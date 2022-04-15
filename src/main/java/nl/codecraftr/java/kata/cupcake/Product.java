package nl.codecraftr.java.kata.cupcake;

sealed public interface Product permits Bundle, Cookie, Cupcake, Topping {

  String description();

  double price();
}
