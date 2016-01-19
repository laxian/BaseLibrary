package com.kevin.building.ui.demo.dynamic.viewbean.item;

import com.kevin.building.ui.demo.dynamic.viewbean.base.AbsSelectedItem;
import com.kevin.building.ui.demo.dynamic.viewbean.constants.ViewType;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 16:07
 */
public class CBItem extends AbsSelectedItem {
    @Override
    public void setDefaultViewType() {
            setViewType(ViewType.CB);
    }


}