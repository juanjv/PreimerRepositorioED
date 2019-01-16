package javadoc;
/**
 * <h3>Clase circulo</h3>
 * es una clase pojo con 3 atributos que permite manejar objetos de tipo circulo
 * calcula su circuferencia,desplazar su centro, escalar su radio y 
 * obtener una cadena de caracteres que lo representa como un objeto
 * <ul>
 * centrox representa la coordenada x del centro circulo
 * centroy representa la coordenada y del centro circulo
 * radio representa el radio del circulo
 * </ul>
 * <ul>
 *    <li>metodo circulo</li>
 *    <li>getCentroX()</li>
 *    <li>getCentroY()</li>
 *    <li>getCircunferencia()</li>
 *    <li>metodo desplazar</li>
 *    <li>metodo escalar</li>
 *    <li>toString</li>
 * </ul>   
 * @author 21856608
 * @version 1.0
 * @since 28/11/2018
 *
 */
public class Circulo { 
    
	private double centroX;
	private double centroY;
	private double radio;
    /**
     * <h2>metodo circulo</h2>
     * inicializa 3 parametros de tipo double para dar valor a los atributos
     * @param cx de tipo double, contendra el valor que se le asigne
     * @param cy de tipo double, contendra el valor que se le asigne
     * @param r de tipo double, contendra el valor que se le asigne
     */
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}
    /**
     *<h2> metodo get devuelve el valor del atributo centrox</h2>
     * @return double que tien el valor centrox
     */
	public double getCentroX() {
		return centroX;
	}
    /**
     * <h2>metodo get devuelve el valor del atributo centroy</h2>
     * @return double que tien el valor centroy
     */
	public double getCentroY() {
		return centroY;
	}
	public double getradio() {
		return radio;
	}
    /**
     * <h2>metodo getCircunferencia</h3>
     * math ya tiene el valor de la constante PI que multiplica x radio 
     * @return double con el valor calculado
     * @see java.lang.Math
     */
	public double getCircunferencia() {
		return 2 * Math.PI * radio;
	}
    /**
    * <h2>método desplazar</h2>
    * Recibe 2 parametros que serviran para desplazar las coordenads del centro circulo
    * @param deltaX de tipo double representa el desplzamiento de la cordenada x del centro del circulo
    * @param deltaY de tipo double representa el desplzamiento de la cordenada y del centro del circulo
    */
	public void desplazar(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
	}
    /**
     * <h2>metodo escalar</h2>
     * Aumenta o disminuye el valor del radio con el valor que recibe como parametro
     * @param s de tipo double, representa la variacion del radio (disminuye o aumenta)
     */
	public void escalar(double s) {
		radio = radio * s;
	}
    /**
     * <h2>metodo toString</h2>
     * método sobreescrito, Retorna la cadena de caracteres que representa a un objeto de tipo circulo
     * @return un String que contiene la cadenad de caracteres que representa al circulo
     */
	public String toString() {
		return "Círculo con centro en el punto (" + centroX + "," + centroY + ") de radio " + radio;
	    }

}
