public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[8];

        funcionarios[0] = new Chefe("Joe Boss", 1001, 10000, 15, 2500);
        funcionarios[1] = new Comissionado("Keith Seller", 1002, 3500, 22);
        funcionarios[2] = new Comissionado("Jeff Seller", 1003, 3250, 20);
        funcionarios[3] = new Horista("Josh Designer", 1004, 30, 70);
        funcionarios[4] = new Horista("Penny Architect", 1005, 45, 82.30f);
        funcionarios[5] = new Empreiteiro("Peter Constructor", 1006, 4500);
        funcionarios[6] = new Empreiteiro("Bob The Builder", 1007, 3920);
        funcionarios[7] = new Empreiteiro("Mary Decorator", 1008, 4230);

        for(Funcionario funcionario : funcionarios){
            System.out.println(String.format("| o | Registro: %4d - Nome: %-35s | o |", funcionario.getNumeroRegistro(), funcionario.getNome()));
            System.out.println(String.format("| o | Salário Líquido: %.2f                                   | o |", funcionario.calcularSalario()));
            System.out.println("| o |........................................................... | o |");
        }
    }
}