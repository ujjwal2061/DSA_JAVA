import java.util.Scanner;

public class CaseCheck {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);
      // ceheck the char is Uppercase or Lowercase   
     if(ch >= 'a' && ch <= 'z'){
       System.out.println("Lowercase");
      }else{
     System.out.println("UpperCase");
    }
   input.close();
  }
}