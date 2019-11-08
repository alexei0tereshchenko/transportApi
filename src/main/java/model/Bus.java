package model;

import java.util.HashMap;

public class Bus {

     private long id;

     private int number;

     private HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, BusStop>> routes;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, BusStop>> getRoutes() {
        return routes;
    }

    public void setRoutes(HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, BusStop>> routes) {
        this.routes = routes;
    }
}
