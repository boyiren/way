package my.way.model.entity;

import lombok.Data;
import my.way.model.enums.PostStatus;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 文章 实体
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
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    private String content;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 阅读数
     */
    private Long visits;

    /**
     * 点赞数
     */
    private Long likes;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态：0-以发布，1-草稿，2-回收，3-私人
     */
    private PostStatus status;

    /**
     * 已删除
     */
    private boolean deleted;

    /**
     * 是否置顶
     */
    private boolean toTop;

    /**
     * 是否允许评论
     */
    private boolean allowComment;
}
