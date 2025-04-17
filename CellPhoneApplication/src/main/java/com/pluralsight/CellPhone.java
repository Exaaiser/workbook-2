package com.pluralsight;

public class CellPhone {
    public int serialNumber;
    public String model;
    public String carrier;
    public String number;
    public String owner;

    public CellPhone(int serialNumber, String model, String carrier, String number, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.number = number;
        this.owner = owner;

    }

    public CellPhone() {

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
        public void setCarrier(String carrier) {
            this.carrier = "";
        }
        public String getNumber() {
            return this.number;
        }
        public void setNumber(String number) {
            this.number = " ";
        }
        public String getOwner() {
            return owner;
        }
        public void setOwner(String owner) {
        this.owner = "Ozan Gul";
    }
}
