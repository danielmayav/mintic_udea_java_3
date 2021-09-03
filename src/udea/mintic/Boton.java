package udea.mintic;

public abstract class Boton {

    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    private String texto;

// CONSTRUCTOR  -------
    public Boton(double ancho, double alto, String colorFondo, String colorTexto, String texto){
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
    }
    // METODO  -------
    public abstract void hacerClick();

    //  GETTERS -------------
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    // SETTERS ---------------

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
