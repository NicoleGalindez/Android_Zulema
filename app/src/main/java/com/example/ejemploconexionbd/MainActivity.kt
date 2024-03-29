package com.example.ejemploconexionbd

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater


import androidx.appcompat.app.AppCompatActivity
import com.example.ejemploconexionbd.databinding.ActivityMain2Binding
import com.example.ejemploconexionbd.databinding.ActivityMainBinding
import com.example.ejemploconexionbd.model.ManangerDb


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var binding2: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.btnInsertar.setOnClickListener {

            val codigo = binding.editTextCodigo.text.toString()
            val ciudad = binding.editTextCiudad.text.toString()
            val codigoDep = binding.editTextDep.text.toString()


            // instanciamos la clase db helper
            val mananger = ManangerDb(this)
            mananger.insertData(codigo.toInt(), ciudad, codigoDep.toInt())


        }

        binding2.btnTabla2.setOnClickListener {
            val intent = Intent(this, ActivityMain2Binding::class.java)
            startActivity(intent)
        }
    }
}

//  val bdHelper= BdHelper(this)
//   val db = bdHelper.writableDatabase // Abro mi Bd en mode scritura)
// Toast.makeText(this, "Base de Datos Creada", Toast.LENGTH_SHORT).show()
//db.close()  //Cierro la base de datos
