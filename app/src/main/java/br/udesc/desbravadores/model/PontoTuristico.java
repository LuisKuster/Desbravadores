package br.udesc.desbravadores.model;

import java.util.Locale;

public abstract class PontoTuristico {

    private int id;
    private int idTipoPontoTuristico;
    private String tipo;
    private String nome;
    private Endereco endereco;
    private String descricao;
    private int curtir;
    private double estrelas;
    private Locale localizacao;
    private String facebook;
    private String instagram;
    //private HoraFuncionamento horaFuncionamento;
    //private double valorEntrada;


    public PontoTuristico(int id, int idTipoPontoTuristico, String tipo, String nome, Endereco endereco, String descricao, int curtir, double estrelas, Locale localizacao) {
        this.id = id;
        this.idTipoPontoTuristico = idTipoPontoTuristico;
        this.tipo = tipo;
        this.nome = nome;
        this.endereco = endereco;
        this.descricao = descricao;
        this.curtir = curtir;
        this.estrelas = estrelas;
        this.localizacao = localizacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTipoPontoTuristico() {
        return idTipoPontoTuristico;
    }

    public void setIdTipoPontoTuristico(int idTipoPontoTuristico) {
        this.idTipoPontoTuristico = idTipoPontoTuristico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCurtir() {
        return curtir;
    }

    public void setCurtir(int curtir) {
        this.curtir = curtir;
    }

    public double getEstrelas() {
        return estrelas;
    }

    public void setEstrelas(double estrelas) {
        this.estrelas = estrelas;
    }

    public Locale getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Locale localizacao) {
        this.localizacao = localizacao;
    }
}
