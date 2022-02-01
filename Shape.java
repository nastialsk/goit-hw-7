public abstract class Shape {
    private String figureName;
    protected int x, y, z;

    protected Shape(String figureName) {
        this.figureName = figureName;
    }

    public String getFigureName() {
        return figureName;
    }

    public void zoomIn(int a, int b, int c) {
        this.x = x + a;
        this.y = y + b;
        this.z = z + c;
    }

    public void zoomOut(int a, int b, int c) {
        this.x = x - a;
        this.y = y - b;
        this.z = z - c;
    }
}
