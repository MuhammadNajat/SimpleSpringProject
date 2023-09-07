package com.mytask.ArtifactId1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Drivable {
	@Autowired
	private Tyre tyre;

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("===> Car is running");
		System.out.println("Car's Tyre is: " + tyre);
	}
}
