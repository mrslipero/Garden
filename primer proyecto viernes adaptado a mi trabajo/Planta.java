public class Planta {
    private String nombre;
    private String tipo;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        } else {
            this.tipo = "";
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            this.precio = 0;
        }
    }

    public Planta(String nombre, String tipo, double precio) {
        setNombre(nombre);
        setTipo(tipo);
        setPrecio(precio);
    }
}

