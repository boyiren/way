package my.way.repository;

import my.way.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 对 Post 进行 CRUD 的 DAO 层
 *
 * @author boyiren
 * @date 2019-10-04
 */
public interface PostRepository extends JpaRepository<Post, Integer> {
}
