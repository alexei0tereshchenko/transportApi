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

    private List<List<RoadSection>> connectedRoadSections;

    private List<List<HashMap<RoadSection, Long>>> turnTimes;

    private List<List<Long>> passingTimes;

    private List<List<Double>> crossingRisk;

    public List<List<RoadSection>> getConnectedRoadSections() {
        return connectedRoadSections;
    }

    public void setConnectedRoadSections(List<List<RoadSection>> connectedRoadSections) {
        this.connectedRoadSections = connectedRoadSections;
    }

    public List<List<HashMap<RoadSection, Long>>> getTurnTimes() {
        return turnTimes;
    }

    public void setTurnTimes(List<List<HashMap<RoadSection, Long>>> turnTimes) {
        this.turnTimes = turnTimes;
    }

    public List<List<Long>> getPassingTimes() {
        return passingTimes;
    }

    public void setPassingTimes(List<List<Long>> passingTimes) {
        this.passingTimes = passingTimes;
    }

    public List<List<Double>> getCrossingRisk() {
        return crossingRisk;
    }

    public void setCrossingRisk(List<List<Double>> crossingRisk) {
        this.crossingRisk = crossingRisk;
    }
}
