// Simple class program in java

class cuboid{
    static int b(int length,int breadth,int heigth){
        return length*breadth*heigth;
    }
    
}
class Main{
    public static void main(String[] args){
        cuboid c = new cuboid();
        System.out.println(c.b(100,100,100));
    }
}