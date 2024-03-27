package ex002poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora) {
        this();
        setHora(hora);
    }

    public Horario(int hora, int minuto) {
        this(hora);
        setMinuto(minuto);
    }

    

    public Horario(int hora, int minuto, int segundo) {
        this(hora, minuto);
        setSegundo(segundo);
    }

    

    public boolean setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            return true;
        } else {
            return false;
        }
    }

    public boolean setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
            return true;
        } else {
            return false;
        }
    }

    public boolean setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String imprimirPorExtenso() {
       String [] horaE = {"uma","duas","tres", "quatro","cinco", "seis","sete" };
        
    }

    public long calcularSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    
    public long diferencaEmSegundos(Horario outroHorario) {
        return Math.abs(this.calcularSegundos() - outroHorario.calcularSegundos());
    }

    
    

}
