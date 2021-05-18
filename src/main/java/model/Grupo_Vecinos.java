package model;

public class Grupo_Vecinos {
    private int Clave_Grupo_de_Vecinos;
    private String Colonia_Grupo_de_Vecinos, DNI;

    public Grupo_Vecinos(int clave_Grupo_de_Vecinos, String colonia_Grupo_de_Vecinos, String DNI) {
        Clave_Grupo_de_Vecinos = clave_Grupo_de_Vecinos;
        Colonia_Grupo_de_Vecinos = colonia_Grupo_de_Vecinos;
        this.DNI = DNI;
    }

    public int getClave_Grupo_de_Vecinos() {
        return Clave_Grupo_de_Vecinos;
    }

    public void setClave_Grupo_de_Vecinos(int clave_Grupo_de_Vecinos) {
        Clave_Grupo_de_Vecinos = clave_Grupo_de_Vecinos;
    }

    public String getColonia_Grupo_de_Vecinos() {
        return Colonia_Grupo_de_Vecinos;
    }

    public void setColonia_Grupo_de_Vecinos(String colonia_Grupo_de_Vecinos) {
        Colonia_Grupo_de_Vecinos = colonia_Grupo_de_Vecinos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
