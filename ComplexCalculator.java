public class ComplexCalculator implements ICalculator {

    //Сложение комплексных чисел
    @Override
    public ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
        return new ComplexNumber(n1.getReal() + n2.getReal(), n1.getImaginary() + n2.getImaginary());
    }

    //Умножение комплексных чисел
    @Override
    public ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2) {
        double real = n1.getReal() * n2.getReal() - n1.getImaginary() * n2.getImaginary();
        double imaginary = n1.getReal() * n2.getImaginary() + n1.getImaginary() * n2.getReal();
        return new ComplexNumber(real, imaginary);
    }

    //Деление комплексных чисел
    @Override
    public ComplexNumber divide(ComplexNumber n1, ComplexNumber n2) {
        double denominator = n2.getReal() * n2.getReal() + n2.getImaginary() * n2.getImaginary();
        double real = (n1.getReal() * n2.getReal() + n1.getImaginary() * n2.getImaginary()) / denominator;
        double imaginary = (n1.getImaginary() * n2.getReal() - n1.getReal() * n2.getImaginary()) / denominator;
        return new ComplexNumber(real, imaginary);
    }
}