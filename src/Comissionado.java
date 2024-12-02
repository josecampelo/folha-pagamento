public class Comissionado extends Funcionario{
    private float salariobase;
    private float comissao;

    public Comissionado(String nome, int numeroRegistro, float salariobase, float comissao) {
        super(nome, numeroRegistro);
        this.salariobase = salariobase;
        this.comissao = comissao;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }

    @Override
    public float calcularSalario() {
        return ((salariobase + salariobase) * comissao) / 100;
    }
}