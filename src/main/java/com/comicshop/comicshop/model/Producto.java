import java.math.BigDecimal;

public class Producto{

private String nombrec, editorialc, generoc, idiomac, descripcionc;
private BigDecimal precioc;
private Integer stockc;


    public String getNombrec() {
        return this.nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getEditorialc() {
        return this.editorialc;
    }

    public void setEditorialc(String editorialc) {
        this.editorialc = editorialc;
    }

    public String getGeneroc() {
        return this.generoc;
    }

    public void setGeneroc(String generoc) {
        this.generoc = generoc;
    }

    public String getIdiomac() {
        return this.idiomac;
    }

    public void setIdiomac(String idiomac) {
        this.idiomac = idiomac;
    }

    public String getDescripcionc() {
        return this.descripcionc;
    }

    public void setDescripcionc(String descripcionc) {
        this.descripcionc = descripcionc;
    }

    public BigDecimal getPrecioc() {
        return this.precioc;
    }

    public void setPrecioc(BigDecimal precioc) {
        this.precioc = precioc;
    }

    public Integer getStockc() {
        return this.stockc;
    }

    public void setStockc(Integer stockc) {
        this.stockc = stockc;
    }


}