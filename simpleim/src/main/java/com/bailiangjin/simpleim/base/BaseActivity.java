package com.bailiangjin.simpleim.base;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

import com.bailiangjin.simpleim.R;
import com.bailiangjin.simpleim.constants.BroadcastAction;
import com.bugtags.library.Bugtags;
import com.kevin.baselibrary.base.SuperBaseActivity;
import com.kevin.baselibrary.utils.LogUtils;

import java.util.HashSet;
import java.util.Set;

import butterknife.ButterKnife;

public abstract class BaseActivity extends SuperBaseActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		LogUtils.d("Activity:::-->>onCreate");
		super.onCreate(savedInstanceState);

	}

	@Override
	protected void onRestart()
	{
		LogUtils.d("Activity:::-->>onRestart");
		super.onRestart();
	}

	@Override
	protected void onStart()
	{
		LogUtils.d("Activity:::-->>onStart");
		super.onStart();
	}

	@Override
	protected void onResume()
	{
		LogUtils.d("Activity:::-->>onResume");
		super.onResume();
		Bugtags.onResume(this);


	}

	@Override
	protected void onPause()
	{
		LogUtils.d("Activity:::-->>onPause");
		super.onPause();
		Bugtags.onPause(this);
	}

	@Override
	protected void onStop()
	{
		LogUtils.d("Activity:::-->>onStop");
		super.onStop();
	}

	@Override
	protected void onDestroy()
	{
		LogUtils.d("Activity:::-->>onDestroy");
		super.onDestroy();

	}

	@Override
	protected void onNewIntent(Intent intent)
	{
		LogUtils.d("Activity:::-->>onNewIntent");
		super.onNewIntent(intent);
	}


	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		LogUtils.d("Activity:::-->>onActivityResult");
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent event) {
		//注：回调 3
		Bugtags.onDispatchTouchEvent(this, event);
		return super.dispatchTouchEvent(event);
	}

	@Override
	protected void initBaseView() {
		ButterKnife.bind(this);
	}

	@Override
	public void onBackPressed()
	{
//		finish();
		overridePendingTransition(R.anim.activity_edit_in, R.anim.activity_edit_out);
		super.onBackPressed();
	}

	/**
	 * 横竖屏切换，键盘等
	 */
	@Override
	public void onConfigurationChanged(Configuration newConfig)
	{
		super.onConfigurationChanged(newConfig);
	}


	@Override
	protected Set<String> getBroadCastAction() {
		Set<String> actionSet = new HashSet<>();
		//获取父类Action 避免覆盖父类添加的Action
		if (null!=super.getBroadCastAction()){
			actionSet.addAll(super.getBroadCastAction());
		}
		//添加当前类注册的广播监听事件
		actionSet.add(BroadcastAction.PUSH_DATA_ACTION);
		actionSet.add(BroadcastAction.NEW_VERSION_ACTION);
		return actionSet;
	}

	@Override
	protected void onBroadcast(Intent intent) {
		super.onBroadcast(intent);
		String action = intent.getAction();
		if (BroadcastAction.PUSH_DATA_ACTION.equals(action))
		{ // 可能有新数据
			// Bundle b = intent.getExtras();
			// MData<Employee> mdata = (MData<Employee>) b.get("data");
			// if (dataCallback != null)
			// { // 数据通知
			// dataCallback.onNewData(mdata);
			// }
		}
		else if (BroadcastAction.NEW_VERSION_ACTION.equals(action))
		{ // 可能发现新版本
			// VersionDialog 可能是版本提示是否需要下载的对话框
		}
	}


	@Override
	protected void handleMsg(Message msg)
	{
		// TODO Auto-generated method stub

	}

	@Override
	protected void onViewClick(View v) {

	}
}
