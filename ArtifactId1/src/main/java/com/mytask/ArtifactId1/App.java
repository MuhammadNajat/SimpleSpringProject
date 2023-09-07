package com.mytask.ArtifactId1;

///import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	//ApplicationContext context = new ClassPathXmlApplicationContext(AppConfig.class);
    	Drivable bike = (Drivable) context.getBean("bike");
        bike.drive();
        
        Drivable car = (Drivable) context.getBean("car");
        car.drive();
    	System.out.println( "Finished!!!" );
    	
    	Tyre tyre = (Tyre) context.getBean("tyre");
    	//tyre.setBrand("Chaka");
    	System.out.println(tyre);
    }
}
