package com.pluralsight;

public class Products {
    private String name;
    private String id;
    private double price;
    private String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", department='" + department + '\'' +
                '}';
    }

    public Products(String name, String id, double price, String department) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.department = department;
    }

}

