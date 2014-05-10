// This class contains static methods for random 
// number generation

import java.util.Random;

public class GenerateRandom {
    
    // static initializer
    static {
	random = new Random();
    }
    
    // don't instantiate
    private GenerateRandom() { }

    private static Random random;
    
    public static double random() {
	return uniform();
    }
    
    // reutnrs a real number uniformly in [0, 1)
    public static double uniform() {
	return random.nextDouble();
    }
    
    // reutnrs an integer  uniformly in [0, N)
    public static int uniform(int N) {
	return (int) (uniform() * N);
    }
}
