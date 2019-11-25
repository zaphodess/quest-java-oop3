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
    public void takeOff () {
      if (!flying) {
      this.flying = true;
      System.out.printf (this.getName()+" takes off in the sky.%n");
    }
    else {System.out.println (this.getName()+" is already in the air.");}
    }

    @Override
    public int ascend (int meters) {
      this.altitude = this.altitude + meters;
      System.out.printf (this.getName()+" flies upward. Altitude: "+this.altitude+".%n");
      return this.altitude;
    }

    @Override
    public int descend (int meters) {
      if (this.flying) {this.altitude = Math.max(this.altitude - meters, 0);
        System.out.println (this.getName()+" flies downward. Altitude: "+this.altitude+".");
      }
      else {System.out.println (this.getName()+" can't get down any further. He's already grounded.");}

      if (this.altitude==0&&this.flying){
        this.flying = false;
      }

      return this.altitude;

    }

    @ Override
    public void land () {
      if (this.flying) {
      this.altitude = 0;
      this.flying = false;
      System.out.println (this.getName()+" lands on the ground.");}
      else {System.out.println (this.getName()+" is already stationary.");}
    }

    @ Override
    public void glides (){
      if (this.flying) {
        System.out.println (this.getName()+" is gliding through the air.");
      }
      else {System.out.println (this.getName()+" can't glide, they're grounded.");}
    }
}
