package com.hazem.BuggyApp.Entity;

import com.hazem.BuggyApp.Enum.Roles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "full_name")
    private String fullName;

    private String phone;
    private String password;

    @Enumerated(EnumType.STRING)
    private Roles role;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
