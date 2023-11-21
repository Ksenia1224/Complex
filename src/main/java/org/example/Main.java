package org.example;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, 3);
        Complex c2 = new Complex(2, 1);
        System.out.println("число 1 = " + c1.str());
        System.out.println("число 2 = " + c2.str());

        Complex sum = c1.add(c2);

        System.out.println("Сумма: " + sum.str());

        Complex difference = c1.sub(c2);

        System.out.println("Разность: " + difference.str());

        Complex product = c1.mul(c2);

        System.out.println("Произведение: " + product.str());

        Complex quotient = c1.div(c2);

        System.out.println("Частное: " + quotient.str());

        double modulus = c1.getModulus();

        System.out.println("Модуль числа 1: " + modulus);

        boolean aEqual = c1.equals(c2);

        System.out.println("число 1 == число 2? " + aEqual);
    }
}
