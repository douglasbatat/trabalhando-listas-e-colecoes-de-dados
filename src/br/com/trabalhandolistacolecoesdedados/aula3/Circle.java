package br.com.trabalhandolistacolecoesdedados.aula3;

public class Circle implements Form {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }
}
