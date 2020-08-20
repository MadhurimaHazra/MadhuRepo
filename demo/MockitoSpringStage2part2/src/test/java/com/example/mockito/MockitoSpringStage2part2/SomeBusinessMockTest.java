package com.example.mockito.MockitoSpringStage2part2;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



//@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@Test
	public void testfindGreatestFromAllData() {
		DataService dataServiceMock	= mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,5,6});
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(12, result);
		
	}

}
// ----------------------Mock------------------------------ Using @Mock----------------------

//	@Mock
//	DataService dataService;
//	
//	@InjectMocks
//	SomeBusinessImpl someBusinessImpl;
//	
//	
//	@Test
//	public void testfindGreatestFromAllData() {
////		DataService dataServiceMock	= mock(DataService.class);
//		when(dataService.retrieveAllData()).thenReturn(new int[] {12,5,6});
////		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(dataServiceMock);
//		int result = someBusinessImpl.findGreatestFromAllData();
//		assertEquals(12, result);
//		
//}}
	
