import java.util.*;
class euclid{

static int inverse(int r1,int r2){
int t1=0;
int t2=1;
while(r1!=1 && r2!=0){
int r=r1%r2;
int q=r1/r2;
int t=t1-q*t2;
r1=r2;
r2=r;
t1=t2;
t2=t;

}
return t1;

}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number and domain");
int num=sc.nextInt();
int dom=sc.nextInt();
int val=inverse(dom,num);
if(val>0){
System.out.println(val);
}
else if(val<0){
val=dom+val;
System.out.println(val);
}
}
}