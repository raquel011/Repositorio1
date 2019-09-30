package cronometro;

public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void PonerCero() {

        if (this.hora != 0 || this.minuto != 0 || this.segundo != 0) {

            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;

        }

    }

    public void incremento(int numero) {

        while (this.hora != 24) {

            this.segundo = this.segundo + numero;

            if (this.segundo == 59) {

                this.minuto = this.minuto + 1;
                this.segundo = 0;

                System.out.println("ewewwe");

            } else if (this.minuto == 59) {

                this.minuto = 0;
                this.hora = this.hora + 1;

            } else if (this.hora == 24) {
                this.minuto = 0;
                this.segundo = 0;

            }

            numero++;

        }

    }

    @Override
    public String toString() {
        return "Reloj ::::>" + hora + ":" + minuto + ":" + segundo;
    }

}
