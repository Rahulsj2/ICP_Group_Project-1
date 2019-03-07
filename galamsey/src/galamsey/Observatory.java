/**
 * 
 */
package galamsey;

/**
 * @author rahulsrinivas
 *
 */

import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Observatory extends Galamsey {
	private String observatoryName;
	private String countryName;
	private int yearStarted;
	private float areaCovered;
	private Date dateStarted;
	private ArrayList<String> galamseyEvents;
	
	public Observatory() {
		this.observatoryName = null;
		this.countryName = null;
		this.yearStarted = 0;
		this.areaCovered = 0;
		this.galamseyEvents = new ArrayList<String>();
	}
	public Observatory(String observatoryName, String countryName, int year, float area) {
		this.observatoryName = observatoryName;
		this.countryName = countryName;
		this.yearStarted = year;
		this.areaCovered = area;
		this.galamseyEvents = new ArrayList<String>();
	}
	
	public void setName(String name) {
		this.observatoryName = name;
	}
	
	public void setCountry(String country) {
		this.countryName = country;
	}
	public void setDate(String date) {
		try {
			dateStarted = new SimpleDateFormat("dd/mm/yy").parse(date);
		} catch(ParseException e) {
			System.out.println("Date " + date + " is unparseable");
		}	
	}
	
	public void setYear(int year) {
		this.yearStarted = year;
	}
	
	public void setArea(float area) {
		this.areaCovered = area;
	}
	
//	public void setEvent(String[] event) {
//		for(int i=0; i<event.length; i++) {
//			this.galamseyEvents.add(event(i))
//		}
//	}
	
	public String getName() {
		return this.observatoryName;
	}
	
	public String getCountry() {
		return this.countryName;
	}
	
//	public Date getDate() {
//		retrun this.dateStarted;
//	}
	
	public int getYear() {
		
		return this.yearStarted;
	}
	
	public float getArea() {
		return this.areaCovered;
	}
	
	public ArrayList<String> getEvents(){
		return this.galamseyEvents;
	}
	@Override
	public String toString() {
		return "Observatory [ Observatory name = " + observatoryName + ", Country name = " + countryName + ", Year started = "
				+ yearStarted + ", Area covered = " + areaCovered + ", Date started=" + dateStarted + ", Galamsey events = "
				+ galamseyEvents + " ]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Observatory other = (Observatory) obj;
		if (Float.floatToIntBits(areaCovered) != Float.floatToIntBits(other.areaCovered))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (dateStarted == null) {
			if (other.dateStarted != null)
				return false;
		} else if (!dateStarted.equals(other.dateStarted))
			return false;
		if (galamseyEvents == null) {
			if (other.galamseyEvents != null)
				return false;
		} else if (!galamseyEvents.equals(other.galamseyEvents))
			return false;
		if (observatoryName == null) {
			if (other.observatoryName != null)
				return false;
		} else if (!observatoryName.equals(other.observatoryName))
			return false;
		if (yearStarted != other.yearStarted)
			return false;
		return true;
	}
	
	// allow to select events they want to see.
	
//	public String[] getEvents(int start, int end) {
//		String[] events = new String[end-start+1];
//		for(int i = start-1; i < end; i++) {
//			int n = 0;
//			events[n] = this.galamseyEvents[i];
//			n++
//		}
//		return events;
//	}
//	public String toString() {
//		return "Observatory: " + observatoryName + "\n" + "Country: " + countryName + "\n" + "Year: " + yearStarted + "\n" + "Area Covered: " + areaCovered + "Galamsey Events: " + galamseyEvents + "\n"
//	}
	
	
}
