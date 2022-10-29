public class Wall {
    double width;
    double height;

    public Wall() {
        this.width = 30.00;
        this.height = 20.00;
    }
    public Wall (double width,double height)
    {
        if(width < 0)
            this.width = 0;
        else
            this.width = width;
        if(height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public void setWidth(double width) {
        if(width < 0)
            this.width = 0;
        else
            this.width = width;
    }
    public double getArea() { return height*width; }
    public static void main(String[] args)
    {
        Wall wall1 = new Wall();
        System.out.println("area = "+wall1.getArea());
        Wall wall2 = new Wall(32.22,19.45);
        System.out.println("height = "+wall2.getHeight());
        System.out.println("width = "+wall2.getWidth());
        System.out.println("area = "+wall2.getArea());
        wall2.setHeight(42.23);
        wall2.setWidth(23.33);
        System.out.println("height = "+wall2.getHeight());
        System.out.println("width = "+wall2.getWidth());
        System.out.println("area = "+wall2.getArea());
        wall2.setHeight(-42.23);
        wall2.setWidth(-23.33);
        System.out.println("height = "+wall2.getHeight());
        System.out.println("width = "+wall2.getWidth());
        System.out.println("area = "+wall2.getArea());
    }
}
