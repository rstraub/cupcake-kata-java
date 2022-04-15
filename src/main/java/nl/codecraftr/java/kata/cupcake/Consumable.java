package nl.codecraftr.java.kata.cupcake;

sealed public interface Consumable permits Topping, Cupcake, Cookie {
  String description();
}
