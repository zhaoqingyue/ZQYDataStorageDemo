package com.mtq.zqydatastorage.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.data.bean.ExclusiveInfo;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ExclusiveAdapter extends BaseAdapter {

	private ArrayList<ExclusiveInfo> list;
	private Context mContext;

	public ExclusiveAdapter(Context context, ArrayList<ExclusiveInfo> list) {
		this.mContext = context;
		this.list = list;
	}

	public void setList(ArrayList<ExclusiveInfo> list) {
		this.list = list;
	}

	@Override
	public int getCount() {
		return list == null ? 0 : list.size();
	}

	@Override
	public ExclusiveInfo getItem(int position) {
		ExclusiveInfo item = null;
		if (null != list) {
			item = list.get(position);
		}
		return item;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(final int position, View view, ViewGroup parent) {
		final ExclusiveInfo item = getItem(position);
		if (item == null)
			return null;

		ViewHolder holder;
		if (view != null) {
			holder = (ViewHolder) view.getTag();
		} else {
			view = LayoutInflater.from(mContext).inflate(R.layout.item_exclusive, parent, false);
			holder = new ViewHolder(view);
			view.setTag(holder);
		}

		holder.tv_version.setText("版本：" + item.version);
		holder.tv_pos.setText("条件：" + item.pos);

		holder.tv_api1.setText("api：" + item.api1);
		SpannableString ss1 = new SpannableString("路径：" + item.path1);
		ForegroundColorSpan cs1 = new ForegroundColorSpan(Color.parseColor("#FF4081"));
		ss1.setSpan(cs1, 3, ss1.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
		holder.tv_path1.setText(ss1);
		holder.tv_type1.setText("类型：" + item.type1);

		holder.tv_api2.setText("api：" + item.api2);
		SpannableString ss2 = new SpannableString("路径：" + item.path2);
		ForegroundColorSpan cs2 = new ForegroundColorSpan(Color.parseColor("#FF4081"));
		ss2.setSpan(cs2, 3, ss2.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
		holder.tv_path2.setText(ss2);
		holder.tv_type2.setText("类型：" + item.type2);

		if (!TextUtils.isEmpty(item.api3)) {
			holder.layout3.setVisibility(View.VISIBLE);
			holder.tv_api3.setText("api：" + item.api3);
			SpannableString ss3 = new SpannableString("路径：" + item.path3);
			ForegroundColorSpan cs3 = new ForegroundColorSpan(Color.parseColor("#FF4081"));
			ss3.setSpan(cs3, 3, ss3.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
			holder.tv_path3.setText(ss3);
			holder.tv_type3.setText("类型：" + item.type3);
		} else {
			holder.layout3.setVisibility(View.GONE);
		}
		return view;
	}

	static class ViewHolder {

		@BindView(R.id.tv_version)
		TextView tv_version;
		@BindView(R.id.tv_pos)
		TextView tv_pos;

		@BindView(R.id.tv_api1)
		TextView tv_api1;
		@BindView(R.id.tv_path1)
		TextView tv_path1;
		@BindView(R.id.tv_type1)
		TextView tv_type1;

		@BindView(R.id.tv_api2)
		TextView tv_api2;
		@BindView(R.id.tv_path2)
		TextView tv_path2;
		@BindView(R.id.tv_type2)
		TextView tv_type2;

		@BindView(R.id.layout3)
		LinearLayout layout3;
		@BindView(R.id.tv_api3)
		TextView tv_api3;
		@BindView(R.id.tv_path3)
		TextView tv_path3;
		@BindView(R.id.tv_type3)
		TextView tv_type3;

		public ViewHolder(View view) {
			ButterKnife.bind(this, view);
		}
	}
}
