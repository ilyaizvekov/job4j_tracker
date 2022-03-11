package ru.job4j.inheritance;

public class Doctor extends Profession {

    private String numberHospital;

    public Doctor(String name, String surname, String education, String birthday, String numberHospital) {
        super(name, surname, education, birthday);
        this.numberHospital = numberHospital;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnosis = new Diagnosis();
        return diagnosis;
    }
}
