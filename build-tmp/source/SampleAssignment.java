import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SampleAssignment extends PApplet {
  public void setup() {

size(200,100);
fill(255,255,0);
ellipse(100,50,80,80);
arc(100,50,60,60,PI/8,7*PI/8);
fill(0,0,0);
ellipse(85,40,10,15);
ellipse(115,40,10,15);
ellipse(50,50,10,10);


    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SampleAssignment" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
