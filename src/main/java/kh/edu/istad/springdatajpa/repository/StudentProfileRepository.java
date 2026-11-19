package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.StudentProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentProfileRepository extends JpaRepository<StudentProfile, String> {
}
