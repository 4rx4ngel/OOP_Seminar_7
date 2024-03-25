package service;

import model.ComplexNumber;

public interface ICalculatorService {
    ComplexNumber createComplexNumber();

    void add();

    void sub();

    void mul();

    void div();
}
