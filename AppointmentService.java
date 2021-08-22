import java.util.Collection;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.List;
import java.util.Date;



public class AppointmentService {
	
	//The appointment service shall be able to add appointments with a unique appointment ID.
	
	Map <String, Appointment> appointmentList = new ConcurrentHashMap<String, Appointment>();
	
	
	 //Requirement 1 - add appointments to appointment list
	public void addAppointmentToList(String appointmentID, Date appointmentDate, String description) {
		
		Appointment testAppointment = new Appointment(appointmentID, appointmentDate, description);
	}
	
	
	//method to generate unique ID /  key
	private String makeKey(Appointment appointment) {
		return String.format("%s-%s", appointment.getAppointmentID());
	}
	
	//Requirement 2 - Method for deleting appointments 
	public void deleteAppointment(Appointment appointment) {
		
		appointmentList.containsValue(appointment);
	
	
}

	

}
