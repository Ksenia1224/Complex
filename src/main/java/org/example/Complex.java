package org.example;

import lombok.Data;

@Data

public class Complex {
    private double x;
    private double y;

    public Complex() {
        this.x = 0;
        this.y = 0;
    }

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String str() {
        if (y >= 0) {
            return x + "+" + y + "i";
        } else {
            return x + "" + y + "i";
        }
    }

    public Complex add(Complex other) {
        return new Complex(this.x + other.x, this.y + other.y);
    }

    public Complex sub(Complex other) {
        return new Complex(this.x - other.x, this.y - other.y);
    }

    public Complex mul(Complex other) {
        double resultX = this.x * other.x - this.y * other.y;
        double resultY = this.x * other.y + this.y * other.x;
        return new Complex(resultX, resultY);
    }

    public Complex div(Complex other) {
        double denominator = other.x * other.x + other.y * other.y;
        double resultX = (this.x * other.x + this.y * other.y) / denominator;
        double resultY = (this.y * other.x - this.x * other.y) / denominator;
        return new Complex(resultX, resultY);
    }

    public double getModulus() {
        return Math.sqrt(x * x + y * y);
    }

    public boolean isEqual(Complex other) {
        return (this.x == other.x && this.y == other.y);
    }
}



