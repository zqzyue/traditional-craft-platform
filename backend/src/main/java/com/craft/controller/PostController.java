package com.craft.controller;

import com.craft.dto.PostDTO;
import com.craft.common.Result;
import com.craft.entity.Post;
import com.craft.mapper.PointsMapper;
import com.craft.mapper.PostMapper;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PostController {

    private final PostMapper postMapper;
    private final PointsMapper pointsMapper;

    public PostController(PostMapper postMapper, PointsMapper pointsMapper) {
        this.postMapper = postMapper;
        this.pointsMapper = pointsMapper;
    }

    @GetMapping("/posts")
    public Result<List<Post>> getPosts() {
        return Result.ok(postMapper.listAll());
    }

    @PostMapping("/posts")
    public Result<Long> createPost(@RequestBody @Valid PostDTO dto) {
        Post p = new Post();
        p.setTitle(dto.getTitle());
        p.setCoverImg(dto.getCoverImg());
        p.setAuthorId(1L);
        postMapper.insert(p);
        pointsMapper.insert(1L, 10, "PUBLISH");
        return Result.ok(p.getId());
    }
}