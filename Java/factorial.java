public class Factorial {

  public int factorial(int n) {
    if (n<0||n>12){ throw new IllegalArgumentException();}

    if (n==0){return 1;}

    return n*factorial(n-1);
  }//end method factorial
}//end class Factorial


/*
  [Takes integer input, returns factorial.]
  Very simple, but recursion still eludes me a bit.
*/

// THE VERSION BELOW IS THE BEST PRACTICE VERSION ON CODEWARS

public class Factorial {
  public int factorial(int n) {
    if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
    return n <= 1 ? 1 : n * factorial(n - 1);
  }
}

/*
  This code uses a ternary operator, which I believe is a more effective if/else loop.
*/
