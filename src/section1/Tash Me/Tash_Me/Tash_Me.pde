PImage mustache;
PImage Kim;
void setup() {

Kim = loadImage("kim.jpg");
size(800, 600);
Kim.resize(800,600);

mustache = loadImage("mustache.png");
}

void draw() {
background(Kim);
 mustache.resize(130,75);
 
  image(mustache, 333, 225);

}
