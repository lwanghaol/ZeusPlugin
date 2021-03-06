package zeus.test.hotfix;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

import zeus.plugin.ZeusBaseAppCompactActivity;

/**
 * 补丁测试页面
 * @author adison
 * @date 16/8/21
 * @time 上午6:09
 */
public class TestHotFixActivity extends ZeusBaseAppCompactActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setTextColor(getResources().getColor(android.R.color.black));
        textView.setTextSize(18);
        textView.setGravity(Gravity.CENTER);
        textView.setText("这是补丁");
        setContentView(textView);
        getSupportActionBar().setTitle("补丁页面");
    }

}
