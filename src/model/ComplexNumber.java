package model;

public class ComplexNumber implements IComplexNumber {
    double real;
    double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return this.real;
    }

    @Override
    public double getImaginary() {
        return this.imaginary;
    }

    @Override
    public void setReal(double real) {
        this.real = real;
    }

    @Override
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if (imaginary > 0) return real + "+" + imaginary + "i";
        if (imaginary == 0) return real + "";
        if (real == 0.0) return imaginary + "i";
        return real + "" + imaginary + "i";
    }
}
