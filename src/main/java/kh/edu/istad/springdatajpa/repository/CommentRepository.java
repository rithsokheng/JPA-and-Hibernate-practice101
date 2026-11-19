package kh.edu.istad.springdatajpa.repository;

import kh.edu.istad.springdatajpa.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

    List<Comment> findByVideoIdAndParentIsNullAndIsDeletedFalse(Integer videoId);
    List<Comment> findByParentId(Integer parentId);
}
