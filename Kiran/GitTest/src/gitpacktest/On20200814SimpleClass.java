package gitpacktest;

public class On20200814SimpleClass {
	
	public static void funcSetNum (int fVar) {
		int vIntVar = 0 ;
		vIntVar = fVar ;
			
		System.out.println("The value of the variable VIntVar in the function *NOW* is :" + vIntVar) ;
	}

	public static void main(String[] args) {
		int vVar = 23 ;
		funcSetNum (vVar) ;
	}

}