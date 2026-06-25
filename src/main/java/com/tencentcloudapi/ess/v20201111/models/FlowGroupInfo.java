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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowGroupInfo extends AbstractModel {

    /**
    * <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。<br>该名称还将用于合同签署完成后的下载文件名。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>签署流程参与者信息，最大限制50方<br>注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。</p>
    */
    @SerializedName("Approvers")
    @Expose
    private ApproverInfo [] Approvers;

    /**
    * <p>文件资源ID，通过多文件上传<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">UploadFiles</a>接口获得，为32位字符串。<br>注：此字段定义为数组，但仅支持单个文件</p>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>合同模板ID，为32位字符串。<br>建议开发者保存此模板ID，后续用此模板发起合同流程需要此参数。<br>可登录腾讯电子签控制台，在 &quot;模板&quot;-&gt;&quot;模板中心&quot;-&gt;&quot;列表展示设置&quot;选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。</p>
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * <p>签署流程的类型(如销售合同/入职合同等)，最大长度200个字符</p>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>签署流程描述,最大长度1000个字符</p>
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * <p>签署流程的签署截止时间。</p><p>值为unix时间戳,精确到秒,不传默认为当前时间一年后<br>示例值：1604912664</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * <p>合同（流程）的回调地址</p>
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 20480长度。<br>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。<br>回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>发送类型：<br>true：无序签<br>false：有序签<br>注：默认为false（有序签），请和模板中的配置保持一致<br>示例值：true</p>
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p><ul><li>单行文本控件</li><li>多行文本控件</li><li>勾选框控件</li><li>数字控件</li><li>图片控件</li><li>动态表格等填写控件</li></ul>
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。<br>若设置为true，审核结果需通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview">CreateFlowSignReview</a> 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。</p><p>注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。<br>示例值：true</p>
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * <p>个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN</p>
    */
    @SerializedName("AutoSignScene")
    @Expose
    private String AutoSignScene;

    /**
    * <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
    */
    @SerializedName("FlowDisplayType")
    @Expose
    private Long FlowDisplayType;

    /**
    * <p>抄送人信息</p>
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
     * Get <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。<br>该名称还将用于合同签署完成后的下载文件名。</p> 
     * @return FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。<br>该名称还将用于合同签署完成后的下载文件名。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。<br>该名称还将用于合同签署完成后的下载文件名。</p>
     * @param FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。<br>该名称还将用于合同签署完成后的下载文件名。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>签署流程参与者信息，最大限制50方<br>注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。</p> 
     * @return Approvers <p>签署流程参与者信息，最大限制50方<br>注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。</p>
     */
    public ApproverInfo [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set <p>签署流程参与者信息，最大限制50方<br>注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。</p>
     * @param Approvers <p>签署流程参与者信息，最大限制50方<br>注意 approver中的顺序需要和模板中的顺序保持一致， 否则会导致模板中配置的信息无效。</p>
     */
    public void setApprovers(ApproverInfo [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get <p>文件资源ID，通过多文件上传<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">UploadFiles</a>接口获得，为32位字符串。<br>注：此字段定义为数组，但仅支持单个文件</p> 
     * @return FileIds <p>文件资源ID，通过多文件上传<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">UploadFiles</a>接口获得，为32位字符串。<br>注：此字段定义为数组，但仅支持单个文件</p>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>文件资源ID，通过多文件上传<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">UploadFiles</a>接口获得，为32位字符串。<br>注：此字段定义为数组，但仅支持单个文件</p>
     * @param FileIds <p>文件资源ID，通过多文件上传<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">UploadFiles</a>接口获得，为32位字符串。<br>注：此字段定义为数组，但仅支持单个文件</p>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>合同模板ID，为32位字符串。<br>建议开发者保存此模板ID，后续用此模板发起合同流程需要此参数。<br>可登录腾讯电子签控制台，在 &quot;模板&quot;-&gt;&quot;模板中心&quot;-&gt;&quot;列表展示设置&quot;选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。</p> 
     * @return TemplateId <p>合同模板ID，为32位字符串。<br>建议开发者保存此模板ID，后续用此模板发起合同流程需要此参数。<br>可登录腾讯电子签控制台，在 &quot;模板&quot;-&gt;&quot;模板中心&quot;-&gt;&quot;列表展示设置&quot;选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。</p>
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set <p>合同模板ID，为32位字符串。<br>建议开发者保存此模板ID，后续用此模板发起合同流程需要此参数。<br>可登录腾讯电子签控制台，在 &quot;模板&quot;-&gt;&quot;模板中心&quot;-&gt;&quot;列表展示设置&quot;选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。</p>
     * @param TemplateId <p>合同模板ID，为32位字符串。<br>建议开发者保存此模板ID，后续用此模板发起合同流程需要此参数。<br>可登录腾讯电子签控制台，在 &quot;模板&quot;-&gt;&quot;模板中心&quot;-&gt;&quot;列表展示设置&quot;选中模板 ID 中查看某个模板的TemplateId(在页面中展示为模板ID)。</p>
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get <p>签署流程的类型(如销售合同/入职合同等)，最大长度200个字符</p> 
     * @return FlowType <p>签署流程的类型(如销售合同/入职合同等)，最大长度200个字符</p>
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set <p>签署流程的类型(如销售合同/入职合同等)，最大长度200个字符</p>
     * @param FlowType <p>签署流程的类型(如销售合同/入职合同等)，最大长度200个字符</p>
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get <p>签署流程描述,最大长度1000个字符</p> 
     * @return FlowDescription <p>签署流程描述,最大长度1000个字符</p>
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set <p>签署流程描述,最大长度1000个字符</p>
     * @param FlowDescription <p>签署流程描述,最大长度1000个字符</p>
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get <p>签署流程的签署截止时间。</p><p>值为unix时间戳,精确到秒,不传默认为当前时间一年后<br>示例值：1604912664</p> 
     * @return Deadline <p>签署流程的签署截止时间。</p><p>值为unix时间戳,精确到秒,不传默认为当前时间一年后<br>示例值：1604912664</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>签署流程的签署截止时间。</p><p>值为unix时间戳,精确到秒,不传默认为当前时间一年后<br>示例值：1604912664</p>
     * @param Deadline <p>签署流程的签署截止时间。</p><p>值为unix时间戳,精确到秒,不传默认为当前时间一年后<br>示例值：1604912664</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>合同（流程）的回调地址</p> 
     * @return CallbackUrl <p>合同（流程）的回调地址</p>
     * @deprecated
     */
    @Deprecated
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>合同（流程）的回调地址</p>
     * @param CallbackUrl <p>合同（流程）的回调地址</p>
     * @deprecated
     */
    @Deprecated
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 20480长度。<br>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。<br>回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p> 
     * @return UserData <p>调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 20480长度。<br>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。<br>回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 20480长度。<br>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。<br>回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     * @param UserData <p>调用方自定义的个性化字段(可自定义此字段的值)，并以base64方式编码，支持的最大数据大小为 20480长度。<br>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。<br>回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>发送类型：<br>true：无序签<br>false：有序签<br>注：默认为false（有序签），请和模板中的配置保持一致<br>示例值：true</p> 
     * @return Unordered <p>发送类型：<br>true：无序签<br>false：有序签<br>注：默认为false（有序签），请和模板中的配置保持一致<br>示例值：true</p>
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set <p>发送类型：<br>true：无序签<br>false：有序签<br>注：默认为false（有序签），请和模板中的配置保持一致<br>示例值：true</p>
     * @param Unordered <p>发送类型：<br>true：无序签<br>false：有序签<br>注：默认为false（有序签），请和模板中的配置保持一致<br>示例值：true</p>
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p><ul><li>单行文本控件</li><li>多行文本控件</li><li>勾选框控件</li><li>数字控件</li><li>图片控件</li><li>动态表格等填写控件</li></ul> 
     * @return Components <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p><ul><li>单行文本控件</li><li>多行文本控件</li><li>勾选框控件</li><li>数字控件</li><li>图片控件</li><li>动态表格等填写控件</li></ul>
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p><ul><li>单行文本控件</li><li>多行文本控件</li><li>勾选框控件</li><li>数字控件</li><li>图片控件</li><li>动态表格等填写控件</li></ul>
     * @param Components <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p><ul><li>单行文本控件</li><li>多行文本控件</li><li>勾选框控件</li><li>数字控件</li><li>图片控件</li><li>动态表格等填写控件</li></ul>
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
    }

    /**
     * Get <p>发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。<br>若设置为true，审核结果需通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview">CreateFlowSignReview</a> 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。</p><p>注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。<br>示例值：true</p> 
     * @return NeedSignReview <p>发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。<br>若设置为true，审核结果需通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview">CreateFlowSignReview</a> 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。</p><p>注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。<br>示例值：true</p>
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set <p>发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。<br>若设置为true，审核结果需通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview">CreateFlowSignReview</a> 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。</p><p>注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。<br>示例值：true</p>
     * @param NeedSignReview <p>发起方企业的签署人进行签署操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。<br>若设置为true，审核结果需通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview">CreateFlowSignReview</a> 通知电子签，审核通过后，发起方企业签署人方可进行签署操作，否则会阻塞其签署操作。</p><p>注：企业可以通过此功能与企业内部的审批流程进行关联，支持手动、静默签署合同。<br>示例值：true</p>
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get <p>个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN</p> 
     * @return AutoSignScene <p>个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN</p>
     */
    public String getAutoSignScene() {
        return this.AutoSignScene;
    }

    /**
     * Set <p>个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN</p>
     * @param AutoSignScene <p>个人自动签场景。发起自动签署时，需设置对应自动签署场景，目前仅支持场景：处方单-E_PRESCRIPTION_AUTO_SIGN</p>
     */
    public void setAutoSignScene(String AutoSignScene) {
        this.AutoSignScene = AutoSignScene;
    }

    /**
     * Get <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p> 
     * @return FlowDisplayType <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     */
    public Long getFlowDisplayType() {
        return this.FlowDisplayType;
    }

    /**
     * Set <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     * @param FlowDisplayType <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
     */
    public void setFlowDisplayType(Long FlowDisplayType) {
        this.FlowDisplayType = FlowDisplayType;
    }

    /**
     * Get <p>抄送人信息</p> 
     * @return CcInfos <p>抄送人信息</p>
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set <p>抄送人信息</p>
     * @param CcInfos <p>抄送人信息</p>
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    public FlowGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowGroupInfo(FlowGroupInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Approvers != null) {
            this.Approvers = new ApproverInfo[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new ApproverInfo(source.Approvers[i]);
            }
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.AutoSignScene != null) {
            this.AutoSignScene = new String(source.AutoSignScene);
        }
        if (source.FlowDisplayType != null) {
            this.FlowDisplayType = new Long(source.FlowDisplayType);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "AutoSignScene", this.AutoSignScene);
        this.setParamSimple(map, prefix + "FlowDisplayType", this.FlowDisplayType);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);

    }
}

