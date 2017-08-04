package com.example.administrator.project2_modedayandnight;//日夜间模式

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /**
     * http://www.jb51.net/article/93852.htm  这个网址上的3种 其他俩个moudle都是照着敲的
     *
     *第一种设置夜间模式
     *1.在Values中的  colors里设置颜色属性
     *2.在style.xml里定义俩组主题,额就是日间主题和夜间主题
     *3.创建attrs.xml文件
     *4.需要夜间模式的布局引用attr自定义属性
     *5.java代码
     *   a.判断存储的类型
     *   b.点击事件,根据类型进行日夜的切换
     */
    // 默认是日间模式
    private int theme = R.style.AppTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 判断是否有主题存储
        if(savedInstanceState != null){
            theme = savedInstanceState.getInt("theme");
            setTheme(theme);
        }
        setContentView(R.layout.activity_main);

        Button btn_theme = (Button) findViewById(R.id.btn_theme);
        btn_theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theme = (theme == R.style.AppTheme) ? R.style.NightAppTheme : R.style.AppTheme;
                MainActivity.this.recreate();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("theme", theme);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        theme = savedInstanceState.getInt("theme");
    }
}
