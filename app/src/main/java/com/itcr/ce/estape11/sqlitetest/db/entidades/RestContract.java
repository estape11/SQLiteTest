package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class RestContract {
    public static class RestEntry implements BaseColumns {
        public static final String TABLE_NAME = "Restaurante";
        public static final String COLUMN_NAME_ID = "idRest";
        public static final String COLUMN_NAME_NOMBRE = "nombre";
        public static final String COLUMN_NAME_UBICACION = "ubicacion";
        public static final String COLUMN_NAME_DESCRIPCION = "descripcion";
    }
}
