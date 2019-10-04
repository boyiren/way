package my.way.repository;

import my.way.model.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 测试 Post 的 CRUD
 *
 * @author boyiren
 * @date 2019-10-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PostRepositoryTest {
    @Autowired
    private PostRepository postRepository;

    /**
     * 查
     */
    @Test
    public void findAll() {
        List<Post> postList = postRepository.findAll();
        System.out.println(postList);
        // System.out.println(postList.get(0).getCategory());
        System.out.println(postList.get(0).getTagList());
    }

    /**
     * 增
     */
    @Test
    @Transactional
    @Rollback
    public void save() {
        Post post = new Post();
        post.setTitle("标题：测试2");
        post.setContent("正文：测试2");

        postRepository.save(post);
    }
}