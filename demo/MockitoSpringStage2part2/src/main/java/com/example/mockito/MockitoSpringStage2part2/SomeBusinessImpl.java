package com.example.mockito.MockitoSpringStage2part2;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	
	protected SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	int findGreatestFromAllData() {
	int[] data =	dataService.retrieveAllData();
	int greatest = Integer.MIN_VALUE;
	for(int value: data) {
		if(value > greatest) {
			greatest = value;
		}
	}
	return greatest;
	}

}
