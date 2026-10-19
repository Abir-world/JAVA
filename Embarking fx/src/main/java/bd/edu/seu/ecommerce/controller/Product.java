package bd.edu.seu.ecommerce.controller;

public class Product {
    public String name;
    public String type;
    public String size;
    public String color;
    public double price;
    public String details;
    public String last_purchase;
    public int quantity;
    public String discount;
    public String customer;
    // public String imagePath;
    public boolean fbBoost;


    public Product(String name, String type, String size, String color,
                   double price, String details, String last_purchase,
                   int quantity, String discount, String customer, boolean fbBoost) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
        this.details = details;
        this.last_purchase = last_purchase;
        this.quantity = quantity;
        this.discount = discount;
        this.customer = customer;
        this.fbBoost = fbBoost;
        //this.imagePath = imagePath;

    }

    public String toFileString() {
        details = details.replace(",", " "); // safety
        return name + "," + type + "," + size + "," + color + "," +
                price + "," + details + "," + last_purchase + "," +
                quantity + "," + discount + "," + customer + "," + fbBoost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getDetails() {
        return details;
    }

    public double getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public String getCustomer() {
        return customer;
    }

    public String getLast_purchase() {
        return last_purchase;
    }



//    public String getImagePath() {
//        return imagePath;
//    }

    public String getSize() {
        return size;
    }

    public boolean isFbBoost() {
        return fbBoost;
    }



    public int getQuantity() {
        return quantity;
    }
}

