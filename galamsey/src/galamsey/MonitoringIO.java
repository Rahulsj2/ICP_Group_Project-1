/**
 * 
 */
package galamsey;
import java.util.Scanner;

/**
 * @author rahulsrinivas
 *
 */

public class MonitoringIO extends Monitoring  {
	
	static Monitoring monitor = new Monitoring();
	
	//ArrayList<Galamsey> events = new ArrayList<Galamsey>();
	
	public static void newObservatory() {
		Observatory ob1 = new Observatory();
		
		Scanner obName = new Scanner(System.in);
		System.out.println("Enter the Observatory Name");
		String name = obName.nextLine();
		ob1.setName(name);
	
		Scanner obCountry = new Scanner(System.in);
		System.out.println("Enter the country of Observatory");
		String country = obCountry.nextLine();
		ob1.setCountry(country);
		
		//change to date
		Scanner obStart = new Scanner(System.in);
		System.out.println("Enter the year Observatory Started");
		int startYear = obStart.nextInt();
		ob1.setYear(startYear);
		
		Scanner obArea = new Scanner(System.in);
		System.out.println("Enter the Observatory area covered");
		float area = obArea.nextFloat();
		ob1.setArea(area);
		
		obName.close();
		obCountry.close();
		obStart.close();
		obArea.close();
		
		monitor.addObservatory(ob1);
		
	}
	
	public static void addGalamsey() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the oberservatory name");
		String obName = scan1.nextLine();
		for (Observatory obs : monitor.getObservatories()) {
			if (obs.getName() == obName) {
				int galCol = 0;
				Galamsey newGalamsey = new Galamsey();
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Enter the vegetation color");
				String galColor = scan2.nextLine();			
				
				if (galColor == "green") {
					galCol = 1;
				}else if (galColor == "yellow") {
					galCol = 2;
				}else if (galColor == "brown") {
					galCol = 3;
				}else {
					galCol = 0;
				}
				
				if (galCol != 0 ) {
					newGalamsey.setVegColor(galColor);
					newGalamsey.setColorValue(galCol);
					
					Scanner scan3 = new Scanner(System.in);
					System.out.println("Enter the year Galamsey started");
					int galYear = scan3.nextInt();
					newGalamsey.setEventYear(galYear);
					
					Scanner scan4 = new Scanner(System.in);
					System.out.println("Enter the galamsey Latitude");
					double galLat = scan4.nextDouble();
					
					Scanner scan5 = new Scanner(System.in);
					System.out.println("Enter the Observatory Name");
					double galLong = scan5.nextDouble();	
					newGalamsey.setPosition(galLong, galLat);
					
					scan3.close();
					scan4.close();
					scan5.close();
					
				}else {
					System.out.println("Color value does not exist");
				}
				
				obs.setEvent(newGalamsey);
				scan2.close();			
			} else {
				System.out.println("Observatory does not exist");
			}
		}
		
		scan1.close();
	}
	
//	public ArrayList<Galamsey> getLargestAvg() {
//		ArrayList<Galamsey> events = new ArrayList<Galamsey>();
//		Scanner ob = new Scanner(System.in);
//		System.out.println("Enter Observatory for statistics")
//		String ob1 = ob.nextLine();
//		for (Observatory obs : monitor.getObservatories()) {
//			if (obs.getName() == ob1) {
//				Scanner col = new Scanner(System.in);
//				System.out.println("Enter color value");
//				int colVal = col.nextInt();
//				for (Galamsey event: obs.getEvents()) {
//					if (event.getColorValue()> colVal) {
//						events.add(event);
//					}
//				}
//						
//			}
//	
//	}
		

	
	public static void newGalamsey() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Add to a new observatory");
		System.out.println("2. Add to an existing observatory");
		int scanVal = scan.nextInt();
		if (scanVal == 1) {
			MonitoringIO.newObservatory();
			MonitoringIO.addGalamsey();
			
		} else if ( scanVal == 2) {
			MonitoringIO.addGalamsey();
		} else {
			System.out.println("Option does not exist");
		}
		scan.close();
		
	}
	
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		System.out.println("Select From the Menu One of the choices");
		System.out.println("1. Galamsey");
		System.out.println("2. Observatory");
		int choice = scann.nextInt();
		
		if (choice == 1) {
			System.out.println("Create a new Galamsey Activity");
			MonitoringIO.newGalamsey();
		}
		else if (choice == 2) {
			System.out.println("Create a new Observatory");
			MonitoringIO.newObservatory();
		}else {
			System.out.println("Option does not exist");
		}
		
		scann.close();
	}
	
	

}
