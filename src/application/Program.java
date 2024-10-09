package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.OnlinePaymentService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter os dados do contrato:");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate datee = LocalDate.parse(sc.next(), sdf);
        System.out.print("Value contract: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, datee, totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = sc.nextInt();

        ContractService service = new ContractService(new PaypalService());
        service.processContract(obj,n);

        System.out.println("Parcelas:");
        for(Installment installment: obj.getInstallments()){
            System.out.println(installment);
        }

    }
}
