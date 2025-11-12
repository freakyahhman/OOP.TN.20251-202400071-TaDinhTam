package com.hust.kstn;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

import java.util.Scanner;

public class Aims {

    public static void main(String[] args) {

        DigitalVideoDisc superman = new DigitalVideoDisc("Superman", "Science fiction", "James Gunn", "10/07/2025", 1, 129, 36);

        DigitalVideoDisc batman = new DigitalVideoDisc("Batman", "Romance", "Ronaldo", "10/10/2006", 2, 136, 37);

        DigitalVideoDisc spiderman = new DigitalVideoDisc("Spiderman", "Action", "Messi", "01/10/2006", 3, 200, 34);

        Cart cart = new Cart();

        Scanner sc = new Scanner(System.in);

        System.out.println("You have 8 options below:\n1: Add DVD to cart\n2: Show items in cart\n3: Sort cart by title\n4: Sort cart by cost\n5: Find item by ID\n6: Find item by title\n7: Update Number of DVD in cart\n8: Place order\n-------------------------");

        while (true) {

            System.out.println("Press 0 to see instruction");

            int option = sc.nextInt();

            if(option == 0) {
                System.out.println("You have 8 options below:\n1: Add DVD to cart\n2: Show items in cart\n3: Sort cart by title\n4: Sort cart by cost\n5: Find item by ID\n6: Find item by title\n7: Update Number of DVD in cart\n8: Place order\n---------------------------");
            }

            if (option == 1) {
                System.out.println("Select one of the below:\n1: Superman\n2: Batman\n3: Spiderman");
                int suboption = sc.nextInt();
                if (suboption == 1) {
                    cart.addDVD(superman);
                }
                if (suboption == 2) {
                    cart.addDVD(batman);
                }
                if (suboption == 3) {
                    cart.addDVD(spiderman);
                }
                continue;
            }

            if (option == 2) {
                cart.showCart();
                continue;
            }

            if (option == 3) {
                cart.sortCartByTitle();
                continue;
            }

            if (option == 4) {
                cart.sortCartByCost();
                continue;
            }

            if (option == 5) {
                System.out.println("Enter an ID (integer): ");
                int id = sc.nextInt();
                cart.findByID(id);
                continue;
            }

            if (option == 6) {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Enter a title: ");
                String title = sc1.nextLine();
                cart.findByTitle(title);
                continue;
            }

            if (option == 7) {
                System.out.println("Select one of the below:\n1: Superman\n2: Batman\n3: Spiderman");
                int suboption = sc.nextInt();

                if (suboption == 1) {
                    System.out.println("Enter change: ");
                    int change = sc.nextInt();
                    cart.updateNumberDVD(superman, change);
                    continue;
                }

                if (suboption == 2) {
                    System.out.println("Enter change: ");
                    int change = sc.nextInt();
                    cart.updateNumberDVD(batman, change);
                    continue;
                }

                if (suboption == 3) {
                    System.out.println("Enter change: ");
                    int change = sc.nextInt();
                    cart.updateNumberDVD(spiderman, change);
                    continue;
                }
            }

            if (option == 8) {
                cart.placeOrder();
                break;
            }
        }
    }
}
