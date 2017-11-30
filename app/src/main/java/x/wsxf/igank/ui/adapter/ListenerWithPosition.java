package x.wsxf.igank.ui.adapter;

import android.view.View;

/**
 * Created by HHX on 2017/11/30.
 */

public class ListenerWithPosition implements View.OnClickListener {// TODO: 2017/11/30 看不懂啊

    private int iPosition;
    private Object iHolder;
    private onClickWithPositionListener iOnClickWithPositionListener;

    public ListenerWithPosition(int iPosition, Object iHolder) {
        this.iPosition = iPosition;
        this.iHolder = iHolder;
    }

    @Override
    public void onClick(View v) {
        if (iOnClickWithPositionListener != null)
            iOnClickWithPositionListener.onClick(v, iPosition, iHolder);

    }

    public interface onClickWithPositionListener<T> {// TODO: 2017/11/30

        void onClick(View v, int position, T holder);
    }

    public void setOnClickListener(onClickWithPositionListener iOnClickListener) {
        this.iOnClickWithPositionListener = iOnClickListener;
    }
}
