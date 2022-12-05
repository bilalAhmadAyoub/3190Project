import java.util.Scanner;

public class BilalAyoub3190Project {
    public static void main(String[] args) {
        boolean quit = false;

        //Print instruction statement
        System.out.println("Hello, welcome to the Sentiment detector. Type any text and the Sentiment detector will try to ascertain which emotions the text may be conveying: ");

        String inputString = "";
        Scanner input = new Scanner(System.in);
        

        while(!quit && (inputString = input.nextLine()) != null) {            
            String outputString = "You may be feeling one of the following emotions: ";
            int originalOutputLength = outputString.length();
            

            //check if user wants to quit
            if(inputString.contains("quit") && inputString.length() <= 7) quit = true;


            //process input and determine possible sentiments
            String emotionArrays[][] = {{"anger", "angry", "hate", "mad", "furious", "stupid", "fuck", "shit", "damn"}, 
                                        {"fear", "scared", "afraid", "terrified", "startled", "agitated", "worried", "on edge", "panicked", "troubled"}, 
                                        {"happiness", "happy", "pleasant", "good", "joy", "nice", "gentle", "smile", "glee", "laugh", "giggl", "teehee"},
                                        {"grief", "death", "loneliness", "miss", "grave", "short life", "funeral", "casket", "burial"},
                                        {"sadness", "sad", "cry", "weep", "feeling blue", "wrenching", "snot", "tear", "sob", "oh no", "upset"},
                                        {"gratitude", "thank", "relief", "reliev"},
                                        {"love", "ador", "giddy", "passion", "rose", "chocolate", "valentine", "romance", "suitor", "husband", "boyfriend", "wife", "girlfriend"},
                                        {"disgust", "repuls", "revolt", "yuck", "eww", "gross", "blech"}, 
                                        {"hunger", "hungry", "yum", "food", "tasty", "delicious", "plate", "bowl"},
                                        {"boredom", "bore", "yawn", "tired"},
                                        {"surprised", "surpris", "baffle", "shock", "woah", "wow", "!"},
                                        {"confused", "huh", "?", "what", "why", "who", "when", "where", "how"},
                                        };

            for(int i = 0; i < emotionArrays.length; i++) {
                boolean emotionFound = false;
                for(int j = 0; j < emotionArrays[i].length && !emotionFound; j++) {
                    if(inputString.contains(emotionArrays[i][j])) {
                        emotionFound = true;
                        outputString += emotionArrays[i][0] + " ";
                    }//if
                }//for loop
            }//for loop

            //if no emotions were detected, add the emotion "neutral" to the output string
            if(outputString.length() == originalOutputLength) outputString += "neutral";


            //print out output
            if(!quit) System.out.println(outputString + "\n\n");

            //print closing message
            if(!quit) System.out.println("You can try again with some other text. If you'd like to quit, type \"quit\" and press the Enter key: ");

        }// while

        //close the Scanner
        input.close();

        //print program end statement
        System.out.println("\n\nProgram has finished running. Thanks for using Sentiment detector!");


    }// main

}// class BilalAyoub3190Project