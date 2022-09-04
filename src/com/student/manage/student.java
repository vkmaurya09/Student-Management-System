package com.student.manage;

public class student {
    private int studId;
    private String studName;
    private String studPhone;
    private String studCity;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getStudName() {
        return studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudPhone() {
        return studPhone;
    }

    public void setStudPhone(String studPhone) {
        this.studPhone = studPhone;
    }

    public String getStudCity() {
        return studCity;
    }

    public void setStudCity(String studCity) {
        this.studCity = studCity;
    }

    public student(int studId, String studName, String studPhone, String studCity) {
        this.studId = studId;
        this.studName = studName;
        this.studPhone = studPhone;
        this.studCity = studCity;

    }

    public student(String studName, String studPhone, String studCity) {
        this.studName = studName;
        this.studPhone = studPhone;
        this.studCity = studCity;
    }

    public student(){
        super();
    }

    @Override
    public String toString() {
        return "student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studPhone='" + studPhone + '\'' +
                ", studCity='" + studCity + '\'' +
                '}';
    }
}
