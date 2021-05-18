package model;

public class Organizan {

    private int Clave_Grupo_de_Vecinos, Clave_Eventos;
    private String DNI;

    public Organizan(int clave_Grupo_de_Vecinos, int clave_Eventos, String DNI) {
        Clave_Grupo_de_Vecinos = clave_Grupo_de_Vecinos;
        Clave_Eventos = clave_Eventos;
        this.DNI = DNI;
    }

    public int getClave_Grupo_de_Vecinos() {
        return Clave_Grupo_de_Vecinos;
    }

    public void setClave_Grupo_de_Vecinos(int clave_Grupo_de_Vecinos) {
        Clave_Grupo_de_Vecinos = clave_Grupo_de_Vecinos;
    }

    public int getClave_Eventos() {
        return Clave_Eventos;
    }

    public void setClave_Eventos(int clave_Eventos) {
        Clave_Eventos = clave_Eventos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
