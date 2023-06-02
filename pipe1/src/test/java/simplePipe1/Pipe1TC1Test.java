package simplePipe1;

import org.testng.annotations.Test;

public class Pipe1TC1Test {

	@Test
	public void pipe1Test() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}
}
