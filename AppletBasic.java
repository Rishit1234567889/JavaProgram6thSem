
// An Applet skeleton. 
import java.awt.*; 
import java.applet.*;
public class AppletBasic extends Applet { 
String s;
// Called first. 
public void init() {
// initialization
s = "WELCOME TO JAVA APPLET";
}
/* Called second, after init(). Also called whenever the applet is restarted. */ 
public void start() {
// start or resume execution 
System.out.println("START");
}
// Called when the applet is stopped. 
public void stop() {
// suspends execution 
System.out.println("STOPPED");
}
/* Called when applet is terminated. This is the last method executed. */ 
public void destroy() {
// perform shutdown activities 
System.out.println("DESTROY");
}
// Called when an applet’s window must be restored. 
public void paint(Graphics g) {
// redisplay contents of window

g.setColor(Color.red); 
g.drawString(s,20,20);
}
}