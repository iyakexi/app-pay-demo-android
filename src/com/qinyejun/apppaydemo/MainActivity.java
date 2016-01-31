package com.qinyejun.apppaydemo;

import com.qinyejun.apppaydemo.SingleFragmentActivity;
import com.qinyejun.apppaydemo.PaymentFragment;
import com.qinyejun.apppaydemo.model.Order;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		//测试订单数据，实际开发中会通过服务器API获取
		Order order = new Order();
		order.setId("od001");
		order.setTitle("订单标题");
		order.setContent("订单描述");
		order.setPrice(0.01);
		return PaymentFragment.newInstance(order);
	}
	
}