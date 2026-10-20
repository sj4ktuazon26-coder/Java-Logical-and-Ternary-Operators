package com.joysistvi.day5.operators;

public class Activity4_Tuazon {
  public static void main(String[] args) {
    /* === USING && OPERATOR === */
    int age = 18;
    boolean hasValidId = true;
    String result = "No";

    System.out.println("--- Task 2: Event Entry Check ---");

    if(age >= 18 && hasValidId) result = "Yes";

    System.out.println("Allowed to enter the event: " + result);

    System.out.println();
    ////////////////////////////////////////////////////////////////////////////////

    /* === USING || OPERATOR === */
    boolean isWeekend = false;
    boolean isHoliday = true;
    result = "No, there are classes today.";

    System.out.println("--- Task 3: Class Status Check ---");

    if(isWeekend || isHoliday) result = "Yes, there are no classes today.";

    System.out.println("Are there no classes today? " + result);

    System.out.println();
    ////////////////////////////////////////////////////////////////////////////////

    /* === USING ?: OPERATOR === */
    int score = 75;

    System.out.println("--- Task 4: Pass or Fail Check ---");

    System.out.println("Score: " + score);
    System.out.println("Result: " + (score >= 75 ? "Passed" : "Failed"));

    System.out.println();
    ////////////////////////////////////////////////////////////////////////////////

    /* === USING ?: OPERATOR === */
    int num = 10;
    int num1 = 25;

    System.out.println("--- Task 5: Larger Number Check ---");

    System.out.print("Number 1: " + num);
    System.out.print(", ");
    System.out.println("Number 2: " + num1);
    System.out.println("The larger number is: " + (num > num1 ? num : num1));
  }
}
