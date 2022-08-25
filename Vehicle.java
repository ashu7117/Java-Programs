import java.lang.*;
import java.util.*;
class Veh{
void display(){
System.out.println("This is a vehicle");
}}
class Car extends Veh{
@Override
void display(){
System.out.println("This is a car");
}}
class Bike extends Veh{
@Override
void display(){
System.out.println("This is a bike");
}}
class Vehicle{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of tyres:");
int n = sc.nextInt();
switch(n){
case 2: 
Bike b = new Bike();
b.display();
break;
case 4:
Car c = new Car();
c.display();
break;
default:
Veh v = new Veh();
v.display();
break;
}}}