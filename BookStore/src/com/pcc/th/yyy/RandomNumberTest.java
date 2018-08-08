package com.pcc.th.yyy;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

class RandomNumberTest {

	@Test
	void test() {
		Random random = new Random5();
		RandomNumber p = new RandomNumber();
		assertEquals(5, p.generate(random));
	}

}

class Random5 extends Random {

	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		return 5;
	}
	
}
