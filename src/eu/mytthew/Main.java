package eu.mytthew;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("BMW",
                "M5",
                "Sedan",
                2019,
                "3.0",
                "Chrome mirrors, spoiler",
                "Adam Lavine",
                LocalDate.parse("2019-05-05"),
                1);

        vehicle.showCatalogInfo();
        vehicle.showEngineInfo();
        vehicle.showOwnerInfo();
        vehicle.showFullInfo();
        System.out.println("Car age = " + vehicle.carAge(2010));
    }
}
