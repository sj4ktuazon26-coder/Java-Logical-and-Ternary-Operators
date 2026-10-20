package com.joysistvi.day6.ifstatement;

public class IfElseLadder {
  public static void main(String[] args) {
    int grade = 70;
    String result = null;

    if(grade <= 70) {
      result = "F";
    } else if(grade <= 80) {
      result = "C";
    } else if(grade <= 80) {
      result = "C";
    } else if(grade <= 80) {
      result = "C";
    }

    int day = -1;
    String dayName = null;

    if(day == 1) {
      dayName = "Sunday";
    } else if(day == 2) {
      dayName = "Monday";
    } else if(day == 3) {
      dayName = "Tuesday";
    } else if(day == 4) {
      dayName = "Wednesday";
    } else if(day == 5) {
      dayName = "Thursday";
    } else if(day == 6) {
      dayName = "Friday";
    } else if(day == 7) {
      dayName = "Saturday";
    } else {
      dayName = "Invalid Day";
    }

    System.out.println(dayName);
  }
}
