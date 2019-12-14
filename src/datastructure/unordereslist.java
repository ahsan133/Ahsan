package datastructure;
import java.util.Scanner;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;


public class unordereslist {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		String s1="";
		int j=0;
		FileReader file=new FileReader("/home/user/Desktop/ahsan/sample.txt");
		BufferedReader br=new BufferedReader(file);
		String s=null;
		while((s=br.readLine())!=null) {
		s1=s1+" "+s;	
		System.out.println(s);
		
		}
		LinkedList<String> list=new LinkedList<String>();
		String[] a=s1.split(" ",100);
		for(int i=0;i<a.length;i++)
		list.add(a[i]);
		list.remove("");
		System.out.println(list);
		System.out.println("enter the word");
		String in=v.next();
		boolean h=list.contains(in);
		if(h)
			list.remove(in);
		else
			list.add(in);
		
		System.out.println(list);
		
		String b=" ";
		for(j=0;j<list.size();j++) {
		b=b+" "+list.get(j);
		
		}
		
		FileWriter fil=new FileWriter("/home/user/Desktop/ahsan/ah.txt");
	fil.write(b);
	fil.close();
	}
}
