import java.util.HashMap;
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if ( walk.length != 10){return false;}//removes all entries that are not ten units
    HashMap <Character, Integer> coordinates = new HashMap <Character, Integer>();
    for (char i : walk){//start for counting
      if (coordinates.containsKey(i)) {//start if/else hashmap load
        coordinates.put(i, coordinates.get(i) + 1);
      } else {
        coordinates.put(i, 1);
      }//end if/else hashmap load
    }//end for counting
    if (coordinates.get('n') == coordinates.get('s') & coordinates.get('w') == coordinates.get('e')){//start if return **DOUBLE/SINGLE QUOTES MATTER
      return true;
    }//end if return
    return false;
  }
}

/*
  [Takes a string of Characters, enters them into a HashMap, and then determines if the opposing coordinates (Cardinal Directions) equate to zero.]
  An easier solve with the use of the primeDegredation HashMap filling technique. A pretty reliable tool for counting amounts of objects and recording them.
  **Also learned that single quotes ('') are used for literal Characters, and double quotes ("") are used for literal Strings, which if used will return true instead of throwing an error.
*/

// THE VERSION BELOW IS THE BEST PRACTICE VERSION ON CODEWARS

public class TenMinWalkCodeWars {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;

    int x = 0, y = 0;
    for (char c: walk) {
      switch (c) {
        case 'n': y++; break;
        case 's': y--; break;
        case 'w': x++; break;
        case 'e': x--; break;
      }
    }

    return x == 0 && y == 0;
  }
}

/*
  I saved this one specifically because Switch Statements caught my eye; almost a block of if/else statements but far cleaner. Considering the light requirements of the problem, this is the most apt code.
*/
