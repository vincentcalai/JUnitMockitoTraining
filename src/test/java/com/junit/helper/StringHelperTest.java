package com.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

	StringHelper helper;
	
	@Before
	public void before() {
		helper = new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// expected, actual
	}

	@Test
	public void testTruncateAInFirst2Positions_AinfirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_noAinString() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AnotInFirst2Positions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegative() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_2Characters() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_1Characters() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
}
