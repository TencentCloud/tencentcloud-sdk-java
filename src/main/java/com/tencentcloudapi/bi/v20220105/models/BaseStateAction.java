/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaseStateAction extends AbstractModel {

    /**
    * 编辑是否可见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowEdit")
    @Expose
    private Boolean ShowEdit;

    /**
    * 编辑是否可点击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsEdit")
    @Expose
    private Boolean IsEdit;

    /**
    * 编辑按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditText")
    @Expose
    private String EditText;

    /**
    * 编辑不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EditTips")
    @Expose
    private String EditTips;

    /**
    * 删除是否可见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowDel")
    @Expose
    private Boolean ShowDel;

    /**
    * 删除是否可点击
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDel")
    @Expose
    private Boolean IsDel;

    /**
    * 删除按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelText")
    @Expose
    private String DelText;

    /**
    * 删除不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelTips")
    @Expose
    private String DelTips;

    /**
    * 复制是否可见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowCopy")
    @Expose
    private Boolean ShowCopy;

    /**
    * 是否可见
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowView")
    @Expose
    private Boolean ShowView;

    /**
    * 是否可重命名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowRename")
    @Expose
    private Boolean ShowRename;

    /**
     * Get 编辑是否可见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowEdit 编辑是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowEdit() {
        return this.ShowEdit;
    }

    /**
     * Set 编辑是否可见
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowEdit 编辑是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowEdit(Boolean ShowEdit) {
        this.ShowEdit = ShowEdit;
    }

    /**
     * Get 编辑是否可点击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsEdit 编辑是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsEdit() {
        return this.IsEdit;
    }

    /**
     * Set 编辑是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsEdit 编辑是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsEdit(Boolean IsEdit) {
        this.IsEdit = IsEdit;
    }

    /**
     * Get 编辑按钮的文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditText 编辑按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEditText() {
        return this.EditText;
    }

    /**
     * Set 编辑按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditText 编辑按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditText(String EditText) {
        this.EditText = EditText;
    }

    /**
     * Get 编辑不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EditTips 编辑不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEditTips() {
        return this.EditTips;
    }

    /**
     * Set 编辑不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param EditTips 编辑不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEditTips(String EditTips) {
        this.EditTips = EditTips;
    }

    /**
     * Get 删除是否可见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowDel 删除是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowDel() {
        return this.ShowDel;
    }

    /**
     * Set 删除是否可见
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowDel 删除是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowDel(Boolean ShowDel) {
        this.ShowDel = ShowDel;
    }

    /**
     * Get 删除是否可点击
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDel 删除是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDel() {
        return this.IsDel;
    }

    /**
     * Set 删除是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDel 删除是否可点击
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDel(Boolean IsDel) {
        this.IsDel = IsDel;
    }

    /**
     * Get 删除按钮的文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelText 删除按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelText() {
        return this.DelText;
    }

    /**
     * Set 删除按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelText 删除按钮的文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelText(String DelText) {
        this.DelText = DelText;
    }

    /**
     * Get 删除不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelTips 删除不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDelTips() {
        return this.DelTips;
    }

    /**
     * Set 删除不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelTips 删除不可用时的提示文本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelTips(String DelTips) {
        this.DelTips = DelTips;
    }

    /**
     * Get 复制是否可见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowCopy 复制是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowCopy() {
        return this.ShowCopy;
    }

    /**
     * Set 复制是否可见
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowCopy 复制是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowCopy(Boolean ShowCopy) {
        this.ShowCopy = ShowCopy;
    }

    /**
     * Get 是否可见
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowView 是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowView() {
        return this.ShowView;
    }

    /**
     * Set 是否可见
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowView 是否可见
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowView(Boolean ShowView) {
        this.ShowView = ShowView;
    }

    /**
     * Get 是否可重命名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowRename 是否可重命名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowRename() {
        return this.ShowRename;
    }

    /**
     * Set 是否可重命名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowRename 是否可重命名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowRename(Boolean ShowRename) {
        this.ShowRename = ShowRename;
    }

    public BaseStateAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseStateAction(BaseStateAction source) {
        if (source.ShowEdit != null) {
            this.ShowEdit = new Boolean(source.ShowEdit);
        }
        if (source.IsEdit != null) {
            this.IsEdit = new Boolean(source.IsEdit);
        }
        if (source.EditText != null) {
            this.EditText = new String(source.EditText);
        }
        if (source.EditTips != null) {
            this.EditTips = new String(source.EditTips);
        }
        if (source.ShowDel != null) {
            this.ShowDel = new Boolean(source.ShowDel);
        }
        if (source.IsDel != null) {
            this.IsDel = new Boolean(source.IsDel);
        }
        if (source.DelText != null) {
            this.DelText = new String(source.DelText);
        }
        if (source.DelTips != null) {
            this.DelTips = new String(source.DelTips);
        }
        if (source.ShowCopy != null) {
            this.ShowCopy = new Boolean(source.ShowCopy);
        }
        if (source.ShowView != null) {
            this.ShowView = new Boolean(source.ShowView);
        }
        if (source.ShowRename != null) {
            this.ShowRename = new Boolean(source.ShowRename);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShowEdit", this.ShowEdit);
        this.setParamSimple(map, prefix + "IsEdit", this.IsEdit);
        this.setParamSimple(map, prefix + "EditText", this.EditText);
        this.setParamSimple(map, prefix + "EditTips", this.EditTips);
        this.setParamSimple(map, prefix + "ShowDel", this.ShowDel);
        this.setParamSimple(map, prefix + "IsDel", this.IsDel);
        this.setParamSimple(map, prefix + "DelText", this.DelText);
        this.setParamSimple(map, prefix + "DelTips", this.DelTips);
        this.setParamSimple(map, prefix + "ShowCopy", this.ShowCopy);
        this.setParamSimple(map, prefix + "ShowView", this.ShowView);
        this.setParamSimple(map, prefix + "ShowRename", this.ShowRename);

    }
}

