/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab01poo;

public class App {
    
    public static void main(String[] args) {
        ponto ponto1 = new ponto(10, 25);
        ponto ponto2 = new ponto(41, 3);

        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);
        System.out.println("Distância entre os pontos: " + ponto1.distanciaTotal(ponto2));
    }
}
