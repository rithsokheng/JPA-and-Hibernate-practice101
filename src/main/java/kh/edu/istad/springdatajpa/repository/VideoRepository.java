package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

    List<Video> findByCourseIdAndIsDeletedFalse(Integer courseId);
    Optional<Video> findBySlug(String slug);
}
