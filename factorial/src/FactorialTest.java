public class FactorialTest {

    public static void main(String[] args) {
        Integer result = 0;
        Integer factorial = factorial(100);
        String factorialString = factorial.toString();
        for (int i = 0; i < factorialString.length(); i++) {
            int digito = Integer.parseInt(String.valueOf(factorialString.charAt(i)));
            result = result + digito;
        }
        System.out.println(result);
    }

    private static Integer factorial(Integer number) {
        Integer result = 1;
        for (int i = 1; i <= number; i++) {
            result = i * result;
        }
        return result;
    }

}
