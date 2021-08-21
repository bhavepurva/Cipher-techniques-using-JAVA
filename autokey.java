import java.util.*;
class autokey{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String alphabets="abcdefghijklmnopqrstuvwxyz";
String ciphertext="";
System.out.println("enter plaintext: ");
String plaintext=sc.nextLine();
System.out.println("enter key: ");
int key=sc.nextInt();
String cipher="";

List<Integer> p_val=new ArrayList<Integer>();
List<Integer> k_val=new ArrayList<Integer>();
k_val.add(0,key);
for(int i=0;i<plaintext.length();i++){
int p_value=alphabets.indexOf(plaintext.charAt(i));
p_val.add(i,p_value);
k_val.add(i+1,p_value);
}
for(int i=0;i<p_val.size();i++){
int sum=(p_val.get(i)+k_val.get(i))%26;
char c=alphabets.charAt(sum);
cipher+=c;
}
System.out.println(cipher);
}
}