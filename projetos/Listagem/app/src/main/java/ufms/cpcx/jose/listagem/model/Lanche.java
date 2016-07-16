package ufms.cpcx.jose.listagem.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.io.Serializable;

import ufms.cpcx.jose.listagem.utils.DbUtils;

/**
 * Created by jose on 25/06/16.
 */
@Table(database = DbUtils.class)
public class Lanche extends BaseModel
        implements Serializable {

    @PrimaryKey(autoincrement = true)
    private long id;

    @Column
    private String nome;

    @Column
    private double valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
