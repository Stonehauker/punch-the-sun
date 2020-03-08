import java.util.ArrayList;
import java.util.HashMap;

public class PrimeDecomp {
    public static String factors(int n) {
        ArrayList < Integer > resultDivision = new ArrayList < Integer > ();
        HashMap < Integer, Integer > count = new HashMap < Integer, Integer > ();
        String resultFinal = "";
        String r = "";
        int value = 0;
        for (int i = 2; i < n; i++) {//start division loop
            while (n % i == 0) {
                resultDivision.add(i);
                n = n / i;
            }
        }//end division loop
        resultDivision.add(n);
        for (int j: resultDivision ) {//start counting loop
            if (count.containsKey(j)) {
                count.put(j, count.get(j) + 1);
            } else {
                count.put(j, 1);
            }
        }//end counting loop
        for (int k: count.keySet()) {//start printing loop
          if (count.get(k) > 1){
            resultFinal= resultFinal+("("+k+"**"+count.get(k)+")");
          } else {
            resultFinal= resultFinal+("("+k+")");
          }
        }//end printing loop
        return (resultFinal);
    }
}

/*
  [Takes a string of integers, enters the factors into an Arraylist, and then assembles a shortened HashMap with the factors and the multiple of the factors, then returns a stylized string.]
  A good exercise is learning Hashmaps as a function of counting the amount of items in a list. HashMaps work nearly the same as a dictionary in Python.
*/
