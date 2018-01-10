public class CurrentConditionsDisplay implements Observer, DisplayElement {

	/* note how this class implements not one but TWO interfaces
	 * this is because this class is an observer, and should be able to display
	 * what it observes.
	 */

	/* class-specific data */
	private float temperature;
	private float humidity;
	private Subject weatherData;

	/* CurrentConditionsDisplay constructor */
	public CurrentConditionsDisplay(Subject weatherData) {

		this.weatherData = weatherData;

		/* register ourselves with weatherData Subject */
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {

		/* get a handle on the data observed and update the display */
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {

		/* basic printing */
		System.out.println("Current Conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}