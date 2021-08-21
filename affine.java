import java.util.*;
class affine{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String alphabets="abcdefghijklmnopqrstuvwxyz";
String ciphertext="";
System.out.println("enter a plaintext: ");
String plaintext=sc.nextLine();


System.out.println("enter multiplicative and additive keys: ");
int key_mul=sc.nextInt();
int key_add=sc.nextInt();


for(int i=0;i<plaintext.length();i++){
int p_value=alphabets.indexOf(plaintext.charAt(i));
int c_value=((p_value*key_mul)+key_add)%26;
char cipher=alphabets.charAt(c_value);
ciphertext+=cipher;

}


System.out.println("ciphertext is: "+ciphertext);
}
}
//trialpurpose@outlook.com
//Shutup@123