package _Extra_Exercises._candidate_management.models;

import java.time.LocalDate;

public class Fresher extends Candidate {
    private double graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(double graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String candidateID, String fullName, LocalDate birthDay, int phone, String email, String candidateType, String candidateCount, double graduationDate, String graduationRank, String education) {
        super(candidateID, fullName, birthDay, phone, email, candidateType, candidateCount);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public double getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(double graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getCandidateID(), super.getFullName(),
                super.getBirthDay(), super.getPhone(),super.getEmail(),
                super.getCandidateType(), super.getCandidateCount(),
                this.getGraduationDate(), this.getGraduationRank(), this.getEducation());
    }

    @Override
    public String toString() {
        return "Fresher {" + super.toString() +
                "graduationDate = " + graduationDate +
                ", graduationRank = '" + graduationRank + '\'' +
                ", education = '" + education + '\'' +
                '}';
    }
}
