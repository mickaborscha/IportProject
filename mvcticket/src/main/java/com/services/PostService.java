package com.services;
import com.models.Post;

import java.util.List;
/**
 * Created by Oleg on 4/22/2017.
 */


    public interface PostService {
        List<Post> findAll();
        List<Post> findLatest5();
        Post findById(Long id);
        Post create(Post post);
        Post edit(Post post);
        void deleteById(Long id);

}
