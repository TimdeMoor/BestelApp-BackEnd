package com.restaurantapp.RestaurantApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class RestaurantAppApplicationTests {


	@Test //De volgende test is een demo om uit te proberen hoe junit werkt
	void demoTestAdd() {
		//Arrange
		demoClass demo = new demoClass();
		int a = 10;
		int b = 20;

		//Act
		int result = demo.add(a, b);

		//Assert
		int expected = 30; //10 + 20 = 30

		assertThat(result).isNotNull(); //check dat het resultaat niet leeg is
		assertThat(result).isEqualTo(expected); //check dat het resultaat gelijk is aan het verwachtte resultaat
	}

	@Test
	void demoTestSubtract(){
		//Arrange
		demoClass demo = new demoClass();
		int a = 100;
		int b = 30;

		//Act
		int result = demo.subtract(100, 30);

		//Assert
		int expected = 70; //100 - 30 = 70

		assertThat(result).isNotNull(); //check dat het resultaat niet leeg is
		assertThat(result).isEqualTo(expected); //check dat het resultaat gelijk is aan het verwachtte resultaat
	}



	class demoClass{
		public int add(int a, int b){
			return a + b;
		}
		public int subtract(int a, int b){
			return a - b;
		}
	}

}
