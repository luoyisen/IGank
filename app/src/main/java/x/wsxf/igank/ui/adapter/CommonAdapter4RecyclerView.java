package x.wsxf.igank.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by HHX on 2017/11/30.
 */

public abstract class CommonAdapter4RecyclerView<T> extends RecyclerView.Adapter {
    public Context context;
    public List<T> data;
    private int layoutId;
    private View view;

    public CommonAdapter4RecyclerView(Context context, List<T> data, int layoutId) {
        this.context = context;
        this.data = data;
        this.layoutId = layoutId;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public abstract void convert(CommonHolder holder, T t);
}
