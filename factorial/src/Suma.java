import static java.lang.Math.pow;

public class Suma {

    public static void main(String[] args) {
        Double potencia = sumPotencia(100);
        String factorialString = potencia.toString();
        System.out.println(factorialString);
    }

    private static Double sumPotencia(Integer number) {
        Double result = 0D;
        for (int i = 0; i <= number; i++) {
            result = result + pow(i, 2);
        }
        return result;
    }

}
