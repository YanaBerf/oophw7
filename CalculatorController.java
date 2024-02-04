import java.util.logging.Level;
public class CalculatorController {
    private CalculatorV view;
    private ICalculator model;

    public CalculatorController(CalculatorV view, ICalculator model) {
        this.view = view;
        this.model = model;
    }

    public void calculate(String operation, ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber result = null;

        try {
            switch (operation) {
                case "+":
                    result = model.add(n1, n2);
                    break;
                case "*":
                    result = model.multiply(n1, n2);
                    break;
                case "/":
                    result = model.divide(n1, n2);
                    break;
                default:
                    FileLogger.log(Level.WARNING, "Нет такой операции");
            }

            if (result != null) {
                view.printResult(operation, result);
            }
        } catch (Exception e) {
            FileLogger.log(Level.SEVERE, "Ошибка вычисления: " + e.getMessage());
        }
    }
}