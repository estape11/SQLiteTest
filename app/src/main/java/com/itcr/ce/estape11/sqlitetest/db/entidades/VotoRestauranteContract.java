package com.itcr.ce.estape11.sqlitetest.db.entidades;

/**
 * Created by estape11 on 9/19/17.
 */

public class VotoRestauranteContract {
    private VotoRestauranteContract(){}

    public static class VotoRestauranteEntry {
        public static final String TABLE_NAME = "VotoPlatillo";
        public static final String COLUMN_NAME_IDRESTAURANTE = "IdRestaurante";
        public static final String COLUMN_NAME_CARNET = "Carnet";
        public static final String COLUMN_NAME_FECHA = "Fecha";
        public static final String COLUMN_NAME_VOTO = "Voto";
    }
}