package com.exaample.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAddition;


class AddTestCase {

	 @Test
	 void addTest5() {
		DefaultAddition add = new DefaultAddition();
		assertEquals(20,add.add(10,10));
		
	}
	 @Test
	 void addTest6() {
			DefaultAddition add = new DefaultAddition();
			assertEquals(20,add.add(10,10));
			
		}

}
