import java.sql.Date;
import java.util.ArrayList;
import java.util.function.Function;

public class Doctor extends User {
    //Atributos
    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Métodos
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time) {
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }

    public static class AvailableAppointment{
        private int id; 
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.setDate(date);
            this.setTime(time);
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
        
        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }

        
    }

    @Override
    public void showDataUser() {
        // TODO Auto-generated method stub
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Departamento: Urologia");
    }
}