package Parte1;

public class Main {
    public static void main(String[] args){

        Conta ContaA = new Conta();
        Conta ContaC = ContaA;
        Cliente ClienteA = new Cliente();

        Conta ContaB = new Conta();
        Cliente ClienteB = new Cliente();

        ClienteA.CPF = "CPF original";
        ClienteA.End = "Ilha da Madeira";
        ClienteA.Idd = 39;
        ClienteA.Name = "Cristiano Ronaldo";
        ClienteA.Sexo = 'm';

        ClienteB.CPF = "CPF diferente";
        ClienteB.End = "Minas Gerais";
        ClienteB.Idd = 15;
        ClienteB.Name = "Mafeus";
        ClienteB.Sexo = 'f';

        ContaA.Dono = ClienteA;
        ContaA.Num = 3344;
        ContaA.Saldo = 2000000.00;
        ContaA.Limite = 4000000.00;

        ContaB.Dono = ClienteB;
        ContaB.Num = 3444;
        ContaB.Saldo = 10000.00;
        ContaB.Limite = 40000.00;

        if(ContaA.Dono == ContaB.Dono && ContaA.Num == ContaB.Num && ContaA.Saldo == ContaB.Saldo && ContaA.Limite == ContaB.Limite) {
            System.out.println("A primeira e a segunda conta são Iguais.");
            imprimir(ContaA.Dono, ContaA.Num, ContaA.Saldo, ContaA.Limite);
        }

        else {
            System.out.println("A primeira e a segunda conta são Diferentes.");
            System.out.println("Conta A:\n");
            imprimir(ContaA.Dono, ContaA.Num, ContaA.Saldo, ContaA.Limite);
            System.out.println("\nConta B:\n");
            imprimir(ContaB.Dono, ContaB.Num, ContaB.Saldo, ContaB.Limite);



        }
    }

    static void imprimir(Cliente Dono, int Num, double Saldo, double Limite){

        System.out.println("Dono da conta: "+ Dono.Name);
        System.out.println("Numero da conta: "+ Num);
        System.out.printf("Saldo da conta: R$%.2f\n", Saldo);
        System.out.printf("Limite da conta: R$%.2f\n", Limite);
    }
}
