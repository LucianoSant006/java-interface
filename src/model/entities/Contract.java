package model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate dataCont;
    private Double valueFull;

    private List<Installment> installments = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, LocalDate dataCont, Double valueFull) {
        this.number = number;
        this.dataCont = dataCont;
        this.valueFull = valueFull;

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDataCont() {
        return dataCont;
    }

    public void setDataCont(LocalDate dataCont) {
        this.dataCont = dataCont;
    }

    public Double getValueFull() {
        return valueFull;
    }

    public void setValueFull(Double valueFull) {
        this.valueFull = valueFull;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

}
