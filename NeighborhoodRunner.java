import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
 BackgroundPainter ava = new BackgroundPainter();
    Heart changeThis = new Heart();
    ava.setPaint(300);
    changeThis.setPaint(300);
    ava.paintBackground("white");
    changeThis.heart("black");
Frame a = new Frame();
a.makeFrame("pink");
  }
}