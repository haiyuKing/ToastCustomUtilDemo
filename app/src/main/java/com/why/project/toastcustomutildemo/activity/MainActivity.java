package com.why.project.toastcustomutildemo.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.why.project.toastcustomutildemo.MyApplication;
import com.why.project.toastcustomutildemo.R;
import com.why.project.toastcustomutildemo.util.ToastCustomUtil;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ToastCustomUtil.showShortToast("ToastCustomUtilDemo");//如果显示字符串，直接写即可
		ToastCustomUtil.showShortToast(MyApplication.getAppContext().getResources().getString(R.string.app_name));//如果想要显示Strings.xml文件中的字符串，建议使用MyApplication.getAppContext()
	}
}
