package ru.dsoft38.albaremotecontrol;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    final static String dLog = "Alba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Обработчик нажатия на элементы
    public void onClick(View view){
        switch (view.getId()){
            case R.id.imgRobotStick:
                Log.i(dLog, "X = " + String.valueOf(view.getPivotX()) +" Y = " + String.valueOf(view.getPivotY()));
                view.setX(10);
                break;
            case R.id.imgCameraStick:

                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int)event.getX();
        int y = (int)event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(dLog, "Touch down X = " + String.valueOf(x) +" Y = " + String.valueOf(y));
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(dLog, "Touch move X = " + String.valueOf(x) +" Y = " + String.valueOf(y));
                break;
            case MotionEvent.ACTION_UP:
                Log.i(dLog, "Touch up X = " + String.valueOf(x) +" Y = " + String.valueOf(y));
                break;
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
