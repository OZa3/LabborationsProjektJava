package Car;

import java.awt.*;

public class Scania extends VehiclesWithPlatform {
    private DegreePlatform platform;        //Hjälp från TA
    public Scania(){
        super(2,300,0,0,false,"Scania");
        color = Color.white;
        stopEngine();
        setPlatformPosition(70);
        platform = new DegreePlatform();        //Hjälp från TA
    }
    /*
    @Override
    public boolean cannotMove(){
        return getPlatformPosition() < getMaxAngle();
    }

     */
}
