package x.wsxf.igank.ui.adapter;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import x.wsxf.igank.R;

/**
 * Created by HHX on 2017/11/30.
 */

public class CommonHolder extends RecyclerView.ViewHolder {

    public View convertView;
    public int position;
    private SparseArray<View> views;// TODO: 2017/11/30 to un

    public CommonHolder(View itemView) {
        super(itemView);
        this.convertView = itemView;
        this.views = new SparseArray<>();
    }

    public <T extends View> T getView(@IdRes int viewId) {// TODO: 2017/11/30  to un
        View view = views.get(position);
        if (view == null) {
            view = convertView.findViewById(viewId);
            views.put(viewId, view);
        }
        return (T) view;// TODO: 2017/11/30
    }

    public CommonHolder setTextViewText(@IdRes int textViewId, String text) {
        TextView textView = getView(textViewId);
        if (!TextUtils.isEmpty(text))
            textView.setText(text);
        else
            textView.setText(" ");
        return this;
    }

    public CommonHolder setOnClickListener()
}
