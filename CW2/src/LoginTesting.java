import static org.junit.jupiter.api.Assertions.*;
import java.sql.Statement;
import org.junit.jupiter.api.Test;

class LoginTesting {

 

    @Test
    void test() {

    
        Login ltest =new Login();
        int result=ltest.userLogin("gg","gg");
        assertEquals(1,result);
    }

 

}