package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String engineeringSpecialty;

    public Engineer(String name, String surname, String education, String birthday, String engineeringSpecialty) {
        super(name, surname, education, birthday);
        this.engineeringSpecialty = engineeringSpecialty;
    }

    public boolean patents() {
        return false;
    }
}
