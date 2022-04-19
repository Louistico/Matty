package com.example.matty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONException
import java.nio.file.Paths.get

class MainActivity : AppCompatActivity() {

    companion object {
        val LOG_TAG = "matty"
    }
    private lateinit var textView: TextView
    private var requestQueue: RequestQueue? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnParse)

        textView= findViewById<TextView>(R.id.textViewResult)
        requestQueue = Volley.newRequestQueue(this)
        button.setOnClickListener {
            jsonParse()
        }
      /*  //Creas las variables que se vayan a utilizar
        val textView= findViewById<TextView>(R.id.txtRequest)
        //variable que configura al Request e inicia la cola
        val queue= Volley.newRequestQueue(this)
        //La url que se va a utilizar
        val url = "https://www.google.com"
        //variable que llamará al metodo request y le responderá en el text view con el contenido de la url
        val stringRequest = StringRequest(Request.Method.GET,url,Response.Listener { response ->
            textView.text= "La respuesta es: ${response}"
        }, Response.ErrorListener {
            textView.text="Algo salió mal"
        })
        //En la cola se añadira la respuesta
        queue.add(stringRequest)*/
    }
    //LLamar a Json
    private fun jsonParse() {

    }

  }