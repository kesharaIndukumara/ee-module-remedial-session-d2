package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.PostDTO;
import edu.icet.ecom.model.entity.PostEntity;
import edu.icet.ecom.repository.PostRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    ModelMapper mapper = new ModelMapper();

    public List<PostDTO> getAll(){
        List<PostEntity> postEntities = postRepository.findAll();
        List<PostDTO> postDTOS = new ArrayList<>();

        for(PostEntity postEntity: postEntities){
            postDTOS.add(mapper.map(postEntity,PostDTO.class));
//            PostDTO postDTO = new PostDTO();

//            postDTO.setId(postEntity.getId());
//            postDTO.setCategory(postEntity.getCategory());
//            postDTO.setTags(postEntity.getTags());
//            postDTO.setContent(postEntity.getContent());
//            postDTO.setTitle(postEntity.getTitle());
//            postDTO.setCommentCount(postEntity.getComments_count());
//
//            postDTOS.add(postDTO);
        }
        return postDTOS;
    }
}
