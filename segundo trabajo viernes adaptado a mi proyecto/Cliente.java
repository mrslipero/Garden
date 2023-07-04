public class Cliente {
    private final String identificacion;
    private String nombre;
    private String direccion;
    
    public Cliente(String identificacion, String nombre, String direccion) {
        if (identificacion != null) {
            this.identificacion = identificacion;
        } else {
            this.identificacion = "";
        }
        setNombre(nombre);
        setDireccion(direccion);
    }
    
    public String getIdentificacion() {
        return identificacion;
    }
    
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
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        if (direccion != null) {
            this.direccion = direccion;
        } else {
            this.direccion = "";
        }
    }
}

