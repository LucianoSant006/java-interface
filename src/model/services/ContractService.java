package model.services;

import model.entities.Contract;

public class ContractService {

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getValueFull() / months;
        for(int i =0 ;i < months;i++){


        }

    }

}
