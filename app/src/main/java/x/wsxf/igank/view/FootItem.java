package x.wsxf.igank.view;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HHX on 2017/11/30.
 */

public abstract class FootItem {

    public CharSequence loadingText;
    public CharSequence endText;
    public CharSequence pullToLoadText;

    public abstract View onCreateView(ViewGroup parent);

    public abstract void onBindData(View view, int state);

}
