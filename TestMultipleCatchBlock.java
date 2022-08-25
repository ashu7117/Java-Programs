class TestMultipleCatchBlock{
public static void main(String args[]){
try{
int a[] = new int[5];
a[5] = 30/0;
}
catch(ArithmeticException ae){
System.out.println("task 1 completed");
}
catch(ArrayIndexOutOfBoundsException ao){
System.out.println("task 2 completed");}
catch(Exception e){
System.out.println("common task completed");
}
System.out.println("rest of the code...");
}}
