public class Square extends Rectangle{
    private int size;

    public Square (int size){
        super(size, size);
        this.size=size;
    }

    public Square (){
       super();
       super.setHeight(super.getWidth());
       this.size=super.getWidth();

    }
}
