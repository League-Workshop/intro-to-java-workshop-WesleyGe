PImage rainbow;
PImage unicorn;

void setup() {
  rainbow = loadImage("rainbow.jpg");
size(800, 600);
rainbow.resize(800,600);
unicorn = loadImage("unicorn.jpg");
unicorn.resize(20,30);
}

void draw() {
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}
