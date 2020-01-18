package at.ttc.pong;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    private GameSurfaceView surfaceView;
    private SurfaceRenderer surfaceRenderer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Switch to fullscreen mode
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Create surfaces
        this.surfaceView = new GameSurfaceView(getApplicationContext());
        this.surfaceRenderer = new SurfaceRenderer();
        surfaceView.setRenderer(surfaceRenderer);

        //Set surface
        setContentView(surfaceView);
    }
}
