package model.exceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException() {
        super("Товар с таким артиклем не найден");
    }
}
