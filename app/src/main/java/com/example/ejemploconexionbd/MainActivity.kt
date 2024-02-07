package com.example.ejemploconexionbd

import android.os.Bundle
import android.view.LayoutInflater

import android.widget.Toast
import com.example.ejemploconexionbd.model.BdHelper


import androidx.appcompat.app.AppCompatActivity
import com.example.ejemploconexionbd.databinding.ActivityMainBinding
import com.example.ejemploconexionbd.model.ManangerDb


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.btnInsertar.setOnClickListener {

            val codigo = binding.editTextCodigo.text.toString()
            val ciudad = binding.editTextCiudad.text.toString()
            val codigoDep = binding.editTextDep.text.toString()


            //  val bdHelper= BdHelper(this)
            //   val db = bdHelper.writableDatabase // Abro mi Bd en mode scritura)
            // Toast.makeText(this, "Base de Datos Creada", Toast.LENGTH_SHORT).show()
            //db.close()  //Cierro la base de datos


            // instanciamos la clase db helper
            val mananger = ManangerDb(this)
            mananger.insertData(codigo.toInt(), ciudad, codigoDep.toInt())


        }
    }
}