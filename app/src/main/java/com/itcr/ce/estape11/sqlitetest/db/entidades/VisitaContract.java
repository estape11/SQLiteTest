package com.itcr.ce.estape11.sqlitetest.db.entidades;

import android.provider.BaseColumns;

/**
 * Created by Esteban AP on 21/9/2017.
 */

public class VisitaContract {
    private VisitaContract(){}

    public static class RestEntry implements BaseColumns {
        public static final String TABLE_NAME = "Restaurante";
        public static final String COLUMN_NAME_IDRESTAURANTE = "IdRestaurante";
        public static final String COLUMN_NAME_FECHA = "Fecha";
        public static final String COLUMN_NAME_Ffecga = "Hora";
        public static final String COLUMN_NAME_CARNET = "Carnet";
    }
}
