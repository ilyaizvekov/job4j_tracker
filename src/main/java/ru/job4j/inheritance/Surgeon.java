package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String directionOfSurgery;

    public Surgeon(String name, String surname, String education, String birthday, String numberHospital,
                   String directionOfSurgery) {
        super(name, surname, education, birthday, numberHospital);
        this.directionOfSurgery = directionOfSurgery;
    }

    public boolean operation() {
        return true;
    }
}
