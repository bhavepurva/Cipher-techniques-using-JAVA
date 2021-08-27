import java.util.*;
class vignere{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String alphabets="abcdefghijklmnopqrstuvwxyz";
System.out.println("enter plaintext: ");
String plaintext=sc.nextLine();
System.out.println("enter string key: ");
String key=sc.nextLine();
String ciphertext="";

List<Integer> p_val=new ArrayList<Integer>();
List<Integer> k_val=new ArrayList<Integer>();

for(int i=0;i<plaintext.length();i++){
int p_value=alphabets.indexOf(plaintext.charAt(i));
p_val.add(i,p_value);
}

for(int i=0;i<plaintext.length();i++){
int k_value=alphabets.indexOf(key.charAt(i));
k_val.add(i,k_value);

}




System.out.println(p_val);
System.out.println(k_val);

for(int i=0,j=0;i<k_val.size();i++,j++){
int sum=(p_val.get(i)+k_val.get(j))%26;


char c=alphabets.charAt(sum);
ciphertext+=c;


}
System.out.println(ciphertext);


}
}