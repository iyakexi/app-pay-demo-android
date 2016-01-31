package com.qinyejun.apppaydemo.wxapi;

import com.qinyejun.apppaydemo.MainActivity;
import com.qinyejun.apppaydemo.R;
import com.qinyejun.apppaydemo.wxapi.Constants;
import com.tencent.mm.sdk.constants.ConstantsAPI;
import com.tencent.mm.sdk.modelbase.BaseReq;
import com.tencent.mm.sdk.modelbase.BaseResp;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.sdk.openapi.WXAPIFactory;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler{
	
	private static final String TAG = "MicroMsg.SDKSample.WXPayEntryActivity";
	
	private TextView tvResult;
	private Button btnReturn;
	
    private IWXAPI api;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_result);
        tvResult = (TextView)findViewById(R.id.tv_pay_result);
        btnReturn = (Button)findViewById(R.id.btn_return);
        
    	api = WXAPIFactory.createWXAPI(this, Constants.APP_ID);

        api.handleIntent(getIntent(), this);
        
        btnReturn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(WXPayEntryActivity.this,MainActivity.class);
				startActivity(i);
			}
		});
    }

	@Override
	protected void onNewIntent(Intent intent) {
		super.onNewIntent(intent);
		setIntent(intent);
        api.handleIntent(intent, this);
	}

	@Override
	public void onReq(BaseReq req) {
	}

	@Override
	public void onResp(BaseResp resp) {
		Log.d(TAG, "onPayFinish, errCode = " + resp.errCode);

		if (resp.getType() == ConstantsAPI.COMMAND_PAY_BY_WX) {
			
			if (resp.errCode == 0) {//success
				Toast.makeText(this, "恭喜您购买成功!", Toast.LENGTH_LONG).show();
				
				Intent i = new Intent(this,MainActivity.class);
				startActivity(i);
				
			} else {
				//tvResult.setText("支付失败："+resp.errStr +";code=" + String.valueOf(resp.errCode));
				
				Toast.makeText(this, "支付失败："+resp.errStr +";code=" + String.valueOf(resp.errCode) , Toast.LENGTH_LONG).show();
				
//				Intent i = new Intent(this,MainActivity.class);
//				startActivity(i);
				finish();
			}
		}
	}
}