package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class PlatilloContract {

    private PlatilloContract(){}

    public static class PlatilloEntry implements BaseColumns {
        public static final String TABLE_NAME = "Platillo";
        public static final String COLUMN_NAME_ID = "IdPlatillo";
        public static final String COLUMN_NAME_NOMBRE = "Nombre";
        public static final String COLUMN_NAME_DESCRIPCION = "Descripcion";
    }
}
