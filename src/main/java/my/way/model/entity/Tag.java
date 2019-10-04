package my.way.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * 文章标签
 *
 * @author boyiren
 * @date 2019-10-03
 */
@Setter
@Getter
@Entity(name = "Tag")
@Table(name = "tag")
public class Tag {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标签名
     */
    @Column(name = "name", columnDefinition = "varchar(255) not null")
    private String name;

    /**
     * 多对多属性，post-tag
     */
    @ManyToMany(mappedBy = "tagList")
    private List<Post> postList;
}
