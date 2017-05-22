
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Test3 {
	@DataProvider(name = "userdetails")
	public Object[][] testcasedata(Method m) {
		Object[][] data = null;

		if (m.getName().equals("testA")) {
			data = new Object[2][2];
			data[0][0] = "u1";
			data[0][1] = "p1";

			data[1][0] = "u2";
			data[1][1] = "p2";

			return data;
		} else if (m.getName().equals("testB")) {

			data = new Object[2][3];
			data[0][0] = "u1";
			data[0][1] = "p1";
			data[0][2] = "abc@gmail.com";

			data[1][0] = "u2";
			data[1][1] = "p2";
			data[1][2] = "xyz@gmail.com";

			// return data;
		}
		return data;

	}

}
