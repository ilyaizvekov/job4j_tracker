package ru.job4j.inheritance;

public class Programmer extends Engineer {

    private String programmingLanguage;

    public Programmer(String name, String surname, String education, String birthday, String engineeringSpecialty,
                      String programmingLanguage) {
        super(name, surname, education, birthday, engineeringSpecialty);
        this.programmingLanguage = programmingLanguage;
    }

    public int yearsOfExperience(int years) {
        return years;
    }
}
