package x.wsxf.igank.category;

import x.wsxf.igank.base.BasePresenter;
import x.wsxf.igank.base.BaseView;

/**
 * Created by HHX on 2017/11/30.
 */

public interface CategoryContract {

    interface View extends BaseView {

    }

    interface Presenter extends BasePresenter {

        void getCategoryItems(boolean isRefresh);
    }
}
