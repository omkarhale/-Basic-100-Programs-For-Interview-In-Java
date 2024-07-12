public class ConstructorOverloading {
    String name;
    ConstructorOverloading(){
        System.out.println("COnstruor");

    }
    ConstructorOverloading(String t){
        name=t;
        System.out.println(name);
    }
    public static void main(String[] args) {
        ConstructorOverloading conn=new ConstructorOverloading();
        ConstructorOverloading con=new ConstructorOverloading("java");
    }
}
