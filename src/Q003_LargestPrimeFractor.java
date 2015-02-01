import java.util.ArrayList;

/**
 * Created by User on 31/01/2015.
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Q003_LargestPrimeFractor {

    public static void main(String[] args) {
        ArrayList<Float> Primes = new ArrayList<Float>();
        ArrayList<Float> Factors = new ArrayList<Float>();
        float target = 600851475143f;
        for (float k = 2; k * k <600851475143f; ++k) {
            if (isPrime(k)) {
                Primes.add(k);
            }


        }


        int i = 0;
        while(target != 0)
        {
            float prime = Primes.get(i);
            if(target % prime == 0)
            {
                target /= prime;
                Factors.add(prime);

            }

            i++;

        }

        System.out.println(Factors.get(Factors.size() - 1));
    }

    //checks whether an int is prime or not.
    static boolean isPrime(float n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
