package com.example.bottomnavigationdemo;

//LinearLayout+TextView 实现底部导航栏

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    private TextView home;
	private TextView like;
	private TextView location;
	private TextView person;
	
	private Fragment f1=null,f2=null,f3=null,f4=null;
	private FrameLayout fragment_container;
	FragmentManager fragmentManager = getFragmentManager();

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        bindView();
    }

	private void bindView() {
		home = (TextView) findViewById(R.id.home);
		like = (TextView) findViewById(R.id.like);
		location = (TextView) findViewById(R.id.location);
		person = (TextView) findViewById(R.id.person);
		fragment_container = (FrameLayout) findViewById(R.id.fragment_container);
		
		home.setOnClickListener(this);
		like.setOnClickListener(this);
		location.setOnClickListener(this);
		person.setOnClickListener(this);
		
	}
	//设置所有的TextView未选中
	private void setAllUnSelected()
	{
		home.setSelected(false);
		like.setSelected(false);
		location.setSelected(false);
		person.setSelected(false);
	}
	
	//隐藏所有的Fragment
	private void hideAllFragment(FragmentTransaction transaction)
	{
		if(f1 != null)
			transaction.hide(f1);
		if(f2 != null)
			transaction.hide(f2);
		if(f3 != null)
			transaction.hide(f3);
		if(f4 != null)
			transaction.hide(f4);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		setAllUnSelected();
		
		FragmentTransaction transaction = fragmentManager.beginTransaction();
		hideAllFragment(transaction);
		switch (v.getId()) 
		{
		case R.id.home:
			home.setSelected(true);
			if(f1==null)
			{
				f1 = new MyFragement("HOME");
				transaction.add(R.id.fragment_container, f1);
			}else
			{
				transaction.show(f1);
			}
			break;
		case R.id.like:
			like.setSelected(true);
			if(f2==null)
			{
				f2 = new MyFragement("LIKE");
				transaction.add(R.id.fragment_container, f2);
			}else
			{
				transaction.show(f2);
			}
			break;
		case R.id.location:
			location.setSelected(true);
			if(f3==null)
			{
				f3 = new MyFragement("LOCATION");
				transaction.add(R.id.fragment_container, f3);
			}else
			{
				transaction.show(f3);
			}
			break;
		case R.id.person:
			person.setSelected(true);
			if(f4==null)
			{
				f4 = new MyFragement("PERSON");
				transaction.add(R.id.fragment_container, f4);
			}else
			{
				transaction.show(f4);
			}
			break;
		default:
			break;
		}
		transaction.commit();
	}
}
