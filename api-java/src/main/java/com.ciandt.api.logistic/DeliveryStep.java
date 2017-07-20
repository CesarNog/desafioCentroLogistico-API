package com.ciandt.api.logistic;

public class DeliveryStep {

    private final long deliveryId;
    private final String vehicle;
    private final String packages;

    public DeliveryStep(String vehicle, long deliveryId, String packages) {
        this.deliveryId = deliveryId;
        this.vehicle = vehicle;
        this.packages = packages;
    }

    public long getVehicle() {
        return vehicle;
    }

    public String getPackages() {
        return packages;
    }
}
