package edu.javacourse.studentorder.domain;

public class RegisterOffice {
    private long officeId;
    private String officeAreaID;
    private String officeName;

    public RegisterOffice() {
    }

    public RegisterOffice(long officeId, String officeAreaID, String officeName) {
        this.officeId = officeId;
        this.officeAreaID = officeAreaID;
        this.officeName = officeName;
    }

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeAreaID() {
        return officeAreaID;
    }

    public void setOfficeAreaID(String officeAreaID) {
        this.officeAreaID = officeAreaID;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
}
