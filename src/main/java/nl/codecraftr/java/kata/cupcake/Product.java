package nl.codecraftr.java.kata.cupcake;

sealed public interface Product permits Bundle, Cake {

  String description();

  double price();
}
