  public class task5
 {
 public int countPrimesInRange(int input1,int input2){
 int d=input1,i,c=0; 
 int cou=0; 
 while(d<=input2){
 for(i=2;i<d;i++){
 if(d%i==0){
 c++;
 }
 }
 if(c==0){
 cou++; 
 System.out.println(d);
 } 
 d++; 
 c=0;
 }
 return cou;
 }
 public static void main(String[] args){
 task5 obj = new task5();
 System.out.println("Count of primes between 1 and 20: " + obj.countPrimesInRange(1, 20));
System.out.println("Count of primes between10 and 30: " + obj.countPrimesInRange(10,30));
}
}
