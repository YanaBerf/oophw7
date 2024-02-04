public class Main {
    public static void main(String[] args) {
        CalculatorV view = new CalculatorV();
        CalculatorController controller = new CalculatorController(view, CalculatorFactory.createCalculator());

        ComplexNumber n1 = new ComplexNumber(1, 3);
        ComplexNumber n2 = new ComplexNumber(4, 5);

        controller.calculate("+", n1, n2);
        controller.calculate("*", n1, n2);
        controller.calculate("/", n1, n2);
        controller.calculate("-", n1, n2);
    }
}
