package infsolution.com.br.infin.model;

import java.util.Date;

/**
 * Created by Cicero on 18/10/2016.
 */
public class Income {
    private int id;
    private String description;
    private float valor;
    private Date dateIncome;
    public Income(float valor){
        this.valor= valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDateIncome() {
        return dateIncome;
    }

    public void setDateIncome(Date dateIncome) {
        this.dateIncome = dateIncome;
    }

    @Override
    public String toString() {
        return "R$ "+getValor();
    }
}
