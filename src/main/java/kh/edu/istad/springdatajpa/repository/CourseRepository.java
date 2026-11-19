package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    Optional<Course> findBySlugAndIsDeletedFalse(String slug);

    List<Course> findByIsPublishedTrueAndIsDeletedFalse();

    Page<Course> findByCategoryIdAndIsPublishedTrueAndIsDeletedFalse(Integer categoryId, Pageable pageable);

    List<Course> findByInstructorUserId(String instructorId);

    List<Course> findByTitleContainingIgnoreCaseAndIsPublishedTrue(String title);
}
