import static ui.UIMenu.*;

import java.sql.Date;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // showMenu();
        Doctor myDoctor = new Doctor("Juan Camilo", "Crijano Plastico");
        myDoctor.addAvailableAppointment(new Date(2022, 02, 20), "4pm");
        myDoctor.addAvailableAppointment(new Date(22, 01, 05), "10am");
        myDoctor.addAvailableAppointment(new Date(22, 03, 05), "1pm");

        for (Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }

        Patiente myPatinete = new Patiente("Dolores Cantaro", "dolores@gmail.com");
        myPatinete.setHeight(1.68);
        System.out.println(myPatinete.getHeight());
        
        
    }
}