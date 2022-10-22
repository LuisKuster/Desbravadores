package br.udesc.desbravadores.model;

import java.util.ArrayList;
import java.util.List;

public class Estrelas {

    private PontoTuristico pontoTuristico;
    private int estrelas ;

    public Estrelas(PontoTuristico pontoTuristico, int estrelas) {
        this.pontoTuristico = pontoTuristico;
        this.estrelas = estrelas;
    }

    public PontoTuristico getPontoTuristico() {
        return pontoTuristico;
    }

    public void setPontoTuristico(PontoTuristico pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }

    public int getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
}
