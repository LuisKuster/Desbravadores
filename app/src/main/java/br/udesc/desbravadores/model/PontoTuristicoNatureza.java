package br.udesc.desbravadores.model;

import java.util.Locale;

public class PontoTuristicoNatureza extends PontoTuristico{

    private double valorEntrada;
    private String guia;

    public PontoTuristicoNatureza(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, int curtir, double estrelas, Locale localizacao, double valorEntrada,String guia) {
        super(id, idTipoPontoTuristico, tipo, nome, endereco, descricao, curtir, estrelas, localizacao);
        this.valorEntrada = valorEntrada;
        this.guia = guia;
    }

    public double getValorEntrada() {
        return valorEntrada;
    }

    public void setValorEntrada(double valorEntrada) {
        this.valorEntrada = valorEntrada;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }
}
