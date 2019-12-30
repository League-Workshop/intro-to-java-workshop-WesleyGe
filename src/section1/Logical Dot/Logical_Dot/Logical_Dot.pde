

void setup() {
  size(1000,1000);
  fill(#173CA0);
}

void draw() {
  rect(50,50,900,900);
  if (mousePressed) {
  fill(#E3101E);
}else {
  fill(#17A025);
}
}
