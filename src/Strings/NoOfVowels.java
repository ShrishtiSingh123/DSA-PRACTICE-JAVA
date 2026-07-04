package Strings;

public class NoOfVowels {
    public static void main(String[] args) {
        String s="saaeefijookwjumji";
        int count=0;
      for(int i=0;i<s.length();i++)
      {
         char ch=s.charAt(i);
         if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u');
         count++;
      }
      System.out.println(count);
    }
}
