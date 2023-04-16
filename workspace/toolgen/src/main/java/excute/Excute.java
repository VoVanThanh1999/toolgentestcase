package excute;

import java.io.IOException;

import bussiness.TestCaseServiceImp;

public class Excute {
	public static void main(String[] args) throws IOException {
		TestCaseServiceImp teamplateTestCase = new TestCaseServiceImp();

		teamplateTestCase.getTestCase();
	}
}
