package com.example.ejemploconexionbd.model

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdHelper(
    context: Context?,
) : SQLiteOpenHelper(context, Constants.NOM_BD, null, Constants.VERSION_BD) {

    //extender de la clase SqliteOpenHelper

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL(Constants.TABLA)

        db?.execSQL(Constants.TABLA2)


    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
      db?.execSQL("DROP TABLE IF EXISTS ciudad")
        db?.execSQL("DROP TABLE IF EXISTS datosP")

       onCreate(db)


    }
}