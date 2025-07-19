package edu.icet.ecom.model.entity;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog_posts")
public class PostEntity {
    @Id
    @CollectionTable
    private Long id;
    private String title;
    private String content;
    private List<String> tags;
    private String category;
    private Integer comments_count;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String image_url;

}
