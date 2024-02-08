package com.example.ejemploconexionbd.model

class Constants {
    // sirve para que mis contantes sean globales
    companion object{

        const val NOM_BD ="BdAdso"
        const val VERSION_BD =5

        const val TABLA = "Create table ciudad(codigoCiudad int,  nombreCiudad text, codigoDep int)"

        const val TABLA2= "Create table datosP(codigoDatos int,  nombreP text, apellidoP text, telefonoP int, direccion text, ciudadP text)"

    }
}