package model.Shop;

import model.Product.Item;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private final LocalDateTime dateTime;
    private final List<Item> products;
    private final String sellerName;
    private float totalPrice;

    public Receipt(String sellerName) {
        this.sellerName = sellerName;
        products=new ArrayList<>();
        totalPrice=0;
        dateTime=LocalDateTime.now();
    }

    public void addProduct(Item item){
        products.add(item);
        totalPrice+=item.getPrice();
    }


    @Override
    public String toString() {
        StringBuilder prod=new StringBuilder();
        for (var a:products) {
            prod.append(a.toString()).append("  ").append(a.getPrice()).append('$').append("\n");
        }
        //how to fix this shit?
        return "Продавец:" +
                sellerName +
                '\n' +
                prod +
                "Общая стоимость:" +
                totalPrice +
                "$\n"+
                "Дата и время покупки:" +
                dateTime.format(DateTimeFormatter.ISO_DATE) +
                " " +
                dateTime.getHour() +
                ":" +
                dateTime.getMinute() +
                ":" +
                dateTime.getSecond();
    }
}
