package com.EricNorrwing.lektion_2_tasks;

public class Main {
    public static void main(String[] args) {



        //Task 3
        //for loop printing index up to 10

        /*
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        */


        //Task 6

        checkForBenny();
        forLoopTest();
        ifStatementTest();

    }


    //task 5
    public static void checkForBenny(){
        String name = "Anton";

        switch (name){
            case "Benny":
                System.out.println("Its Benny, not Anton");
                break;
            case "Anton":
                System.out.println("Its a me, Anton");
                break;
            default:
                System.out.println("Nobody here called that, please try another name");

        }
    }

    //task 4
    //For loop with if clause, if index is 10 then print X, otherwise Y
    //No breaks added, so it will print for every loop as the value  is hardcoded
        public static void forLoopTest(){

        for (int i = 0; i <= 10; i++) {
            if (i == 10) {
                System.out.println("Index is 10");
            } else {
                System.out.println("Index is not 10");
            }
        }

    }

    public static void ifStatementTest(){
        //Task 1 and 2
        //If statement checking a hardcoded value "age"
        int age = 18;

        if(age < 18){
            System.out.println("Underage");
        }
        else{
            System.out.println("Adult");
        }
    }
}







