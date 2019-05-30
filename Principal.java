package pruebaPnt;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {


  public static  void main(String[] args)
  {
    mostrar();
  }

static public void mostrar()
{
  int sizeArray;
  ArrayList<Producto> productos = new ArrayList<>(5);

  Producto pro1= new Bebida("Coca-Cola Zero",20,1.5);
  productos.add(pro1);
  Producto pro2= new Bebida("Coca-Cola ",18,1.5);
  productos.add(pro2);
  Producto pro3= new usoPersonal("Shampoo Sedal ",19,500);
  productos.add(pro3);
  Producto pro4= new Fruta("Frutillas ",64,"kilo");
  productos.add(pro4);


for (Producto pro : productos)
  System.out.println(pro.toString());

  Collections.sort(productos);

  System.out.println("=======================================================");
  sizeArray =productos.size();
  for (int i=0;i<sizeArray;i++)
  {
    if (i==0)
    {
      System.out.println("Producto más caro: "+productos.get(0).getNombre());
    }
    if (i==sizeArray-1)
    {
      System.out.println("Producto más Barato: "+productos.get(sizeArray-1).getNombre());
    }

  }
  }

}



