package lesson6;

import java.util.Date;

public class DemoHomeWork {
    public static void main(String[] args) {
        createOrder();
        createOrderAndCallMethods();
        Order newOrder = createOrder();
        Order newOrder1 = createOrderAndCallMethods();
    }

    public static Order createOrder() {
        Order orderObject1 = new Order(100, (new Date()), false, null, "Dnepr", "Ukraine", "Buy");
        return orderObject1;
    }

    public static Order createOrderAndCallMethods() {
        Order orderObject2 = new Order(100, (new Date()), true, (new Date()), "Kiev", "Ukraine", "SomeValue");
        orderObject2.checkPrice();
        orderObject2.confirmOrder();
        orderObject2.isValidType();
        return orderObject2;
    }
}

