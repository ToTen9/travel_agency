package fr.lernejo.travelsite;

public record inscription(String userName, String userCountry, String userEmail, WeatherExp weatherExp) {
    public enum WeatherExp {
        WARMER,
        COLDER
    };
}
