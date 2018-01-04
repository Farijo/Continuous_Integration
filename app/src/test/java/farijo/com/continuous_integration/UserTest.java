package farijo.com.continuous_integration;

import junit.framework.Assert;

import org.junit.Test;

/**
 * Created by Eikichi on 04/01/2018.
 */

public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());
    }
}
