package br.udesc.desbravadores.model;

public class TipoPontoTuristico {

    private int id;
    private String TipoPontoTuristico;

    public TipoPontoTuristico(int id, String tipoPontoTuristico) {
        this.id = id;
        TipoPontoTuristico = tipoPontoTuristico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoPontoTuristico() {
        return TipoPontoTuristico;
    }

    public void setTipoPontoTuristico(String tipoPontoTuristico) {
        TipoPontoTuristico = tipoPontoTuristico;
    }
}
