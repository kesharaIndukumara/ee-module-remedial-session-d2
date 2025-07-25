package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.service.PostService;
import edu.icet.ecom.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    //PostServiceImpl postServiceImpl;
    PostService postService;

    @GetMapping
    public List<PostDTO> getAll(){
        //return postServiceImpl.getAll();
        return postService.getAll();
    }
}
