package com.pluralsight.clientservice;

public class TollData {

    private String recordId;
    private String licensePlate;
    private String timestamp;

    public TollData() {}

    public TollData(String RecordId, String LicensePlate, String TimeStamp) {
        this.setRecordId(RecordId);
        this.setLicensePlate(LicensePlate);
        this.setTimestamp(TimeStamp);
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

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }
    
}
