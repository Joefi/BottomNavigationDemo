package com.example.bottomnavigationdemo2;

//LinearLayout+

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    private TextView home;
	private TextView home_num;
	private TextView like;
	private TextView like_num;
	private TextView location;
	private TextView location_num;
	private TextView me;
	private TextView me_num;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        bindView();
        
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        MyFragment f = new MyFragment();
        fragmentTransaction.add(R.id.fragment_container,f);
        fragmentTransaction.commit();
        
    }

	
	private void setAllUnSelect()
	{
		home.setSelected(false);
		like.setSelected(false);
		me.setSelected(false);
		location.setSelected(false);
	}
	private void bindView() {
		home = (TextView) findViewById(R.id.home);
		home_num = (TextView) findViewById(R.id.home_num);
		like = (TextView) findViewById(R.id.like);
		like_num = (TextView) findViewById(R.id.like_num);
		location = (TextView) findViewById(R.id.location);
		location_num = (TextView)findViewById(R.id.location_num);
		me = (TextView)findViewById(R.id.me);
		me_num = (TextView)findViewById(R.id.me_num);
		
		home.setOnClickListener(this);
		location.setOnClickListener(this);
		me.setOnClickListener(this);
		like.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.home:
			setAllUnSelect();
			home.setSelected(true);
			home_num.setVisibility(View.INVISIBLE);
			break;
		case R.id.like:
			setAllUnSelect();
			like.setSelected(true);
			like_num.setVisibility(View.INVISIBLE);
			break;
		case R.id.location:
			setAllUnSelect();
			location.setSelected(true);
			location_num.setVisibility(View.INVISIBLE);
			break;
		case R.id.me:
			setAllUnSelect();
			me.setSelected(true);
			me_num.setVisibility(View.INVISIBLE);
			break;

		default:
			break;
		}
	}
}
