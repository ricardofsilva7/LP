import org.w3c.dom.css.Rect;

import java.awt.*;

public class Rectangle extends Shape{

    //ATRIBUTOS
    private int width;
    private int height;

    //CONSTRUTORES
    public Rectangle(){
        this.width = super.r.nextInt(91)+10;
        this.height = super.r.nextInt(91)+10;
    }
    
public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
}    

public Rectangle(Color color, int x, int y, int speedX, int speedY, int width, int height){
    super(color, x, y, speedX, speedY);
    this.width=width;
    this.height=height;
}

    //METODOS
    public void draw(Graphics g){
      g.setColor(super.getColor());
      g.fillRect(super.getX(), super.getY(), this. width, this.height);
    }

    public void move(int screenWidth, int screenHeight){
        super.move(screenWidth, screenHeight);

        //COLISAO
        if (super.getX()<0 || super.getX()+this.width>screenWidth){
            super.setSpeedX(super.getSpeedX() * -1);
        }
        if (super.getY()<0 || super.getY()+this.height>screenHeight){
            super.setSpeedY(super.getSpeedY()*-1);
        }
    }



    //GETTERS E SETTERS

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    //toSTRING

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}'+
                super.toString();
    }
}
