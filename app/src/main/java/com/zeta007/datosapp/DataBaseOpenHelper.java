package com.zeta007.datosapp;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DataBaseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME= "datosExterno.db";
    private static final int DATABASE_VERSION=1;


    //CONSTRUCTOR
    //esto es una prueba
        public DataBaseOpenHelper (Context context){

            super(context,DATABASE_NAME,null,DATABASE_VERSION);

        }
}
