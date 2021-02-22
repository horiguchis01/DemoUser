import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
public class DemoUserTest {
    @Test
    void test_createUser_success() {
        // when: ユーザーネーム(10文字以上)、パスワード(8文字以上)を入力すると
        String userName = "1234567890";
        String password = "12345678";
        DemoUser demoUser = new DemoUser(userName, password);

        // Then: ユーザーオブジェクトが作られる
        Assertions.assertNotEquals(demoUser, null);
        Assertions.assertEquals(demoUser.getUserName(), userName);
        Assertions.assertEquals(demoUser.getPassword(), password);
    }

    @Test
    void test_createUser_fail_userNameLength() {
        // When: ユーザーネームに9文字以下を入力すると
        String userName = "123456789";
        String password = "12345678";

        // Then: 例外が投げられる
        assertThrows(IllegalArgumentException.class,
                () -> new DemoUser(userName, password));
    }


//    @Test
//    void test_createUser_fail_passwordLength() {
//        // When: ユーザーネームに7文字以下を入力すると
//        String userName = "1234567890";
//        String password = "1234567";
//
//        // Then: 例外が投げられる
//        assertThrows(IllegalArgumentException.class,
//                () -> new DemoUser(userName, password));
//    }

}
