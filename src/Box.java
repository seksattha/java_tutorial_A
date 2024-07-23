public class Box {
    private double w, d, h;

    public Box(double w, double h, double d) {
        setW(w);
        this.h = h;
        this.d = d;
    }

    //Create setter ตัวอย่างแค่ w พอ
    public void setW(double w) {
        if ((w > 0)) {
            this.w = w;
        } else {
            throw new IllegalArgumentException("ค่าจะต้องมากกว่าศูนย์");
        }
    }

    public double getW() {
        return w;
    }

    //Creating method for calculating volume
    public double volume() {
        return w * h * d;
    }

    public double surface() {
        return (2 * w * h) + (2 * w * d) + (2 * d * h);
    }




}
