package utp.mision2022.c2.model.vo;

public class Requerimiento_1 {
    // Atributos de la clase
    private String fechaCompra;
    private Integer codCompra;
    private String nombreProveedor;
    private String pagado;

    //Constructores
    public Requerimiento_1(){

    }

    public Requerimiento_1(String fechaCompra, Integer codCompra, String nombreProveedor, String pagado) {
        this.fechaCompra = fechaCompra;
        this.codCompra = codCompra;
        this.nombreProveedor = nombreProveedor;
        this.pagado = pagado;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    public String getPagado() {
        return pagado;
    }
    public void setPagado(String pagado) {
        this.pagado = pagado;
    }
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
    public Integer getCodCompra() {
        return codCompra;
    }
    public void setCodCompra(Integer codCompra) {
        this.codCompra = codCompra;
    }
    
}
