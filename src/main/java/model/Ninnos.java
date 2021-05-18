package model;

public class Ninnos {
    private int Clave_ninno, Numero_Residencia;
    private String Regalo_Ninnos, Colonia_Ninnos, Calle_Ninnos, Apellido_Paterno_Ninnos, Apellido_Materno_Ninnos, Nombres_Ninnos;

    public Ninnos(int clave_ninno, int numero_Residencia, String regalo_Ninnos, String colonia_Ninnos, String calle_Ninnos, String apellido_Paterno_Ninnos, String apellido_Materno_Ninnos, String nombres_Ninnos) {
        Clave_ninno = clave_ninno;
        Numero_Residencia = numero_Residencia;
        Regalo_Ninnos = regalo_Ninnos;
        Colonia_Ninnos = colonia_Ninnos;
        Calle_Ninnos = calle_Ninnos;
        Apellido_Paterno_Ninnos = apellido_Paterno_Ninnos;
        Apellido_Materno_Ninnos = apellido_Materno_Ninnos;
        Nombres_Ninnos = nombres_Ninnos;
    }

    public int getClave_ninno() {
        return Clave_ninno;
    }

    public void setClave_ninno(int clave_ninno) {
        Clave_ninno = clave_ninno;
    }

    public int getNumero_Residencia() {
        return Numero_Residencia;
    }

    public void setNumero_Residencia(int numero_Residencia) {
        Numero_Residencia = numero_Residencia;
    }

    public String getRegalo_Ninnos() {
        return Regalo_Ninnos;
    }

    public void setRegalo_Ninnos(String regalo_Ninnos) {
        Regalo_Ninnos = regalo_Ninnos;
    }

    public String getColonia_Ninnos() {
        return Colonia_Ninnos;
    }

    public void setColonia_Ninnos(String colonia_Ninnos) {
        Colonia_Ninnos = colonia_Ninnos;
    }

    public String getCalle_Ninnos() {
        return Calle_Ninnos;
    }

    public void setCalle_Ninnos(String calle_Ninnos) {
        Calle_Ninnos = calle_Ninnos;
    }

    public String getApellido_Paterno_Ninnos() {
        return Apellido_Paterno_Ninnos;
    }

    public void setApellido_Paterno_Ninnos(String apellido_Paterno_Ninnos) {
        Apellido_Paterno_Ninnos = apellido_Paterno_Ninnos;
    }

    public String getApellido_Materno_Ninnos() {
        return Apellido_Materno_Ninnos;
    }

    public void setApellido_Materno_Ninnos(String apellido_Materno_Ninnos) {
        Apellido_Materno_Ninnos = apellido_Materno_Ninnos;
    }

    public String getNombres_Ninnos() {
        return Nombres_Ninnos;
    }

    public void setNombres_Ninnos(String nombres_Ninnos) {
        Nombres_Ninnos = nombres_Ninnos;
    }
}
