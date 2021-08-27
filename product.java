import java.util.*;
class product{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String alphabets="abcdefghijklmnopqrstuvwxyz";
String cipher="";
String text="";
String int_ciphertext="";
System.out.println("Using affine cipher and rail fence cipher");
System.out.println("enter a plaintext: ");
String plaintext=sc.nextLine();
System.out.println("enter multiplicative and additive keys: ");
int key_mul=sc.nextInt();
int key_add=sc.nextInt();

for(int i=0;i<plaintext.length();i++){
int p_value=alphabets.indexOf(plaintext.charAt(i));
int c_value=((p_value*key_mul)+key_add)%26;
char int_cipher=alphabets.charAt(c_value);
int_ciphertext+=int_cipher;
}
for(int i=0;i<int_ciphertext.length();i++){
if(i%2==0){
char c=int_ciphertext.charAt(i);
cipher+=c;
}
else if(i%2!=0){
char t=int_ciphertext.charAt(i);
text+=t;
}
}
System.out.println(cipher+text);
}
}