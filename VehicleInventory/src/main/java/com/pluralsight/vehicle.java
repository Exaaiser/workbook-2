package com.pluralsight;

public class vehicle {
    int vehicleID;
    String makeModel;
    String color;
    int odometerReading;
    float price;

    public vehicle(int i, String jeepWrangler, String yellow, int i1, int i2) {

    }

    void Vehicle (int vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.vehicleID = vehicleID;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }

    int getVehicleID() {
        return vehicleID; }
    int setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
        return vehicleID; }

    String getMakeModel() {
        return makeModel; }
    String setMakeModel(String makeModel) {
        this.makeModel = makeModel;
        return makeModel; }

    String getColor() {
        return color; }
    String setColor(String color) {
        this.color = color;
        return color; }

    int getOdometerReading() {
        return odometerReading; }
    int setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
        return odometerReading; }

    float getPrice() {
        return price; }
    float setPrice(float price) {
        this.price = price;
        return price; }

    String display() {
        return vehicleID + " " + makeModel + " " + color + " " + odometerReading + " $" + price;
    }
}
}