package session2;
public class Demo {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int x = 10;
        System.out.println("x = "+x);
        String str = "Hello World";
        if(x>5){
            System.out.println(str);
        }else{
            System.out.println("not found");
        }
        for (int i=0;i<10;i++){
            System.out.println("i="+i);
        }
        Car c = new Car();
        Car c2 = new Car();
        c.brand = "Toyota";
        System.out.println(c.brand);
        Car.color ="red";

        c.showInfo();
        c2.showInfo();
        Bike b= new Bike();
        b.run();
        System.out.println(Car.color);
        TamGiac t = new TamGiac();
        t.canh1 = 4;
        t.canh2 = 5;
        t.canh3 = 6;
        System.out.println("Chu vi:"+t.chuVi());
        System.out.println("Dien tich:"+t.dienTich());
    }
}
