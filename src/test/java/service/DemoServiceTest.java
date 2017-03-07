package service;

import org.junit.Before;
import org.junit.Test;

import com.demo.service.DemoService;

public class DemoServiceTest {

	private final DemoService demoService;

	public DemoServiceTest() {
		demoService = new DemoService();
	}

	@Before
	public void init() {
		// todo init db
	}

	@Test
	public void test() {
		demoService.get();
	}

}
