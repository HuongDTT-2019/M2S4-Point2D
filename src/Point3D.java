public class Point3D extends Point2D {
    private float z = 0.00f;

    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.z = z;
    }
    public float[] getXYZ(){
        float []xyz=new float[3];
        xyz[0]=getX();
        xyz[1]=getY();
        xyz[2]=getZ();
        return xyz;
    }
    public String toString(){
        return "(x,y,z)= "+"("+getXYZ()[0]+","+getXYZ()[1]+","+getXYZ()[2]+")"+" is subclass from "+super.toString();
    }
}
