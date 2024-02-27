package com.directi.training.ocp.exercise_refractored;

public class SpaceResource extends Resource {
    @Override
    public void markSlotBusy(int resourceId){}

   @Override
    public void markSlotFree(int resourceId){}

    @Override
    public int findFreeSlot(){
        return 0;
    }
    
    
}