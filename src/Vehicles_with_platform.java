public abstract class Vehicles_with_platform extends Car implements Movable {

    private int platformAngle;
    public static int maxAngle;
    public static int minAngle;
    private boolean canMove;

    public Vehicles_with_platform(){   // initializes platform angle as the lowest possible angle
        platformAngle = minAngle;
    }

    public abstract boolean canMoveCheck();
    public int getPlatformPosition() {
        return platformAngle;
    }
    public void platformUp(int amount) {
        int newAngle  = Math.min(getPlatformPosition() + amount, minAngle);
        //if (newAngle >= getPlatformPosition()) {
            platformAngle = newAngle;
        //}
    }
    public void platformDown(int amount) {
        int newAngle  = Math.max(getPlatformPosition() - amount, minAngle);
        //if (newAngle <= getPlatformPosition()) {
            platformAngle = newAngle;
        //}



    }

    @Override
    public void move(){// remember to test
        if (canMoveCheck()) super.move();
    }

    @Override
    public void turnLeft(){
        if (canMoveCheck()) super.turnLeft();
    }

    @Override
    public void turnRight(){
        if (canMoveCheck()) super.turnRight();
    }

}
