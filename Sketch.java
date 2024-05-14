import processing.core.PApplet;
import processing.core.PImage;

public class Sketch extends PApplet {
  boolean up = false;
boolean down = false;
boolean left = false;
boolean right = false;
float circleX = 0;
float circleY =  0;
	
	PImage img;
  PImage ckey;
  PImage ctrl;
  float r = 255;
  float g = 80;
  float b = 0;
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
    
    //noLoop();
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    img = loadImage("gerbera.png");
    img.resize(60,60);
    ckey = loadImage("key.png");
    ckey.resize(20,20);
    ctrl = loadImage("ctrl.png");
    ctrl.resize(20,40);
    background(r, g, b);
   
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    if (up) {
      circleY--;
    }
    
    if (down) {
      circleY++;
    }
    
    if (left) {
      circleX--;
    }
    
    if (right) {
      circleX++;
    }
    
    ellipse(circleX, circleY, 50, 50);
    if(mouseButton == CENTER){
      image(img, mouseX-30, mouseY-30);
    }
   if(mouseButton == RIGHT){
      noStroke();
      fill(0, 180, 0);
      ellipse(mouseX, mouseY, 100, 100);
   }
      if(mouseButton == LEFT){
        noStroke();
        fill(255, 255, 255);
        ellipse(mouseX, mouseY, 20, 20);
      
      }
      if(keyPressed){
        image(ckey, 0, 0);
        if(keyCode ==  CONTROL){
          image(ctrl, 0, 350);
        }
        if(key == 'c'){
          background(r, g, b);
        if(key == 'd'){
          r = 0;
          g = 0;
          b = 180;
          background(0 ,0,180);
        }
          
         

        
          
        }
        

          
        }

      
            

   }
  public void mouseClicked(){
    fill(150, 0,0);
    ellipse(mouseX, mouseY, 50, 50);
   }
  public void keyCode(){
    image(img, mouseX, mouseY);
  }
  public void keyPressed() {
    if (keyCode == UP) {
      up = true;
    }
    else if (keyCode == DOWN) {
      down = true;
    }
    else if (keyCode == LEFT) {
      left = true;
    }
    else if (keyCode == RIGHT) {
      right = true;
    }
  }
  public void keyReleased() {
    if (keyCode == UP) {
      up = false;
    }
    else if (keyCode == DOWN) {
      down = false;
    }
    else if (keyCode == LEFT) {
      left = false;
    }
    else if (keyCode == RIGHT) {
      right = false;
    }
  }
  
}
 

  

 
	  
   
  
  // define other methods down here.
