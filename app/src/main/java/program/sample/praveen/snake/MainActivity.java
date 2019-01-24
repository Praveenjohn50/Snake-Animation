package program.sample.praveen.snake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import program.sample.praveen.ball.R;

public class MainActivity extends AppCompatActivity {
    public static MainActivity mainActivity;
    SnakeView snakeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivity = this;
        snakeView = findViewById(R.id.snake_view);
    }


}
