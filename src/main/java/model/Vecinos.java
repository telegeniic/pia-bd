package model;

public class Vecinos {
    private String DNI, Apellido_Paterno, Apellido_Materno, Nombre_Vecinos;

    public Vecinos(String dni, String apellido_paterno, String apellido_materno, String nombre_vecinos) {
        DNI = dni;
        Apellido_Paterno = apellido_paterno;
        Apellido_Materno = apellido_materno;
        Nombre_Vecinos = nombre_vecinos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        Apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        Apellido_Materno = apellido_Materno;
    }

    public String getNombre_Vecinos() {
        return Nombre_Vecinos;
    }

    public void setNombre_Vecinos(String nombre_Vecinos) {
        Nombre_Vecinos = nombre_Vecinos;
    }
}
