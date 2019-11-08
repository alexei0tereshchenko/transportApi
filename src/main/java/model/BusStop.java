package model;

import java.util.HashMap;

public class BusStop {

    private long id;

    public long getId() {
        return id;
    }

    private HashMap<BusStop, Long> neededBusStops;

    public HashMap<BusStop, Long> getNeededBusStops() {
        return neededBusStops;
    }

    public void setNeededBusStops(HashMap<BusStop, Long> neededBusStops) {
        this.neededBusStops = neededBusStops;
    }

    public void setId(long id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoadSection getPosition() {
        return position;
    }

    public void setPosition(RoadSection position) {
        this.position = position;
    }

    public HashMap<Schedule.Weak, HashMap<HashMap<Schedule.TimeInterval, Bus>, Integer>> getBusSchedule() {
        return busSchedule;
    }

    public void setBusSchedule(HashMap<Schedule.Weak, HashMap<HashMap<Schedule.TimeInterval, Bus>, Integer>> busSchedule) {
        this.busSchedule = busSchedule;
    }

    private RoadSection position;

    private HashMap<Schedule.Weak, HashMap<HashMap<Schedule.TimeInterval, Bus>, Integer>> busSchedule;
}
