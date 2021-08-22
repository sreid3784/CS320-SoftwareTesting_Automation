package Test;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentServiceTest {
	
	//The appointment service shall be able to add appointments with a unique ID.
		@Test
		public void testAddAppointment() {
			Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
			
			//creates a new appointment

			Appointment testAppointment = new Appointment("1",10-31-2021, "Halloween");
			
			
			//add appointments to appointment list
			addAppointmentToList(testAppointment);
		
			
			//validates appointment was created
			assertTrue(testAppointment.getID().equals("1"));
			assertTrue(testAppointment.getDate().equals(10-31-2021));
			assertTrue(testAppointment.getDescription().equals("Halloween"));
		
		}
		
		
		//The appointment service shall be able to delete appointments with a unique ID.
			@Test
			public void testDeleteAppointment() {
				Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
				
				//creates a new task

				Appointment testAppointment = new Appointment("1",10-31-2021, "Halloween");
				
				
				//add appointment to task list
				addAppointmentToList(testAppointment);
				
				//delete appointment
				deleteAppointment(testAppointment);
			
				
				//validates appointment was deleted
				assertTrue(testAppointment.getID().equals(null));
				assertTrue(testAppointment.getDate().equals(null));
				assertTrue(testAppointment.getDescription().equals(null));
			
			}

}
