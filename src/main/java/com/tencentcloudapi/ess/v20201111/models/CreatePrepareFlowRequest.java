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

public class CreatePrepareFlowRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&amp;)、（+）组成。</p><p>该名称还将用于合同签署完成后文件下载的默认文件名称。</p>
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>合同流程的签署顺序类型：</p><ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li><li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>
    */
    @SerializedName("Unordered")
    @Expose
    private Boolean Unordered;

    /**
    * <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。</p>
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * <p>用户自定义合同类型Id</p><p>该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取<br>注: <code>该参数如果和FlowType同时传，以该参数优先生效</code></p>
    */
    @SerializedName("UserFlowTypeId")
    @Expose
    private String UserFlowTypeId;

    /**
    * <p>合同流程的类别分类（可自定义名称，如销售合同/入职合同等），最大长度为200个字符，仅限中文、字母、数字和下划线组成。</p>
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * <p>合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，具体定义可以参考开发者中心的ApproverInfo结构体。</p><p>如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序，请确保列表中参与人的顺序符合实际签署顺序。</p>
    */
    @SerializedName("Approvers")
    @Expose
    private FlowCreateApprover [] Approvers;

    /**
    * <p>开启或者关闭智能添加填写区：</p><ul><li> **OPEN**：开启（默认值）</li><li> **CLOSE**：关闭</li></ul>
    */
    @SerializedName("IntelligentStatus")
    @Expose
    private String IntelligentStatus;

    /**
    * <p>该字段已不再使用，请使用InitiatorComponents</p>
    */
    @SerializedName("Components")
    @Expose
    private Component Components;

    /**
    * <p>发起合同个性化参数<br>用于满足创建及页面操作过程中的个性化要求<br>具体定制化内容详见数据接口说明</p>
    */
    @SerializedName("FlowOption")
    @Expose
    private CreateFlowOption FlowOption;

    /**
    * <p>发起方企业签署员工，在进行签署操作前，是否需要先通过企业内部审批流程 （签署审核）1. <strong>false（默认）</strong>：  无需审批，发起方企业签署员工可直接进行签署操作。2. <strong>true</strong>：  需要先走企业内部审批流程。 当流程进展到发起方企业签署员工时，其签署操作会被阻塞，等待企业内部审批结果。企业应通过 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a>审批接口，将内部审批结果通知腾讯电子签平台：1. 若通知为“审核通过”，发起方企业签署员工可继续完成签署操作。2. 若通知为“审核未通过”，平台将继续阻塞该签署方的签署操作，直到企业再次通知平台审核通过为止。说明： 此能力可用于与企业内部审批流程打通，适用于手动签署和“授权签”两种模式。</p>
    */
    @SerializedName("NeedSignReview")
    @Expose
    private Boolean NeedSignReview;

    /**
    * <p>发起方在创建合同流程前，是否必须先通过企业内部审批流程 （发起审核）</p><p>当设置为 <code>true</code> 时：  </p><ol><li>您需要在企业内部完成审批，并通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a> 将审批结果回传给腾讯电子签。 </li><li>只有当审核状态为“通过”时，合同流程正常发起。  </li><li>若未通过或未回传审核结果，发起操作将被阻塞，阻止合同流程。</li></ol><p>当设置为 <code>false</code> （默认值）时：<br>  发起方无需经过企业内部审批，可直接发起合同流程。</p>
    */
    @SerializedName("NeedCreateReview")
    @Expose
    private Boolean NeedCreateReview;

    /**
    * <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 20480长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p>
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
    * <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p>
    */
    @SerializedName("InitiatorComponents")
    @Expose
    private Component [] InitiatorComponents;

    /**
    * <p>在短信通知、填写、签署流程中，若标题、按钮、合同详情等地方存在“合同”字样时，可根据此配置指定文案，可选文案如下：  <ul><li> <b>0</b> :合同（默认值）</li> <li> <b>1</b> :文件</li> <li> <b>2</b> :协议</li><li> <b>3</b> :文书</li></ul>效果如下:<img src="https://qcloudimg.tencent-cloud.cn/raw/e4a2c4d638717cc901d3dbd5137c9bbc.png" alt="FlowDisplayType"></p>
    */
    @SerializedName("FlowDisplayType")
    @Expose
    private Long FlowDisplayType;

    /**
    * <p><font color="red">此字段已不再使用，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，<br>包括  </p><ul><li>签署控件 是否默认展示日期.</li></ul>
    */
    @SerializedName("SignComponentConfig")
    @Expose
    private SignComponentConfig SignComponentConfig;

    /**
    * <p>是否开启嵌入式合同发起时，提交发起审批流，默认：false（不开启），开启后，嵌入式合同发起后，会提交电子签内置审批流</p>
    */
    @SerializedName("Workflow")
    @Expose
    private Boolean Workflow;

    /**
     * Get <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。使用此接口时，必须填写userId。<br>支持填入集团子公司经办人 userId 代发合同。</p><p>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型 
     * @return ResourceId <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型
     * @param ResourceId <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&amp;)、（+）组成。</p><p>该名称还将用于合同签署完成后文件下载的默认文件名称。</p> 
     * @return FlowName <p>自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&amp;)、（+）组成。</p><p>该名称还将用于合同签署完成后文件下载的默认文件名称。</p>
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set <p>自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&amp;)、（+）组成。</p><p>该名称还将用于合同签署完成后文件下载的默认文件名称。</p>
     * @param FlowName <p>自定义的合同流程的名称，长度不能超过200个字符，只能由中文汉字、中文标点、英文字母、阿拉伯数字、空格、小括号、中括号、中划线、下划线以及（,）、（;）、（.）、(&amp;)、（+）组成。</p><p>该名称还将用于合同签署完成后文件下载的默认文件名称。</p>
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul> 
     * @return ResourceType <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul>
     * @param ResourceType <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul>
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>合同流程的签署顺序类型：</p><ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li><li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul> 
     * @return Unordered <p>合同流程的签署顺序类型：</p><ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li><li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>
     */
    public Boolean getUnordered() {
        return this.Unordered;
    }

    /**
     * Set <p>合同流程的签署顺序类型：</p><ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li><li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>
     * @param Unordered <p>合同流程的签署顺序类型：</p><ul><li> **false**：(默认)有序签署, 本合同多个参与人需要依次签署 </li><li> **true**：无序签署, 本合同多个参与人没有先后签署限制</li></ul>
     */
    public void setUnordered(Boolean Unordered) {
        this.Unordered = Unordered;
    }

    /**
     * Get <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。</p> 
     * @return Deadline <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。</p>
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。</p>
     * @param Deadline <p>合同流程的签署截止时间，格式为Unix标准时间戳（秒），如果未设置签署截止时间，则默认为合同流程创建后的365天时截止。</p>
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get <p>用户自定义合同类型Id</p><p>该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取<br>注: <code>该参数如果和FlowType同时传，以该参数优先生效</code></p> 
     * @return UserFlowTypeId <p>用户自定义合同类型Id</p><p>该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取<br>注: <code>该参数如果和FlowType同时传，以该参数优先生效</code></p>
     */
    public String getUserFlowTypeId() {
        return this.UserFlowTypeId;
    }

    /**
     * Set <p>用户自定义合同类型Id</p><p>该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取<br>注: <code>该参数如果和FlowType同时传，以该参数优先生效</code></p>
     * @param UserFlowTypeId <p>用户自定义合同类型Id</p><p>该id为电子签企业内的合同类型id， 可以在控制台-合同-自定义合同类型处获取<br>注: <code>该参数如果和FlowType同时传，以该参数优先生效</code></p>
     */
    public void setUserFlowTypeId(String UserFlowTypeId) {
        this.UserFlowTypeId = UserFlowTypeId;
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
     * Get <p>合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，具体定义可以参考开发者中心的ApproverInfo结构体。</p><p>如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序，请确保列表中参与人的顺序符合实际签署顺序。</p> 
     * @return Approvers <p>合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，具体定义可以参考开发者中心的ApproverInfo结构体。</p><p>如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序，请确保列表中参与人的顺序符合实际签署顺序。</p>
     */
    public FlowCreateApprover [] getApprovers() {
        return this.Approvers;
    }

    /**
     * Set <p>合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，具体定义可以参考开发者中心的ApproverInfo结构体。</p><p>如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序，请确保列表中参与人的顺序符合实际签署顺序。</p>
     * @param Approvers <p>合同流程的参与方列表，最多可支持50个参与方，可在列表中指定企业B端签署方和个人C端签署方的联系和认证方式等信息，具体定义可以参考开发者中心的ApproverInfo结构体。</p><p>如果合同流程是有序签署，Approvers列表中参与人的顺序就是默认的签署顺序，请确保列表中参与人的顺序符合实际签署顺序。</p>
     */
    public void setApprovers(FlowCreateApprover [] Approvers) {
        this.Approvers = Approvers;
    }

    /**
     * Get <p>开启或者关闭智能添加填写区：</p><ul><li> **OPEN**：开启（默认值）</li><li> **CLOSE**：关闭</li></ul> 
     * @return IntelligentStatus <p>开启或者关闭智能添加填写区：</p><ul><li> **OPEN**：开启（默认值）</li><li> **CLOSE**：关闭</li></ul>
     */
    public String getIntelligentStatus() {
        return this.IntelligentStatus;
    }

    /**
     * Set <p>开启或者关闭智能添加填写区：</p><ul><li> **OPEN**：开启（默认值）</li><li> **CLOSE**：关闭</li></ul>
     * @param IntelligentStatus <p>开启或者关闭智能添加填写区：</p><ul><li> **OPEN**：开启（默认值）</li><li> **CLOSE**：关闭</li></ul>
     */
    public void setIntelligentStatus(String IntelligentStatus) {
        this.IntelligentStatus = IntelligentStatus;
    }

    /**
     * Get <p>该字段已不再使用，请使用InitiatorComponents</p> 
     * @return Components <p>该字段已不再使用，请使用InitiatorComponents</p>
     */
    public Component getComponents() {
        return this.Components;
    }

    /**
     * Set <p>该字段已不再使用，请使用InitiatorComponents</p>
     * @param Components <p>该字段已不再使用，请使用InitiatorComponents</p>
     */
    public void setComponents(Component Components) {
        this.Components = Components;
    }

    /**
     * Get <p>发起合同个性化参数<br>用于满足创建及页面操作过程中的个性化要求<br>具体定制化内容详见数据接口说明</p> 
     * @return FlowOption <p>发起合同个性化参数<br>用于满足创建及页面操作过程中的个性化要求<br>具体定制化内容详见数据接口说明</p>
     */
    public CreateFlowOption getFlowOption() {
        return this.FlowOption;
    }

    /**
     * Set <p>发起合同个性化参数<br>用于满足创建及页面操作过程中的个性化要求<br>具体定制化内容详见数据接口说明</p>
     * @param FlowOption <p>发起合同个性化参数<br>用于满足创建及页面操作过程中的个性化要求<br>具体定制化内容详见数据接口说明</p>
     */
    public void setFlowOption(CreateFlowOption FlowOption) {
        this.FlowOption = FlowOption;
    }

    /**
     * Get <p>发起方企业签署员工，在进行签署操作前，是否需要先通过企业内部审批流程 （签署审核）1. <strong>false（默认）</strong>：  无需审批，发起方企业签署员工可直接进行签署操作。2. <strong>true</strong>：  需要先走企业内部审批流程。 当流程进展到发起方企业签署员工时，其签署操作会被阻塞，等待企业内部审批结果。企业应通过 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a>审批接口，将内部审批结果通知腾讯电子签平台：1. 若通知为“审核通过”，发起方企业签署员工可继续完成签署操作。2. 若通知为“审核未通过”，平台将继续阻塞该签署方的签署操作，直到企业再次通知平台审核通过为止。说明： 此能力可用于与企业内部审批流程打通，适用于手动签署和“授权签”两种模式。</p> 
     * @return NeedSignReview <p>发起方企业签署员工，在进行签署操作前，是否需要先通过企业内部审批流程 （签署审核）1. <strong>false（默认）</strong>：  无需审批，发起方企业签署员工可直接进行签署操作。2. <strong>true</strong>：  需要先走企业内部审批流程。 当流程进展到发起方企业签署员工时，其签署操作会被阻塞，等待企业内部审批结果。企业应通过 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a>审批接口，将内部审批结果通知腾讯电子签平台：1. 若通知为“审核通过”，发起方企业签署员工可继续完成签署操作。2. 若通知为“审核未通过”，平台将继续阻塞该签署方的签署操作，直到企业再次通知平台审核通过为止。说明： 此能力可用于与企业内部审批流程打通，适用于手动签署和“授权签”两种模式。</p>
     */
    public Boolean getNeedSignReview() {
        return this.NeedSignReview;
    }

    /**
     * Set <p>发起方企业签署员工，在进行签署操作前，是否需要先通过企业内部审批流程 （签署审核）1. <strong>false（默认）</strong>：  无需审批，发起方企业签署员工可直接进行签署操作。2. <strong>true</strong>：  需要先走企业内部审批流程。 当流程进展到发起方企业签署员工时，其签署操作会被阻塞，等待企业内部审批结果。企业应通过 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a>审批接口，将内部审批结果通知腾讯电子签平台：1. 若通知为“审核通过”，发起方企业签署员工可继续完成签署操作。2. 若通知为“审核未通过”，平台将继续阻塞该签署方的签署操作，直到企业再次通知平台审核通过为止。说明： 此能力可用于与企业内部审批流程打通，适用于手动签署和“授权签”两种模式。</p>
     * @param NeedSignReview <p>发起方企业签署员工，在进行签署操作前，是否需要先通过企业内部审批流程 （签署审核）1. <strong>false（默认）</strong>：  无需审批，发起方企业签署员工可直接进行签署操作。2. <strong>true</strong>：  需要先走企业内部审批流程。 当流程进展到发起方企业签署员工时，其签署操作会被阻塞，等待企业内部审批结果。企业应通过 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a>审批接口，将内部审批结果通知腾讯电子签平台：1. 若通知为“审核通过”，发起方企业签署员工可继续完成签署操作。2. 若通知为“审核未通过”，平台将继续阻塞该签署方的签署操作，直到企业再次通知平台审核通过为止。说明： 此能力可用于与企业内部审批流程打通，适用于手动签署和“授权签”两种模式。</p>
     */
    public void setNeedSignReview(Boolean NeedSignReview) {
        this.NeedSignReview = NeedSignReview;
    }

    /**
     * Get <p>发起方在创建合同流程前，是否必须先通过企业内部审批流程 （发起审核）</p><p>当设置为 <code>true</code> 时：  </p><ol><li>您需要在企业内部完成审批，并通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a> 将审批结果回传给腾讯电子签。 </li><li>只有当审核状态为“通过”时，合同流程正常发起。  </li><li>若未通过或未回传审核结果，发起操作将被阻塞，阻止合同流程。</li></ol><p>当设置为 <code>false</code> （默认值）时：<br>  发起方无需经过企业内部审批，可直接发起合同流程。</p> 
     * @return NeedCreateReview <p>发起方在创建合同流程前，是否必须先通过企业内部审批流程 （发起审核）</p><p>当设置为 <code>true</code> 时：  </p><ol><li>您需要在企业内部完成审批，并通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a> 将审批结果回传给腾讯电子签。 </li><li>只有当审核状态为“通过”时，合同流程正常发起。  </li><li>若未通过或未回传审核结果，发起操作将被阻塞，阻止合同流程。</li></ol><p>当设置为 <code>false</code> （默认值）时：<br>  发起方无需经过企业内部审批，可直接发起合同流程。</p>
     */
    public Boolean getNeedCreateReview() {
        return this.NeedCreateReview;
    }

    /**
     * Set <p>发起方在创建合同流程前，是否必须先通过企业内部审批流程 （发起审核）</p><p>当设置为 <code>true</code> 时：  </p><ol><li>您需要在企业内部完成审批，并通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a> 将审批结果回传给腾讯电子签。 </li><li>只有当审核状态为“通过”时，合同流程正常发起。  </li><li>若未通过或未回传审核结果，发起操作将被阻塞，阻止合同流程。</li></ol><p>当设置为 <code>false</code> （默认值）时：<br>  发起方无需经过企业内部审批，可直接发起合同流程。</p>
     * @param NeedCreateReview <p>发起方在创建合同流程前，是否必须先通过企业内部审批流程 （发起审核）</p><p>当设置为 <code>true</code> 时：  </p><ol><li>您需要在企业内部完成审批，并通过接口 <a href="https://qian.tencent.com/developers/companyApis/operateFlows/CreateFlowSignReview" target="_blank">提交签署流程审批结果</a> 将审批结果回传给腾讯电子签。 </li><li>只有当审核状态为“通过”时，合同流程正常发起。  </li><li>若未通过或未回传审核结果，发起操作将被阻塞，阻止合同流程。</li></ol><p>当设置为 <code>false</code> （默认值）时：<br>  发起方无需经过企业内部审批，可直接发起合同流程。</p>
     */
    public void setNeedCreateReview(Boolean NeedCreateReview) {
        this.NeedCreateReview = NeedCreateReview;
    }

    /**
     * Get <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 20480长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p> 
     * @return UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 20480长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * Set <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 20480长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     * @param UserData <p>调用方自定义的个性化字段(可自定义此名称)，并以base64方式编码，支持的最大数据大小为 20480长度。</p><p>在合同状态变更的回调信息等场景中，该字段的信息将原封不动地透传给贵方。回调的相关说明可参考开发者中心的<a href="https://qian.tencent.com/developers/company/callback_types_v2" target="_blank">回调通知</a>模块。</p>
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * Get <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p> 
     * @return CcInfos <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p>
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p>
     * @param CcInfos <p>合同流程的抄送人列表，最多可支持50个抄送人，抄送人可查看合同内容及签署进度，但无需参与合同签署。</p>
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    /**
     * Get <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p> 
     * @return FlowId <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p>
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p>
     * @param FlowId <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p>
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p> 
     * @return InitiatorComponents <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p>
     */
    public Component [] getInitiatorComponents() {
        return this.InitiatorComponents;
    }

    /**
     * Set <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p>
     * @param InitiatorComponents <p>模板或者合同中的填写控件列表，列表中可支持下列多种填写控件，控件的详细定义参考开发者中心的Component结构体</p>
     */
    public void setInitiatorComponents(Component [] InitiatorComponents) {
        this.InitiatorComponents = InitiatorComponents;
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
     * Get <p><font color="red">此字段已不再使用，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，<br>包括  </p><ul><li>签署控件 是否默认展示日期.</li></ul> 
     * @return SignComponentConfig <p><font color="red">此字段已不再使用，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，<br>包括  </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @deprecated
     */
    @Deprecated
    public SignComponentConfig getSignComponentConfig() {
        return this.SignComponentConfig;
    }

    /**
     * Set <p><font color="red">此字段已不再使用，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，<br>包括  </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @param SignComponentConfig <p><font color="red">此字段已不再使用，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，<br>包括  </p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSignComponentConfig(SignComponentConfig SignComponentConfig) {
        this.SignComponentConfig = SignComponentConfig;
    }

    /**
     * Get <p>是否开启嵌入式合同发起时，提交发起审批流，默认：false（不开启），开启后，嵌入式合同发起后，会提交电子签内置审批流</p> 
     * @return Workflow <p>是否开启嵌入式合同发起时，提交发起审批流，默认：false（不开启），开启后，嵌入式合同发起后，会提交电子签内置审批流</p>
     */
    public Boolean getWorkflow() {
        return this.Workflow;
    }

    /**
     * Set <p>是否开启嵌入式合同发起时，提交发起审批流，默认：false（不开启），开启后，嵌入式合同发起后，会提交电子签内置审批流</p>
     * @param Workflow <p>是否开启嵌入式合同发起时，提交发起审批流，默认：false（不开启），开启后，嵌入式合同发起后，会提交电子签内置审批流</p>
     */
    public void setWorkflow(Boolean Workflow) {
        this.Workflow = Workflow;
    }

    public CreatePrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrepareFlowRequest(CreatePrepareFlowRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.Unordered != null) {
            this.Unordered = new Boolean(source.Unordered);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.UserFlowTypeId != null) {
            this.UserFlowTypeId = new String(source.UserFlowTypeId);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.Approvers != null) {
            this.Approvers = new FlowCreateApprover[source.Approvers.length];
            for (int i = 0; i < source.Approvers.length; i++) {
                this.Approvers[i] = new FlowCreateApprover(source.Approvers[i]);
            }
        }
        if (source.IntelligentStatus != null) {
            this.IntelligentStatus = new String(source.IntelligentStatus);
        }
        if (source.Components != null) {
            this.Components = new Component(source.Components);
        }
        if (source.FlowOption != null) {
            this.FlowOption = new CreateFlowOption(source.FlowOption);
        }
        if (source.NeedSignReview != null) {
            this.NeedSignReview = new Boolean(source.NeedSignReview);
        }
        if (source.NeedCreateReview != null) {
            this.NeedCreateReview = new Boolean(source.NeedCreateReview);
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
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.InitiatorComponents != null) {
            this.InitiatorComponents = new Component[source.InitiatorComponents.length];
            for (int i = 0; i < source.InitiatorComponents.length; i++) {
                this.InitiatorComponents[i] = new Component(source.InitiatorComponents[i]);
            }
        }
        if (source.FlowDisplayType != null) {
            this.FlowDisplayType = new Long(source.FlowDisplayType);
        }
        if (source.SignComponentConfig != null) {
            this.SignComponentConfig = new SignComponentConfig(source.SignComponentConfig);
        }
        if (source.Workflow != null) {
            this.Workflow = new Boolean(source.Workflow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Unordered", this.Unordered);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "UserFlowTypeId", this.UserFlowTypeId);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamArrayObj(map, prefix + "Approvers.", this.Approvers);
        this.setParamSimple(map, prefix + "IntelligentStatus", this.IntelligentStatus);
        this.setParamObj(map, prefix + "Components.", this.Components);
        this.setParamObj(map, prefix + "FlowOption.", this.FlowOption);
        this.setParamSimple(map, prefix + "NeedSignReview", this.NeedSignReview);
        this.setParamSimple(map, prefix + "NeedCreateReview", this.NeedCreateReview);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "InitiatorComponents.", this.InitiatorComponents);
        this.setParamSimple(map, prefix + "FlowDisplayType", this.FlowDisplayType);
        this.setParamObj(map, prefix + "SignComponentConfig.", this.SignComponentConfig);
        this.setParamSimple(map, prefix + "Workflow", this.Workflow);

    }
}

