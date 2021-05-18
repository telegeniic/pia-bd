package model;

public class Convencidos {

    private String DNI_Convencedor, DNI_Convencido;

    public Convencidos(String dni_convencedor, String dni_convencido) {
        DNI_Convencedor = dni_convencedor;
        DNI_Convencido = dni_convencido;
    }

    public String getDNI_Convencedor() {
        return DNI_Convencedor;
    }

    public void setDNI_Convencedor(String DNI_Convencedor) {
        this.DNI_Convencedor = DNI_Convencedor;
    }

    public String getDNI_Convencido() {
        return DNI_Convencido;
    }

    public void setDNI_Convencido(String DNI_Convencido) {
        this.DNI_Convencido = DNI_Convencido;
    }
}
