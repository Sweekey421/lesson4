public class bararaban implements Instrument{
    private String size ="60";

    @Override
    public String toString() {
        return "bararaban{" +
                "size=" + size +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public void play(){
        System.out.println("haracteristic " + getSize());
    }

}