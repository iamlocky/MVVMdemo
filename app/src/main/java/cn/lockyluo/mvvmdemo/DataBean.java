package cn.lockyluo.mvvmdemo;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;


/**
 * Created by LockyLuo on 2018/10/8.
 */

public class DataBean extends BaseObservable{
    public final ObservableField<String> textData = new ObservableField<>();
}
