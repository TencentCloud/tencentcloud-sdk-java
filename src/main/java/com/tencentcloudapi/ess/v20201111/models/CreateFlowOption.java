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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowOption extends AbstractModel {

    /**
    * 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>
    */
    @SerializedName("CanEditFlow")
    @Expose
    private Boolean CanEditFlow;

    /**
    * 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息（默认值）
<br/>
    */
    @SerializedName("CanEditFormField")
    @Expose
    private Boolean CanEditFormField;

    /**
    * 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示（默认值）
<br/>
    */
    @SerializedName("HideShowFlowName")
    @Expose
    private Boolean HideShowFlowName;

    /**
    * 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示（默认值）
<br/>

    */
    @SerializedName("HideShowFlowType")
    @Expose
    private Boolean HideShowFlowType;

    /**
    * 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示（默认值）
<br/>
    */
    @SerializedName("HideShowDeadline")
    @Expose
    private Boolean HideShowDeadline;

    /**
    * 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节（默认值）
<br/>

    */
    @SerializedName("CanSkipAddApprover")
    @Expose
    private Boolean CanSkipAddApprover;

    /**
    * 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤（默认值）
<br/>
    */
    @SerializedName("SkipUploadFile")
    @Expose
    private Boolean SkipUploadFile;

    /**
    * 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件（默认值）
<br/>
    */
    @SerializedName("ForbidEditFillComponent")
    @Expose
    private Boolean ForbidEditFillComponent;

    /**
    * 定制化发起合同弹窗的描述信息，描述信息最长500字符

    */
    @SerializedName("CustomCreateFlowDescription")
    @Expose
    private String CustomCreateFlowDescription;

    /**
    *   禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”

    */
    @SerializedName("ForbidAddApprover")
    @Expose
    private Boolean ForbidAddApprover;

    /**
    *   禁止设置设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板

    */
    @SerializedName("ForbidEditFlowProperties")
    @Expose
    private Boolean ForbidEditFlowProperties;

    /**
    * 在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
    */
    @SerializedName("HideComponentTypes")
    @Expose
    private String [] HideComponentTypes;

    /**
    * 在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
    */
    @SerializedName("ShowComponentTypes")
    @Expose
    private String [] ShowComponentTypes;

    /**
    * 发起流程的可嵌入页面结果页配置
    */
    @SerializedName("ResultPageConfig")
    @Expose
    private CreateResultPageConfig [] ResultPageConfig;

    /**
     * Get 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/> 
     * @return CanEditFlow 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>
     */
    public Boolean getCanEditFlow() {
        return this.CanEditFlow;
    }

    /**
     * Set 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>
     * @param CanEditFlow 是否允许修改发起合同时确认弹窗的合同信息（合同名称、合同类型、签署截止时间），若不允许编辑，则表单字段将被禁止输入。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>
     */
    public void setCanEditFlow(Boolean CanEditFlow) {
        this.CanEditFlow = CanEditFlow;
    }

    /**
     * Get 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息（默认值）
<br/> 
     * @return CanEditFormField 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息（默认值）
<br/>
     */
    public Boolean getCanEditFormField() {
        return this.CanEditFormField;
    }

    /**
     * Set 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息（默认值）
<br/>
     * @param CanEditFormField 是否允许编辑模板控件
<br/>true:允许编辑模板控件信息
<br/>false:不允许编辑模板控件信息（默认值）
<br/>
     */
    public void setCanEditFormField(Boolean CanEditFormField) {
        this.CanEditFormField = CanEditFormField;
    }

    /**
     * Get 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示（默认值）
<br/> 
     * @return HideShowFlowName 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示（默认值）
<br/>
     */
    public Boolean getHideShowFlowName() {
        return this.HideShowFlowName;
    }

    /**
     * Set 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示（默认值）
<br/>
     * @param HideShowFlowName 发起页面隐藏合同名称展示
<br/>true:发起页面隐藏合同名称展示
<br/>false:发起页面不隐藏合同名称展示（默认值）
<br/>
     */
    public void setHideShowFlowName(Boolean HideShowFlowName) {
        this.HideShowFlowName = HideShowFlowName;
    }

    /**
     * Get 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示（默认值）
<br/>
 
     * @return HideShowFlowType 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示（默认值）
<br/>

     */
    public Boolean getHideShowFlowType() {
        return this.HideShowFlowType;
    }

    /**
     * Set 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示（默认值）
<br/>

     * @param HideShowFlowType 发起页面隐藏合同类型展示
<br/>true:发起页面隐藏合同类型展示
<br/>false:发起页面不隐藏合同类型展示（默认值）
<br/>

     */
    public void setHideShowFlowType(Boolean HideShowFlowType) {
        this.HideShowFlowType = HideShowFlowType;
    }

    /**
     * Get 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示（默认值）
<br/> 
     * @return HideShowDeadline 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示（默认值）
<br/>
     */
    public Boolean getHideShowDeadline() {
        return this.HideShowDeadline;
    }

    /**
     * Set 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示（默认值）
<br/>
     * @param HideShowDeadline 发起页面隐藏合同截止日期展示
<br/>true:发起页面隐藏合同截止日期展示
<br/>false:发起页面不隐藏合同截止日期展示（默认值）
<br/>
     */
    public void setHideShowDeadline(Boolean HideShowDeadline) {
        this.HideShowDeadline = HideShowDeadline;
    }

    /**
     * Get 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节（默认值）
<br/>
 
     * @return CanSkipAddApprover 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节（默认值）
<br/>

     */
    public Boolean getCanSkipAddApprover() {
        return this.CanSkipAddApprover;
    }

    /**
     * Set 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节（默认值）
<br/>

     * @param CanSkipAddApprover 发起页面允许跳过添加签署人环节
<br/>true:发起页面允许跳过添加签署人环节
<br/>false:发起页面不允许跳过添加签署人环节（默认值）
<br/>

     */
    public void setCanSkipAddApprover(Boolean CanSkipAddApprover) {
        this.CanSkipAddApprover = CanSkipAddApprover;
    }

    /**
     * Get 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤（默认值）
<br/> 
     * @return SkipUploadFile 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤（默认值）
<br/>
     */
    public Boolean getSkipUploadFile() {
        return this.SkipUploadFile;
    }

    /**
     * Set 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤（默认值）
<br/>
     * @param SkipUploadFile 文件发起页面跳过文件上传步骤
<br/>true:文件发起页面跳过文件上传步骤
<br/>false:文件发起页面不跳过文件上传步骤（默认值）
<br/>
     */
    public void setSkipUploadFile(Boolean SkipUploadFile) {
        this.SkipUploadFile = SkipUploadFile;
    }

    /**
     * Get 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件（默认值）
<br/> 
     * @return ForbidEditFillComponent 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件（默认值）
<br/>
     */
    public Boolean getForbidEditFillComponent() {
        return this.ForbidEditFillComponent;
    }

    /**
     * Set 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件（默认值）
<br/>
     * @param ForbidEditFillComponent 禁止编辑填写控件
<br/>true:禁止编辑填写控件
<br/>false:允许编辑填写控件（默认值）
<br/>
     */
    public void setForbidEditFillComponent(Boolean ForbidEditFillComponent) {
        this.ForbidEditFillComponent = ForbidEditFillComponent;
    }

    /**
     * Get 定制化发起合同弹窗的描述信息，描述信息最长500字符
 
     * @return CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500字符

     */
    public String getCustomCreateFlowDescription() {
        return this.CustomCreateFlowDescription;
    }

    /**
     * Set 定制化发起合同弹窗的描述信息，描述信息最长500字符

     * @param CustomCreateFlowDescription 定制化发起合同弹窗的描述信息，描述信息最长500字符

     */
    public void setCustomCreateFlowDescription(String CustomCreateFlowDescription) {
        this.CustomCreateFlowDescription = CustomCreateFlowDescription;
    }

    /**
     * Get   禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”
 
     * @return ForbidAddApprover   禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”

     */
    public Boolean getForbidAddApprover() {
        return this.ForbidAddApprover;
    }

    /**
     * Set   禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”

     * @param ForbidAddApprover   禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”

     */
    public void setForbidAddApprover(Boolean ForbidAddApprover) {
        this.ForbidAddApprover = ForbidAddApprover;
    }

    /**
     * Get   禁止设置设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板
 
     * @return ForbidEditFlowProperties   禁止设置设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板

     */
    public Boolean getForbidEditFlowProperties() {
        return this.ForbidEditFlowProperties;
    }

    /**
     * Set   禁止设置设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板

     * @param ForbidEditFlowProperties   禁止设置设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板

     */
    public void setForbidEditFlowProperties(Boolean ForbidEditFlowProperties) {
        this.ForbidEditFlowProperties = ForbidEditFlowProperties;
    }

    /**
     * Get 在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul> 
     * @return HideComponentTypes 在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     */
    public String [] getHideComponentTypes() {
        return this.HideComponentTypes;
    }

    /**
     * Set 在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     * @param HideComponentTypes 在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     */
    public void setHideComponentTypes(String [] HideComponentTypes) {
        this.HideComponentTypes = HideComponentTypes;
    }

    /**
     * Get 在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul> 
     * @return ShowComponentTypes 在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     */
    public String [] getShowComponentTypes() {
        return this.ShowComponentTypes;
    }

    /**
     * Set 在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     * @param ShowComponentTypes 在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用，具体的控件类型如下
<ul><li>SIGN_SIGNATURE : 个人签名/印章</li>
<li>SIGN_SEAL : 企业印章</li>
<li>SIGN_PAGING_SEAL : 骑缝章</li>
<li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li>
<li>SIGN_APPROVE : 签批</li>
<li>SIGN_OPINION : 签署意见</li>
<li>BUSI-FULL-NAME  : 企业全称</li>
<li>BUSI-CREDIT-CODE : 统一社会信用代码</li>
<li>BUSI-LEGAL-NAME : 法人/经营者姓名</li>
<li>PERSONAL-NAME : 签署人姓名</li>
<li>PERSONAL-MOBILE : 签署人手机号</li>
<li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li>
<li>PERSONAL-IDCARD : 签署人证件号</li>
<li>TEXT : 单行文本</li>
<li>MULTI_LINE_TEXT : 多行文本</li>
<li>CHECK_BOX : 勾选框</li>
<li>SELECTOR : 选择器</li>
<li>DIGIT : 数字</li>
<li>DATE : 日期</li>
<li>FILL_IMAGE : 图片</li>
<li>ATTACHMENT : 附件</li>
<li>EMAIL : 邮箱</li>
<li>LOCATION : 地址</li>
<li>EDUCATION : 学历</li>
<li>GENDER : 性别</li>
<li>DISTRICT : 省市区</li></ul>
     */
    public void setShowComponentTypes(String [] ShowComponentTypes) {
        this.ShowComponentTypes = ShowComponentTypes;
    }

    /**
     * Get 发起流程的可嵌入页面结果页配置 
     * @return ResultPageConfig 发起流程的可嵌入页面结果页配置
     */
    public CreateResultPageConfig [] getResultPageConfig() {
        return this.ResultPageConfig;
    }

    /**
     * Set 发起流程的可嵌入页面结果页配置
     * @param ResultPageConfig 发起流程的可嵌入页面结果页配置
     */
    public void setResultPageConfig(CreateResultPageConfig [] ResultPageConfig) {
        this.ResultPageConfig = ResultPageConfig;
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
        if (source.ForbidAddApprover != null) {
            this.ForbidAddApprover = new Boolean(source.ForbidAddApprover);
        }
        if (source.ForbidEditFlowProperties != null) {
            this.ForbidEditFlowProperties = new Boolean(source.ForbidEditFlowProperties);
        }
        if (source.HideComponentTypes != null) {
            this.HideComponentTypes = new String[source.HideComponentTypes.length];
            for (int i = 0; i < source.HideComponentTypes.length; i++) {
                this.HideComponentTypes[i] = new String(source.HideComponentTypes[i]);
            }
        }
        if (source.ShowComponentTypes != null) {
            this.ShowComponentTypes = new String[source.ShowComponentTypes.length];
            for (int i = 0; i < source.ShowComponentTypes.length; i++) {
                this.ShowComponentTypes[i] = new String(source.ShowComponentTypes[i]);
            }
        }
        if (source.ResultPageConfig != null) {
            this.ResultPageConfig = new CreateResultPageConfig[source.ResultPageConfig.length];
            for (int i = 0; i < source.ResultPageConfig.length; i++) {
                this.ResultPageConfig[i] = new CreateResultPageConfig(source.ResultPageConfig[i]);
            }
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
        this.setParamSimple(map, prefix + "ForbidAddApprover", this.ForbidAddApprover);
        this.setParamSimple(map, prefix + "ForbidEditFlowProperties", this.ForbidEditFlowProperties);
        this.setParamArraySimple(map, prefix + "HideComponentTypes.", this.HideComponentTypes);
        this.setParamArraySimple(map, prefix + "ShowComponentTypes.", this.ShowComponentTypes);
        this.setParamArrayObj(map, prefix + "ResultPageConfig.", this.ResultPageConfig);

    }
}

