package x.wsxf.igank.view;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HHX on 2017/11/30.
 */

public abstract class EmptyItem {

    CharSequence mEmptyText;
    int mEmptyIconRes = -1;

    abstract View onCreateView(ViewGroup parent);

    abstract void onBindData(View view);
}
