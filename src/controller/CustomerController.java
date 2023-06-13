package controller;

import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    CustomerService customerService = new CustomerServiceImpl();
    Scanner scanner = new Scanner(System.in);
    public void create() {

        System.out.println("1. Nhap Id");
        int cid= scanner.nextInt();
        System.out.println("2. Nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("2. Nhap address");
        String address = scanner.nextLine();
        System.out.println("2. Nhap Phone");
        String phone = scanner.nextLine();
        Customer customer = new Customer(cid,name,address,phone);
        customerService.create(customer);
    }

    public void update() {
        System.out.println("1. Nhap Id");
        int cid= scanner.nextInt();
        System.out.println("2. Nhap ten");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("2. Nhap address");
        String address = scanner.nextLine();
        System.out.println("2. Nhap Phone");
        String phone = scanner.nextLine();
        Customer customer = new Customer(cid,name,address,phone);
        customerService.update(customer);

    }

    public void del() {
        System.out.println("1. Nhap Id");
        int cid= scanner.nextInt();
        customerService.del(cid);
    }

    public void read() {
        ArrayList<Customer> list = customerService.read();
        if (list == null || list.isEmpty()) {
            System.out.println("No Data");
        } else {
            for (Customer c : list) {
                System.out.println(c);
            }
        }

    }


}
