package com.pluralsight;

public class CellPhoneApp {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone(1111, "Iphone X","AT&T",800 - 555 - 5555,"Ozan Gul");

        System.out.println(cellPhone.getSerialNumber());

        System.out.println(cellPhone.getModel());

        System.out.println(cellPhone.getCarrier());

        System.out.println(cellPhone.getNumber());

        System.out.println(cellPhone.getOwner());
    }
}
