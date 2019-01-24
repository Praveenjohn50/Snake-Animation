package program.sample.praveen.snake;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
/**
 * Created by Praveen John on 24,January,2019
 */
public class Snake{
    public int[] direction = new int[]{1,1};
    public int x,y,size;
    public int speed = 10;
    public Paint paint;
    public RectF oval;
    public RectF line;

    public Snake(int x, int y, int size, int color){
        this.x = x;
        this.y = y;
        this.size = size;
        this.paint = new Paint();
        this.paint.setColor(color);
    }

    public void move(Canvas canvas) {
        this.x += speed*direction[0];
        this.y += speed*direction[1];
        this.oval = new RectF(x-size/2,y-size/2,x+size/2,y+size/2);
        this.line=new RectF(10,20,10,20);
        Rect bounds = new Rect();
        this.oval.roundOut(bounds);
        if(!canvas.getClipBounds().contains(bounds)){

            if(this.x-size<0 || this.x+size > canvas.getWidth()){
                direction[0] = direction[0]*-1;
            }
            if(this.y-size<0 || this.y+size > canvas.getHeight()){
                direction[1] = direction[1]*-1;

            }


        }
    }
}
