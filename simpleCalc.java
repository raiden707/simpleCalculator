
package com.bham.pij.assignments.calculator;
//Ahmed Khan - Student ID: 2255610

import java.util.ArrayList;

public class Calculator {

    public float finalResult = 0;
    public ArrayList<Float> ram = new ArrayList<Float>();

    public float evaluate(String expression) {

        // 1. Receive a string as an input
        // 2. Return the output as a float
        
        // This splits the input string to a list with all items seperated
        ArrayList<String> token = new ArrayList<String>();
        for (String retval : expression.split(" ")) {
            token.add(retval);
        }
        float result = 0;
        
        float item1 = Float.valueOf(token.get(0));
        float item2 = Float.valueOf(token.get(2));
        
        
        // This block iterates over all items in token
        for(String item: token){
            if (token.get(1).equals("+")){
                result = item1 + item2;
            }
            if (token.get(1).equals("-")){
                result = item1 - item2;
            }
            if (token.get(1).equals("/")){
                result = item1 / item2;
            }
            if (token.get(1).equals("*")){
                result = item1 * item2;
            }
           
        }

        //System.out.println(result);
        
        finalResult = result;

        ram.add(result);
        

        return result;
    }

    public float getCurrentValue() {
        /*
         * 1. This method returns the evaluated expression from evaluate()
         */
    
        
        return finalResult;
    }
    
    public float getMemoryValue() {
        /*
         * If the user types “mr”, the program should print to the console the stored
         * memory value (or zero if no value has been stored).
         */
        if (!ram.isEmpty()){
            System.out.println( ram.get(ram.size()-1));
        }
        else{
            System.out.println(0);
        }
        return 0;
    }
    
    public void setMemoryValue(float memval) {
        /*
         * The memory function works as follows. If the user presses presses the ‘m’ key
         * the program should store the most recent calculator result (if it was valid,
         * zero otherwise).
         */


         //append finalResult to the Arraylist ram

         ram.add(finalResult);
         
        return ;
    }
    
    public void clearMemory() {
        /*
         * If the user presses the ‘c’ key, the program should clear the memory by
         * setting it to zero.
         */

         //delete all items in the memory arraylist
         ram.clear();
        return;
    }
    
    public float getHistoryValue(int index) {
        /*
         * The calculator should also have a history function which works as follows. If
         * the user presses ‘h’ then the program should print to the console all of the
         * results since the program was started, on one line, separated by spaces. You
         * should also add the following method to your class. This method returns the
         * history value at the index in the parameter. If the parameter is zero, the
         * method should return the first value that was added to the history. If the
         * parameter is 1, the method should return the second value that was added to
         * the history, and so on.
         */

         // return historic value in ram at index n

        return ram.get(index-1);
    }
    
    public void run() {
        /*
         * This method acts as the main controller
         */
        
    }
    
    public static void main(String[] args) {
        

        new Calculator().run();
    }
}