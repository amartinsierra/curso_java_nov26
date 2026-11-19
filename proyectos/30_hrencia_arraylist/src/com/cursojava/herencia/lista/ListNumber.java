package com.cursojava.herencia.lista;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer>{
	private boolean unico;

    public ListNumber(boolean unico) {
        this.unico = unico;
    }

    @Override
    public boolean add(Integer numero) {
        if (unico && contains(numero)) {
            return false;
        }
        return super.add(numero);
    }

    public int suma() {
        int suma = 0;
        for (Integer numero : this) {
            suma += numero;
        }
        return suma;
    }

    public double media() {
        if (isEmpty()) {
            return 0;
        }
        return (double) suma() / size();
    }
}
