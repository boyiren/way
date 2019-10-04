package my.way.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 文章所属目录
 *
 * @author boyiren
 * @date 2019-10-03
 */
@Setter
@Getter
@Entity(name = "Category")
@Table(name = "category")
public class Category {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 目录名
     */
    @Column(name = "name", columnDefinition = "varchar(255) not null")
    private String name;

    /**
     * 一对多属性，级联所有权限，懒加载
     */
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> postList;
}
