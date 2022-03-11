package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String directionInDentistry;

    public Dentist(String name, String surname, String education, String birthday, String numberHospital,
                   String directionInDentistry) {
        super(name, surname, education, birthday, numberHospital);
        this.directionInDentistry = directionInDentistry;
    }

    public boolean treatsTeeth() {
        return true;
    }
}
