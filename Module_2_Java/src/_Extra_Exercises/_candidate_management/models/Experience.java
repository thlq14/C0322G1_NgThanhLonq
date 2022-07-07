package _Extra_Exercises._candidate_management.models;

import java.time.LocalDate;

public class Experience extends Candidate {
    private double expInYear;
    private String proSkill;

    public Experience() {
    }

    public Experience(String candidateID, String fullName, LocalDate birthDay, int phone, String email, String candidateType, String candidateCount) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, candidateCount);
    }

    public Experience(double expInYear, String proSkill) {
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public Experience(String candidateID, String fullName, LocalDate birthDay, int phone, String email, String candidateType, String candidateCount, double expInYear, String proSkill) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, candidateCount);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public double getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(double expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getCandidateID(), super.getFullName(),
                super.getBirthDay(), super.getPhone(),super.getEmail(),
                super.getCandidateType(), super.getCandidateCount(),
                this.getExpInYear(), this.getProSkill());
    }

    @Override
    public String toString() {
        return "Experience {" + super.toString() +
                "expInYear = " + expInYear +
                ", proSkill = '" + proSkill + '\'' +
                '}';
    }
}
