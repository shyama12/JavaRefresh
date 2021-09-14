public class Rectangle  extends Shape{

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle (int width, int height) {
        this(0,0, width, height);
    }

    public Rectangle () {
        this(0,0);
    }
}
