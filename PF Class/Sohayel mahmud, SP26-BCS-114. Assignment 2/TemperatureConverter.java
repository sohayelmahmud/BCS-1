public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 32, fahrenheit, kelvin;

        fahrenheit = (9 / 5 * celsius) + 32;
        kelvin = celsius + 273.15;

        System.out.println("The equivalent temperature in Farenheit is : " + fahrenheit);
        System.out.println("The equivalent temperature in Kelvin is : " + kelvin);
    }
}
