package practicas;
public class Figura {
    public static final int CUADRADO = 1;
    public static final int CIRCULO = 2;
    public static final int TRIANGULO_RECT = 3;
    
    private int tipoFigura;
    private double lado;
    public Figura(int TipoFigura, double lado){
        this.tipoFigura = TipoFigura;
        this.lado = lado;
    }
    
    // ... other methods ...
    
    public double area(){
        switch(tipoFigura){
            case CUADRADO: return lado*lado;
            case CIRCULO: return Math.PI*lado/4.0;
            case TRIANGULO_RECT: return lado*lado/2.0;
        }
        return 0;
    }
}
