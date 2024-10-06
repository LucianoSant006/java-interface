package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String ModelCar = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(),fmt);
        CarRental cr = new CarRental(finish,start,new Vehicle(ModelCar));

        System.out.println("Enter com o preço por hora: ");
        double priceHour = sc.nextDouble();
        System.out.println("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay,priceHour,new BrazilTaxService());

        rentalService.processInvoice(cr);
        System.out.println("FATURA:");
        System.out.println("Pagamento básico: "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: "+String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total: "+String.format("%.2f",cr.getInvoice().getTotalPayment()));
        sc.close();
    }

}
