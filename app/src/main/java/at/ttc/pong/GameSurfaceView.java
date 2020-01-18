package at.ttc.pong;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class GameSurfaceView extends GLSurfaceView {

    public GameSurfaceView(Context context) {
        super(context);

        setEGLContextClientVersion(3);
    }
}
