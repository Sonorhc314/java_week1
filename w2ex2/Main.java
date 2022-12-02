class Main {

    public static void main(String[] args) {
      Main m = new Main();
      String example = "This is an example string";
      m.printCharsInString(example);
      System.out.println();
      m.printStringInReverse(example);
      System.out.println();
      m.printStringInUppercase(example);
      System.out.println();
      m.encryptText(example,3);
    }
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";  
    /*
    * Modify the method below so that it prints out each character in the string
    * on a new line.
    */
  
    public void printCharsInString(String s){
      for (int i = 0; i < s.length(); i++) 
      {
        System.out.println(s.charAt(i));
      }
    }
  
    /*
    * Modify the method below so that it prints out
    * the string in reverse order
    */
  
    public void printStringInReverse(String s){
        for (int i = 0; i < s.length(); i++) 
        {
          System.out.print(s.charAt(s.length()-i-1));
        }
    }
  
    /*
    * Modify the method below so that it prints out
    * the string as all uppercase
    */
  
    public void printStringInUppercase(String s){
        for (int i = 0; i < s.length(); i++) 
        {
          System.out.print(Character.toUpperCase(s.charAt(i)));
        }
    }
  
    /*
    * Implement the method below which encrypts the
    * text passed in as an argument using a 
    * Ceaser cypher.  
    * 
    * https://en.wikipedia.org/wiki/Caesar_cipher
    * 
    * This is illustrated below 
    *
    * input string = "ABC"
    * shift by = 3
    * encrypted text = "DEF"
    */
    public void encryptText(String s, int shiftBy){
        for (int i = 0; i < s.length(); i++) 
        {
            if(i+shiftBy<s.length())
            {
                System.out.print(s.charAt(i+shiftBy));
            }
            else
            {
                int my_index = i+shiftBy-s.length();
                System.out.print(my_index);
            }
        }
    }
  
    /*
    * Implement the method below which decrypts a
    * Ceaser cypher encrypted message
    *
    */
  
    public String decryptText(String s, int shiftBy){
      return s;
    }
  
  }