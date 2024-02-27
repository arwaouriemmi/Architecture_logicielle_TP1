package com.directi.training.isp.exercise_refractored;

import java.util.Random;

public class Sensor
{
    public void register(IProximity door)
    {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
