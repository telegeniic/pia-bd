package model;

public class Asisten {
    private int Clave_Ninnos, Clave_Eventos;

    public Asisten(int clave_Ninnos, int clave_Eventos) {
        Clave_Ninnos = clave_Ninnos;
        Clave_Eventos = clave_Eventos;
    }

    public int getClave_Ninnos() {
        return Clave_Ninnos;
    }

    public void setClave_Ninnos(int clave_Ninnos) {
        Clave_Ninnos = clave_Ninnos;
    }

    public int getClave_Eventos() {
        return Clave_Eventos;
    }

    public void setClave_Eventos(int clave_Eventos) {
        Clave_Eventos = clave_Eventos;
    }
}
