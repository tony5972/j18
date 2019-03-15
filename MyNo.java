interface IntOperations
 {
   void isPositive();
   void isNigative();
   void iseven();
   void isOdd();
   void isPrime();
   
  // void sum(int a);
   //void fact(int a);
 }
 class MyNo implements IntOperations
 {
         private  int a;
  MyNo()
  {
  	a=0;
  }
  MyNo(int a)
  {
  	this.a=a;
  }
  public void isPositive()
  {
   if(a>0)
    System.out.println("The no is Positive");
  }  
 public void isNigative()
  {
   if(a<0)
    System.out.println("The no is Nigative");
  }   
 public void iseven()
  {
   if(a%2==0)
    System.out.println("The no is even");
  } 
 public void isOdd()
  {
   if(a%2!=0)
    System.out.println("The no is Odd");
  }
 public void isPrime()                                                     
 {
  int flag=1;
  for(int i=2;i<a;i++)
  {
   if(a%i==0)
     flag=0;
     break;
  }
  if(flag==0)
    System.out.println("The No is not Prime ");
  else
    System.out.println("The no is Prime");
  }
 public static void main(String args[])
 {
   int a1=Integer.parseInt(args[0]);
  MyNo m=new MyNo();	
  MyNo m1=new MyNo(a1);
  IntOperations i;
  i=m1;
  i.isPositive();
  i.isNigative();
  i.iseven();
  i.isOdd();
  i.isPrime();
 }
}
