package gitpacktest ;

public class On20200807EgSetGet {

			private int varAge;
		

			//Syntax for creating a method
			//access-modifier, <optional-static,final,abstract>, return-data-type, method-name, <optional-method-arguments>
			
			public int setAge (int varAge) {
				this.varAge = varAge + 1 ;
				System.out.println("The age one year from now will be: " + this.varAge) ;
				return this.varAge ;
			}
			
			public int getAge () {
				System.out.println("The age now is: " + varAge) ;
				return varAge ;
			}
			
			public static void main(String[] args) {
				//How do I call the set and get methods from here ?
			}
	}