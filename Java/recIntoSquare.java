import java.util.*;

public class SqInRect {

	public static List<Integer> sqInRect(int lng, int wdth) {
    ArrayList<Integer> squares = new ArrayList<Integer>();
    int nLng = lng;
    int nWdth = wdth;
    if (nLng == nWdth)  {return null;}
		while( nLng > 0 & nWdth > 0){//start while
      if (nLng > nWdth){
        System.out.println(nLng);
        squares.add(nLng-(nLng-nWdth));
        nLng = nLng-nWdth;
      }else if (nWdth > nLng){
        squares.add(nWdth-(nWdth-nLng));
        nWdth = nWdth-nLng;
      }else if (nWdth == nLng){
      System.out.println(nLng);
        squares.add(nWdth);
        nWdth = 0;
        nLng = 0;
      }
    }//end while

		return squares;

  }
}

/*
[Takes two integers, determines the larger value, and then returns the largest possible integer squares with the values until both are zero, and returns an ArrayList of integers.]
Pretty simple. Had to write down the math in pseudocode to really understand the exact math equations.
*/

// THE VERSION BELOW IS THE BEST PRACTICE VERSION ON CODEWARS

import java.util.*;

public class SqInRect {

  public static List<Integer> sqInRect(int l, int w) {
    if(l == w)
      return null;
    else if(l > w)
      return sqInRect(w, l);

    List<Integer> answer = new ArrayList<>();
    answer.add(w);
    answer.addAll(sqInRect(w, l - w));
    return answer;
  }
}

/*
  [Takes two integers, determines which value is greater, then continues to add values recursively into the same method until all squares are generated.]
  Daaamn, first real look at recursive use of a function. I can't quite wrap my head around it. The best way I can explain is that each time the method is called it opens up another instance inside of the first method, like a matryoshka doll.
*/
