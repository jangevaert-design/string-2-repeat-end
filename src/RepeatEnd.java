public class RepeatEnd {

  /*
  Given a string and an int n, return a string made of n repetitions of the last n characters
  of the string. You may assume that n is between 0 and the length of the string, inclusive.
  */

  public static void main(String[] args) {
    String str = "Hello";
    int n = 3;
    System.out.printf("the outcome of %s with number %s is: " + repeatEnd(str, n), str, n);
  }

  public static String repeatEnd(String str, int n) {
    String result = "";
    int len = str.length();

    for(int i = 0; i < n; i++) {
      result += (str.substring(len - n, len));
    }
    return result;
  }


}
