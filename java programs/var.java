class varl{
    static int k = 3;
     int n;
     void insert(int a){
       n = --a;
       
       int j = 2;
     }
     void display(){
       System.out.println(n);
     /*  System.out.println(j);  it cannot accessable*/ 
     }
     public static void main(String args[]){
       varl s1  = new varl();
       s1.insert(3);
       s1.display();
   
       System.out.print(k);
     }
}
/*  this keyword
class varl{
     static int k = 3;
      int n;
      void insert(int n){
        this.n = --n;
        System.out.println(this.n)
        int j = 2;
      }
      void display(){
        System.out.println(n);
      \\  System.out.println(j);  it cannot accessable
    }
    public static void main(String args[]){
      varl s1  = new varl();
      s1.insert(3);
      s1.display();
  
      System.out.print(k);
    }
}
 */