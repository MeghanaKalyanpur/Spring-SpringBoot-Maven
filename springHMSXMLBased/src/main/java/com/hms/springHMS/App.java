package com.hms.springHMS;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // creates spring container
        ApplicationContext context= new ClassPathXmlApplicationContext("SpringBeans.xml");
        
        Patient patient= (Patient) context.getBean("patient");
        patient.displayPatientDetails();
        Patient patient1= (Patient) context.getBean("patient1");
        patient.displayPatientDetails();
        Patient patient2= (Patient) context.getBean("patient2");
        patient.displayPatientDetails();
        
        InPatient inPatient= (InPatient) context.getBean("inPatient");
        inPatient.showInPatientDetails();
        
        InPatient inPatient1= (InPatient) context.getBean("inPatient1");
        inPatient1.showInPatientDetails();
//        Patient patient1= (Patient) context.getBean("patient");
//        patient1.displayPatientDetails();
//        		Patient p=new Patient();
//        		p.displayPatientDetails();
    }
}
