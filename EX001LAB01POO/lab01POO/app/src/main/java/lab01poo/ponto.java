package lab01poo;

public class ponto {
    private double x;
    private double y;

    public ponto (double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    public void setX (double x) {
        this.x = 2;
    }
    public void setY (double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "ponto [x=" + x + ", y=" + y + "]";
    }
    public double distanciaTotal (ponto outroPonto) {
        double distancia = Math.sqrt(Math.pow(outroPonto.getX() - x, 2) + Math.pow(outroPonto.getY() - y, 2));
        return distancia;
    }
    

    
   
}
   

    

