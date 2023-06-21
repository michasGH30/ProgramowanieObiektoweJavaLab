public class Wektor {
    float x, y, z;

    public Wektor() {
        x = 1.0f;
        y = 2.0f;
        z = 3.0f;
    }

    public Wektor(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void print() {
        System.out.println("Wektor: [" + x + ", " + y + ", " + z + "]");
    }

    public float scalarMultiply(Wektor w) {
        return (float) (x * w.getX() + y * w.getY() + z * w.getZ());
    }

    public Wektor vectorMultiply(Wektor w) {
        return new Wektor(y * w.getZ() - z * w.getY(), z * w.getX() - x * w.getZ(), x * w.getY() - y * w.getX());
    }
    // by⋅cz - bz⋅cy; bz⋅cx - bx⋅cz; bx⋅cy - by⋅cx - składowe wektora a.
}
