package com.directi.training.lsp.exercise_refractored;

public class Duck
{
    public boolean _on ;
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            quack();
        }
    }

    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            swim();
        }
    }
    

}
