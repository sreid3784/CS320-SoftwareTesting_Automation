import java.util.Date;

public class Appointment {
	
	//defined member variables
	
	
	//The appointment object shall have a required unique appointment ID string
	String appointmentID;
	public static final byte APPOINTMENTIDLENGTH = 10;
	
	
	//The appointment object shall have a required appointment Date field. 
	Date appointmentDate;
	
	
	//The appointment object shall have a required description String field
	String description;
	
	//make a constructor
	
	public Appointment(String appointmentID, Date appointmentDate, String description) {
		this.appointmentID = appointmentID;
		this.appointmentDate = appointmentDate;
		this.description = description;
	}
	
	//accessors and mutators
	public void setAppointmentID(String appointmentID) {
		appointmentID = this.appointmentID;
	}
	public String getAppointmentID () {
		return appointmentID;
	}
	
	public void setDescription(String description) {
		description = this.description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDate(Date appointmentDate) {
		appointmentDate = this.appointmentDate;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	
	
	

}
