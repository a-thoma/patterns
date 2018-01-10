public class WeatherStation {

	/* testing what we've made so far */
	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay =
				new CurrentConditionsDisplay(weatherData);

		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


		/* now to simulate some measurements */
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}