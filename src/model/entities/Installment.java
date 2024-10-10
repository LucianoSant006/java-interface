package model.entities;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {

    private static DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Double amount;
    private LocalDate dueDate;

    public Installment(){
    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getdueDate() {
        return dueDate;
    }

    public void setdueDate(LocalDate dueDate) {
        this.dueDate = dueDate;

    }

    public Double getAmount() {
        return amount;

    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(sdf)+" - "+String.format("%.2f",amount);
    }

}
