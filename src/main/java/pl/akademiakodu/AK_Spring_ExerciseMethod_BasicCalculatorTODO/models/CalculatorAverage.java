package pl.akademiakodu.AK_Spring_ExerciseMethod_BasicCalculatorTODO.models;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class CalculatorAverage {
    /**
     * Method calculate mathematical square of digit
     *
     * @param a user input
     * @return square of a
     */
    public int squareOf(int a) {
        return a * a;
    }

    /**
     * Method calculate mathematical element of digit
     *
     * @param a user input
     * @return element of a
     */
    public double elementOf(int a) {
        double result = Math.sqrt(a);
        return result;
    }

    /**
     * Method calculate mathematical factorial of digit
     *
     * @param a user input
     * @return factorial of a
     */
    public String factorial(int a) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= a; i++) {

            result = result.multiply((new BigInteger("" + i)));
        }
        return result.toString();
    }

    /**
     * Method check if digit is a prime number
     *
     * @param a user input
     * @return result
     */
    public boolean isPrimeNumber(int a) {
        for (int i = a-1; i >1 ; i--) {
            if((a%i==0))
                return false;
        }
            return true;
    }
}
