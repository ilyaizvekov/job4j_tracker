package ru.job4j.inheritance;

public class Builder extends Engineer {

    private String colorHelmet;

    public Builder(String name, String surname, String education, String birthday, String engineeringSpecialty,
                   String colorHelmet) {
        super(name, surname, education, birthday, engineeringSpecialty);
        this.colorHelmet = colorHelmet;
    }

    private int heightHouse(int metres) {
        return metres;
    }
}
