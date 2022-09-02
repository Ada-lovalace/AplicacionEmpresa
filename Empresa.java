package Ada.Lovalace.ciclo3;

import lombok.Getter;
import lombok.Setter;

public class Empresa {

    @Getter @Setter
    private String nombreEmpresa;
    @Getter @Setter
    private String direccionEmpresa;
    @Getter @Setter
    private String telefonoEmpresa;
    @Getter @Setter
    private String nitEmpresa;

    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }
}

