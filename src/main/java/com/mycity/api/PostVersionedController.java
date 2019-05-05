package com.mycity.api;


import com.mycity.dto.PostDto;
import com.mycity.service.PostService;
import com.mycity.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by erman.payasli on 26.04.2019
 */
@RestController
@RequestMapping("/versioning")
@Api(value = ApiPaths.PostCtrl.CTRL,description = "Post APIs")
public class PostVersionedController
{
    @Autowired
    private PostService postServiceImpl;

    public PostVersionedController(PostService postService)
    {
        this.postServiceImpl = postServiceImpl;
    }

    @GetMapping(value = "/{id}", params = "version=1")
    @ApiOperation(value = "Get By Id Opertion V1", response = PostDto.class)
    public ResponseEntity<PostDto> getByIdV1(@PathVariable(value = "id", required = true) Long id)
    {
        PostDto postDto = postServiceImpl.getById(id);
        return ResponseEntity.ok(postDto);
    }

    @GetMapping(value = "/{id}", params = "version=2")
    @ApiOperation(value = "Get By Id Opertion V2", response = PostDto.class)
    public ResponseEntity<PostDto> getByIdV2(@PathVariable(value = "id", required = true) Long id)
    {
        PostDto postDto = postServiceImpl.getById(id);
        return ResponseEntity.ok(postDto);
    }
}
