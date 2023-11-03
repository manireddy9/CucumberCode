package ParaBankSource;

import io.cucumber.java.Before;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	@Before
	public static void setUp() {
		HelperClass.SetUpDriver();
	}
	
	@After
	public static void  tearDown() {
		HelperClass.TearDown();
	}

}
//
//

