package pruebaPnt;


import java.util.Comparator;

public class usoPersonal extends Producto {
  private int contenido;

  public usoPersonal(String nombre, double precio, int contenido) {
    super(nombre, precio);
    this.contenido = contenido;
  }

  @Override
  public String toString() {
    return "Nombre: " +nombre +
            " /// Contenido: " + contenido+"ml" +

            " /// Precio: " +"$"+ precio ;
  }


}
