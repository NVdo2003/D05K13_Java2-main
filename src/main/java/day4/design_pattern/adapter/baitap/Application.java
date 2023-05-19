package day4.design_pattern.adapter.baitap;


public class Application {
    public static void main(String[] args) {
        Weather weather = new WeatherCityInVietNam();

        String city = "Thanh Hóa";
        String weatherInfo = weather.getWeather(city);
        System.out.println(city);
        System.out.println(weatherInfo);

        weather = new OpenWeatherAdapter();

        city = "Seol";
        weatherInfo = weather.getWeather(city);
        System.out.println(city);
        System.out.println(weatherInfo);
    }
}
