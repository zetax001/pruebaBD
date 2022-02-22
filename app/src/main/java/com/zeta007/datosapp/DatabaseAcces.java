package com.zeta007.datosapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAcces {
    private final SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAcces instance;
    Cursor c=null;


    private DatabaseAcces (Context context){
        this.openHelper=new DataBaseOpenHelper(context);
    }

    public static DatabaseAcces getInstance(Context context){

        if(instance==null){
            instance=new DatabaseAcces(context);
        }
        return instance;
    }

    public void open(){
        this.db=openHelper.getWritableDatabase();
    }

    public void close(){
        if (db!=null){
            this.db.close();
        }
    }
    public String getAddress(String name){
        c=db.rawQuery("select Pais from tabla1 where nombre='"+name+"'",new String[]{});
        StringBuilder buffer = new StringBuilder();
        while(c.moveToNext()){
            String address=c.getString(0);
            buffer.append("").append(address);
        }
        return buffer.toString();
    }
}
