import java.util.*;

class dha{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Enter n and g: ");
int n=sc.nextInt();
int g=sc.nextInt();
System.out.println("Enter Alice's private key:  ");
int a=sc.nextInt();
System.out.println("Enter Bob's private key:  ");
int b=sc.nextInt();

double A=Math.pow(g,a)%n;
double B=Math.pow(g,b)%n;

double ka=Math.pow(B,a)%n;
double kb=Math.pow(A,b)%n;

if(ka==kb){
System.out.println("Shared key for Alice is: ");
System.out.println((int)ka);
System.out.println("Shared key for Bob is: ");
System.out.println((int)kb);
}
else{
System.out.println("error");
}
}
}