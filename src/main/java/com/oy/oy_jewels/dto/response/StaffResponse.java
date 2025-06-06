package com.oy.oy_jewels.dto.response;


import java.time.LocalDate;

public class StaffResponse {

    private Long id;
    private byte[] staffImage;
    private String staffName;
    private String emailAddress;
    private String contactNumber;
    private LocalDate joiningDate;
    private String staffRole;

    // Default constructor
    public StaffResponse() {}

    // Parameterized constructor
    public StaffResponse(Long id, byte[] staffImage, String staffName, String emailAddress,
                         String contactNumber, LocalDate joiningDate, String staffRole) {
        this.id = id;
        this.staffImage = staffImage;
        this.staffName = staffName;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.joiningDate = joiningDate;
        this.staffRole = staffRole;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getStaffImage() {
        return staffImage;
    }

    public void setStaffImage(byte[] staffImage) {
        this.staffImage = staffImage;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    @Override
    public String toString() {
        return "StaffResponse{" +
                "id=" + id +
                ", staffName='" + staffName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", joiningDate=" + joiningDate +
                ", staffRole='" + staffRole + '\'' +
                '}';
    }
}