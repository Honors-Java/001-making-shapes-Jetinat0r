// welcome! 😄🔥

void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //this rectangle is the start of your army tank
  //all of your programming should be after this 👍 
  rect(150, 200, 200, 100);
  rect(100, 125, 100, 50);
  rect(250, 125, 200, 25);

  for(i = 1; i < 6; i++){
    ellipse(i * 50, 270, 50, 50);
  }
  
 
	

}