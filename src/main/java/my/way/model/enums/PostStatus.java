package my.way.model.enums;

/**
 * 文章状态
 *
 * @author boyiren
 * @date 2019-10-01
 */
public enum PostStatus {
    /**
     * 状态-已发布
     */
    PUBLISHED(0),

    /**
     * 状态-草稿
     */
    DRAFT(1),

    /**
     * 状态-回收
     */
    RECYCLE(2),

    /**
     * 状态-私人
     */
    INTIMATE(3);

    private final int value;

    PostStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
