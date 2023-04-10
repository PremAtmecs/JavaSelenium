package BasicOops;

public class ShapePolymorphism {
    void draw(){
        System.out.println("Drawing");
    }

    public static class Triangle extends ShapePolymorphism{
        void draw(){
            System.out.println("Drawing Triangle");
        }
    }

    public static class Rectangle extends ShapePolymorphism{
        void draw(){
            System.out.println("Drawing Rectangle");
        }
    }

    public static void main(String[] args) {
        ShapePolymorphism s;
        s= new Triangle(); //upcasting
        s.draw();

        s = new Rectangle(); //upcasting
        s.draw();

    }


}
