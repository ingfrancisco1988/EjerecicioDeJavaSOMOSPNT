package pruebaPnt;


import java.util.Comparator;
import java.util.function.Function;

public class Bebida extends Producto{
  private double litros;

  public Bebida(String nombre, double precio, double litros) {
    super(nombre, precio);
    this.litros = litros;
  }

  @Override
  public String toString() {
    return "Nombre: " +nombre +
            " /// Litros: " + litros +

            " /// Precio: "+"$"+ precio;
  }


}
