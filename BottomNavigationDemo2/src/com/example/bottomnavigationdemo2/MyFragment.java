package com.example.bottomnavigationdemo2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MyFragment extends Fragment implements OnClickListener {
	private Button btn_1;
	private Button btn_2;
	private Button btn_3;
	private Button btn_4;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.fragment, container, false);
		btn_1 = (Button) view.findViewById(R.id.btn_one);
		btn_2 = (Button) view.findViewById(R.id.btn_two);
		btn_3 = (Button) view.findViewById(R.id.btn_three);
		btn_4 = (Button) view.findViewById(R.id.btn_four);
		
		btn_1.setOnClickListener(this);
		btn_2.setOnClickListener(this);
		btn_3.setOnClickListener(this);
		btn_4.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btn_one:
			TextView home_num = (TextView) getActivity().findViewById(R.id.home_num);
			home_num.setText("11");
			home_num.setVisibility(View.VISIBLE);
			break;	
		case R.id.btn_two:
			TextView like_num = (TextView) getActivity().findViewById(R.id.like_num);
			like_num.setText("22");
			like_num.setVisibility(View.VISIBLE);
			break;
		case R.id.btn_three:
			TextView location_num = (TextView) getActivity().findViewById(R.id.location_num);
			location_num.setText("33");
			location_num.setVisibility(View.VISIBLE);
			break;
		case R.id.btn_four:
			TextView me_num = (TextView) getActivity().findViewById(R.id.me_num);
			me_num.setText("44");
			me_num.setVisibility(View.VISIBLE);
			break;
		default:
			break;
		}
	}
}
