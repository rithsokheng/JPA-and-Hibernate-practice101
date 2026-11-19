package kh.edu.istad.springdatajpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student_profiles")

public class StudentProfile {

    @Id
    @Column(name = "user_id", nullable = false, length = 255)
    private String userId;

    private String biography;

    @Column(name = "facebook_link")
    private String facebookLink;

    @Column(name = "github_link")
    private String githubLink;

    private String major;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String university;

    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments = new ArrayList<>();
}