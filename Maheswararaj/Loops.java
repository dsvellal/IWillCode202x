public class Loops {
  public static void main(final String[] args) {
    // Loops.
    // for, while, do-while
    // for - traditional for loop, enhanced for loops

    // arrays
    final String[] namesOfParticipantsOfIWillCode = 
      { "Datta", "Kiran", "Sujay", "Sobi", "Jabeen", "KLM", "Pavithra", "Sapna" };

    // Traditional for loop
    // Loop has three elements: 1. Initialisation, 2. Condition for termination, 3.
    // Increment/decrement
    for (int i = 0; i < namesOfParticipantsOfIWillCode.length; i++) { // i-- ==> i = i-1
      System.out.println(namesOfParticipantsOfIWillCode[i].toUpperCase());
    }

    // Enhanced for loop
    // No initlisation, no increment, no termination, no index-access of elements!
    for (final String nameOfParticipantofIWillCode : namesOfParticipantsOfIWillCode) {
      System.out.println(nameOfParticipantofIWillCode.toLowerCase());
    }
  }
}
