package com.pluralsight.webfunction;

public class TollRecord {

    private String stationId;
    private String licensePlate;
    private String timestamp;

    public TollRecord(String StationId, String LicensePlate, String Timestamp) {
        this.stationId = StationId;
        this.licensePlate = LicensePlate;
        this.timestamp = Timestamp;
    }

    public String getStationId() {
        return stationId;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setStationId(String stationId) {
        this.stationId = stationId;
    }
    
}
