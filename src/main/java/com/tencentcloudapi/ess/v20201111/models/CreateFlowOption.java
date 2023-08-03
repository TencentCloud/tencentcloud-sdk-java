/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowOption extends AbstractModel{

    /**
    * 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑（默认），<br/>false：不允许编辑<br/>默认：false：不允许编辑
    */
    @SerializedName("CanEditFlow")
    @Expose
    private Boolean CanEditFlow;

    /**
    * 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息
<br/>默认false:不允许编辑模板控件信息
    */
    @SerializedName("CanEditFormField")
    @Expose
    private Boolean CanEditFormField;

    /**
    * 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示
<br/>默认false:发起页面不隐藏合同名称展示
    */
    @SerializedName("HideShowFlowName")
    @Expose
    private Boolean HideShowFlowName;

    /**
    * 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示
<br/>默认false:发起页面不隐藏合同类型展示

    */
    @SerializedName("HideShowFlowType")
    @Expose
    private Boolean HideShowFlowType;

    /**
    * 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示
<br/>默认false:发起页面不隐藏合同截止日期展示
    */
    @SerializedName("HideShowDeadline")
    @Expose
    private Boolean HideShowDeadline;

    /**
    * 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节
<br/>默认false:发起页面不允许跳过添加签署人环节

    */
    @SerializedName("CanSkipAddApprover")
    @Expose
    private Boolean CanSkipAddApprover;

    /**
    * 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤
<br/>默认false:文件发起页面不跳过文件上传步骤
    */
    @SerializedName("SkipUploadFile")
    @Expose
    private Boolean SkipUploadFile;

    /**
    * 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件
<br/>默认false:允许编辑填写控件
    */
    @SerializedName("ForbidEditFillComponent")
    @Expose
    private Boolean ForbidEditFillComponent;

    /**
    * 定制化发起合同弹窗的描述信息，描述信息最长500

    */
    @SerializedName("CustomCreateFlowDescription")
    @Expose
    private String CustomCreateFlowDescription;

    /**
     * Get 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑（默认），<br/>false：不允许编辑<br/>默认：false：不允许编辑 
     * @return CanEditFlow 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑（默认），<br/>false：不允许编辑<br/>默认：false：不允许编辑
     */
    public Boolean getCanEditFlow() {
        return this.CanEditFlow;
    }

    /**
     * Set 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑（默认），<br/>false：不允许编辑<br/>默认：false：不允许编辑
     * @param CanEditFlow 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑（默认），<br/>false：不允许编辑<br/>默认：false：不允许编辑
     */
    public void setCanEditFlow(Boolean CanEditFlow) {
        this.CanEditFlow = CanEditFlow;
    }

    /**
     * Get 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息
<br/>默认false:不允许编辑模板控件信息 
     * @return CanEditFormField 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息
<br/>默认false:不允许编辑模板控件信息
     */
    public Boolean getCanEditFormField() {
        return this.CanEditFormField;
    }

    /**
     * Set 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息
<br/>默认false:不允许编辑模板控件信息
     * @param CanEditFormField 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息
<br/>默认false:不允许编辑模板控件信息
     */
    public void setCanEditFormField(Boolean CanEditFormField) {
        this.CanEditFormField = CanEditFormField;
    }

    /**
     * Get 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示
<br/>默认false:发起页面不隐藏合同名称展示 
     * @return HideShowFlowName 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示
<br/>默认false:发起页面不隐藏合同名称展示
     */
    public Boolean getHideShowFlowName() {
        return this.HideShowFlowName;
    }

    /**
     * Set 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示
<br/>默认false:发起页面不隐藏合同名称展示
     * @param HideShowFlowName 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示
<br/>默认false:发起页面不隐藏合同名称展示
     */
    public void setHideShowFlowName(Boolean HideShowFlowName) {
        this.HideShowFlowName = HideShowFlowName;
    }

    /**
     * Get 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示
<br/>默认false:发起页面不隐藏合同类型展示
 
     * @return HideShowFlowType 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示
<br/>默认false:发起页面不隐藏合同类型展示

     */
    public Boolean getHideShowFlowType() {
        return this.HideShowFlowType;
    }

    /**
     * Set 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示
<br/>默认false:发起页面不隐藏合同类型展示

     * @param HideShowFlowType 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示
<br/>默认false:发起页面不隐藏合同类型展示

     */
    public void setHideShowFlowType(Boolean HideShowFlowType) {
        this.HideShowFlowType = HideShowFlowType;
    }

    /**
     * Get 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示
<br/>默认false:发起页面不隐藏合同截止日期展示 
     * @return HideShowDeadline 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示
<br/>默认false:发起页面不隐藏合同截止日期展示
     */
    public Boolean getHideShowDeadline() {
        return this.HideShowDeadline;
    }

    /**
     * Set 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示
<br/>默认false:发起页面不隐藏合同截止日期展示
     * @param HideShowDeadline 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示
<br/>默认false:发起页面不隐藏合同截止日期展示
     */
    public void setHideShowDeadline(Boolean HideShowDeadline) {
        this.HideShowDeadline = HideShowDeadline;
    }

    /**
     * Get 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节
<br/>默认false:发起页面不允许跳过添加签署人环节
 
     * @return CanSkipAddApprover 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节
<br/>默认false:发起页面不允许跳过添加签署人环节

     */
    public Boolean getCanSkipAddApprover() {
        return this.CanSkipAddApprover;
    }

    /**
     * Set 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节
<br/>默认false:发起页面不允许跳过添加签署人环节

     * @param CanSkipAddApprover 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节
<br/>默认false:发起页面不允许跳过添加签署人环节

     */
    public void setCanSkipAddApprover(Boolean CanSkipAddApprover) {
        this.CanSkipAddApprover = CanSkipAddApprover;
    }

    /**
     * Get 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤
<br/>默认false:文件发起页面不跳过文件上传步骤 
     * @return SkipUploadFile 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤
<br/>默认false:文件发起页面不跳过文件上传步骤
     */
    public Boolean getSkipUploadFile() {
        return this.SkipUploadFile;
    }

    /**
     * Set 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤
<br/>默认false:文件发起页面不跳过文件上传步骤
     * @param SkipUploadFile 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤
<br/>默认false:文件发起页面不跳过文件上传步骤
     */
    public void setSkipUploadFile(Boolean SkipUploadFile) {
        this.SkipUploadFile = SkipUploadFile;
    }

    /**
     * Get 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件
<br/>默认false:允许编辑填写控件 
     * @return ForbidEditFillComponent 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件
<br/>默认false:允许编辑填写控件
     */
    public Boolean getForbidEditFillComponent() {
        return this.ForbidEditFillComponent;
    }

    /**
     * Set 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件
<br/>默认false:允许编辑填写控件
     * @param ForbidEditFillComponent 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件
<br/>默认false:允许编辑填写控件
     */
    public void setForbidEditFillComponent(Boolean ForbidEditFillComponent) {
        this.ForbidEditFillComponent = ForbidEditFillComponent;
    }

    /**
     * Get 定制化发起合同弹窗的描述信息，描述信息最长500
 
     * @return CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500

     */
    public String getCustomCreateFlowDescription() {
        return this.CustomCreateFlowDescription;
    }

    /**
     * Set 定制化发起合同弹窗的描述信息，描述信息最长500

     * @param CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500

     */
    public void setCustomCreateFlowDescription(String CustomCreateFlowDescription) {
        this.CustomCreateFlowDescription = CustomCreateFlowDescription;
    }

    public CreateFlowOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowOption(CreateFlowOption source) {
        if (source.CanEditFlow != null) {
            this.CanEditFlow = new Boolean(source.CanEditFlow);
        }
        if (source.CanEditFormField != null) {
            this.CanEditFormField = new Boolean(source.CanEditFormField);
        }
        if (source.HideShowFlowName != null) {
            this.HideShowFlowName = new Boolean(source.HideShowFlowName);
        }
        if (source.HideShowFlowType != null) {
            this.HideShowFlowType = new Boolean(source.HideShowFlowType);
        }
        if (source.HideShowDeadline != null) {
            this.HideShowDeadline = new Boolean(source.HideShowDeadline);
        }
        if (source.CanSkipAddApprover != null) {
            this.CanSkipAddApprover = new Boolean(source.CanSkipAddApprover);
        }
        if (source.SkipUploadFile != null) {
            this.SkipUploadFile = new Boolean(source.SkipUploadFile);
        }
        if (source.ForbidEditFillComponent != null) {
            this.ForbidEditFillComponent = new Boolean(source.ForbidEditFillComponent);
        }
        if (source.CustomCreateFlowDescription != null) {
            this.CustomCreateFlowDescription = new String(source.CustomCreateFlowDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanEditFlow", this.CanEditFlow);
        this.setParamSimple(map, prefix + "CanEditFormField", this.CanEditFormField);
        this.setParamSimple(map, prefix + "HideShowFlowName", this.HideShowFlowName);
        this.setParamSimple(map, prefix + "HideShowFlowType", this.HideShowFlowType);
        this.setParamSimple(map, prefix + "HideShowDeadline", this.HideShowDeadline);
        this.setParamSimple(map, prefix + "CanSkipAddApprover", this.CanSkipAddApprover);
        this.setParamSimple(map, prefix + "SkipUploadFile", this.SkipUploadFile);
        this.setParamSimple(map, prefix + "ForbidEditFillComponent", this.ForbidEditFillComponent);
        this.setParamSimple(map, prefix + "CustomCreateFlowDescription", this.CustomCreateFlowDescription);

    }
}

