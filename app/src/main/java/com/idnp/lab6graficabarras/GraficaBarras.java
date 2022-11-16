package com.idnp.lab6graficabarras;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import android.view.View;

public class GraficaBarras extends View{

    int numParticiones;
    float[] datos;
    private int[] colores;

    public GraficaBarras(Context context, int numItems, float[] datos, int[] colores) {
        super(context);
        this.numParticiones=numItems;
        this.datos=datos;
        this.colores=colores;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Backgroud
        canvas.drawColor(Color.WHITE);
        Paint paint = new Paint();

        int padding =100;
        float rectanguloWidth = (getMeasuredWidth() - padding * 2) / this.datos.length;

        for (int i = 0; i < colores.length; i++) {
            paint.setColor(colores[i]);
            canvas.drawRect(padding + (rectanguloWidth * i),
                    (getMeasuredHeight() / 2)-(datos[i]*10),
                    padding + rectanguloWidth * (i + 1),
                    (getMeasuredHeight() / 2), paint
            );
        }
    }
}