package com.inter.dExercise1.entities;

import com.inter.dExercise1.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(OrderStatus status, Client client) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        double totalPrice = 0;
        sb.append("ORDER SUMMARY: \n")
                .append("Order momment: " + sdf.format(moment) + "\n")
                .append("Order status: " + status.toString() + "\n")
                .append("Client: " + client.getName() + " (" + sdf2.format(client.getBirthDate()) + ")")
                .append(" - " + client.getEmail() + "\n")
                .append("Order Items: \n");

        for (OrderItem oi : orderItems) {
            sb.append(oi.getProduct().getName() + ", ")
                    .append(String.format("%.2f", oi.getProduct().getPrice()))
                    .append(", Quantity: " + oi.getQuantity())
                    .append(", Subtotal: " + oi.subTotal() + "\n");
            totalPrice += oi.subTotal();
        }
        sb.append("Total price: " + String.format("%.2f", totalPrice));


        return sb.toString();
    }
}
