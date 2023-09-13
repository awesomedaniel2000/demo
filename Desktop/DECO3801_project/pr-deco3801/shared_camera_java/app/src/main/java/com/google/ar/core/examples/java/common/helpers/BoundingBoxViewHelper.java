package com.google.ar.core.examples.java.common.helpers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class BoundingBoxViewHelper extends View {

    private Paint paint = new Paint();
    private Rect box = new Rect(300, 800, 800, 1200); // Example coordinates

    public BoundingBoxViewHelper(Context context) {
        super(context);
        init();
    }

    public BoundingBoxViewHelper(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BoundingBoxViewHelper(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(box, paint);
    }
}
