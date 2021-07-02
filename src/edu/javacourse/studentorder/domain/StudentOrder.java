package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.register.Child;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentOrder {

    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private List<Child> children;
    private String MarriageCertificateId;
    private LocalDate MarriageDate;
    private String MarriageOffice;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void addChild(Child child) {
       if (child == null){
           children = new ArrayList<>(5);
       }
       children.add(child);
    }

    public String getMarriageCertificateId() {
        return MarriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        MarriageCertificateId = marriageCertificateId;
    }

    public LocalDate getMarriageDate() {
        return MarriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        MarriageDate = marriageDate;
    }

    public String getMarriageOffice() {
        return MarriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        MarriageOffice = marriageOffice;
    }
}
