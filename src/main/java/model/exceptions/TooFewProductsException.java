package model.exceptions;

public class TooFewProductsException extends Exception {
    public TooFewProductsException() {
        super("Необходимо закупить продукт");
    }
}
