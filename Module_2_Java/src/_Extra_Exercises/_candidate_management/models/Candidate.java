package _Extra_Exercises._candidate_management.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Candidate {
    private String candidateID;
    private String fullName;
    private LocalDate birthDay;
    private int phone;
    private String email;
    private String candidateType;
    private String candidateCount;
    private List<Certificate> certificates = new ArrayList<>();

    public Candidate() {
    }

    public Candidate(String candidateID, String fullName, LocalDate birthDay, int phone, String email, String candidateType, String candidateCount) {
        this.candidateID = candidateID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
        this.candidateCount = candidateCount;
    }

    public String getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(String candidateID) {
        this.candidateID = candidateID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    public String getCandidateCount() {
        return candidateCount;
    }

    public void setCandidateCount(String candidateCount) {
        this.candidateCount = candidateCount;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "candidateID = '" + candidateID + '\'' +
                ", fullName = '" + fullName + '\'' +
                ", birthDay = " + birthDay +
                ", phone = " + phone +
                ", email = '" + email + '\'' +
                ", candidateType = '" + candidateType + '\'' +
                ", candidateCount = '" + candidateCount + '\'';
    }
}
