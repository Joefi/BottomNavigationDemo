package com.example.bottomnavigationdemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyFragement extends Fragment {
	private TextView txt;
	
	private String content;
	
	

	public MyFragement() {
		// TODO Auto-generated constructor stub
	}
	public MyFragement(String content)
	{
		this.content = content;
	}
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment, container,false);
		txt = (TextView) view.findViewById(R.id.txt);
		txt.setText(content);
		return view;
	}
}
