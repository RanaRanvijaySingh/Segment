package com.example.segmentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.segment.Segment;
import com.segment.Segment.OnClickSegmentButton;

public class MainActivity extends Activity implements OnClickSegmentButton{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		Segment segment = (Segment)findViewById(R.id.segment);
		segment.setOnClickSegmentButton(this);
	}

	@Override
	public void onButtonSelected(View view, int position) {
		Log.i("", "onButtonSelected"+position+"");
	}
}
