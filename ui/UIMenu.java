package ui;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.Painter;

import model.Doctor;
import model.Patiente;

public class UIMenu {

    public static final String[] MONTHS  = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static Doctor doctorLogged;
    public static Patiente patienteLogged;

    public static void showMenu() {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro", "alajandro@fifa.com"));
        doctors.add(new Doctor("Miriam", "miriam@fifa.com"));
        doctors.add(new Doctor("Valentina", "valentina@fifa.com"));

        ArrayList<Patiente> patientes = new ArrayList<>();
        patientes.add(new Patiente("Mario", "mario@hitmail.com"));
        patientes.add(new Patiente("Mario", "mario@hitmail.com"));
        patientes.add(new Patiente("Rosalia", "rosalia@hitmail.com"));

        boolean eamilCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1) {
                for (Doctor d: doctors) {
                    if (d.getEmail().equals(email)) {
                        eamilCorrect = true;
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2) {
                for (Patiente p : patientes) {
                    if (p.getEmail().equals(email)) {
                        eamilCorrect = true;
                        patienteLogged = p;
                    }
                }
            }
        } while (!eamilCorrect);
    }

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
