package model;

import java.sql.Date;

/**
 * ISchedule
 */
public interface ISchedule {
    void schedule(Date date, String time); 
}