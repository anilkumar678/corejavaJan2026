package org.example;

public class SwitchDemo {
    enum Day {sunday,monday,tuesday,wednesday,thursday,friday,saturday};

    public static void main(String[] args) {
        Day day=Day.monday;
        String result=switch (day){
            case monday -> "less traffic";
            case tuesday -> "moderate traffic";
            default -> "heavy traffic";
        };
        System.out.println(result);
    }



}
