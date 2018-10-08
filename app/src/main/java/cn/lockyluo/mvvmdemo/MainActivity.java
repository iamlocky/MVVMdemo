package cn.lockyluo.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.lockyluo.mvvmdemo.databinding.ActivityMainBinding;

/**
 * mvvm双向绑定简单测试
 */

public class MainActivity extends AppCompatActivity {
    private DataBean dataBean=new DataBean();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setDataBean(dataBean);
    }
}
