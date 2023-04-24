package com.example.ExpenseTracker.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tbl_expenses")
@Getter
@Setter
@ToString
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="description")
    private String expenseName;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name="note")
    private String note;

    @Column(name="created_at")
    private Long createdAt;
}
