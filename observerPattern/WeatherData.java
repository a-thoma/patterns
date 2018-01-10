import java.util.ArrayList;

public class WeatherData implements Subject {

	/* class-specific data */
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	/* WeatherData constructor */
	public WeatherData() {

		/* initialize our ArrayList of Observers */
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {

		observers.add(o);
	}

	public void removeObserver(Observer o) {

		/* search through the ArrayList for our Observer */
		int i = observers.indexOf(o);

		/* error checking for index */
		if(i >= 0) observers.remove(o);
	}

	/* abstracted from measurementsChanged() */
	public void notifyObservers() {

		/* newer for loop, read as for(Type name in place) */
		for(Observer observer : observers) {

			/* tell everyone what happened */
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {

		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {

		/* this is a method to test in lieu of an actual hardware module
		 * set some values that we would get from a real module
		 */
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		/* now tell the displays */
		measurementsChanged();
	}

	/* other methods below */
}