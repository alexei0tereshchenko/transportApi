package model;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class Bus {

     private long id;

     private int number;

     private List<List<HashMap<BusStop, Calendar>>> routes;

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

    public List<List<HashMap<BusStop, Calendar>>> getRoutes() {
        return routes;
    }

    public void setRoutes(List<List<HashMap<BusStop, Calendar>>> routes) {
        this.routes = routes;
    }
}
