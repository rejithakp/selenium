package seleniumtestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametrization {
	@Parameters("nm")
    @Test
    public void pass_value(String nm) {
		System.out.println(nm);
	}
}
