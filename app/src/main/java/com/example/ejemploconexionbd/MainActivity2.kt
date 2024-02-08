package com.example.ejemploconexionbd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejemploconexionbd.databinding.ActivityMain2Binding
import com.example.ejemploconexionbd.model.ManangerDb

class MainActivity2 : AppCompatActivity() {


    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        binding.btnInsertar2.setOnClickListener {

            val codigoD = binding.editTextCodigoP.text.toString()
            val nombreP = binding.editTextNombreP.text.toString()
            val apellidoP = binding.editTextApellidoP.text.toString()
            val telefonoP = binding.editTextTelefonoP.text.toString()
            val direccionP = binding.editTextDireccionP.text.toString()
            val ciudadP = binding.editTextCiudadP.text.toString()



            // instanciamos la clase db helper
            val mananger = ManangerDb(this)
            mananger.insertData2(codigoD.toInt(), nombreP,apellidoP, telefonoP.toInt(),direccionP, ciudadP)


        }
    }
}