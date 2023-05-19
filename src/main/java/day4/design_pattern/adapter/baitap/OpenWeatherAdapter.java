package day4.design_pattern.adapter.baitap;

import java.util.Random;

class OpenWeatherAdapter implements Weather {
    private OpenWeatherMap openWeatherMap;

    public OpenWeatherAdapter() {
        openWeatherMap = new OpenWeatherMap();
    }

    @Override
    public String getWeather(String city) {
        double temperature = generateRandomTemperature();
        double humidity = generateRandomHumidity();
        double wind = 5.0;
        double pressure = 200.0;

        return "[Hump: " + humidity + "%, Temp: " + temperature + "°F, Pressure: " +
                pressure + " Pa, Wind: " + wind + " m/s]";
    }

    private double generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(61) + 60;
    }

    private double generateRandomHumidity() {
        Random random = new Random();
        return random.nextInt(41) + 40;
    }
}