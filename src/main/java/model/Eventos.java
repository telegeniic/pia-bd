package model;

import java.sql.Time;

public class Eventos {
    private int Clave_Eventos, Dia_Eventos, Mes_Eventos;
    private String  Colonia_Eventos, Calle_Eventos;
    private Time Hora_de_Inicio_Eventos, Hora_de_Final_Eventos;

    public Eventos(int clave_Eventos, int dia_Eventos, int mes_Eventos, String colonia_Eventos, String calle_Eventos, Time hora_de_Inicio_Eventos, Time hora_de_Final_Eventos) {
        Clave_Eventos = clave_Eventos;
        Dia_Eventos = dia_Eventos;
        Mes_Eventos = mes_Eventos;
        Colonia_Eventos = colonia_Eventos;
        Calle_Eventos = calle_Eventos;
        Hora_de_Inicio_Eventos = hora_de_Inicio_Eventos;
        Hora_de_Final_Eventos = hora_de_Final_Eventos;
    }

    public int getClave_Eventos() {
        return Clave_Eventos;
    }

    public void setClave_Eventos(int clave_Eventos) {
        Clave_Eventos = clave_Eventos;
    }

    public int getDia_Eventos() {
        return Dia_Eventos;
    }

    public void setDia_Eventos(int dia_Eventos) {
        Dia_Eventos = dia_Eventos;
    }

    public int getMes_Eventos() {
        return Mes_Eventos;
    }

    public void setMes_Eventos(int mes_Eventos) {
        Mes_Eventos = mes_Eventos;
    }

    public String getColonia_Eventos() {
        return Colonia_Eventos;
    }

    public void setColonia_Eventos(String colonia_Eventos) {
        Colonia_Eventos = colonia_Eventos;
    }

    public String getCalle_Eventos() {
        return Calle_Eventos;
    }

    public void setCalle_Eventos(String calle_Eventos) {
        Calle_Eventos = calle_Eventos;
    }

    public Time getHora_de_Inicio_Eventos() {
        return Hora_de_Inicio_Eventos;
    }

    public void setHora_de_Inicio_Eventos(Time hora_de_Inicio_Eventos) {
        Hora_de_Inicio_Eventos = hora_de_Inicio_Eventos;
    }

    public Time getHora_de_Final_Eventos() {
        return Hora_de_Final_Eventos;
    }

    public void setHora_de_Final_Eventos(Time hora_de_Final_Eventos) {
        Hora_de_Final_Eventos = hora_de_Final_Eventos;
    }
}
