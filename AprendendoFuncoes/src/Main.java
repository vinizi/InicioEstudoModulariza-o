//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int primeroNumero = 10;
    int segundoNumero = 20;
    int soma = primeroNumero + segundoNumero;
    int subtracao = primeroNumero - segundoNumero;
    int multiplicacao = primeroNumero * segundoNumero;
    int divisao = primeroNumero / segundoNumero;
     int somaViaFuncao = somarValores(primeroNumero, segundoNumero);
        System.out.println("Valor soma = " + somaViaFuncao);
   int subtrairViaFuncao = subtrairValores(segundoNumero, primeroNumero);
        System.out.println("Valor subtração = " + subtrairViaFuncao);
        int multiplicarViaFuncao = multiplicarValores(primeroNumero, segundoNumero);
        System.out.println("Valor multiplicação = " + multiplicarViaFuncao);
        int dividirViaFuncao = dividirValores(primeroNumero, segundoNumero);
        System.out.println("Valor divisão = " + dividirViaFuncao);
    }
    public static int somarValores(int numA, int numB){
        return numA + numB;
    }
    public static int subtrairValores(int numA, int numB){

        if(numA < 0){
            numA = numA * -1;
        }
        return numA-numB;
    }
    public static int multiplicarValores (int numA, int numB){
        if(numA < 0){
            numA = numA * -1;
        }
        return numA * numB;
    }
    public static int dividirValores (int numA, int numB){
        if(numA < 0){
            numA = numA * -1;
        }
        return numA / numB;
    }
}

