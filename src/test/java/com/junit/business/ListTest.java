package com.junit.business;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

import static org.hamcrest.CoreMatchers.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockListSizeMethod() {
		//Given - setup
		List listMock = mock(List.class);
		//When - actual method call
		when(listMock.size()).thenReturn(2);
		//Then - asserts
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
		assertEquals(2, listMock.size());
	}
	
	@Test
	public void letsMockListSize_ReturnMultipleValues() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2).thenReturn(3);
		
		assertEquals(2, listMock.size());
		assertEquals(3, listMock.size());
	}
	
	@Test
	public void letsMockListGet() {
		List listMock = mock(List.class);
		//Arguement Matcher
		when(listMock.get(anyInt())).thenReturn("in28Minutes");
		
		assertEquals("in28Minutes", listMock.get(0));
		assertEquals("in28Minutes", listMock.get(1));
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockList_throwAnException() {
		List listMock = mock(List.class);
		when(listMock.get(anyInt())).thenThrow(new RuntimeException("throw an exception"));
		listMock.get(0);
	}
	
	@Test(expected = RuntimeException.class)
	public void letsMockList_mixingUp() {
		List listMock = mock(List.class);
		when(listMock.subList(anyInt(),5)).thenThrow(new RuntimeException("throw an exception"));
		listMock.get(0);
		listMock.get(5);
	}
	
	@Test
	public void letsMockListGet_usingBDD() {
		//Given
		List<String> listMock = mock(List.class);
		given(listMock.get(anyInt())).willReturn("in28Minutes");
		
		//When
		String firstMatch = listMock.get(0);
		
		//Then
		assertThat(firstMatch, is("in28Minutes"));
	}

}
