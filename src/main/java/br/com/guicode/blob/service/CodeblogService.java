package br.com.guicode.blob.service;

import br.com.guicode.blob.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();
    Post findByid(long id);
    Post save(Post post);
}
