package model.entities;


import java.time.LocalDate;
import java.util.Date;

public class Installment {
    private Double amount;
    private LocalDate dueDate;

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {

        return dueDate;
    }

    public void setDueDate(LocalDate dueDate)
    {
        this.dueDate = dueDate;
    }

    public Double getAmount()
    {
        return amount;
    }

    public void setAmount(Double amount)
    {
        this.amount = amount;
    }




}
