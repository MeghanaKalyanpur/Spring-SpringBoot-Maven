package com.hms.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hms.JavaBasedConfiguration.Config.AppConfigJava;

import com.hms.JavaBasedConfiguration.PhysicalMedicine;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfigJava.class);
    	
    	
    	Patient patient= (Patient) context.getBean("patient");
        patient.displayPatientDetails();
    	
    	
//        PhysicalMedicine pm =context.getBean(PhysicalMedicine.class);
//        //calling a bean by name
//        pm = context.getBean("pm1", PhysicalMedicine.class);
//        pm.generalTreatment();
        InPatient inPatient= context.getBean("inPatient",InPatient.class);
        inPatient.showInPatientDetails();
        
        
       
        
        System.out.println( "Hello World!" );
    }
}
