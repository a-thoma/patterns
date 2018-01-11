public class WeatherStationBuiltIn {

	public static void main(String[] args) {

		WeatherDataBuiltIn weatherData = new WeatherDataBuiltIn();

		CurrentConditionsDisplayBuiltIn currentDisplay =
				new CurrentConditionsDisplayBuiltIn(weatherData);

		// HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplayBuiltIn forecastDisplay = new ForecastDisplayBuiltIn(weatherData);


		/* now to simulate some measurements */
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}