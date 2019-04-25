package com.mycity.api;


import com.mycity.dto.PostDto;
import com.mycity.service.PostService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by erman.payasli on 22.04.2019
 */
@RestController
@RequestMapping("/post")
public class PostController
{
    private final PostService postServiceImpl;

    public PostController(PostService postServiceImpl)
    {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getById(@PathVariable(value = "id", required = true) Long id)
    {
        PostDto postDto = postServiceImpl.getById(id);
        return ResponseEntity.ok(postDto);
    }

    @PostMapping()
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto post)
    {
        return ResponseEntity.ok(postServiceImpl.save(post));
    }

    //@RequestMapping(path = "/update",method = RequestMethod.PUT)
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@PathVariable("id") Long id, @Valid @RequestBody PostDto post)
    {
        return ResponseEntity.ok(postServiceImpl.update(id, post));
    }

    @RequestMapping(path = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<PostDto> updatePostWithReqMapping(@PathVariable(value = "id", required = true) Long id, @Valid @RequestBody PostDto post)
    {
        return ResponseEntity.ok(postServiceImpl.update(id, post));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id)
    {
        return ResponseEntity.ok(postServiceImpl.deleteById(id));


    }
}
