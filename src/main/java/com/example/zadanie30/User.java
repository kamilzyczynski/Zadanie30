package com.example.zadanie30;

import jakarta.validation.constraints.*;

public class User {
    @NotEmpty(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć co najmniej 3 znaki")
    private String firstName;
    @NotEmpty(message = "Pole nie może być puste")
    @Size(min = 3, message = "Pole musi mieć co najmniej 3 znaki")
    private String lastName;
    @NotEmpty(message = "Pole nie może być puste")
    private String address;
    @NotEmpty(message = "Pole nie może być puste")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "Wpisz poprawny kod pocztowy w formacie XX-XXX")
    private String postCode;
    @NotEmpty(message = "Pole nie może być puste")
    private String city;
    @NotEmpty(message = "Pole nie może być puste")
    @Email(message = "Pole musi zawierać poprawny adres email")
    private String email;
    @NotEmpty(message = "Pole nie może być puste")
    @Size(min = 8, message = "Pole musi mieć co najmniej 8 znaków")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#&()\\[\\]{}:;',?/*~$^+=<>]).+$", message = "Hasło musi zawierać min. 1 znak mały, duży i znak specjalny")
    private String password;

    @AssertTrue(message = "Akceptacja regulaminu jest wymagana")
    private boolean rulesAccepted;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isRulesAccepted() {
        return rulesAccepted;
    }

    public void setRulesAccepted(boolean rulesAccepted) {
        this.rulesAccepted = rulesAccepted;
    }
}
