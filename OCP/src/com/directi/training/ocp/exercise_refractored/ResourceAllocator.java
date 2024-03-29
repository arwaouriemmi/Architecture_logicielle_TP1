package com.directi.training.ocp.exercise_refractored;

public class ResourceAllocator
{

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeSlot();
        resource.markSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
        resource.markSlotFree(resourceId);
    }
}
