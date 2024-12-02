public class Chefe extends Funcionario{
    private float salarioBase;
    private float adicionalFuncao;
    private float beneficioTerno;

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getAdicionalFuncao() {
        return adicionalFuncao;
    }

    public void setAdicionalFuncao(float adicionalFuncao) {
        this.adicionalFuncao = adicionalFuncao;
    }

    public float getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(float beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    public Chefe(String nome, int numeroRegistro, float salariobase, float adicionalFuncao, float beneficioTerno) {
        super(nome, numeroRegistro);
        this.salarioBase = salariobase;
        this.adicionalFuncao = adicionalFuncao;
        this.beneficioTerno = beneficioTerno;
    }

    @Override
    public float calcularSalario() {
        return (((salarioBase + salarioBase) * adicionalFuncao) / 100) + beneficioTerno;
    }
}