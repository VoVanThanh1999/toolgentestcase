package excute;

import java.io.IOException;

 
import bussiness.TestCaseService;
import bussiness.TestCaseServiceImp;

public class Excute {
	public static void main(String[] args) throws IOException {
		TestCaseService teamplateTestCase = new TestCaseServiceImp();
		
		teamplateTestCase.getTestCase();
	}
}
