package Lab10.Actividades;

public class Producto {
    int codigo;
    String descripcion;
    double precio;
    
    public Producto (int codigo_, String descripcion_, double precio_){
        this.codigo = codigo_;
        this.descripcion = descripcion_;
        this.precio = precio_;
    }

    public void showInfo(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) 
            return true;
        if(obj == null || getClass() != obj.getClass()) 
            return false;
        Producto producto = (Producto) obj;
        return codigo == producto.codigo;
    }    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion='" + descripcion + '\'' + ", precio=" + precio + '}';
    }

}
