public class Square implements Form {
    double side;
    double width;

    public Square(double side, double width) {
        this.side = side;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return side;
    }

    public double calcularArea() {
        return this.getWidth() * this.getHeight();
    }
}
