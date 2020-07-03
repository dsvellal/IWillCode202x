public class Patient {
  public static void main(final String[] args) {

    final int age = 50;
    final int bloodpressure = 120;


    final boolean validAge = (age >= 0);
    
         if ((age <= 50) && (bloodpressure <= 140)) {
        System.out.println("no hypertension!");
      } else {
        System.out.println(" hypertension ");
        if (bloodpressure > 140) {
          System.out.println("You are not bp patient!");
        } else {
          System.out.println("You are high BP patient!");
        }
      }
    }
  }
