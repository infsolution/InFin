package infsolution.com.br.infin.model;

import java.util.Date;

/**
 * Created by Cicero on 18/10/2016.
 */
public class User {
    private long codInFin;
    private String name;
    private Date date_birth;
    private Double income;
    public User(String name){
        this.name=name;
    }

    public long getCodInFin() {
        return codInFin;
    }

    public void setCodInFin(long codInFin) {
        this.codInFin = codInFin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return getName();
    }
}
