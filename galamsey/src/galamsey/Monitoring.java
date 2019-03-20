/**
 * 
 */
package galamsey;

import java.util.ArrayList;

/**
 * @author rahulsrinivas
 *
 */
public class Monitoring extends Observatory {
	private ArrayList<Observatory> observatories;
	
	
	public  Monitoring() {
		this.observatories = new ArrayList<Observatory>();
	}
	
	public void addObservatory(Observatory observatory) {
		this.observatories.add(observatory);
	}
	
	public ArrayList<Observatory> getObservatories(){
		return this.observatories;
	}
	
	public Observatory largestAverage() {
		Observatory largestAverage = null;
		for(Observatory obs : observatories) {
			if(obs.averageColor() > largestAverage.averageColor()) {
				largestAverage = obs;
			}
		}
		return largestAverage;
	}
	
	public int colorValue() {
		int value = 0;
		for(Observatory obs : observatories) {
			if (obs.largestColor() > value) {
				value = obs.largestColor();
			}
		}
		return value;
	}
	
	public ArrayList<Galamsey> allEventsGreater(int colorValue){
		ArrayList<Galamsey> events =  new ArrayList<Galamsey>();
		for (Observatory obs : observatories) {
			for (Galamsey event : obs.getEvents()) {
				if (event.getColorValue() > colorValue) {
					events.add(event);
				}
			}
		}
		return events;
	}
	
	

	

}
