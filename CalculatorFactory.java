public class CalculatorFactory {
    public static ICalculator createCalculator() {
        return new ComplexCalculator();
    }
}