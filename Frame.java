import org.code.neighborhood.*;

public class Frame extends PainterPlus{
  public void makeFrame(String color){
    setPaint(12*4);
    while(canMove()){
      paint(color);
      move();
      if(!canMove()){
        paint(color);
        turnRight();
      }
      if(!hasPaint()){
        break;
      }
    }
  }
}