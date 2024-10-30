package EjercicioEva;

/**
 *
 * ejercio 8.a.6
 * 
 */
public abstract class  Producto {
    protected int fechaCaducidad;
    private int lote;

    public Producto(int fechaCaducidad, int lote) {
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
    }

    public Producto() {
    }

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad=" + fechaCaducidad + ", lote=" + lote + '}';
    }
    
    public  abstract boolean verificarFechaCaducidad(int fechaActual);
    
    
}
