package my.way.model.enums;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author boyiren
 * @date 2019-10-02
 */
public class PostStatusTest {

    @Test
    public void getValue() {
        for (PostStatus postStatus : PostStatus.values()) {
            System.out.println(postStatus + " " + postStatus.getValue());
        }
    }
}