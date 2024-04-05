/*
Use this command to make an mp4 video from the images using ffmpeg.
ffmpeg -f image2 -framerate 1 -i rp-%dof17.png -framerate 1 rp-17.mp4
*/
int n = 7; // a reptend prime
int maxNum = 10;
void setup() {
  fullScreen();
  frameRate(1);
  background(0);
}

void draw() {
  translate(width/2, height/2); // move the origin to the center
  float radius = height * 0.35; // radius of the circle
  float angleStep = TWO_PI / n; // angle between each dot

  // Draw the dots and lines
  for (int i = 1; i < n; i++) {
    float angle = i * angleStep;
    float x = radius * cos(angle);
    float y = radius * sin(angle);
    
    // Calculate the target dot
    int target = (i * (maxNum % n)) % n;
    float targetAngle = target * angleStep;
    float targetX = radius * cos(targetAngle);
    float targetY = radius * sin(targetAngle);

    //Display the Reptend prime
    textSize(50);
    text(n,0,height*-0.4);
    // Draw the line
    stroke(255);
    line(x, y, targetX, targetY);
    saveFrame("output/"+n+"/rp-"+i+"of"+n+".png");
  }
  noLoop(); // draw the sketch only once
}
