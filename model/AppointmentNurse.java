package model;

import java.sql.*;

public class AppointmentNurse implements ISchedule {
    private int id;
    private Patiente patiente;
    private Nurse nurse;
    private Date date;
    private String time;


    public Date getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Patiente getPatiente() {
        return patiente;
    }
    public void setPatiente(Patiente patiente) {
        this.patiente = patiente;
    }
    public Nurse getNurse() {
        return nurse;
    }
    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public void schedule(Date date, String time) {
        // TODO Auto-generated method stub
        
    }    
}
