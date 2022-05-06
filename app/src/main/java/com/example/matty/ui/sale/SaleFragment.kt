package com.example.matty.ui.sale

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.matty.Payment
import com.example.matty.databinding.FragmentSaleBinding
import com.google.zxing.integration.android.IntentIntegrator

class SaleFragment : Fragment() {



    private var _binding: FragmentSaleBinding? = null

    //Recycler
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<SaleAdapter.ViewHolder>? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {



        //Añadir función de escaner a un botón
        val bind = FragmentSaleBinding.inflate(layoutInflater)
        bind.camsc.setOnClickListener {
            escanear()


        }


        bind.recycl.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = SaleAdapter()
        }

        //Menú
        val homeViewModel =
            ViewModelProvider(this).get(SaleViewModel::class.java)


        _binding = FragmentSaleBinding.inflate(inflater, container, false)
        val root: View = binding.root


        /*val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
             textView.text = it
         }*/

        return bind.root







    }


    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {

        super.onViewCreated(itemView, savedInstanceState)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {


        //Código para los mensajes del Escaner
        val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        //Mandar mensajes de lecturaval
        val resultado = result.contents
        if (result != null) {

            if (result.contents == null) {
                Toast.makeText(requireActivity(), "Lectura erronea", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(
                    requireActivity(),
                    "El articulo escaneado es: ${result.contents}",
                    Toast.LENGTH_SHORT


                ).show()




            }

        } else {
            super.onActivityResult(requestCode, resultCode, data)

        }

    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun escanear() {

        val intentIntegrator = IntentIntegrator.forSupportFragment(this)
        //Tipos de código a escanear
        intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.ALL_CODE_TYPES)
        intentIntegrator.setPrompt("Centra el código en el recuadro del escaner para obtener el artículo")
        //Sonido al hacer escaneo efetivo
        intentIntegrator.setBeepEnabled(true)
        intentIntegrator.initiateScan()
    }



}