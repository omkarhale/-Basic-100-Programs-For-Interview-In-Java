public class ObjectCreations {

    public  static void dis(){
        System.out.println("static method");
    }
    public static void main(String[] args) {

        ObjectCreations obj=new ObjectCreations();
        obj.display();
        dis();
    }


    public void display(){
        System.out.println("first method");
    }

}
