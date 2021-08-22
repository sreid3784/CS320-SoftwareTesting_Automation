package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;
import java.util.Date;
import java.time.LocalDate;

public class AppointmentTest {
	
	
	//appointment ID shall not be null
	public void createNullAppointmentID() {
		
		Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
		
		Appointment testAppointment = new Appointment(null,10-31-2021, "Halloween");
		
		addAppointmentToList(testAppointment);
		
	}
	
		
	//this test will check for null values in task ID
	@Test
		public void nullAppointmentIDTest() {
		
		MyAssertNullAppointmentIDTest msnt = new MyAssertNullAppointmentIDTest();
        assertNotNull(msnt.getAppointmentValue("Appointment2"));
    }
	
	
	
	//appointment description shall not be null
		public void createNullAppointmentDescription() {
			
			Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
			
			Appointment testAppointment = new Appointment("1",10-31-2021, null);
			
			addAppointmentToList(testAppointment);
			
		}
		
			
		//this test will check for null values in appointment description
		@Test
			public void nullAppointmentDescriptionTest() {
			
			MyAssertNullAppointmentDescriptionTest msnt = new MyAssertNullAppointmentDescriptionTest();
	        assertNotNull(msnt.getAppointmentValue("1"));
	    }

		
		//appointment date shall not be null
		public void createNullAppointmentDate() {
			
			Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
			
			Appointment testAppointment = new Appointment("1",null, "Halloween");
			
			addAppointmentToList(testAppointment);
			
		}
		
			
		//this test will check for null values in appointment date
		@Test
			public void nullAppointmentDateTest() {
			
			MyAssertNullAppointmentDescriptionTest msnt = new MyAssertNullAppointmentDescriptionTest();
	        assertNotNull(msnt.getAppointmentValue("1"));
	    }
		
		//check length of appt ID
		
		public void testAppointmentIDLength() {
			
			//this test will check the character length of ID
			Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
			
			Appointment testAppointment = new Appointment("10000000000",10-31-2021, "Halloween");
			
			int AppointmentIDLength = 10;
			
			//checks length of Appointment ID
			@Test
				
			assert testAppointment.getAppointmentID().length() >= 10 : "ID length is incorrect";
			}
			
			

		//check length of description
		public void testAppointmentDescriptionLength() {
				
				//this test will check the character length of appointment description
				Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
				
				Appointment testAppointment = new Appointment("1",10-31-2021, "Halloweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeen");
			
			int appointmentDescriptionLength = 50;
			
			//checks length of description
			@Test
				
			assert testAppointment.getDescription().length() >= 50 : "Name length is incorrect";
			}
			
			
		
		
		//checks to see if date is in the past
			
			public void testDateInPast() {
				//this test will check if the appointment date is in the past
				Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
				
				Appointment testAppointment = new Appointment("1",07-04-1776, "Inaugural 4th of July");
				
				LocalDate currentDate = LocalDate.now();
				
				//checks if date of appointment is in the past
				@Test
				if(testAppointment.getDate().isbefore(currentDate)) {
					assert testAppointment.getDate() : "Date is in the past";
				}

				
			}
				
		
}
