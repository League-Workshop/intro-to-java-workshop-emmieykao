PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend.jpg");
size(800, 600);
friend.resize(width,height);
background(friend);
mustache = loadImage("mustache.png");
mustache.resize(900,400);
}
void draw() {
image(mustache, 50, 300);
}
