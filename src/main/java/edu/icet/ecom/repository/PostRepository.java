package edu.icet.ecom.repository;

import edu.icet.ecom.model.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<PostEntity, Long> {
}
