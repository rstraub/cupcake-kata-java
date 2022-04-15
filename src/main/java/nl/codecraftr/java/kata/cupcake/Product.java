package nl.codecraftr.java.kata.cupcake;

sealed public interface Product permits Topping, Cupcake, Cookie {

  String description();

  double price();
}
