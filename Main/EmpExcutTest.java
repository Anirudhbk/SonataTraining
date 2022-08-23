package com.sonata.Main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class EmpExcutTest {
	

	private int ySal;

	@Test
	public void ySal() {
		EmpExcutTest e1 = new EmpExcutTest();
		e1.ySal = 1200;
		Assertions.assertEquals(1200,e1.ySal);

	}
	@Test
	public void ySal1() {
		EmpExcutTest e1 = new EmpExcutTest();
		e1.ySal = 1200;
		Assertions.assertEquals(1200,e1.ySal);
	}
}