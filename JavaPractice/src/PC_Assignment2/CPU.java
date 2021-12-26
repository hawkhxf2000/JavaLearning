package PC_Assignment2;

public class CPU {
    private int generation = 1;
    private String series = "i3";
    private double price = 117.0;
    private double speed = 2.93;
    private String launchDate = "Q1'10";
    private boolean supportSGX = false;

    public CPU(){}  //constructor without argument

    //constructor with 6 argument
    public CPU(int generation, String series, double price, double speed, String launchDate, boolean supportSGX) {
        this.generation = generation;
        this.series = series;
        this.price = price;
        this.speed = speed;
        this.launchDate = launchDate;
        this.supportSGX = supportSGX;
    }

    //6 accessor methods
    public int getGeneration() {
        return generation;
    }

    public String getSeries() {
        return series;
    }

    public double getPrice() {
        return price;
    }

    public double getSpeed() {
        return speed;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public boolean isSupportSGX() {
        return supportSGX;
    }

    // mutator method to set suggested price
    public void setPrice(double price) {
        this.price = price;
    }

    //public　method priceNow
    public double priceNow(String sQuarterYear){
        String[] suppliedDate = sQuarterYear.split("'");
        int suppliedQuarter = Integer.parseInt(suppliedDate[0].substring(1));
        int suppliedYear = Integer.parseInt(suppliedDate[1]);

        String[] launchTime = launchDate.split("'");
        int launchQuareter = Integer.parseInt(launchTime[0].substring(1));
        int launchYear = Integer.parseInt(launchTime[1]);

        int quartInterval = (suppliedQuarter-launchQuareter)+(suppliedYear-launchYear)*4;
        double priceNow;
        if (quartInterval < 0)
            priceNow = price;
        else priceNow = price*(1-0.02*(quartInterval));

        return priceNow;
    }

    @Override
    public String toString() {
//        String strSGX;
//        if (supportSGX)
//            strSGX = "SGX is supported.";
//        else strSGX = "SGX is not supported.";

        return "This CPU is " + generation +"th generation "
                + series + "(" +speed + "GHz), launched: "
                + launchDate + " with price: " + String.format("%.2f",price) +" USD. "
                + (supportSGX?"SGX is supported.":"SGX is not supported.");
    }

    //@Override
    public boolean equals(CPU cpu) {
        if(cpu == null)
            return false;

        if(cpu == this)
            return true;

        return (this.generation == cpu.generation &&
                this.series.equalsIgnoreCase(cpu.series) &&
                this.supportSGX == cpu.supportSGX);
    }

    public boolean isHigherGeneration(CPU cpu){
        return this.generation > cpu.generation;
    }
}
