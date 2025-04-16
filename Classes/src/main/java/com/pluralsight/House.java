package com.pluralsight;

public class House {
    public static void main(String[] args) {
        
    }
    private String floors;
    private int bathrooms;
    private int bedrooms;
    private int windows;
    private  int balcony;
    private  boolean garage;
    private String kitchen;
    private int doors;
    private int yearBuilt;

    public House(String floors, int bathrooms, int bedrooms,int balcony, int windows, boolean garage, String kitchen, int doors, int yearBuilt) {
        this.floors = floors;
        this.balcony = balcony;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
        this.windows = windows;
        this.garage = garage;
        this.kitchen = kitchen;
        this.doors = doors;
        this.yearBuilt = yearBuilt;

        House ourNewHouse = new House("2",2, 5, 3, 12, true, "1",
                14, 2025);

        System.out.println(getClass());
    }


}

}
