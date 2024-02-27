package com.directi.training.ocp.exercise_refractored;

public abstract class Resource {
    
    protected abstract void markSlotBusy(int resourceId);
   
    protected abstract void markSlotFree(int resourceId);

    protected abstract int findFreeSlot();
    
}
