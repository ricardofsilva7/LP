public class Circle extends Rectangle {
    private int diameter;
}
public Circle (int diameter){
    super(diameter, diameter);
    this.diameter = diameter;
}
public Circle(){
    super();
    super.setHeight(super.getWidth());
    this.diameter=super.getWidth(); }

@Override