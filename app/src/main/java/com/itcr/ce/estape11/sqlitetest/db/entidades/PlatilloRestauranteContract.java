package com.itcr.ce.estape11.sqlitetest.db.entidades;

/**
 * Created by estape11 on 9/21/17.
 */

public class PlatilloRestauranteContract {
    private PlatilloRestauranteContract(){}

    public static class PlatilloRestauranteEntry {
        public static final String TABLE_NAME = "PlatilloRestaurante";
        public static final String COLUMN_NAME_ID = "IdPlatilloRestaurante";
        public static final String COLUMN_NAME_IDPLATILLO = "IdPlatillo";
        public static final String COLUMN_NAME_IDRESTAURANTE = "IdRestaurante";
        public static final String COLUMN_NAME_PRECIO = "Precio";
        public static final String COLUMN_NAME_FECHA = "Fecha";
        public static final String COLUMN_NAME_HORA = "Hora ";
    }
}
