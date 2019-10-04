package my.way.repository;

import my.way.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 对 Category 进行 CRUD 的 DAO 层
 *
 * @author boyiren
 * @date 2019-10-04
 */
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
