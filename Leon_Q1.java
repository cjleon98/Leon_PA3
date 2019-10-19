import java.util.Random;
import java.util.Scanner;

public class Leon_Q1<type, usr_answer, answer> {

    private final static Scanner sc = new Scanner(System.in);
    public static void main(String []args)
    {
        int forever = 0 ;
        while (forever == 0){

            int count = 0;
            int difficulty = 0;
            int arithmetic = 0;
            int score = 0;
            boolean usr_crct = false;

            System.out.println("Please select a difficulty");

            difficulty = sc.nextInt();

            System.out.println("Please Select a type of Problem \n1:addition\n2:Multiplication \n3:Subtraction \n4:Division \n5: Random");
            arithmetic = sc.nextInt();


            while(count<10) //this makes it so that the user is asked 10 questions , change to 3 for testing , and 10 for final proj
            {
                usr_crct = generate_question(difficulty, arithmetic); //here we ask the user the question and store if they got it right
                response(usr_crct); //next we generate a response based on correct or wrong answer - this is done with booleans
                if (usr_crct == true) score ++ ; // increase the users score with the boolean returned
                count++;//increment the count to go to next question
            }

            //print the user final score
            if (score <8)
                System.out.println("Final score = " + score*10 + "% Please ask your teacher for extra help");
            else
                System.out.println("Congratulations you are ready to go to the next level");


        }
    }

    public static boolean generate_question(int level, int type)
    {
        Random randoms = new Random();
        double temp =Math.pow(10, level);
        int random1 =randoms.nextInt((int)temp); /// do calculations based on level;
        int random2 = randoms.nextInt((int)temp);
        int answer = 0;//this will be used to store the correct answer
        int usr_answer = 0;//this will be used to store the users answer and compare it to the correct answer
        if (type == 5)
        {// type 5 means a random mix so we do this to avoid a complicated switch statement
            int random =randoms.nextInt(4)+1; //number from 1-4
            type = random;
        }
        //return false;
    }
            switch (type){
        //String random1 = "";
            case 1: //addition
                //String random1 = "";
            System.out.println("What is " + random1 + " plus " + random2);
            answer = random1+random2;
            break;
            case 2: //multiplication
            System.out.println("What is " + random1 + " times " + random2);
            answer = random1*random2;
            break;
            case 3: //subtraction
            System.out.println("What is " + random1 + " minus " + random2);
            answer = random1 - random2;
            break;
            case 4: //division
            System.out.println("What is " + random1 + " divided by " + random2);
            answer = random1/random2;
            break;

    }


    usr_answer = sc.nextInt();

             if (usr_answer == answer)return true; else return false;
}

    public static void response(boolean ans)
    {
        //ans is a boolean which means true or false, AKA right or wrong , based on this we select a response
        Random random_num = new Random();

        int random = random_num.nextInt(4)+1;
        if (ans == true)
        {
            switch (random)
            {
                case 1:
                    System.out.println("Very good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        else
        {
            switch (random)
            {
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don’t give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }

    }

        }
