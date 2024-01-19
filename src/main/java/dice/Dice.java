import java.util.Random; 
/** 
 * creating dice that gets a random number one through sides.
 */

public class Dice {
  /**
 * implementation for dice inside dice class.
 */
  public int roll(int sides) { 
    Random random = new Random(); 
    int dice = random.nextInt(sides) + 1; 
    return dice;
  }

} 
