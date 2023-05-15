package com.devsuperior.desafiocomponentes;

import com.devsuperior.desafiocomponentes.entities.Order;
import com.devsuperior.desafiocomponentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioComponentesApplication implements CommandLineRunner {
    @Autowired
    private OrderService orderService = new OrderService();

    public static void main(String[] args) {
        SpringApplication.run(DesafioComponentesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Order data:");
        System.out.print("Code: ");
        int code = sc.nextInt();
        System.out.print("Basic value: ");
        double basicValue = sc.nextDouble();
        System.out.print("Discount: ");
        double discount = sc.nextDouble();
        Order order = new Order(code, basicValue, discount);

        System.out.println("Pedido Código: " + order.getCode());
        System.out.println("Valor Total: " + orderService.total(order));

        sc.close();
    }
}
