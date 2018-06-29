package com.mtq.zqydatastorage.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.data.bean.ApiInfo;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ApiAdapter extends BaseAdapter {

	private ArrayList<ApiInfo> list;
	private Context mContext;

	public ApiAdapter(Context context, ArrayList<ApiInfo> list) {
		this.mContext = context;
		this.list = list;
	}

	public void setList(ArrayList<ApiInfo> list) {
		this.list = list;
	}

	@Override
	public int getCount() {
		return list == null ? 0 : list.size();
	}

	@Override
	public ApiInfo getItem(int position) {
		ApiInfo item = null;
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
		final ApiInfo item = getItem(position);
		if (item == null)
			return null;

		ViewHolder holder;
		if (view != null) {
			holder = (ViewHolder) view.getTag();
		} else {
			view = LayoutInflater.from(mContext).inflate(R.layout.item_api, parent, false);
			holder = new ViewHolder(view);
			view.setTag(holder);
		}

		holder.tv_type.setText("类型：" + item.type);
		holder.tv_api.setText("api：" + item.api);

		holder.tv_path.setText("路径：" + "");
		holder.tv_des.setText("描述：" + item.des);

		return view;
	}

	static class ViewHolder {

		@BindView(R.id.tv_type)
		TextView tv_type;

		@BindView(R.id.tv_api)
		TextView tv_api;

		@BindView(R.id.tv_path)
		TextView tv_path;

		@BindView(R.id.tv_des)
		TextView tv_des;

		public ViewHolder(View view) {
			ButterKnife.bind(this, view);
		}
	}
}
