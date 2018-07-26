
public class PrimeFactor {

    public String of(int number) {
        String result ="";        
        int prime = 2;
        while(number > 1 ) {
            while(number % prime == 0 ) {
                result += prime;
                number /= prime;
            }
            prime++;
        }
        return result;
    }

}
