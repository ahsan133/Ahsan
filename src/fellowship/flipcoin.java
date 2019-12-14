package fellowship;

import java.util.Scanner;

public class flipcoin {
public static void main(String[] args) {
	int tails=0,heads=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number");
	int n=scanner.nextInt();
	scanner.close();
	for(int i=0;i<n;i++) {
	if(Math.random()<0.5)
	tails++;
	else
		heads++;}
	double h=(heads*100)/n;
	double t=(tails*100)/n;
	System.out.println("heads= "+h+"%");
	System.out.println("tails= "+t+"%");
    
}
}
