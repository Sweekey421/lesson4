public class truba implements Instrument{
    private String  diametr ="13";

    public String getDiametr() {
        return diametr;
    }

    public void setDiametr(String diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("haracteristic " + getDiametr());
    }

    @Override
    public String toString() {
        return "truba{" +
                "diametr=" + diametr +
                '}';
    }
}