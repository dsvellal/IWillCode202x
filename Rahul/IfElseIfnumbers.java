public class numbers {
  public static void main(final String[] args) {

    
    int num1 = 100;
    int num2 = 700;
    int num3 = 300;
    int num4 = 400;
    
  {
        if (num1>num2 && num1>num3 && num1>num4){
          System.out.println(num1+"is the greatest number!");
        }
        else if (num2>num1 && num2>num3 && num2>num4)
        {
          System.out.println(num2+"is the greatest number!");
        }
        else if (num3>num2 && num3>num1 && num3>num4)
        {
          System.out.println(num3+"is the greatest number!");    
        }
        else if(num4>num2 && num4>num3 && num4>num1)
        {
          System.out.println(num4+"is the greatest number!");    
        }
        if (num1 < num2 && num1 < num3 && num1<num4){
          System.out.println(num1+"is the smallest number!");
        }
        else if (num2<num1 && num2<num3 && num2<num4)
        {
          System.out.println(num2+"is the smallest number!");
        }
        else if (num3<num2 && num3<num1 && num3<num4)
        {
          System.out.println(num3+"is the smallest number!");    
        }
        else if(num4<num2 && num4<num3 && num4<num1)
        {
          System.out.println(num4+"is the smallest number!");    
        }
        
      }
    }
}
