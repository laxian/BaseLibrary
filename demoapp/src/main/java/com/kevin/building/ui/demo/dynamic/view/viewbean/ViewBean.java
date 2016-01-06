package com.kevin.building.ui.demo.dynamic.view.viewbean;

import com.kevin.building.ui.demo.dynamic.view.viewbean.group.BtnGroup;
import com.kevin.building.ui.demo.dynamic.view.viewbean.group.CBGroup;
import com.kevin.building.ui.demo.dynamic.view.viewbean.group.RBGroup;
import com.kevin.building.ui.demo.dynamic.view.viewbean.item.BtnItem;
import com.kevin.building.ui.demo.dynamic.view.viewbean.item.EditTextItem;
import com.kevin.building.ui.demo.dynamic.view.viewbean.item.TextItem;

/**
 * Author:  liangjin.bai
 * Email: bailiangjin@gmail.com
 * Create Time: 2016/1/6 16:14
 */
public class ViewBean {

    private int itemType;

    private TextItem textItem;

    private BtnItem btnItem;

    private EditTextItem editTextItem;

    private BtnGroup btnGroup;

    private RBGroup rbGroup;

    private CBGroup cbGroup;

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }

    public TextItem getTextItem() {
        return textItem;
    }

    public void setTextItem(TextItem textItem) {
        this.textItem = textItem;
    }

    public BtnItem getBtnItem() {
        return btnItem;
    }

    public void setBtnItem(BtnItem btnItem) {
        this.btnItem = btnItem;
    }

    public EditTextItem getEditTextItem() {
        return editTextItem;
    }

    public void setEditTextItem(EditTextItem editTextItem) {
        this.editTextItem = editTextItem;
    }

    public BtnGroup getBtnGroup() {
        return btnGroup;
    }

    public void setBtnGroup(BtnGroup btnGroup) {
        this.btnGroup = btnGroup;
    }

    public RBGroup getRbGroup() {
        return rbGroup;
    }

    public void setRbGroup(RBGroup rbGroup) {
        this.rbGroup = rbGroup;
    }

    public CBGroup getCbGroup() {
        return cbGroup;
    }

    public void setCbGroup(CBGroup cbGroup) {
        this.cbGroup = cbGroup;
    }
}