package guimodule;

import processing.core.PApplet;

/**
 * Created by Eleanor on 17/07/2017.
 */
public class MyDisplay extends PApplet {

    public void setup()
    {
        size(400,400);
        background(0,0,0);

    }

    public void draw()
    {
        fill(255,255,0);
        ellipse(200,200,390,390);
        fill(0,0,0);
        ellipse(120,130,50,70);
        ellipse(280,130,50,70);
    }
}