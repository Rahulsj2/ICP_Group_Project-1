/**
 * 
 */
package galamsey;

/**
 * @author Rahul Srinivas
 * @author Jefferson Welbeck
 * @author Pamela Anang
 * @author Albert Hodo
 *
 */
import java.util.Map;
//import java.util.Collection;
import java.util.HashMap;

public class Galamsey {
	private String vegColor;
	private int colorValue;
	private int yearOfEvent;
	//public float longitude;
	//public float latitude;
	public Map<String, Double> position = new HashMap<String, Double>();
	
	public Galamsey() {
		vegColor = null;
		colorValue = 0;
		yearOfEvent = 0;
		position = null;
	}
	
	public Galamsey(String color, int value, int year, double latitude, double longitude) {
		this.vegColor = color;
		this.colorValue = value;
		this.yearOfEvent = year;
		position.put("Longitude", longitude);
		position.put("Latitude", latitude);
	}
	
	
	public void setVegColor(String color) {
		this.vegColor = color;
	}
	
	
	public void setColorValue(int value) {
		this.colorValue = value;
	}
	
	
	public void setEventYear(int year) {
		this.yearOfEvent = year;
	}

	
	public void setPosition(double longitude, double latitude) {
		position.put("Longitude", longitude);
		position.put("Latitude", latitude);
	}
	
	public String getVegColor() {
		return this.vegColor;
	}

	public int getColorValue() {
		return this.colorValue;
	}
	
	public int getYearOfEvent() {
		return this.yearOfEvent;
	}
	
	public Map<String, Double> getPosition() {
		return this.position;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Galamsey other = (Galamsey) obj;
		if (colorValue != other.colorValue)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (vegColor == null) {
			if (other.vegColor != null)
				return false;
		} else if (!vegColor.equals(other.vegColor))
			return false;
		if (yearOfEvent != other.yearOfEvent)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Galamsey [Vegetation color = " + vegColor + ", Color value = " + colorValue + ", Year of event = " + yearOfEvent
				+ ", Position = " + position + "]";
	}

	public static void main(String[] args) {
		Galamsey first  = new Galamsey("Green", 1, 1999, 12.3,13.4);
		System.out.println(first.getPosition());
		
	}

}

