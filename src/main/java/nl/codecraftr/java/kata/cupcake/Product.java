package nl.codecraftr.java.kata.cupcake;

sealed public interface Product permits Bundle, Confectionary {

  String description();

  double price();

}
