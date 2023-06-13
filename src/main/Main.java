package main;

import controller.CustomerController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerController controller = new CustomerController();

        do {
            System.out.println("1. xem list");
            System.out.println("2. tao moi");
            System.out.println("3. sua cus");
            System.out.println("4. xoa cus");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1: controller.read();
                break;
                case 2: controller.create();
                break;
                case 3: controller.update();
                    break;
                case 4: controller.del();
                break;
            }
        }while (true);

    }
}
