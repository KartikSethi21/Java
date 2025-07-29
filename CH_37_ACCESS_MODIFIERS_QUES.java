class Cylinder {
    private int radius;
    private int height;

    Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }

    public double volume(){
        return Math.PI *radius*radius*height;
    }

}

public class CH_37_ACCESS_MODIFIERS_QUES {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder(9, 12);
        System.out.println(cy.getHeight());
        System.out.println(cy.getRadius());
        System.out.println(cy.surfaceArea());
        System.out.println(cy.volume());

    }

}
