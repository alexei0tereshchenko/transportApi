package model;

import java.util.HashMap;
import java.util.List;

public class RoadSection {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private List<RoadSection> connectedRoadSections;

    private HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, HashMap<RoadSection, Long>>> turnTimes;

    private HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Long>> passingTimes;

    private HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Double>> crossingRisk;

    public List<RoadSection> getConnectedRoadSections() {
        return connectedRoadSections;
    }

    public void setConnectedRoadSections(List<RoadSection> connectedRoadSections) {
        this.connectedRoadSections = connectedRoadSections;
    }

    public HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, HashMap<RoadSection, Long>>> getTurnTimes() {
        return turnTimes;
    }

    public void setTurnTimes(HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, HashMap<RoadSection, Long>>> turnTimes) {
        this.turnTimes = turnTimes;
    }

    public HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Long>> getPassingTimes() {
        return passingTimes;
    }

    public void setPassingTimes(HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Long>> passingTimes) {
        this.passingTimes = passingTimes;
    }

    public HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Double>> getCrossingRisk() {
        return crossingRisk;
    }

    public void setCrossingRisk(HashMap<Schedule.Weak, HashMap<Schedule.TimeInterval, Double>> crossingRisk) {
        this.crossingRisk = crossingRisk;
    }
}
