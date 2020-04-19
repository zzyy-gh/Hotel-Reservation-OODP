package boundary_classes;

import control_classes.Reservation;
import main.MainBoundary;

import java.util.Scanner;

public class ReservationBoundary {

    Scanner sc = MainBoundary.scanner;
    Reservation reservation = new Reservation();

    public void display() {
        int option = -1;

        while (!(option == 0)) {
            // display menu
            System.out.println("===== Reservation Menu");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("0. Back to Main Menu");
            System.out.println("=====");

            // get option
            option = MainBoundary.inIntInRange("Option: ", 0, 2);

            switch(option) {
                case 1:

                    break;
                case 2:

                    break;

            }
        }
    }
}
