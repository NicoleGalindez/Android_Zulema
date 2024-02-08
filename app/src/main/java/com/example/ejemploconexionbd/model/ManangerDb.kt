package com.example.ejemploconexionbd.model


import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase



data class ManangerDb(val context: Context) {

    lateinit var bd:SQLiteDatabase

    val  bdHelper=BdHelper(context)//llamado a mi conexion

    //metodo para abrir bd en modo escritura
    fun openBdWr(){

        bd= bdHelper.writableDatabase
    }
    //abre base de datos modo lectura
    fun openBdRd(){

        bd=bdHelper.readableDatabase

    }


    fun insertData(codigo:Int, ciudad:String, codigoDep: Int): Long {
    //abrir db en modo escritura
        openBdWr()

        //creo contenedor de valores para insertar data
       val contenedor = ContentValues()
        contenedor.put("codigoCiudad", codigo)
        contenedor.put("nombreCiudad", ciudad)
        contenedor.put("codigoDep", codigoDep)

       // llamo metodo insert

        val resul = bd.insert("ciudad", null, contenedor)
        return  resul


    }



    // aqui en los parentesis es como lo tengo en main y tipo de dato
    fun insertData2(codigoD:Int , nombreP:String, apellidoP:String, telefonoP:Int, direccionP:String, ciudadP:String ): Long {
        //abrir db en modo escritura
        openBdWr()

        //creo contenedor de valores para insertar data
        val contenedor = ContentValues()
        contenedor.put("codigoDatos", codigoD)
        contenedor.put("nombreP", nombreP) // como esta en constantes
        contenedor.put("apellidoP", apellidoP)
        contenedor.put("telefonoP", telefonoP)
        contenedor.put("direccionP", direccionP)


        // llamo metodo insert

        val resul = bd.insert("datosP", null, contenedor)
        return  resul


    }

}



//data class ManangerDb (val context: Context) {

  //  lateinit var bd: SQLiteDatabase

    //val bdHelper = BdHelper(context)

    //abre base de datos  en modo escritura
    //fun openBdWr(){
      //  bd = bdHelper.writableDatabase
    //}

    // abre base de datos  en modo lectura
//    fun openBdRd(){
  ////}