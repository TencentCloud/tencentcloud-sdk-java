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

public class BaseFlowInfo extends AbstractModel {

    /**
    * <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>合同流程描述信息(可自定义此描述)，最大长度1000个字符。</p>
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * <p>合同流程的签署顺序类型：<br><strong>false</strong>：(默认)有序签署, 本合同多个参与人需要依次签署<br><strong>true</strong>：无序签署, 本合同多个参与人没有先后签署限制</p>
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * <p>是否打开智能添加填写区(默认开启，打开:&quot;OPEN&quot; 关闭：&quot;CLOSE&quot;)</p>
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
    * <p>填写控件内容， 填写的控制的ID-填写的内容对列表</p>
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * <p>发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：<ul><li> <strong>false</strong>：（默认）不需要审批，直接签署。</li><li> <strong>true</strong>：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果<ul><li> 如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li><li> 如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>注：<code>此功能可用于与企业内部的审批流程进行关联，支持手动、“授权签”合同</code></p>
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为1000长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的回调通知模块。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p><p>注</p><ol><li>抄送人名单中可以包括自然人以及本企业的员工（本企业员工必须已经完成认证并加入企业）。</li><li>请确保抄送人列表中的成员不与任何签署人重复。</li></ol>
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * <p>发起方企业的签署人进行发起操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。</p><p>若设置为true，发起审核结果需通过接口 <a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignReview">提交企业签署流程审批结果</a>通知电子签，审核通过后，发起方企业签署人方可进行发起操作，否则会阻塞其发起操作。</p>
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
    * <p>填写控件：文件发起使用</p>
    */
    @SerializedName("Components")
    @Expose
    private Component [] Components;

    /**
    * <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
    */
    @SerializedName("FlowDisplayType")
    @Expose
    private Long FlowDisplayType;

    /**
    * <p>签署文件资源Id列表，目前仅支持单个文件</p>
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * <p>合同签署人信息</p>
    */
    @SerializedName("Approvers")
    @Expose
    private CommonFlowApprover [] Approvers;

    /**
     * Get <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p> 
     * @return FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     * @param FlowName <p>合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。</p> 
     * @return Deadline <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。</p>
     * @param Deadline <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果在签署截止时间前未完成签署，则合同状态会变为已过期，导致合同作废。</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p> 
     * @return FlowType <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p>
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p>
     * @param FlowType <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p>
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get <p>合同流程描述信息(可自定义此描述)，最大长度1000个字符。</p> 
     * @return FlowDescription <p>合同流程描述信息(可自定义此描述)，最大长度1000个字符。</p>
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set <p>合同流程描述信息(可自定义此描述)，最大长度1000个字符。</p>
     * @param FlowDescription <p>合同流程描述信息(可自定义此描述)，最大长度1000个字符。</p>
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get <p>合同流程的签署顺序类型：<br><strong>false</strong>：(默认)有序签署, 本合同多个参与人需要依次签署<br><strong>true</strong>：无序签署, 本合同多个参与人没有先后签署限制</p> 
     * @return Unordered <p>合同流程的签署顺序类型：<br><strong>false</strong>：(默认)有序签署, 本合同多个参与人需要依次签署<br><strong>true</strong>：无序签署, 本合同多个参与人没有先后签署限制</p>
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set <p>合同流程的签署顺序类型：<br><strong>false</strong>：(默认)有序签署, 本合同多个参与人需要依次签署<br><strong>true</strong>：无序签署, 本合同多个参与人没有先后签署限制</p>
     * @param Unordered <p>合同流程的签署顺序类型：<br><strong>false</strong>：(默认)有序签署, 本合同多个参与人需要依次签署<br><strong>true</strong>：无序签署, 本合同多个参与人没有先后签署限制</p>
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get <p>是否打开智能添加填写区(默认开启，打开:&quot;OPEN&quot; 关闭：&quot;CLOSE&quot;)</p> 
     * @return IntelligentStatus <p>是否打开智能添加填写区(默认开启，打开:&quot;OPEN&quot; 关闭：&quot;CLOSE&quot;)</p>
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set <p>是否打开智能添加填写区(默认开启，打开:&quot;OPEN&quot; 关闭：&quot;CLOSE&quot;)</p>
     * @param IntelligentStatus <p>是否打开智能添加填写区(默认开启，打开:&quot;OPEN&quot; 关闭：&quot;CLOSE&quot;)</p>
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    /**
     * Get <p>填写控件内容， 填写的控制的ID-填写的内容对列表</p> 
     * @return FormFields <p>填写控件内容， 填写的控制的ID-填写的内容对列表</p>
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set <p>填写控件内容， 填写的控制的ID-填写的内容对列表</p>
     * @param FormFields <p>填写控件内容， 填写的控制的ID-填写的内容对列表</p>
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get <p>发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：<ul><li> <strong>false</strong>：（默认）不需要审批，直接签署。</li><li> <strong>true</strong>：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果<ul><li> 如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li><li> 如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>注：<code>此功能可用于与企业内部的审批流程进行关联，支持手动、“授权签”合同</code></p> 
     * @return NeedSignReview <p>发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：<ul><li> <strong>false</strong>：（默认）不需要审批，直接签署。</li><li> <strong>true</strong>：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果<ul><li> 如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li><li> 如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>注：<code>此功能可用于与企业内部的审批流程进行关联，支持手动、“授权签”合同</code></p>
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set <p>发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：<ul><li> <strong>false</strong>：（默认）不需要审批，直接签署。</li><li> <strong>true</strong>：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果<ul><li> 如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li><li> 如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>注：<code>此功能可用于与企业内部的审批流程进行关联，支持手动、“授权签”合同</code></p>
     * @param NeedSignReview <p>发起方企业的签署人进行签署操作前，是否需要企业内部走审批流程，取值如下：<ul><li> <strong>false</strong>：（默认）不需要审批，直接签署。</li><li> <strong>true</strong>：需要走审批流程。当到对应参与人签署时，会阻塞其签署操作，等待企业内部审批完成。</li></ul>企业可以通过CreateFlowSignReview审批接口通知腾讯电子签平台企业内部审批结果<ul><li> 如果企业通知腾讯电子签平台审核通过，签署方可继续签署动作。</li><li> 如果企业通知腾讯电子签平台审核未通过，平台将继续阻塞签署方的签署动作，直到企业通知平台审核通过。</li></ul>注：<code>此功能可用于与企业内部的审批流程进行关联，支持手动、“授权签”合同</code></p>
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为1000长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的回调通知模块。</p> 
     * @return UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为1000长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的回调通知模块。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为1000长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的回调通知模块。</p>
     * @param UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为1000长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的回调通知模块。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p><p>注</p><ol><li>抄送人名单中可以包括自然人以及本企业的员工（本企业员工必须已经完成认证并加入企业）。</li><li>请确保抄送人列表中的成员不与任何签署人重复。</li></ol> 
     * @return CcInfos <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p><p>注</p><ol><li>抄送人名单中可以包括自然人以及本企业的员工（本企业员工必须已经完成认证并加入企业）。</li><li>请确保抄送人列表中的成员不与任何签署人重复。</li></ol>
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p><p>注</p><ol><li>抄送人名单中可以包括自然人以及本企业的员工（本企业员工必须已经完成认证并加入企业）。</li><li>请确保抄送人列表中的成员不与任何签署人重复。</li></ol>
     * @param CcInfos <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p><p>注</p><ol><li>抄送人名单中可以包括自然人以及本企业的员工（本企业员工必须已经完成认证并加入企业）。</li><li>请确保抄送人列表中的成员不与任何签署人重复。</li></ol>
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get <p>发起方企业的签署人进行发起操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。</p><p>若设置为true，发起审核结果需通过接口 <a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignReview">提交企业签署流程审批结果</a>通知电子签，审核通过后，发起方企业签署人方可进行发起操作，否则会阻塞其发起操作。</p> 
     * @return NeedCreateReview <p>发起方企业的签署人进行发起操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。</p><p>若设置为true，发起审核结果需通过接口 <a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignReview">提交企业签署流程审批结果</a>通知电子签，审核通过后，发起方企业签署人方可进行发起操作，否则会阻塞其发起操作。</p>
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set <p>发起方企业的签署人进行发起操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。</p><p>若设置为true，发起审核结果需通过接口 <a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignReview">提交企业签署流程审批结果</a>通知电子签，审核通过后，发起方企业签署人方可进行发起操作，否则会阻塞其发起操作。</p>
     * @param NeedCreateReview <p>发起方企业的签署人进行发起操作是否需要企业内部审批。使用此功能需要发起方企业有参与签署。</p><p>若设置为true，发起审核结果需通过接口 <a href="https://qian.tencent.com/developers/partnerApis/operateFlows/ChannelCreateFlowSignReview">提交企业签署流程审批结果</a>通知电子签，审核通过后，发起方企业签署人方可进行发起操作，否则会阻塞其发起操作。</p>
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
    }

    /**
     * Get <p>填写控件：文件发起使用</p> 
     * @return Components <p>填写控件：文件发起使用</p>
     */
    public Component [] getComponents() {
        return this.Components;
    }

    /**
     * Set <p>填写控件：文件发起使用</p>
     * @param Components <p>填写控件：文件发起使用</p>
     */
    public void setComponents(Component [] Components) {
        this.Components = Components;
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
     * Get <p>签署文件资源Id列表，目前仅支持单个文件</p> 
     * @return FileIds <p>签署文件资源Id列表，目前仅支持单个文件</p>
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set <p>签署文件资源Id列表，目前仅支持单个文件</p>
     * @param FileIds <p>签署文件资源Id列表，目前仅支持单个文件</p>
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get <p>合同签署人信息</p> 
     * @return Approvers <p>合同签署人信息</p>
     */
    public CommonFlowApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set <p>合同签署人信息</p>
     * @param Approvers <p>合同签署人信息</p>
     */
    public void setApprovers(CommonFlowApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    public BaseFlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaseFlowInfo(BaseFlowInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.UserData != null) {
            this.UserData = new String(source.UserData);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
        }
        if (source.Components != null) {
            this.Components = new Component[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new Component(source.Components[i]);
            }
        }
        if (source.FlowDisplayType != null) {
            this.FlowDisplayType = new Long(source.FlowDisplayType);
        }
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.Approvers != null) {
            this.Approvers = new CommonFlowApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new CommonFlowApprover(source.Approvers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);
        this.setParamSimple(map, prefix + "FlowDisplayType", this.FlowDisplayType);
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);

    }
}

