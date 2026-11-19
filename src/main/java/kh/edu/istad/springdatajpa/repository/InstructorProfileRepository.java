package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.InstructorProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorProfileRepository extends JpaRepository<InstructorProfile, String> {
}
