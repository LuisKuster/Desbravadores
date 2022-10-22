package br.udesc.desbravadores.model;

import java.util.ArrayList;
import java.util.List;

public class Curtidas {

    private PontoTuristico pontoTuristico;
    private Boolean curtido;

    public Curtidas(PontoTuristico pontoTuristico, Boolean curtido) {
        this.pontoTuristico = pontoTuristico;
        this.curtido = curtido;
    }

    public PontoTuristico getPontoTuristico() {
        return pontoTuristico;
    }

    public void setPontoTuristico(PontoTuristico pontoTuristico) {
        this.pontoTuristico = pontoTuristico;
    }

    public Boolean getCurtido() {
        return curtido;
    }

    public void setCurtido(Boolean curtido) {
        this.curtido = curtido;
    }
}
