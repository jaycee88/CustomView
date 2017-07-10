package com.jaycee88.customview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * SimpleView
 * Created by jaycee on 2017/7/10.
 */
public class SimpleView extends View {

    Paint paint = new Paint();
//    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public SimpleView(Context context) {
        super(context);
    }

    public SimpleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        canvas.drawColor(Color.BLACK);

//        canvas.drawColor(Color.parseColor("#88880000"));

        /*
         * 这类颜色填充方法一般用于在绘制之前设置底色，或者在绘制之后为界面设置半透明蒙版。
         */
//        canvas.drawRGB(100, 200, 100);

//        canvas.drawARGB(100, 100, 200, 100);

//        paint.setColor(Color.RED);
//        /*
//         * setStyle(Style style) 这个方法设置的是绘制的 Style 。Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。
//         * FILL 是填充模式，STROKE 是画线模式（即勾边模式），FILL_AND_STROKE 是两种模式一并使用：既画线又填充。它的默认值是 FILL，填充模式。
//         */
//        paint.setStyle(Paint.Style.STROKE); // Style 修改为画线模式
//        /*
//         * 设置线条的宽度
//         */
//        paint.setStrokeWidth(20);// 线条宽度为 20 像素
//        paint.setAntiAlias(true);// 抗锯齿
//        /*
//         * centerX 圆心X轴坐标
//         * centerY 圆心Y轴坐标
//         * radius 圆的半径
//         */
//        canvas.drawCircle(300, 300, 200, paint);

//        // 以及2个重载方法
//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(100, 100, 500, 500, paint);
//
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(700, 100, 1100, 500, paint);

//        paint.setStrokeWidth(20);
//        paint.setStrokeCap(Paint.Cap.ROUND);
//        paint.setStrokeCap(Paint.Cap.SQUARE);
//        paint.setStrokeCap(Paint.Cap.BUTT);
//        canvas.drawPoint(50, 50, paint);

//        paint.setStrokeWidth(20);
//        paint.setStrokeCap(Paint.Cap.ROUND);
//        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
//        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
//        canvas.drawPoints(points, 2 /* 跳过两个数，即前两个 0 */, 8 /* 一共绘制四个点*/, paint);

//        paint.setStyle(Paint.Style.FILL);
//        canvas.drawOval(50, 50, 350, 200, paint);
//
//        paint.setStyle(Paint.Style.STROKE);
//        canvas.drawOval(400, 50, 700, 200, paint);

        // 由于直线不是封闭图形，所以 setStyle(style) 对直线没有影响。
//        paint.setStrokeWidth(20);
//        canvas.drawLine(200, 200, 800, 500, paint);

//        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120,
//                150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points, paint);

        // 圆角矩形
        /*
         * rx 圆角的横向半径
         * ry 圆角的纵向半径
         */
//        canvas.drawRoundRect(100, 100, 500, 300, 50, 50, paint);

        // 扇形--难点
        /*
         * drawArc() 是使用一个椭圆来描述弧形的。left, top, right, bottom 描述的是这个弧形所在的椭圆；
         * startAngle 是弧形的起始角度（x 轴的正向，即正右的方向，是 0 度的位置；顺时针为正角度，逆时针为负角度），
         * sweepAngle 是弧形划过的角度；
         * useCenter 表示是否连接到圆心，如果不连接到圆心，就是弧形，如果连接到圆心，就是扇形。
         */
        paint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, paint); // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, paint); // 绘制弧形
        paint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, paint); // 绘制不封口的弧形
    }
}
