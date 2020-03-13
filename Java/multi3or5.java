import java.util.ArrayList;

public class Solution {

  public int solution(int number) {
    int answer = 0;
    for (int i = 0;i<number;i++){
      ArrayList<Integer> x3 = new ArrayList<>();
      ArrayList<Integer> x5 = new ArrayList<>();

      if (i%3==0){x3.add(i);}//end if i%3
      if (i%5==0){x5.add(i);}//end if i%5

      x3.removeAll(x5);
      x3.addAll(x5);
      for (int j:x3){
        answer+=j;
      }//end for i:x3
    }//end for i
    return answer;
  }//end method solution
}//end class solution

/*
  [Take an integer, find its multiples of 3 and 5, counted only once per multiple.]
  Easy one. Took inspiration from the recIntoSquares project and utilized ArrayLists.
*/

// THE VERSION BELOW IS THE BEST PRACTICE VERSION ON CODEWARS

public class Solution {

  public int solution(int number) {
    int sum=0;

    for (int i=0; i < number; i++){
      if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
  }
}

/*
  A simple strictly mathematical version. Sort of points out my predisposition to use something fancy over something elegant. Should really try to think of a simpler version of all my projects.
*/
