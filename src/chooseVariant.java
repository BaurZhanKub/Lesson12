import java.util.Random;

public class chooseVariant {
    static  Random random = new Random();
  static int chooseVariant (int maxForFirstVariant, int maxForSecondVariant){
      int x = random.nextInt(maxForFirstVariant) +1 <= maxForFirstVariant ? 1:2;
        return x;
  }

}
