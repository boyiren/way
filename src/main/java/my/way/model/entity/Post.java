package my.way.model.entity;

import lombok.Data;
import my.way.model.enums.PostStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 文章
 *
 * @author boyiren
 * @date 2019-10-01
 */
@Data
@Entity(name = "Post")
@Table(name = "post")
public class Post {
    /**
     * ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    @Column(name = "title", columnDefinition = "varchar(255) not null")
    private String title;

    /**
     * 摘要
     */
    @Column(name = "summary", columnDefinition = "varchar(500) default ''")
    private String summary;

    /**
     * 正文
     */
    @Column(name = "content", columnDefinition = "text not null")
    private String content;

    /**
     * 阅读数
     */
    @Column(name = "visits", columnDefinition = "bigint default 0")
    private Long visits;

    /**
     * 点赞数
     */
    @Column(name = "likes", columnDefinition = "bigint default 0")
    private Long likes;

    /**
     * 状态：0-以发布，1-草稿，2-回收，3-私人
     */
    @Column(name = "status", columnDefinition = "int default 1")
    private PostStatus status;

    /**
     * 创建时间
     */
    @Column(name = "create_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time", columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    private Date updateTime;

    /**
     * 是否置顶
     */
    @Column(name = "top", columnDefinition = "int default 0")
    private boolean top;

    /**
     * 是否允许评论，默认是允许，想要不允许评论在设置这个属性
     */
    @Column(name = "disallow_comment", columnDefinition = "int default 0")
    private boolean disallowComment;

    /**
     * 设置外键-目录，目录与文章为一对多关系
     */
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "category_id")
    private Category category;

    /**
     * 多对多属性，post-tag
     */
    @ManyToMany
    @JoinTable(
            name = "post_tag",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tagList;
}
