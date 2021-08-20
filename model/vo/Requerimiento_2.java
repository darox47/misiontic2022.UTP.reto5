package utp.mision2022.c2.model.vo;

public class Requerimiento_2 {
    //Atributos 
    private String fechaInicio;
    private String nombreCiudad;
    private String constructora;
    private String nombreLider;
    private Integer codigoTipo;
    private Integer estrato;

    public Requerimiento_2() {
    }

    public Requerimiento_2(String fechaInicio, String nombreCiudad, String constructora, String nombreLider,
            Integer codigoTipo, Integer estrato) {
        this.fechaInicio = fechaInicio;
        this.nombreCiudad = nombreCiudad;
        this.constructora = constructora;
        this.nombreLider = nombreLider;
        this.codigoTipo = codigoTipo;
        this.estrato = estrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getNombreLider() {
        return nombreLider;
    }

    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }

    public Integer getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }


    public Integer getEstrato() {
        return estrato;
    }


    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    

    
    
}
