package com.anthonyguthrie.zdailycode_003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Scanner;

@SpringBootApplication
public class Zdailycode003Application {

	public static void main(String[] args) {
		SpringApplication.run(Zdailycode003Application.class, args);

		System.out.println("Application running...");
	}

	/*	Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
		We define a token to be one or more consecutive English alphabetic letters.
		Then, print the number of tokens, followed by each token on a new line.
	* */
	public static String tokenCountAndPrint(String s) {
		String[] split = s.split("[ !,?._'@]+");
		StringBuilder sb = new StringBuilder();
		sb.append(split.length + "\n");
		Arrays.stream(split).forEach((i)->{
			if (i.trim().length() != 0) {
				sb.append(i + "\n");
			}
		});
		return sb.toString().trim();
	}
}
