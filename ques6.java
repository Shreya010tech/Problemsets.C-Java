package ques;

public class ques6 {

	public static void main(String[] args) {
		int w=841;
		int h=1189;
		for(int i=0; i<9; i++) {
			System.out.println("A"+i+": "+w+ "x" +h);
			int t = h;
			h = w;
			w = t/2;
		}
		

	}

}
