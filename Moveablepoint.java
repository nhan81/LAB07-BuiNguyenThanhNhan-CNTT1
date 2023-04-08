
package Ptiendichuyen;

interface Moveable
{
void moveup();
void movedown();
void moveleft();
void moveright();
}
public class Moveablepoint implements Moveable
{
    int x;
    int y;
    int xspeed;
    int yspeed;

    public Moveablepoint(int x, int y, int xspeed, int yspeed) {
        this.x = x;
        this.y = y;
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    @Override
    public String toString() {
        return "Moveablepoint{" + "x=" + x + ", y=" + y + ", xspeed=" + xspeed + ", yspeed=" + yspeed + '}';
    }
    @Override
     public void moveup(){}
    @Override
    public void movedown(){}
    @Override
    public void moveleft(){}
    @Override
    public void moveright(){}
}
class MoveableCircle extends Moveablepoint
{
int radius;
Moveablepoint center;
    public MoveableCircle(int radius, Moveablepoint center) {
        super(center.x, center.y, center.xspeed, center.yspeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MoveableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }
@Override
    public void moveup(){}
@Override
    public void movedown(){}
@Override
    public void moveleft(){}
@Override
    public void moveright(){}
}
