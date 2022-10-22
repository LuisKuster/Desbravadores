package br.udesc.desbravadores.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PontoTuristicoCNPJ extends PontoTuristico{

    private List<String> horarios = new ArrayList<String>();
    private String facebook;
    private String instagram;
    private String telefone;

    public PontoTuristicoCNPJ(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, int curtir, double estrelas, Locale localizacao, List<String> horarios, String facebook, String instagram, String telefone) {
        super(id, idTipoPontoTuristico, tipo, nome, endereco, descricao, curtir, estrelas, localizacao);
        this.horarios = horarios;
        this.facebook = facebook;
        this.instagram = instagram;
        this.telefone = telefone;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<String> horarios) {
        this.horarios = horarios;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
