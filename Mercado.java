package Parcial;

import java.util.ArrayList;

public class Mercado {

    public static final int CAPACIDAD = 91;
    String supermercado;
    ArrayList<Producto> carrito = new ArrayList<Producto>();


    public Mercado(String supermercado) {
        this.supermercado = supermercado;
    }

    public ArrayList<Producto> getCarrito() {
        return carrito;
    }

    public String getSupermercado() {
        return supermercado;
    }

    int contadorProductos = 0;
    public boolean agregarProducto(Producto p){

        if (contadorProductos < CAPACIDAD){

            carrito.add(p);
            System.out.println("Se agregó el producto " + p.getCodigo() + "  al carrito");
            contadorProductos++;
            return true;

        }
        else{
            System.out.println("no se puede agregar el producto "+ p.getCodigo() + "  al carrito");
            return false;

        }

    }
    public Boolean retirarProducto(Producto p){

        for (int i = 0; i < carrito.size(); i++){
            if (p.getNombre() == carrito.get(i).getNombre()){

                carrito.remove(i);
                System.out.println("El producto "+ carrito.get(i).getNombre() + " fue removido del carrito.");
                contadorProductos--;
                return false;



            }else {

                System.out.println("El producto "+ Producto.nombre + " no se encuetra en el carrito.");
                return true;
            }
        }
        return true;
    }


    public Producto buscarProducto(String nombre, int codigo){
        for (int i = 0; i < carrito.size(); i++){

            if (carrito.get(i).getNombre() == nombre || carrito.get(i).getCodigo() == codigo ){

                System.out.println("El producto "+ carrito.get(i).getCodigo()+ "  Está actualmente en el carrito");
                break;
            }else {
                System.out.println("No se encontró el producto dentro del carrito");

            }
        }
        return carrito.get(0);


    }

//    public ArrayList buscarPorTipo(String tipo){
//
//        ArrayList <String> listadoPorProducto = new ArrayList<>();
////        ArrayList<String> tipoProducto = (ArrayList<String>) Arrays.asList(TipoProducto.CARNE,TipoProducto.VERDURA,TipoProducto.LACTEO,TipoProducto.FRUTA,TipoProducto.PAN,TipoProducto.ESCOLARES,TipoProducto.LICORES,TipoProducto.PLACER);
//        for (int i = 0; i < carrito.size(); i++){
//            if (carrito.get(i).getTipo() == tipo ){
//
//                System.out.println("El producto " + carrito.get(i).getCodigo()+ "  Es de tipo  " + tipo);
//                listadoPorProducto.add(carrito.get(i).getNombre());
//            }
//
//
//        }
//        return listadoPorProducto();
//    }


    public double calcularTotal(){
        double totalAPagar = 0;
        for (int i = 0; i < carrito.size(); i++){
            totalAPagar += carrito.get(i).getPrecio();
        }
        System.out.println("El total a pagar es: " + totalAPagar);
        return totalAPagar;
    }
}
