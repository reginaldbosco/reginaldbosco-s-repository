import java.util.Scanner;
class Date{
 int d;
 int m;
 int y;
 Date(int i, int j, int k){
  d=i;
  m=j;
  y=k;
 }
}
class Days{
 int d;
 int f;
 int l;
 int Days(int j,int k){
  f=j;
  l=k;
  if(f==2){
   if(((l%4==0) && (l%100!=0))||(l%400==0)){
    d=29;
   }
   else{
    d=28;
   }
  }
  else if(((f>0 && f<8) && f%2==1)|((f>7 && f<13) && f%2==0)){
   d=31;
  }
  else{
   d=30;
  }
 return d;
 }
}
class Age extends Days{
 int year, month, days;
 void Age(Date Date1,Date Date2){
  if (Date2.m > Date1.m){
   year=Date2.y-Date1.y;
   month=Date2.m-Date1.m;
  }
  else if(Date2.m < Date1.m){
   year=(Date2.y-Date1.y)-1;
   month=Date1.m-Date2.m;
  }
  else{
   year=Date2.y-Date1.y;
   if(Date1.d > Date2.d){
    year=(Date2.y-Date1.y)-1;
    month=11;
    days=Days((Date2.m)-1,Date2.y)-Date1.d+Date2.d;
   }
   else{
    year=Date2.y-Date1.y;
    month=0;
    days=Date2.d-Date1.d;
   }
  }
  if(Date2.d > Date1.d){
   days=Date2.d-Date1.d;
  }
  else{
   days=Days((Date2.m)-1,Date2.y)-Date1.d+Date2.d;
  }
  if(Date1.y > Date2.y){
   System.out.println("how could you exist when you didn't born yet?");
  }
  else if(Date1.y==Date1.y){
   if(Date2.m < Date1.m){
     System.out.println("how could you exist when you didn't born yet?");
   }
   else{
    if(Date1.d > Date2.d){
     System.out.println("how could you exist when you didn't born yet?");
    }
    else{
     days=Date2.d-Date1.d;
     System.out.println("your age is "+ year+" years "+month+" months "+days+" days");
    }
   }
  }
  else{
   System.out.println("your age is "+ year+" years "+month+" months "+days+" days");
  }
 }
}
class Age_calculator{
 public static void main(String args[]){
  Scanner date = new Scanner(System.in);
  System.out.println("enter the date of your birth as dd/mm/yyyy : ");
  int d1= date.nextInt();
  int m1= date.nextInt();
  int y1= date.nextInt();
  System.out.println("enter today's date as dd/mm/yyyy : ");
  int d2= date.nextInt();
  int m2= date.nextInt();
  int y2= date.nextInt();
  Date Dob=new Date(d1,m1,y1);
  Date Today=new Date(d2,m2,y2);
  Age Calculate=new Age();
  Calculate.Age(Dob,Today);
 }
}