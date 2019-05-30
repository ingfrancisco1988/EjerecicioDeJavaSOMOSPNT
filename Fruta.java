package pruebaPnt;

public class Fruta extends Producto {
  private String unidadVenta;

  public Fruta(String nombre, double precio, String unidadVenta) {
    super(nombre, precio);
    this.unidadVenta = unidadVenta;
  }

  @Override
  public String toString() {
    return "Nombre: " + nombre +
            " /// Precio: " + "$"+precio +
            " /// Unidad de Venta: " + unidadVenta;

  }


}
