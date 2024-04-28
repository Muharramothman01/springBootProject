package com.example.assignmentspring.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    public Customer(String fName, String lName, String email) {
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
    }

}
