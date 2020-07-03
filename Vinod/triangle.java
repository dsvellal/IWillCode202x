public class Traingle{

    public static void main(String []args){
    
    final int total_depth = 9;

for (int currentDepth = 0; currentDepth < total_depth; currentDepth++) {
for (int spaces = currentDepth; spaces < (total_depth - 1); spaces++) { 
System.out.print(" ");
}

for (int ones = 0; ones <= currentDepth; ones++) { 
System.out.print("1 ");
}

System.out.println();

    }

  }

}
