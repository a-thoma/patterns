import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayBuiltIn implements Observer, DisplayElement {

	/* class-specific data */
	Observable observable;
	private float temperature;
	private float humidity;

	/* CurrentConditonsDisplayBuiltIn constructor */
	public CurrentConditionsDisplayBuiltIn(Observable observable) {

		this.observable = observable;
		observable.addObserver(this);
	}

	public void update(Observable obs, Object arg) {

		/* check if obs is a specific Observable subclass, specifically
		 * WeatherDataBuiltIn
		 */
		if(obs instanceof WeatherDataBuiltIn) {

			WeatherDataBuiltIn weatherData = (WeatherDataBuiltIn)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}

	public void display() {

		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}