import java.util.Observable;

public class WeatherDataBuiltIn extends Observable {

	/* class-specific data */
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherDataBuiltIn() {
		/* nothing here! */
	}

	public void measurementsChanged() {

		setChanged(); /* Observable-inherited method */
		notifyObservers(); /* pull model of call */
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {

		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/* getter methods */
	public float getTemperature() {

		return temperature;
	}

	public float getHumidity() {

		return humidity;
	}

	public float getPressure() {

		return pressure;
	}
}