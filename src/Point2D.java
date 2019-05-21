public class Point2D {
    private float x = 0.00f;
    private float y = 0.00f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
       this.x = x;
       this.y = y;
    }
    public float[] getXY(){
        float []xy=new float[2];
        xy[0]=getX();
        xy[1]=getY();
        return xy;
    }

    @Override
    public String toString(){

        return "(x,y) = (" +getXY()[0]+","+getXY()[1]+ ")";
    }

}
