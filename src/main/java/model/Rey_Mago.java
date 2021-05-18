package model;

public class Rey_Mago {
    private int Clave_Rey_Mago;
    private String Nombre_Rey_Mago, DNI;

    public Rey_Mago(int clave_Rey_Mago, String nombre_Rey_Mago, String DNI) {
        Clave_Rey_Mago = clave_Rey_Mago;
        Nombre_Rey_Mago = nombre_Rey_Mago;
        this.DNI = DNI;
    }

    public int getClave_Rey_Mago() {
        return Clave_Rey_Mago;
    }

    public void setClave_Rey_Mago(int clave_Rey_Mago) {
        Clave_Rey_Mago = clave_Rey_Mago;
    }

    public String getNombre_Rey_Mago() {
        return Nombre_Rey_Mago;
    }

    public void setNombre_Rey_Mago(String nombre_Rey_Mago) {
        Nombre_Rey_Mago = nombre_Rey_Mago;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
