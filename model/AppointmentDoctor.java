package model;

import java.sql.*;

public class AppointmentDoctor implements ISchedule{
    private int id;
    private Patiente patiente;
    private Doctor doctor;
    private Date date;
    private String time;


    public Date getDate() {
        return date;
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
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public void schedule(Date date, String time) {
        // TODO Auto-generated method stub
        
    }
    
}
