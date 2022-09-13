public class gitara implements Instrument{
    private String strun = "5";

    public String getStrun() {
        return strun;
    }

    public void setStrun(String strun) {
        this.strun = strun;
    }

    @Override
    public String toString() {
        return "gitara{" +
                "strun='" + strun + '\'' +
                '}';
    }

    public void play(){
        System.out.println("haracteristic " + getStrun());
    }
}