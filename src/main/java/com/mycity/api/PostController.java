package com.mycity.api;


import com.mycity.dto.PostDto;
import com.mycity.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<PostDto> getById(@PathVariable("id") Long id){
        PostDto postDto = postServiceImpl.getById(id);
        return ResponseEntity.ok(postDto);
    }

    @PostMapping()
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto post){
       return ResponseEntity.ok(postServiceImpl.save(post));
    }


}
