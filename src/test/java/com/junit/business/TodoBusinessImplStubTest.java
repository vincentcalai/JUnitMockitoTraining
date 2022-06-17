package com.junit.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.junit.data.api.TodoService;
import com.junit.helper.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub2() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
	
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy1");
		
		assertEquals(2, filteredTodos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_exactMatches() {
		TodoService todoServiceStub = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
	
		List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy2");
		
		assertTrue(filteredTodos.contains("Learn Spring MVC"));
	}
	
	

}
