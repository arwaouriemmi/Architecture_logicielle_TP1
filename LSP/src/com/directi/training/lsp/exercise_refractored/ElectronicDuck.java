package com.directi.training.lsp.exercise_refractored;

public class ElectronicDuck extends Duck
{
    private boolean _on = false;

    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            quack();
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            swim();
        }
    }
    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

}
