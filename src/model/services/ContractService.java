package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService =onlinePaymentService;
    }


    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getValueFull() / months;
        for(int i = 1;i <= months;i++){
            LocalDate due = contract.getDataCont().plusMonths(i);
            //basicQuota = 200.00
            double interest = basicQuota + onlinePaymentService.interest(basicQuota,i);
            //2
            double free = interest + onlinePaymentService.paymentFree(interest+basicQuota);
            //free 6.04
            double quotaFull =basicQuota + interest +free;

            contract.getInstallments().add(new Installment(due,quotaFull));
        }
    }

}
