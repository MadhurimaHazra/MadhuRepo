package com.example.mockito.MockitoSpringStage2part2;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class SomeBusinessStubTest {
	
	@Test
	public void testfindGreatestFromAllData() {
		SomeBusinessImpl someBusinessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = someBusinessImpl.findGreatestFromAllData();
		assertEquals(12, result);
		
	}

}
// ----------------------Stub------------------------------

class DataServiceStub implements DataService{
	
	
	@Override
	public int[] retrieveAllData() {
		return new int[] {6,8,12};
	}
}