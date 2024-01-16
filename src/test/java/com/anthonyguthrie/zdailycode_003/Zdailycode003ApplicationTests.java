package com.anthonyguthrie.zdailycode_003;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class Zdailycode003ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testTokenCountAndPrint() {
		Assert.isTrue(true, "Testing the string message");

		String string1 = "He is a very very good boy, isn't he?";
		String testresult1 = Zdailycode003Application.tokenCountAndPrint(string1);
		String result1 = "10\n" +
				"He\n" +
				"is\n" +
				"a\n" +
				"very\n" +
				"very\n" +
				"good\n" +
				"boy\n" +
				"isn\n" +
				"t\n" +
				"he";

		Assert.isTrue(result1.equals(testresult1), "Test string 1.");

		String string2 = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
		String testresult2 = Zdailycode003Application.tokenCountAndPrint(string2);
		String result2 = "21\n" +
				"Hello\n" +
				"thanks\n" +
				"for\n" +
				"attempting\n" +
				"this\n" +
				"problem\n" +
				"Hope\n" +
				"it\n" +
				"will\n" +
				"help\n" +
				"you\n" +
				"to\n" +
				"learn\n" +
				"java\n" +
				"Good\n" +
				"luck\n" +
				"and\n" +
				"have\n" +
				"a\n" +
				"nice\n" +
				"day";
		System.out.println(result2);
		System.out.println(testresult2);
		Assert.isTrue(result2.equals(testresult2), "Test string 2");
	}
}
