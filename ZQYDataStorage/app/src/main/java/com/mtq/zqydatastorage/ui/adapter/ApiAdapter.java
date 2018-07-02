package com.mtq.zqydatastorage.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.os.Environment;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.blankj.utilcode.util.LogUtils;
import com.mtq.zqydatastorage.R;
import com.mtq.zqydatastorage.data.bean.ApiInfo;

import java.io.File;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;
import static android.content.Context.MODE_PRIVATE;

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

		String path = "";
		switch (item.no) {
			case 0: {
				path = Environment.getDataDirectory().getAbsolutePath();
				break;
			}
			case 1: {
				path = mContext.getFilesDir().getAbsolutePath();
				break;
			}
			case 2: {
				path = mContext.getCacheDir().getAbsolutePath();
				break;
			}
			case 3: {
				path = mContext.getDir("zqy", MODE_PRIVATE).getAbsolutePath();
				break;
			}
			case 4: {
				path = Environment.getExternalStorageDirectory().getAbsolutePath();

				if (false) {
					// 可以指定访问的文件夹名
					File sdCard = Environment.getExternalStorageDirectory();
					if (sdCard != null) {
						File directory_pictures = new File(sdCard, "Pictures");
						if (directory_pictures != null) {
							LogUtils.i(TAG, "directory_pictures= " + directory_pictures.toString());
							path = directory_pictures.toString();
						}
					}
				}
				break;
			}
			case 5: {
				path = Environment.getExternalStoragePublicDirectory(
						Environment.DIRECTORY_MUSIC).getAbsolutePath();
				break;
			}
			case 6: {
				path = mContext.getExternalFilesDir("").getAbsolutePath();
				break;
			}
			case 7: {
				path = mContext.getExternalCacheDir().getAbsolutePath();
				break;
			}
			case 8: {
				path = Environment.getDownloadCacheDirectory().getAbsolutePath();
				break;
			}
			case 9: {
				path = Environment.getRootDirectory().getAbsolutePath();
				break;
			}
		}

		LogUtils.i("ZQY", "path： " + path);
		SpannableString ss = new SpannableString("路径：" + path);
		ForegroundColorSpan cs = new ForegroundColorSpan(Color.parseColor("#FF4081"));
		ss.setSpan(cs, 3, ss.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
		holder.tv_path.setText(ss);
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
