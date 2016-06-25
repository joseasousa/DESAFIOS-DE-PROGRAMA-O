package ufms.cpcx.jose.listagem.model;

import java.io.Serializable;

/**
 * Created by jose on 25/06/16.
 */
public class Lanche implements Serializable {
    private int id;

    private String nome;

    private double valor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
