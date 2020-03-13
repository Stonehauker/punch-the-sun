public class Kata {

  public static String encrypt(final String text, final int n) {
    String nTextResult = text;
    if (text == null || n <= 0 ){return text;}
    for (int j = 0; j<n ; j++){
      nTextResult = helperEncrypt(nTextResult);
    }//end for j
    return nTextResult;
  }//end method encrypt

   public static String helperEncrypt(String input){
      String nText1 = "";
      String nText2 = "";
      for (int i = 0; i<input.length(); i ++){
        if (i%2==0){nText1 = nText1.concat(String.valueOf(input.charAt(i)));
        } else {nText2 = nText2.concat(String.valueOf(input.charAt(i)));}//end if i%2
      }//end for i
      return (nText2 +  nText1);
    }//end method helperEncrypt

  public static String decrypt(final String encryptedText, final int n) {
    String nTextResult = encryptedText;
    if (encryptedText == null || n <= 0 ){return encryptedText;}
    for (int j = 0; j<n ; j++){
      nTextResult = helperDecrypt(nTextResult);
    }//end for j
    return nTextResult;
  }//end method decrypt

  public static String helperDecrypt(String input){
    int mid = input.length()/2;
    String nText1 = input.substring(0, mid);//evens
    String nText2 = input.substring(mid);//odds
    String output = "";
    for (int x = 0; x<input.length(); x++){
      if (x%2==0) {output = output.concat(String.valueOf(nText2.charAt(0)));nText2 = nText2.substring(1);
      } else {output = output.concat(String.valueOf(nText1.charAt(0)));nText1 = nText1.substring(1);}//end if i%2
    }//end for x
    return output;
  }//end method helperDecrypt
}//end Kata


/*
  [This program takes a string to be encrypted and an integer to label how many times the encryption must be done. It also has a decryption function that reverses the encryption function the set number of times.]
  I stole this nearly wholesale from another website; the difference bein g that the solution was coded in Javascript instead of Java.
*/
