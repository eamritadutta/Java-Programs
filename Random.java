// This class contains static methods for random 
// number generation

// uses java.util.Random

public class GenerateRandom {
    
    // don't instantiate
    private GenerateRandom() { }

    private static Random random;
    
    public static int uniform() {
	return random.nextInt();
    }
}
