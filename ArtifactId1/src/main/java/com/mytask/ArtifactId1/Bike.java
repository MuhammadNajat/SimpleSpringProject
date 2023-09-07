package com.mytask.ArtifactId1;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Drivable {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("~~~> Bike is running fast");
	}
	
}
