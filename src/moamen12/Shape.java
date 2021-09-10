/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moamen12;



public interface Shape {
    public String getShapeName ();
    public Double getArea ();
}

class Circle implements Shape {
    double diameter;
    
    public Circle(double d){
        diameter = d;
    }
    
    @Override
    public Double getArea() {
        return Math.pow(this.diameter/2,2)*Math.PI;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    public void displayShapeInfo (){
        System.out.println(getShapeName() + " "+getArea() );
    }

}
class Square implements Shape {
   double x;
    
    public Square(double d){
        x = d;
    }
    
    @Override
    public Double getArea() {
        return Math.pow(this.x,2);
    }

    @Override
    public String getShapeName() {
        return "Square";
    }
    
    public void displayShapeInfo (){
        System.out.println(getShapeName() + " "+getArea() );
    }
}
