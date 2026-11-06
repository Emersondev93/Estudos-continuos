public class Calculadora {

    public int somar(int a, int b){
        return a + b;
    }

    public int subtrair(int a, int b){
        return a - b;
    }

    public int multiplicar(int a, int b){
        return a * b;
    }

    public int dividir(int a, int b){
        return a / b;
    }

    public boolean ehPositivo(int n){

        if(n <= 0){
            return false;
        }
        return true;
    }

    public boolean ehPar(int n){
        return n % 2 == 0;
    }
}
