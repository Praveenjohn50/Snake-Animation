package program.sample.praveen.snake;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Praveen John on 24,January,2019
 */
public class SnakeView extends View {
    private List<Snake> snake = new ArrayList<>();


    public SnakeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SnakeView(Context context) {
        super(context);
        init();
    }

    private void init() {
        int x=50;
        int y=50;
        for(int i=0;i<20;i++) {
            snake.add(new Snake(x, y, 100, Color.BLACK));

            x=x+10;
            y=y+10;
            snake.add(new Snake(x, y, 100, Color.WHITE));
            x=x+10;
            y=y+10;
            if(i==19)
            {
                x=x+20;
                y=y+20;
                snake.add(new Snake(x, y, 100, Color.RED));
            }
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Snake snake1 : snake) {
            snake1.move(canvas);
            canvas.drawOval(snake1.oval, snake1.paint);
        }

        invalidate();
    }


}
