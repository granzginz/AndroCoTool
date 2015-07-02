package com.granzginz.helper;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class ListenerHelper {

	private Intent intent;
	private Context context;
	private Class cls;
	
	public Class getCls() {
		return cls;
	}

	public void setCls(Class cls) {
		this.cls = cls;
	}

	

	public Intent getIntent() {
		return intent;
	}

	public void setIntent(Intent intent) {
		this.intent = intent;
	}

	public ListenerHelper(Intent intent, Context context, Class classN) {
		super();
		setIntent(intent);
		setContext(context);
		setCls(classN);
	}

	public OnClickListener button = new OnClickListener() {

		@Override
		public void onClick(View v) {
			getIntent().setClass(getContext(), cls);
			getContext().startActivity(getIntent());
		}

	};

	public Context getContext() {
		return context;
	}

	public void setContext(Context context) {
		this.context = context;
	}
}
