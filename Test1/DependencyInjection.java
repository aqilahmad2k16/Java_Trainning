package Test1;

class Circle{
    void draw(){System.out.println("draw a Circle");}
}

class Triangle{
    void draw(){System.out.println("draw a Triangle");}
}


//Tightly Coupled************************************************************
// class Shape{
//     private Circle cir  = new Circle();
//     private Triangle tr = new Triangle();// tightly coupled, ultimately Shape is depend on the this two instance, but in future if we want to add new behaviour or features then still weill have to create that's object and inject here or accordingly we will have to change in the code of respective classes and that would be quite difficult.

//     public void shape(){
//         cir.draw();
//         tr.draw();
//     }
// }

// public class DependencyInjection {
//    public static void main(String[] args) {
//     //    Shape sh = new Shape();
//     //    sh.shape();
//    }
// }


//Loosely Coupled***********************************************************************

class NewShape{
    private Circle circle;
    private Triangle triangle;

    NewShape(Circle c, Triangle t){
        this.circle = c;
        this.triangle = t;
    }

    public void drawShape(){
        circle.draw();
        triangle.draw();
    }
}

public class DependencyInjection {
   public static void main(String[] args) {
     NewShape ns = new NewShape(new Circle(), new Triangle());// this is loosely coupled and done by someone else to and pass to the constructor of NewShape. In this way class NewShape is not depend on the instance of the classes and this all i.e creating the instance or inject into the class is done by IOC container (inversal of control);
     ns.drawShape();
   }
}


