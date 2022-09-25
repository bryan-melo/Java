package Lab5;

import java.io.*;
import java.util.StringTokenizer;

public class Util {

	public static Student [] readFile(String filename, Student [] stu) {
		//Reads the file and builds student array.
		int counter = 0;
		try {
			//Open the file using FileReader Object.
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			String temp;
			boolean eof = false;
			buff.readLine();
			while(!eof) {
				//In a loop read a line using readLine method.
				String line = buff.readLine();
				if (line == null) {
					eof = true;
				}
				else {
					stu[counter] = new Student();
					//Tokenize each line using StringTokenizer Object
					StringTokenizer st = new StringTokenizer(line);
					while (st.hasMoreTokens()) {
						temp = st.nextToken();
						//Each token is converted from String to Integer using parseInt method
						stu[counter].setSID(Integer.parseInt(temp));
					
						int[] scores = new int[5];	
						for (int i = 0; i < scores.length; i++) {
							temp = st.nextToken();
							scores[i] = Integer.parseInt(temp);
						}
						//Value is then saved in the right property of Student Object.
						stu[counter].setScores(scores);
						counter++;
					}
				}
			}
			buff.close();
		} catch (IOException e) {
			System.out.println("Error -- " + e.toString());
		}
		 Student[] students = new Student[counter];
	        System.arraycopy(stu, 0, students, 0, counter);
	        return students;
	}
}
