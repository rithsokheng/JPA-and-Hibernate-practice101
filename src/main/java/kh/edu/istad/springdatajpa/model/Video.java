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
@Table(name = "videos")

public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String duration;

    @Column(name = "is_deleted")
    private Boolean isDeleted = false;

    @Column(name = "is_published")
    private Boolean isPublished = false;

    private String slug;

    private String thumbnail;

    private String title;

    private String youtube;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy = "video")
    private List<Comment> comments = new ArrayList<>();
}
