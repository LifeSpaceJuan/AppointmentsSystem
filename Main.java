import java.sql.Date;

import model.*;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        
        // showMenu();
        Doctor myDoctor = new Doctor("Juan Camilo", "juancspace@hotmail.com");
        myDoctor.addAvailableAppointment(new Date(22,02,10), "4pm");
        myDoctor.addAvailableAppointment(new Date(22,01,30), "10am");
        myDoctor.addAvailableAppointment(new Date(22, 04,05), "1pm");

        /* for (Doctor.AvailableAppointment aA:myDoctor.getAvailableAppointments()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        } */
        System.out.println("\n\n");
        myDoctor.setSpeciality("Cirujano Plastico");
        System.out.println(myDoctor);

        Patiente myPatinete = new Patiente("Dolores Cantaro", "dolores@gmail.com");
        /* myPatinete.setHeight(1.68);
        System.out.println(myPatinete.getHeight()); */
        System.out.println("\n\n");
        System.out.println(myPatinete);
        /* 
        User user1 = new User("Carlos", "carlos@carniceria.com") {

            @Override
            public void showDataUser() {
                // TODO Auto-generated method stub
                System.out.println("Doctor\n");
                System.out.println("Hospital: San Pedro te abre las puertas\n");
                System.out.println("Departamento: Emergencias");
            }
             
        };
        user1.showDataUser(); */

        ISchedule iSchedule = new ISchedule() {

            @Override
            public void schedule(Date date, String time) {
                // TODO Auto-generated method stub
                
            }
            
        }; 

        ISchedule iSchedule1 = new AppointmentDoctor();
        iSchedule1.schedule();

        /* System.out.println("\n\n");
        User user = new Doctor("Cesar", "cesar@cesar.com");
        user.showDataUser();

        User userPa = new Patiente("Liseth", "liseth@liseth.com");
        userPa.showDataUser(); */
    }
}