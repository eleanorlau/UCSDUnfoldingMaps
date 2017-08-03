package module6;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimpleLinesMarker;
import processing.core.PGraphics;

import java.util.List;

/** 
 * A class to represent AirportMarkers on a world map.
 *   
 * @author Adam Setters and the UC San Diego Intermediate Software Development
 * MOOC team
 *
 */
public class AirportMarker extends CommonMarker implements Comparable<AirportMarker> {
	public static List<SimpleLinesMarker> routes;
	
	public AirportMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
	
	}

	private double distance;

	@Override
	public void drawMarker(PGraphics pg, float x, float y) {
		pg.fill(0,255,0);
		pg.ellipse(x, y, 10, 10);
		
		
	}

	@Override
	public void showTitle(PGraphics pg, float x, float y) {
		 // show rectangle with title
		String name = getStringProperty("name");

		pg.pushStyle();
		int SIZE = 5;
		pg.fill(255, 255, 255);
		pg.textSize(12);
		pg.text(name, x+3, y-SIZE-33);

		pg.popStyle();
		
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getDistance() {
		return this.distance;
	}

	public int compareTo(AirportMarker airport) {
		if(this.distance < airport.distance) {
			return -1;
		}
		else if(this.distance > airport.distance) {
			return 1;
		}
		else {return 0;}
	}

}
