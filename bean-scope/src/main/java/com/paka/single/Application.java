package com.paka.single;

import com.paka.common.Chicken;
import com.paka.common.Kimbap;
import com.paka.common.Product;
import com.paka.common.ShoppingCart;
import com.paka.proto.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);



        Product tunaKimbap = context.getBean("tunaKimbap", Kimbap.class);
        Product kimchiKimbap = context.getBean("kimchiKimbap", Kimbap.class);
        Product volcano = context.getBean("volcano", Chicken.class);
        Product Seasoned = context.getBean("Seasoned", Chicken.class);


        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addFood(tunaKimbap);
        cart1.addFood(kimchiKimbap);

        System.out.println("cart1? : " + cart1.getFood());


        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addFood(volcano);
        cart2.addFood(Seasoned);

        System.out.println("cart2? : " + cart2.getFood());

        System.out.println(cart1.hashCode());
        System.out.println(cart2.hashCode());
    }

}
