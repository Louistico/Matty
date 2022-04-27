package com.example.matty.ui.catalogue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.matty.R
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatalogueFragment : Fragment() {

    companion object {
        fun newInstance() = CatalogueFragment()
    }

    private lateinit var viewModel: CatalogueViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*val retrofit = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/users")
            .addConverterFactory(GsonConverterFactory.create()).build()*/
        return inflater.inflate(R.layout.fragment_catalogue, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CatalogueViewModel::class.java)
        // TODO: Use the ViewModel
    }

}