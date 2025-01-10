package exceptions;

public class WeatherException extends Exception {
    public WeatherException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка из-за погодных условий: " + super.getMessage();
    }
}
