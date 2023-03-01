public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override    
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky. ");
        }
    }

   
    @Override
    public int ascend(int meters) {
        if (this.flying) {
            this.altitude = this.altitude + meters;
            System.out.println(this.getName() + " flies upward, altitude: " + this.altitude );
        }
        return this.altitude;
    }

     @Override
    public void glide() {
        System.out.println(this.getName() + " glide in the sky ");
    }

     @Override
    public int descend(int meters) {
        if (this.flying) {
            this.altitude = this.altitude - meters;
            System.out.println(this.getName() + " flies downward, altitude: " + this.altitude );
        }
        return this.altitude;
    }

      @Override
    public void land() {
        if (this.flying && this.altitude == 1) {
            System.out.println(this.getName() + " land on the ground. ");
        } else {
            System.out.println(this.getName() + " is too high, it can't lands. ");
        }
    }
    

}
