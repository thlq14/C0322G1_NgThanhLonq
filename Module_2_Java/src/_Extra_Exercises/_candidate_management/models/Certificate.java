package _Extra_Exercises._candidate_management.models;

import java.time.LocalDate;

public class Certificate {
    private String certificatedID;
    private String certificateName;
    private String certificateRank;
    private LocalDate certificateDate;

    public Certificate() {
    }

    public Certificate(String certificatedID, String certificateName, String certificateRank, LocalDate certificateDate) {
        this.certificatedID = certificatedID;
        this.certificateName = certificateName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate {" +
                "certificatedID = '" + certificatedID + '\'' +
                ", certificateName = '" + certificateName + '\'' +
                ", certificateRank = '" + certificateRank + '\'' +
                ", certificateDate = " + certificateDate +
                '}';
    }
}
