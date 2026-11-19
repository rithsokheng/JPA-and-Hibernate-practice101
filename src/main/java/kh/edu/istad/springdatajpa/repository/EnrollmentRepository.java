package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {

    List<Enrollment> findByStudentUserId(String userId);
    List<Enrollment> findByCourseId(Integer courseId);
    boolean existsByStudentUserIdAndCourseId(String userId, Integer courseId);
}
