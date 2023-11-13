public class Rectangle {
    private int height = 1; // const is always private
    private int width = 1; // const is always private

    public Rectangle (int h, int w) {
        // System.out.println("Rectangle created");
        // if (h > 0) {
        //     height = h;
        // }
        // if (w > 0) {
        //     width = w;            
        // }
        setHeight(h);
        setWidth(w);
    }

    public void setHeight(int h) {
        if (h > 0){
            height = h;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int w) {
        if (w > 0) {
            width = w;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return height * width;
    }

    public int getPermieter() {
        return ((2 * height) + (2 * width));
    }
}
