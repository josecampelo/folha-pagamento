public class Horista extends Funcionario{
    private float valorHora;
    private float numeroHoras;

    public Horista(String nome, int numeroRegistro, float valorHora, float numeroHoras) {
        super(nome, numeroRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(float numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public float calcularSalario() {
        return valorHora * numeroHoras;
    }
}