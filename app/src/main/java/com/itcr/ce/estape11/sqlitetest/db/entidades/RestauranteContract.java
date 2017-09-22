package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by estape11 on 9/19/17.
 */

public class RestauranteContract {

    private RestauranteContract(){}

    public static class RestEntry implements BaseColumns {
        public static final String TABLE_NAME = "Restaurante";
        public static final String COLUMN_NAME_ID = "IdRestaurante";
        public static final String COLUMN_NAME_NOMBRE = "Nombre";
        public static final String COLUMN_NAME_UBICACION = "Ubicacion";
        public static final String COLUMN_NAME_DESCRIPCION = "Descripcion";
        public static final String COLUMN_NAME_HORARIO = "Horario";
    }
}
