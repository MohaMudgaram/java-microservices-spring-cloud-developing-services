package com.pluralsight.webfunction;

public class TollStation {

    private String stationId;
    private Float mileMarker;
    private Integer stallCount;

    public TollStation(String StationId, Float MileMarker, Integer StallCount) {
        this.stationId = StationId;
        this.mileMarker = MileMarker;
        this.stallCount = StallCount;
    }

    public String getStationId() {
        return stationId;
    }
    public Integer getStallCount() {
        return stallCount;
    }
    public void setStallCount(Integer stallCount) {
        this.stallCount = stallCount;
    }
    public Float getMileMarker() {
        return mileMarker;
    }
    public void setMileMarker(Float mileMarker) {
        this.mileMarker = mileMarker;
    }
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
    
}
