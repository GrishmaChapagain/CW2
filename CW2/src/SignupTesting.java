import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SignupTesting {

	@Test
	void test() {

	
		Reg ltest =new Reg();
		int result=ltest.userSignup("op", "op", "op", "op", "op");
		assertEquals(1,result);
	}

}
