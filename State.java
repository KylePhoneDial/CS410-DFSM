/*
	Kyle Brantley
	CS 410
	DFSM Project
	Number: 36, 00100100
*/

public enum State{

	//Each state represents a state in the DFSM image
	STATE1 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 2");
				return STATE2;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE2 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 3");
				return STATE3;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE3 {
		@Override
		State run(char c) {
			if (c == '1') {
				System.out.println("Entering state 4");
				return STATE4;
			}
			else {
				System.out.println("Returning to state 2");
				return STATE2;
			}
		}
	},

	STATE4 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 5");
				return STATE5;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE5 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 6");
				return STATE6;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE6 {
		@Override
		State run(char c) {
			if (c == '1') {
				System.out.println("Entering state 7");
				return STATE7;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE7 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 8");
				return STATE8;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE8 {
		@Override
		State run(char c) {
			if (c == '0') {
				System.out.println("Entering state 9");
				return STATE9;
			}
			else {
				System.out.println("Returning to state 1");
				return STATE1;
			}
		}
	},

	STATE9 {
		@Override
		State run(char c) {
			return STATE9;
		}
	};


	abstract State run(char c);
}