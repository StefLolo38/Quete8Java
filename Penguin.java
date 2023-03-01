public class Penguin extends Bird implements Swim {

    private boolean swimming;
    private int depths;

    public Penguin(String name) {
        super(name);
        this.swimming = false;
        this.depths = 0;
    }

    @Override
    public String sing() {
        return "Quack!";
    }

    public int getDepths() {
        return depths;
    }

    public boolean isSwimming() {
        return swimming;
    }

    /**
     * dives, must be on ground
     */
    @Override
    public void dive() {
        if (!this.swimming && this.depths == 0) {
            this.swimming = true;
            System.out.printf(" dives into the water. ", this.getName());
        }
    }

    /**
     * swim downward
     * @param meters depths increase
     * @return depth
     */
    @Override
    public int swimDown(int meters) {
        if (this.swimming) {
            this.depths = Math.min(this.depths + meters, 325);
            System.out.printf(" swims downward, depths : ", this.getName(), this.depths);
        }
        return this.depths;
    }

    /**
     * swin upward
     * @param meters depths decrease
     * @return depth
     */
    @Override
    public int swimUp(int meters) {
        if (this.swimming) {
            this.depths = Math.max(this.depths - meters, 0);
            System.out.printf(" swims upward, depths : ", this.getName(), this.depths);
        }
        return this.depths;
    }

    /**
     * get out of water, must be on surface
     */
    @Override
    public void getOut() {
        if (this.swimming && this.depths == 0) {
            System.out.printf(" gets out of the water. ", this.getName());
        } else {
            System.out.printf(" is too deep, it can't get out. ", this.getName());
        }
    }
}
