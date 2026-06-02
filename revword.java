class revword{
public static void main(String[] args){
String str = "Java is fun";
String[] words = str.split(" ");
String res = "";
for(String word:words){
String reverse = new StringBuilder(word).reverse().toString();
res+=reverse+" ";
}
System.out.println(res.trim());
}
}