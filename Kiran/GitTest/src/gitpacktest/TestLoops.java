package gitpacktest;

public class TestLoops {

  public static void main(final String[] args) {
    final int i = 0;
    final String[] namesOfParticipantsOfIWillCode = { "Datta", "Kiran", "Sujay", "Sobi", "Jabeen", "KLM", "Pavithra",
        "Sapna" };

    for (final String element : namesOfParticipantsOfIWillCode) { // i-- ==> i = i-1
      System.out.println(element.toUpperCase());
    }

    // Enhanced for loop
    // No initlisation, no increment, no termination, no index-access of elements!
    for (final String nameOfParticipantofIWillCode : namesOfParticipantsOfIWillCode) {
      System.out.println(nameOfParticipantofIWillCode.toLowerCase());
    }
  }
}