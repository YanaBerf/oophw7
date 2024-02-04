 public class CalculatorV {
        public void printResult(String operation, ComplexNumber result) {
            String message = operation + " равно: " + result.getReal() + " + " + result.getImaginary() + "i";
            System.out.println(message);
        }
    }

