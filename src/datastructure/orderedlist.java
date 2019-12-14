package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class orderedlist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileReader file=new FileReader("/home/user/Desktop/ahsan/num.txt");
     BufferedReader b=new BufferedReader(file);
     while(b!=null) {
     int r=b.read();
     System.out.print(r+" ");
     }
	}

}
