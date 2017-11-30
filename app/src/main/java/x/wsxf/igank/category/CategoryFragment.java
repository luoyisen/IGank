package x.wsxf.igank.category;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import x.wsxf.igank.R;
import x.wsxf.igank.view.OnLoadMoreListener;

/**
 * Created by HHX on 2017/11/30.
 */

public class CategoryFragment extends Fragment implements CategoryContract.View, SwipeRefreshLayout.OnRefreshListener, OnLoadMoreListener {
    private static final String CATEGORY_NAME = "yincheng";

    @BindView(R.id.swiperefresh_category)
    SwipeRefreshLayout swiperefresh_category;
    @BindView(R.id.recyclerview_category)
    RecyclerView recyclerView_category;

    private String mCategoryName;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();// TODO: 2017/11/30
        mCategoryName = bundle.getString(CATEGORY_NAME);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //设置swiperefresh
        swiperefresh_category.setColorSchemeResources(
                R.color.appColor,
                R.color.colorSwipeRefresh1,
                R.color.colorSwipeRefresh2,
                R.color.colorSwipeRefresh3,
                R.color.colorSwipeRefresh4,
                R.color.colorSwipeRefresh5);
        swiperefresh_category.setOnRefreshListener(this);

        //设置adapter

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onLoadMore() {

    }
}
