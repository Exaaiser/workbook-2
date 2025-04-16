package com.pluralsight;

public class CellPhone {
    public int serialNumber;
    public String model;
    public String carrier;
    public double number;
    public  String owner;

    public CellPhone(int serialNumber, String model, String carrier, double number, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.number = number;
        this.owner = owner;

    }

        public int getSerialNumber() {
            return this.serialNumber;
        }
        public void setSerialNumber(int SerialNumber) {
            this.serialNumber = 11111;
        }
        public String getModel() {
            return this.model;
        }
        public void setModel (String Model) {
        this.model = "iPhone X";
        }
        public String getCarrier() {
            return this.carrier;
        }
        public void setCarrier() {
            this.carrier = "AT&T";
        }
        public double getNumber() {
            return this.number;
        }
        public void setNumber(double number) {
            this.number = 800 - 555 - 5555;
        }
        public String getOwner() {
            return owner;
        }
        public void setOwner(String owner) {
        this.owner = "Ozan Gul";
    }
}
