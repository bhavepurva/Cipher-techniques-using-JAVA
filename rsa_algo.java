import java.util.*;
import java.math.BigInteger;
class rsa_algo{


static int gcd(int e,int phi_n){
while(phi_n!=0){
int r=e%phi_n;
e=phi_n;
phi_n=r;
}
return e;
}


static void encrypt(int p,int q,int n,int phi_n){
String alphabets="abcdefghijklmnopqrstuvwxyz";
List<Integer> p_val=new ArrayList<Integer>();
List<Integer> c_val=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
System.out.println("Enter a plaintext: ");
String plaintext=sc.nextLine();
for(int i=0;i<plaintext.length();i++){
char p_char=plaintext.charAt(i);
int p_value=(int)p_char;
p_val.add(i,p_value);
}
for(int e=2;e<=phi_n;e++){
if(gcd(e,phi_n)==1){
for(int i=0;i<p_val.size();i++){
int pts=p_val.get(i);
BigInteger P=BigInteger.valueOf(pts);
BigInteger E=BigInteger.valueOf(e);
BigInteger N=BigInteger.valueOf(n);
BigInteger pt=P.modPow(E,N);
int ptvalues=pt.intValue();
c_val.add(i,ptvalues);
}
System.out.println("Encrypted message is: ");
System.out.println(c_val);
break;
}
}
}


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


static void decrypt(int p,int q,int n,int phi_n){
Scanner sc=new Scanner(System.in);
List<Integer> ct_val=new ArrayList<Integer>();
List<Integer> pt_val=new ArrayList<Integer>();
System.out.println("Enter cipher list, to terminate list press 0: ");
int val=sc.nextInt();
ct_val.add(val);
while(val!=0){
val=sc.nextInt();
if(val!=0){
ct_val.add(val);
}
}
for(int e=2;e<=phi_n;e++){
if(gcd(e,phi_n)==1){
int e_inv=inverse(phi_n,e);
if(e_inv<0){
e_inv=phi_n+e_inv;
}
int d=e_inv%phi_n;
for(int i=0;i<ct_val.size();i++){
int c=ct_val.get(i);
BigInteger C=BigInteger.valueOf(c);
BigInteger D=BigInteger.valueOf(d);
BigInteger N=BigInteger.valueOf(n);
BigInteger plain=C.modPow(D,N);
int values=plain.intValue();
pt_val.add(i,values);
}
String plaintext="";
for(int i:pt_val){
char text=(char)i;
plaintext+=text;
}
System.out.println("Decrypted message is:");
System.out.println(plaintext);
break;
}
}
}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("-----RSA CRYPTOSYSTEM-----");
System.out.println("Make a choice\n1.Encrypt\n2.Decrypt");
int choice=sc.nextInt();
System.out.println("Enter a prime number p and q: ");
int p=sc.nextInt();
int q=sc.nextInt();
int n=p*q;
int phi_n=(p-1)*(q-1);

switch(choice){

case 1:
encrypt(p,q,n,phi_n);
break;

case 2:
decrypt(p,q,n,phi_n);
break;

default:
System.out.println("invalid choice");
}


}
}