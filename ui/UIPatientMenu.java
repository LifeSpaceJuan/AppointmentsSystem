package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

/**
 * UIPatientMenu
 */
public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patienteLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointment");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    
                    break;    

                case 2:

                    break;

                case 0:
                    UIMenu.showMenu();
                    break;
                
                default:
                    break;
            }
        } while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select date: ");
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();
                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());

            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() + 
                    ". Date: " + 
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " + 
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());
            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Date");
            response = Integer.valueOf(sc.nextLine());

            if (respsonse == 1) {
                
            }

        } while (response != 0);
    }
}