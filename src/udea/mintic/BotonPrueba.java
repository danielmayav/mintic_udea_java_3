package udea.mintic;

public class BotonPrueba extends Boton{


    public BotonPrueba(double ancho, double alto, String colorFondo, String colorTexto, String texto) {
        super(ancho, alto, colorFondo, colorTexto, texto);
    }

    @Override
    public void hacerClick() {
        this.setTexto("Hello World!");
    }
}
