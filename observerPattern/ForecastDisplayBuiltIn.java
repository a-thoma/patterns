/* from p. 69 */
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplayBuiltIn implements Observer, DisplayElement {

	/* class-specific data */
	Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;

	/* ForecastDisplayBuiltIn constructor */
	public ForecastDisplayBuiltIn(Observable observable) {
		
		this.observable = observable;
		observable.addObserver(this);
	}

	public void update (Observable obs, Object arg) {

		if(obs instanceof WeatherDataBuiltIn) {

			WeatherDataBuiltIn weatherData = (WeatherDataBuiltIn)obs;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {

		/* dependent on the pressure, we can forecast the weather */
		System.out.print("Forecast: ");
		if(currentPressure > lastPressure) {

			System.out.println("Improving weather on the way!");
		}
		else if(currentPressure == lastPressure) {

			System.out.println("More of the same.");
		}
		else if(currentPressure < lastPressure) {

			System.out.println("Watch out for cooler, rainy weather.");
		}
	}
}