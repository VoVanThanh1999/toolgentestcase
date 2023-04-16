package bussiness;

import java.io.IOException;
import java.util.List;

import model.TestCase;

public interface TestCaseService {
	
	public List<TestCase> getTestCase() throws IOException;
}
