/*
	Kyle Brantley
	CS 410
	DFSM Project
	Number: 36, 00100100
*/

import java.util.*;

public class DFSM {
	private State state;

	public DFSM() {
		state = State.STATE1;
	}

	public void analyze(char c) {
		state = state.run(c);
	}

	public State getState() {
		return state;
	}

	public static void main(String[] args) {
		DFSM dfsm = new DFSM();

		Scanner kb = new Scanner(System.in);


		//User input, only accepts 0s and 1s and input
        System.out.println("Please enter a binary string.\nWe are looking for the substring 00100100.");
        while(!kb.hasNext("[01]+")){
            System.out.println("Please enter a binary string.");
            kb.next();
        }
        String numIn = kb.next();

        //Put the entry into char[] so we can analyze each individual digit
        char[] numInArr = numIn.toCharArray();

        System.out.println("\n");
        for (int i = 0; i < numInArr.length; i++) {
        	dfsm.analyze(numInArr[i]);
        }

        //STATE9 is our accepting state
        if (dfsm.getState() == State.STATE9) {
        	System.out.println("Your entry contains the substring '00100100'.");
        }
        else {
        	System.out.println("Your entry does not contain the substring '00100100'.");
        }


	}
}
