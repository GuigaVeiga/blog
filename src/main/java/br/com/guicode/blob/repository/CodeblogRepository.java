package br.com.guicode.blob.repository;

import br.com.guicode.blob.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeblogRepository extends JpaRepository<Post, Long> {
}
