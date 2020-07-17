public class GreaterSmaller{ 

 

      public static void main(final String[] args) { 

        int num1 = 100; 

        int num2 = 200; 

        int num3 = 300; 

        int num4 = 400; 

         

        if (num1 > num2) { 

            if (num1 > num3){ 

                if (num1 > num4){ 

                System.out.println("greatest No is "+ num1);     

                } 

                else { 

                System.out.println("greatest No is "+ num4); 

                } 

            } 

            else{ 

                if (num3 > num4){ 

                System.out.println("greatest No is "+ num3);     

                } 

                else { 

                System.out.println("greatest No is "+ num4); 

                } 

            } 

        } 

        else { 

            if (num2 > num3){ 

                if (num2 > num4){ 

                System.out.println("greatest No is "+ num2);     

                } 

                else { 

                System.out.println("greatest No is "+ num4); 

                } 

            }     

            else{ 

                if (num3 > num4){ 

                System.out.println("greatest No is "+ num3);     

                } 

                else { 

                System.out.println("greatest No is "+ num4); 

                } 

            } 

        } 

        if (num1 < num2) { 

            if (num1 < num3){ 

                if (num1 < num4){ 

                System.out.println("Smallest No is "+ num1);     

                } 

                else { 

                System.out.println("Smallest No is "+ num4); 

                } 

            } 

            else{ 

                if (num3 < num4){ 

                System.out.println("Smallest No is "+ num3);     

                } 

                else { 

                System.out.println("Smallest No is "+ num4); 

                } 

            } 

        } 

        else { 

            if (num2 < num3){ 

                if (num2 < num4){ 

                System.out.println("Smallest No is "+ num2);     

                } 

                else { 

                System.out.println("Smallest No is "+ num4); 

                } 

            }     

            else{ 

                if (num3 < num4){ 

                System.out.println("Smallest No is "+ num3);     

                } 

                else { 

                System.out.println("Smallest No is "+ num4); 

                } 

            } 

        }         

     } 

} 
