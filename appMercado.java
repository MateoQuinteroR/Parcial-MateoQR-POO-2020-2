package Parcial.appMercado;

import Parcial.Mercado;
import Parcial.Producto;
import Parcial.TipoProducto;

public class appMercado {

    public static void main(String[] args) {
        Producto manzana = new Producto(1,"Manzana",1,1000, TipoProducto.FRUTA);
        Producto pera = new Producto(2,"Pera",1,1000, TipoProducto.FRUTA);
        Producto pollo = new Producto(3,"Pollo",1,1000, TipoProducto.CARNE);
        Producto cuaderno = new Producto(4,"cuaderno",1,3000, TipoProducto.ESCOLARES);
        Producto lubricanteIntimoDeChontaduro = new Producto(5,"Lube",1,10000,TipoProducto.PLACER);


        Mercado supermercado1 = new Mercado("El Chanchito Feliz");

        supermercado1.agregarProducto(manzana);
        supermercado1.agregarProducto(pera);
        supermercado1.agregarProducto(pollo);
        supermercado1.agregarProducto(cuaderno);

        //supermercado1.getCarrito().forEach(x ->System.out.println(supermercado1.getCarrito()));

        supermercado1.retirarProducto(lubricanteIntimoDeChontaduro);

        System.out.println(manzana);
        System.out.println(pera);
        System.out.println(pollo);
        System.out.println(cuaderno);

        supermercado1.calcularTotal();

        supermercado1.getCarrito().forEach(x ->System.out.println(supermercado1.getCarrito()));

        //supermercado1.buscarPorTipo(pollo.getNombre());

        supermercado1.buscarProducto("Pera",2);








    }
}
