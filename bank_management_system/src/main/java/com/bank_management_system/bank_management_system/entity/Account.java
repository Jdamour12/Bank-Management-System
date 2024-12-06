package com.bank_management_system.bank_management_system.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "The PAN Number is required")
    private Long PANNumber;
    @NotEmpty(message = "The account type is required")
    private String accountType;
    @NotEmpty(message = "The account number is required")
    private Long accountNumber;
    @NotEmpty(message = "The customer name is required")
    private String customerName;
    @NotEmpty(message = "The address is required")
    private String address;
    @NotEmpty(message = "The adhar number is required")
    private Long adharNumber;
    @NotEmpty(message = "The phone number is required")
    private String phone;
    @NotEmpty(message = "The email is required")
    private String email;
    @NotEmpty(message = "The if8c is required")
    private String if8c;
    
    public Long getPANNumber() {
        return PANNumber;
    }
    public void setPANNumber(Long pANNumber) {
        PANNumber = pANNumber;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    public Long getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Long getAdharNumber() {
        return adharNumber;
    }
    public void setAdharNumber(Long adharNumber) {
        this.adharNumber = adharNumber;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIf8c() {
        return if8c;
    }
    public void setIf8c(String if8c) {
        this.if8c = if8c;
    }   
}
