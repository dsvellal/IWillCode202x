package com.philips;

public class NestedIf {
  public static void main(final String[] args) {

    final boolean IsThereTraffic = false;
    final boolean WantToEnjoyRide = false;
    final String RouteOptions[] = { "Bull Temple Road", "JC Road", "TCM Royan Road", "VV Puram" };
    String ChosenRoute = "To be chosen";

    if (WantToEnjoyRide == true) {
      if (IsThereTraffic == false) {
        ChosenRoute = RouteOptions[1];
      } else if (IsThereTraffic == true) {
        ChosenRoute = RouteOptions[0];
      }
    }
    if (WantToEnjoyRide == false) {
      if (IsThereTraffic == false) {
        ChosenRoute = RouteOptions[2];
      } else if (IsThereTraffic == true) {
        ChosenRoute = RouteOptions[3];
      }
    }
    System.out.println("The route selected is : " + ChosenRoute);
  }
}