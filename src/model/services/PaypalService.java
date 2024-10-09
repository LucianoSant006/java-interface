package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.ArrayList;
import java.util.List;

public class PaypalService implements OnlinePaymentService {

    private static final double PAYMENT_FREE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;
    @Override
    public Double paymentFree(Double amount) {

    return amount * PAYMENT_FREE;
    }

    @Override
    public Double interest(Double amount, Integer months) {

        return amount * MONTHLY_INTEREST * months;
    }
}
