package application;

import model.entities.Contract;

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
        System.out.print("Number");
        int number = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate datee = LocalDate.parse(sc.next(), sdf);
        System.out.println("Valor contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, datee, totalValue);

    }
}
