package com.vaishnavi.practice.spring.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Builder

public class Account {
    private int accountNumber;
    private String holderName;
    private double balance;
}
