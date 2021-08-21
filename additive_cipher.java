import java.util.*;
class additive_cipher{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter a plaintext: ");
String plaintext=sc.nextLine();
System.out.println("enter a key for additive cipher: ");
int key=sc.nextInt();
String ciphertext="";
String alphabets="abcdefghijklmnopqrstuvwxyz";


int i;
for(i=0;i<plaintext.length();i++){
int p_value=alphabets.indexOf(plaintext.charAt(i));
int mod_value=(p_value+key)%26;
char c_value=alphabets.charAt(mod_value);
ciphertext +=  c_value;

}
System.out.println("cipher text is: "+ciphertext);



}
}