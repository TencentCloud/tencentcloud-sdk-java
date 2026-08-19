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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowOption extends AbstractModel {

    /**
    * <p>是否允许修改合同信息，<br><strong>true</strong>：可以<br><strong>false</strong>：（默认）不可以</p>
    */
    @SerializedName("CanEditFlow")
    @Expose
    private Boolean CanEditFlow;

    /**
    * <p>是否允许发起合同弹窗隐藏合同名称<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
    */
    @SerializedName("HideShowFlowName")
    @Expose
    private Boolean HideShowFlowName;

    /**
    * <p>是否允许发起合同弹窗隐藏合同类型，<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
    */
    @SerializedName("HideShowFlowType")
    @Expose
    private Boolean HideShowFlowType;

    /**
    * <p>是否允许发起合同弹窗隐藏合同到期时间<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
    */
    @SerializedName("HideShowDeadline")
    @Expose
    private Boolean HideShowDeadline;

    /**
    * <p>是否允许发起合同步骤跳过指定签署方步骤<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
    */
    @SerializedName("CanSkipAddApprover")
    @Expose
    private Boolean CanSkipAddApprover;

    /**
    * <p>是否可以编辑签署人包括新增，修改，删除 </p><ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul><p>注意：</p><ul><li>如果设置参数为 true， 则 参数签署人 <a href="https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow">FlowApproverList</a> 不能为空</li><li>此参数对子客和自动签无效，不允许进行修改。</li></ul>
    */
    @SerializedName("ForbidEditApprover")
    @Expose
    private Boolean ForbidEditApprover;

    /**
    * <p>定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。</p>
    */
    @SerializedName("CustomCreateFlowDescription")
    @Expose
    private String CustomCreateFlowDescription;

    /**
    * <p>禁止编辑填写控件</p><p><strong>true</strong>：禁止编辑填写控件<br><strong>false</strong>：（默认）允许编辑填写控件</p>
    */
    @SerializedName("ForbidEditFillComponent")
    @Expose
    private Boolean ForbidEditFillComponent;

    /**
    * <p>跳过上传文件步骤</p><p><strong>true</strong>：跳过<br><strong>false</strong>：（默认）不跳过，需要传ResourceId</p>
    */
    @SerializedName("SkipUploadFile")
    @Expose
    private Boolean SkipUploadFile;

    /**
    * <p>签署控件的配置信息，用在嵌入式发起的页面配置，包括 </p><ul><li>签署控件 是否默认展示日期.</li></ul>
    */
    @SerializedName("SignComponentConfig")
    @Expose
    private SignComponentConfig SignComponentConfig;

    /**
    * <p>是否禁止编辑（展示）水印控件属性</p><ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
    */
    @SerializedName("ForbidEditWatermark")
    @Expose
    private Boolean ForbidEditWatermark;

    /**
    * <p>发起成功后是否预览合同</p><ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
    */
    @SerializedName("PreviewAfterStart")
    @Expose
    private Boolean PreviewAfterStart;

    /**
    * <p>发起成功之后是否签署合同，仅当前经办人作为签署人时生效</p><ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
    */
    @SerializedName("SignAfterStart")
    @Expose
    private Boolean SignAfterStart;

    /**
    * <p>隐藏操作步骤: 具体的控件类型如下</p><ul><li>1 : 选择文件及签署方</li><li>2 : 补充文件内容</li><li>4 : 发起前合同信息与设置确认</li></ul>注：仅对新版页面生效
    */
    @SerializedName("HideOperationSteps")
    @Expose
    private Long [] HideOperationSteps;

    /**
    * <p>本企业简称，注：仅对新版页面生效</p>
    */
    @SerializedName("SelfName")
    @Expose
    private String SelfName;

    /**
    * <p>发起后签署码隐藏，默认false，注：仅对新版页面生效</p>
    */
    @SerializedName("HideSignCodeAfterStart")
    @Expose
    private Boolean HideSignCodeAfterStart;

    /**
    * <p>发起过程中是否保存草稿</p>
    */
    @SerializedName("NeedFlowDraft")
    @Expose
    private Boolean NeedFlowDraft;

    /**
    * <p>在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
    */
    @SerializedName("HideComponentTypes")
    @Expose
    private String [] HideComponentTypes;

    /**
    * <p>在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
    */
    @SerializedName("ShowComponentTypes")
    @Expose
    private String [] ShowComponentTypes;

    /**
    * <p>禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”</p>
    */
    @SerializedName("ForbidAddApprover")
    @Expose
    private Boolean ForbidAddApprover;

    /**
    * <p>禁止设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板</p>
    */
    @SerializedName("ForbidEditFlowProperties")
    @Expose
    private Boolean ForbidEditFlowProperties;

    /**
    * <p>发起流程的可嵌入页面结果页配置</p>
    */
    @SerializedName("ResultPageConfig")
    @Expose
    private CreateResultPageConfig ResultPageConfig;

    /**
    * <p>若指定了合同抄送人，此参数用来控制操作人能否在嵌入式页面看见或编辑（修改、增加、删除）抄送人信息。</p><p>枚举值：</p><ul><li>0： 不可见不可编辑</li><li>1： 可见不可编辑</li><li>2： 可见可编辑</li></ul><p>默认值：0</p>
    */
    @SerializedName("CcInfoVisibility")
    @Expose
    private Long CcInfoVisibility;

    /**
     * Get <p>是否允许修改合同信息，<br><strong>true</strong>：可以<br><strong>false</strong>：（默认）不可以</p> 
     * @return CanEditFlow <p>是否允许修改合同信息，<br><strong>true</strong>：可以<br><strong>false</strong>：（默认）不可以</p>
     */
    public Boolean getCanEditFlow() {
        return this.CanEditFlow;
    }

    /**
     * Set <p>是否允许修改合同信息，<br><strong>true</strong>：可以<br><strong>false</strong>：（默认）不可以</p>
     * @param CanEditFlow <p>是否允许修改合同信息，<br><strong>true</strong>：可以<br><strong>false</strong>：（默认）不可以</p>
     */
    public void setCanEditFlow(Boolean CanEditFlow) {
        this.CanEditFlow = CanEditFlow;
    }

    /**
     * Get <p>是否允许发起合同弹窗隐藏合同名称<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p> 
     * @return HideShowFlowName <p>是否允许发起合同弹窗隐藏合同名称<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public Boolean getHideShowFlowName() {
        return this.HideShowFlowName;
    }

    /**
     * Set <p>是否允许发起合同弹窗隐藏合同名称<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     * @param HideShowFlowName <p>是否允许发起合同弹窗隐藏合同名称<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public void setHideShowFlowName(Boolean HideShowFlowName) {
        this.HideShowFlowName = HideShowFlowName;
    }

    /**
     * Get <p>是否允许发起合同弹窗隐藏合同类型，<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p> 
     * @return HideShowFlowType <p>是否允许发起合同弹窗隐藏合同类型，<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public Boolean getHideShowFlowType() {
        return this.HideShowFlowType;
    }

    /**
     * Set <p>是否允许发起合同弹窗隐藏合同类型，<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     * @param HideShowFlowType <p>是否允许发起合同弹窗隐藏合同类型，<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public void setHideShowFlowType(Boolean HideShowFlowType) {
        this.HideShowFlowType = HideShowFlowType;
    }

    /**
     * Get <p>是否允许发起合同弹窗隐藏合同到期时间<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p> 
     * @return HideShowDeadline <p>是否允许发起合同弹窗隐藏合同到期时间<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public Boolean getHideShowDeadline() {
        return this.HideShowDeadline;
    }

    /**
     * Set <p>是否允许发起合同弹窗隐藏合同到期时间<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     * @param HideShowDeadline <p>是否允许发起合同弹窗隐藏合同到期时间<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public void setHideShowDeadline(Boolean HideShowDeadline) {
        this.HideShowDeadline = HideShowDeadline;
    }

    /**
     * Get <p>是否允许发起合同步骤跳过指定签署方步骤<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p> 
     * @return CanSkipAddApprover <p>是否允许发起合同步骤跳过指定签署方步骤<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public Boolean getCanSkipAddApprover() {
        return this.CanSkipAddApprover;
    }

    /**
     * Set <p>是否允许发起合同步骤跳过指定签署方步骤<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     * @param CanSkipAddApprover <p>是否允许发起合同步骤跳过指定签署方步骤<br><strong>true</strong>：允许<br><strong>false</strong>：（默认）不允许</p>
     */
    public void setCanSkipAddApprover(Boolean CanSkipAddApprover) {
        this.CanSkipAddApprover = CanSkipAddApprover;
    }

    /**
     * Get <p>是否可以编辑签署人包括新增，修改，删除 </p><ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul><p>注意：</p><ul><li>如果设置参数为 true， 则 参数签署人 <a href="https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow">FlowApproverList</a> 不能为空</li><li>此参数对子客和自动签无效，不允许进行修改。</li></ul> 
     * @return ForbidEditApprover <p>是否可以编辑签署人包括新增，修改，删除 </p><ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul><p>注意：</p><ul><li>如果设置参数为 true， 则 参数签署人 <a href="https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow">FlowApproverList</a> 不能为空</li><li>此参数对子客和自动签无效，不允许进行修改。</li></ul>
     */
    public Boolean getForbidEditApprover() {
        return this.ForbidEditApprover;
    }

    /**
     * Set <p>是否可以编辑签署人包括新增，修改，删除 </p><ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul><p>注意：</p><ul><li>如果设置参数为 true， 则 参数签署人 <a href="https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow">FlowApproverList</a> 不能为空</li><li>此参数对子客和自动签无效，不允许进行修改。</li></ul>
     * @param ForbidEditApprover <p>是否可以编辑签署人包括新增，修改，删除 </p><ul><li>（默认） false -可以编辑签署人</li> <li> true - 禁止编辑签署人</li></ul><p>注意：</p><ul><li>如果设置参数为 true， 则 参数签署人 <a href="https://qian.tencent.com/developers/partnerApis/embedPages/ChannelCreatePrepareFlow">FlowApproverList</a> 不能为空</li><li>此参数对子客和自动签无效，不允许进行修改。</li></ul>
     */
    public void setForbidEditApprover(Boolean ForbidEditApprover) {
        this.ForbidEditApprover = ForbidEditApprover;
    }

    /**
     * Get <p>定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。</p> 
     * @return CustomCreateFlowDescription <p>定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。</p>
     */
    public String getCustomCreateFlowDescription() {
        return this.CustomCreateFlowDescription;
    }

    /**
     * Set <p>定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。</p>
     * @param CustomCreateFlowDescription <p>定制化发起合同弹窗的描述信息，长度不能超过500，只能由中文、字母、数字和标点组成。</p>
     */
    public void setCustomCreateFlowDescription(String CustomCreateFlowDescription) {
        this.CustomCreateFlowDescription = CustomCreateFlowDescription;
    }

    /**
     * Get <p>禁止编辑填写控件</p><p><strong>true</strong>：禁止编辑填写控件<br><strong>false</strong>：（默认）允许编辑填写控件</p> 
     * @return ForbidEditFillComponent <p>禁止编辑填写控件</p><p><strong>true</strong>：禁止编辑填写控件<br><strong>false</strong>：（默认）允许编辑填写控件</p>
     */
    public Boolean getForbidEditFillComponent() {
        return this.ForbidEditFillComponent;
    }

    /**
     * Set <p>禁止编辑填写控件</p><p><strong>true</strong>：禁止编辑填写控件<br><strong>false</strong>：（默认）允许编辑填写控件</p>
     * @param ForbidEditFillComponent <p>禁止编辑填写控件</p><p><strong>true</strong>：禁止编辑填写控件<br><strong>false</strong>：（默认）允许编辑填写控件</p>
     */
    public void setForbidEditFillComponent(Boolean ForbidEditFillComponent) {
        this.ForbidEditFillComponent = ForbidEditFillComponent;
    }

    /**
     * Get <p>跳过上传文件步骤</p><p><strong>true</strong>：跳过<br><strong>false</strong>：（默认）不跳过，需要传ResourceId</p> 
     * @return SkipUploadFile <p>跳过上传文件步骤</p><p><strong>true</strong>：跳过<br><strong>false</strong>：（默认）不跳过，需要传ResourceId</p>
     */
    public Boolean getSkipUploadFile() {
        return this.SkipUploadFile;
    }

    /**
     * Set <p>跳过上传文件步骤</p><p><strong>true</strong>：跳过<br><strong>false</strong>：（默认）不跳过，需要传ResourceId</p>
     * @param SkipUploadFile <p>跳过上传文件步骤</p><p><strong>true</strong>：跳过<br><strong>false</strong>：（默认）不跳过，需要传ResourceId</p>
     */
    public void setSkipUploadFile(Boolean SkipUploadFile) {
        this.SkipUploadFile = SkipUploadFile;
    }

    /**
     * Get <p>签署控件的配置信息，用在嵌入式发起的页面配置，包括 </p><ul><li>签署控件 是否默认展示日期.</li></ul> 
     * @return SignComponentConfig <p>签署控件的配置信息，用在嵌入式发起的页面配置，包括 </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     */
    public SignComponentConfig getSignComponentConfig() {
        return this.SignComponentConfig;
    }

    /**
     * Set <p>签署控件的配置信息，用在嵌入式发起的页面配置，包括 </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @param SignComponentConfig <p>签署控件的配置信息，用在嵌入式发起的页面配置，包括 </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     */
    public void setSignComponentConfig(SignComponentConfig SignComponentConfig) {
        this.SignComponentConfig = SignComponentConfig;
    }

    /**
     * Get <p>是否禁止编辑（展示）水印控件属性</p><ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul> 
     * @return ForbidEditWatermark <p>是否禁止编辑（展示）水印控件属性</p><ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     */
    public Boolean getForbidEditWatermark() {
        return this.ForbidEditWatermark;
    }

    /**
     * Set <p>是否禁止编辑（展示）水印控件属性</p><ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     * @param ForbidEditWatermark <p>是否禁止编辑（展示）水印控件属性</p><ul><li>（默认） false -否</li> <li> true - 禁止编辑</li></ul>
     */
    public void setForbidEditWatermark(Boolean ForbidEditWatermark) {
        this.ForbidEditWatermark = ForbidEditWatermark;
    }

    /**
     * Get <p>发起成功后是否预览合同</p><ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul> 
     * @return PreviewAfterStart <p>发起成功后是否预览合同</p><ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     */
    public Boolean getPreviewAfterStart() {
        return this.PreviewAfterStart;
    }

    /**
     * Set <p>发起成功后是否预览合同</p><ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     * @param PreviewAfterStart <p>发起成功后是否预览合同</p><ul><li>（默认） false -否</li> <li> true - 展示预览按钮</li></ul>
     */
    public void setPreviewAfterStart(Boolean PreviewAfterStart) {
        this.PreviewAfterStart = PreviewAfterStart;
    }

    /**
     * Get <p>发起成功之后是否签署合同，仅当前经办人作为签署人时生效</p><ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul> 
     * @return SignAfterStart <p>发起成功之后是否签署合同，仅当前经办人作为签署人时生效</p><ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     */
    public Boolean getSignAfterStart() {
        return this.SignAfterStart;
    }

    /**
     * Set <p>发起成功之后是否签署合同，仅当前经办人作为签署人时生效</p><ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     * @param SignAfterStart <p>发起成功之后是否签署合同，仅当前经办人作为签署人时生效</p><ul><li>（默认） false -否</li> <li> true - 展示签署按钮</li></ul>
     */
    public void setSignAfterStart(Boolean SignAfterStart) {
        this.SignAfterStart = SignAfterStart;
    }

    /**
     * Get <p>隐藏操作步骤: 具体的控件类型如下</p><ul><li>1 : 选择文件及签署方</li><li>2 : 补充文件内容</li><li>4 : 发起前合同信息与设置确认</li></ul>注：仅对新版页面生效 
     * @return HideOperationSteps <p>隐藏操作步骤: 具体的控件类型如下</p><ul><li>1 : 选择文件及签署方</li><li>2 : 补充文件内容</li><li>4 : 发起前合同信息与设置确认</li></ul>注：仅对新版页面生效
     */
    public Long [] getHideOperationSteps() {
        return this.HideOperationSteps;
    }

    /**
     * Set <p>隐藏操作步骤: 具体的控件类型如下</p><ul><li>1 : 选择文件及签署方</li><li>2 : 补充文件内容</li><li>4 : 发起前合同信息与设置确认</li></ul>注：仅对新版页面生效
     * @param HideOperationSteps <p>隐藏操作步骤: 具体的控件类型如下</p><ul><li>1 : 选择文件及签署方</li><li>2 : 补充文件内容</li><li>4 : 发起前合同信息与设置确认</li></ul>注：仅对新版页面生效
     */
    public void setHideOperationSteps(Long [] HideOperationSteps) {
        this.HideOperationSteps = HideOperationSteps;
    }

    /**
     * Get <p>本企业简称，注：仅对新版页面生效</p> 
     * @return SelfName <p>本企业简称，注：仅对新版页面生效</p>
     */
    public String getSelfName() {
        return this.SelfName;
    }

    /**
     * Set <p>本企业简称，注：仅对新版页面生效</p>
     * @param SelfName <p>本企业简称，注：仅对新版页面生效</p>
     */
    public void setSelfName(String SelfName) {
        this.SelfName = SelfName;
    }

    /**
     * Get <p>发起后签署码隐藏，默认false，注：仅对新版页面生效</p> 
     * @return HideSignCodeAfterStart <p>发起后签署码隐藏，默认false，注：仅对新版页面生效</p>
     */
    public Boolean getHideSignCodeAfterStart() {
        return this.HideSignCodeAfterStart;
    }

    /**
     * Set <p>发起后签署码隐藏，默认false，注：仅对新版页面生效</p>
     * @param HideSignCodeAfterStart <p>发起后签署码隐藏，默认false，注：仅对新版页面生效</p>
     */
    public void setHideSignCodeAfterStart(Boolean HideSignCodeAfterStart) {
        this.HideSignCodeAfterStart = HideSignCodeAfterStart;
    }

    /**
     * Get <p>发起过程中是否保存草稿</p> 
     * @return NeedFlowDraft <p>发起过程中是否保存草稿</p>
     */
    public Boolean getNeedFlowDraft() {
        return this.NeedFlowDraft;
    }

    /**
     * Set <p>发起过程中是否保存草稿</p>
     * @param NeedFlowDraft <p>发起过程中是否保存草稿</p>
     */
    public void setNeedFlowDraft(Boolean NeedFlowDraft) {
        this.NeedFlowDraft = NeedFlowDraft;
    }

    /**
     * Get <p>在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul> 
     * @return HideComponentTypes <p>在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     */
    public String [] getHideComponentTypes() {
        return this.HideComponentTypes;
    }

    /**
     * Set <p>在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     * @param HideComponentTypes <p>在发起流程的可嵌入页面要隐藏的控件列表，和 ShowComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     */
    public void setHideComponentTypes(String [] HideComponentTypes) {
        this.HideComponentTypes = HideComponentTypes;
    }

    /**
     * Get <p>在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul> 
     * @return ShowComponentTypes <p>在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     */
    public String [] getShowComponentTypes() {
        return this.ShowComponentTypes;
    }

    /**
     * Set <p>在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     * @param ShowComponentTypes <p>在发起流程的可嵌入页面要显示的控件列表，和 HideComponentTypes 参数 只能二选一使用（注:<br><font color="red">空数组代表未指定</font>），具体的控件类型如下</p><ul><li>SIGN_SIGNATURE : 个人签名/印章</li><li>SIGN_SEAL : 企业印章</li><li>SIGN_PAGING_SEAL : 骑缝章</li><li>SIGN_LEGAL_PERSON_SEAL : 法定代表人章</li><li>SIGN_APPROVE : 签批</li><li>SIGN_OPINION : 签署意见</li><li>SIGN_PAGING_SIGNATURE : 手写签名骑缝控件</li><li>BUSI-FULL-NAME  : 企业全称</li><li>BUSI-CREDIT-CODE : 统一社会信用代码</li><li>BUSI-LEGAL-NAME : 法人/经营者姓名</li><li>PERSONAL-NAME : 签署人姓名</li><li>PERSONAL-MOBILE : 签署人手机号</li><li>PERSONAL-IDCARD-TYPE : 签署人证件类型</li><li>PERSONAL-IDCARD : 签署人证件号</li><li>TEXT : 单行文本</li><li>MULTI_LINE_TEXT : 多行文本</li><li>CHECK_BOX : 勾选框</li><li>SELECTOR : 选择器</li><li>DIGIT : 数字</li><li>DATE : 日期</li><li>FILL_IMAGE : 图片</li><li>ATTACHMENT : 附件</li><li>EMAIL : 邮箱</li><li>LOCATION : 地址</li><li>EDUCATION : 学历</li><li>GENDER : 性别</li><li>DISTRICT : 省市区</li></ul>
     */
    public void setShowComponentTypes(String [] ShowComponentTypes) {
        this.ShowComponentTypes = ShowComponentTypes;
    }

    /**
     * Get <p>禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”</p> 
     * @return ForbidAddApprover <p>禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”</p>
     */
    public Boolean getForbidAddApprover() {
        return this.ForbidAddApprover;
    }

    /**
     * Set <p>禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”</p>
     * @param ForbidAddApprover <p>禁止添加签署方，若为true则在发起流程的可嵌入页面隐藏“添加签署人按钮”</p>
     */
    public void setForbidAddApprover(Boolean ForbidAddApprover) {
        this.ForbidAddApprover = ForbidAddApprover;
    }

    /**
     * Get <p>禁止设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板</p> 
     * @return ForbidEditFlowProperties <p>禁止设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板</p>
     */
    public Boolean getForbidEditFlowProperties() {
        return this.ForbidEditFlowProperties;
    }

    /**
     * Set <p>禁止设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板</p>
     * @param ForbidEditFlowProperties <p>禁止设置签署流程属性 (顺序、合同签署认证方式等)，若为true则在发起流程的可嵌入页面隐藏签署流程设置面板</p>
     */
    public void setForbidEditFlowProperties(Boolean ForbidEditFlowProperties) {
        this.ForbidEditFlowProperties = ForbidEditFlowProperties;
    }

    /**
     * Get <p>发起流程的可嵌入页面结果页配置</p> 
     * @return ResultPageConfig <p>发起流程的可嵌入页面结果页配置</p>
     */
    public CreateResultPageConfig getResultPageConfig() {
        return this.ResultPageConfig;
    }

    /**
     * Set <p>发起流程的可嵌入页面结果页配置</p>
     * @param ResultPageConfig <p>发起流程的可嵌入页面结果页配置</p>
     */
    public void setResultPageConfig(CreateResultPageConfig ResultPageConfig) {
        this.ResultPageConfig = ResultPageConfig;
    }

    /**
     * Get <p>若指定了合同抄送人，此参数用来控制操作人能否在嵌入式页面看见或编辑（修改、增加、删除）抄送人信息。</p><p>枚举值：</p><ul><li>0： 不可见不可编辑</li><li>1： 可见不可编辑</li><li>2： 可见可编辑</li></ul><p>默认值：0</p> 
     * @return CcInfoVisibility <p>若指定了合同抄送人，此参数用来控制操作人能否在嵌入式页面看见或编辑（修改、增加、删除）抄送人信息。</p><p>枚举值：</p><ul><li>0： 不可见不可编辑</li><li>1： 可见不可编辑</li><li>2： 可见可编辑</li></ul><p>默认值：0</p>
     */
    public Long getCcInfoVisibility() {
        return this.CcInfoVisibility;
    }

    /**
     * Set <p>若指定了合同抄送人，此参数用来控制操作人能否在嵌入式页面看见或编辑（修改、增加、删除）抄送人信息。</p><p>枚举值：</p><ul><li>0： 不可见不可编辑</li><li>1： 可见不可编辑</li><li>2： 可见可编辑</li></ul><p>默认值：0</p>
     * @param CcInfoVisibility <p>若指定了合同抄送人，此参数用来控制操作人能否在嵌入式页面看见或编辑（修改、增加、删除）抄送人信息。</p><p>枚举值：</p><ul><li>0： 不可见不可编辑</li><li>1： 可见不可编辑</li><li>2： 可见可编辑</li></ul><p>默认值：0</p>
     */
    public void setCcInfoVisibility(Long CcInfoVisibility) {
        this.CcInfoVisibility = CcInfoVisibility;
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
        if (source.ForbidEditApprover != null) {
            this.ForbidEditApprover = new Boolean(source.ForbidEditApprover);
        }
        if (source.CustomCreateFlowDescription != null) {
            this.CustomCreateFlowDescription = new String(source.CustomCreateFlowDescription);
        }
        if (source.ForbidEditFillComponent != null) {
            this.ForbidEditFillComponent = new Boolean(source.ForbidEditFillComponent);
        }
        if (source.SkipUploadFile != null) {
            this.SkipUploadFile = new Boolean(source.SkipUploadFile);
        }
        if (source.SignComponentConfig != null) {
            this.SignComponentConfig = new SignComponentConfig(source.SignComponentConfig);
        }
        if (source.ForbidEditWatermark != null) {
            this.ForbidEditWatermark = new Boolean(source.ForbidEditWatermark);
        }
        if (source.PreviewAfterStart != null) {
            this.PreviewAfterStart = new Boolean(source.PreviewAfterStart);
        }
        if (source.SignAfterStart != null) {
            this.SignAfterStart = new Boolean(source.SignAfterStart);
        }
        if (source.HideOperationSteps != null) {
            this.HideOperationSteps = new Long[source.HideOperationSteps.length];
            for (int i = 0; i < source.HideOperationSteps.length; i++) {
                this.HideOperationSteps[i] = new Long(source.HideOperationSteps[i]);
            }
        }
        if (source.SelfName != null) {
            this.SelfName = new String(source.SelfName);
        }
        if (source.HideSignCodeAfterStart != null) {
            this.HideSignCodeAfterStart = new Boolean(source.HideSignCodeAfterStart);
        }
        if (source.NeedFlowDraft != null) {
            this.NeedFlowDraft = new Boolean(source.NeedFlowDraft);
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
        if (source.ForbidAddApprover != null) {
            this.ForbidAddApprover = new Boolean(source.ForbidAddApprover);
        }
        if (source.ForbidEditFlowProperties != null) {
            this.ForbidEditFlowProperties = new Boolean(source.ForbidEditFlowProperties);
        }
        if (source.ResultPageConfig != null) {
            this.ResultPageConfig = new CreateResultPageConfig(source.ResultPageConfig);
        }
        if (source.CcInfoVisibility != null) {
            this.CcInfoVisibility = new Long(source.CcInfoVisibility);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanEditFlow", this.CanEditFlow);
        this.setParamSimple(map, prefix + "HideShowFlowName", this.HideShowFlowName);
        this.setParamSimple(map, prefix + "HideShowFlowType", this.HideShowFlowType);
        this.setParamSimple(map, prefix + "HideShowDeadline", this.HideShowDeadline);
        this.setParamSimple(map, prefix + "CanSkipAddApprover", this.CanSkipAddApprover);
        this.setParamSimple(map, prefix + "ForbidEditApprover", this.ForbidEditApprover);
        this.setParamSimple(map, prefix + "CustomCreateFlowDescription", this.CustomCreateFlowDescription);
        this.setParamSimple(map, prefix + "ForbidEditFillComponent", this.ForbidEditFillComponent);
        this.setParamSimple(map, prefix + "SkipUploadFile", this.SkipUploadFile);
        this.setParamObj(map, prefix + "SignComponentConfig.", this.SignComponentConfig);
        this.setParamSimple(map, prefix + "ForbidEditWatermark", this.ForbidEditWatermark);
        this.setParamSimple(map, prefix + "PreviewAfterStart", this.PreviewAfterStart);
        this.setParamSimple(map, prefix + "SignAfterStart", this.SignAfterStart);
        this.setParamArraySimple(map, prefix + "HideOperationSteps.", this.HideOperationSteps);
        this.setParamSimple(map, prefix + "SelfName", this.SelfName);
        this.setParamSimple(map, prefix + "HideSignCodeAfterStart", this.HideSignCodeAfterStart);
        this.setParamSimple(map, prefix + "NeedFlowDraft", this.NeedFlowDraft);
        this.setParamArraySimple(map, prefix + "HideComponentTypes.", this.HideComponentTypes);
        this.setParamArraySimple(map, prefix + "ShowComponentTypes.", this.ShowComponentTypes);
        this.setParamSimple(map, prefix + "ForbidAddApprover", this.ForbidAddApprover);
        this.setParamSimple(map, prefix + "ForbidEditFlowProperties", this.ForbidEditFlowProperties);
        this.setParamObj(map, prefix + "ResultPageConfig.", this.ResultPageConfig);
        this.setParamSimple(map, prefix + "CcInfoVisibility", this.CcInfoVisibility);

    }
}

