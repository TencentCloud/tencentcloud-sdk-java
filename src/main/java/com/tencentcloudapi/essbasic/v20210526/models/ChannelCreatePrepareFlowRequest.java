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

public class ChannelCreatePrepareFlowRequest extends AbstractModel {

    /**
    * <p>资源类型，取值有：</p><ul><li> **1**：模板</li><li> **2**：文件（默认值）</li><li> **3**：草稿</li></ul>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>要创建的合同信息</p>
    */
    @SerializedName("FlowInfo")
    @Expose
    private BaseFlowInfo FlowInfo;

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>资源id，与ResourceType相对应，取值范围：</p><ul><li>文件Id（通过UploadFiles获取文件资源Id）</li><li>模板Id（通过控制台创建模板后获取模板Id）</li><li>草稿Id（通过嵌入页面保存草稿后获取草稿Id）</li></ul>注意：需要同时设置 ResourceType 参数指定资源类型
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>合同流程配置信息，用于配置发起合同时定制化如是否允许修改，某些按钮的隐藏等逻辑</p>
    */
    @SerializedName("FlowOption")
    @Expose
    private CreateFlowOption FlowOption;

    /**
    * <p>已废弃，请用FlowInfo.Approvers</p>
    */
    @SerializedName("FlowApproverList")
    @Expose
    private CommonFlowApprover [] FlowApproverList;

    /**
    * <p>合同Id：用于通过一个已发起的合同快速生成一个发起流程web链接<br>注: <code>该参数必须是一个待发起审核的合同id，并且还未审核通过</code></p>
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * <p>该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL</p>
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * <p>企业机构信息，不用传</p>
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * <p>操作人（用户）信息，不用传</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p><font color="red">此参数已经废弃，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，包括</p><ul><li>签署控件 是否默认展示日期.</li></ul>
    */
    @SerializedName("SignComponentConfig")
    @Expose
    private SignComponentConfig SignComponentConfig;

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
     * Get <p>要创建的合同信息</p> 
     * @return FlowInfo <p>要创建的合同信息</p>
     */
    public BaseFlowInfo getFlowInfo() {
        return this.FlowInfo;
    }

    /**
     * Set <p>要创建的合同信息</p>
     * @param FlowInfo <p>要创建的合同信息</p>
     */
    public void setFlowInfo(BaseFlowInfo FlowInfo) {
        this.FlowInfo = FlowInfo;
    }

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p><p>此接口下面信息必填。</p><ul><li>渠道应用标识:  Agent.AppId</li><li>第三方平台子客企业标识: Agent.ProxyOrganizationOpenId</li><li>第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId</li></ul>第三方平台子客企业和员工必须已经经过实名认证
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
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
     * Get <p>合同流程配置信息，用于配置发起合同时定制化如是否允许修改，某些按钮的隐藏等逻辑</p> 
     * @return FlowOption <p>合同流程配置信息，用于配置发起合同时定制化如是否允许修改，某些按钮的隐藏等逻辑</p>
     */
    public CreateFlowOption getFlowOption() {
        return this.FlowOption;
    }

    /**
     * Set <p>合同流程配置信息，用于配置发起合同时定制化如是否允许修改，某些按钮的隐藏等逻辑</p>
     * @param FlowOption <p>合同流程配置信息，用于配置发起合同时定制化如是否允许修改，某些按钮的隐藏等逻辑</p>
     */
    public void setFlowOption(CreateFlowOption FlowOption) {
        this.FlowOption = FlowOption;
    }

    /**
     * Get <p>已废弃，请用FlowInfo.Approvers</p> 
     * @return FlowApproverList <p>已废弃，请用FlowInfo.Approvers</p>
     * @deprecated
     */
    @Deprecated
    public CommonFlowApprover [] getFlowApproverList() {
        return this.FlowApproverList;
    }

    /**
     * Set <p>已废弃，请用FlowInfo.Approvers</p>
     * @param FlowApproverList <p>已废弃，请用FlowInfo.Approvers</p>
     * @deprecated
     */
    @Deprecated
    public void setFlowApproverList(CommonFlowApprover [] FlowApproverList) {
        this.FlowApproverList = FlowApproverList;
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
     * Get <p>该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL</p> 
     * @return NeedPreview <p>该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL</p>
     * @deprecated
     */
    @Deprecated
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set <p>该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL</p>
     * @param NeedPreview <p>该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL</p>
     * @deprecated
     */
    @Deprecated
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get <p>企业机构信息，不用传</p> 
     * @return Organization <p>企业机构信息，不用传</p>
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set <p>企业机构信息，不用传</p>
     * @param Organization <p>企业机构信息，不用传</p>
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get <p>操作人（用户）信息，不用传</p> 
     * @return Operator <p>操作人（用户）信息，不用传</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人（用户）信息，不用传</p>
     * @param Operator <p>操作人（用户）信息，不用传</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p><font color="red">此参数已经废弃，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，包括</p><ul><li>签署控件 是否默认展示日期.</li></ul> 
     * @return SignComponentConfig <p><font color="red">此参数已经废弃，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，包括</p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @deprecated
     */
    @Deprecated
    public SignComponentConfig getSignComponentConfig() {
        return this.SignComponentConfig;
    }

    /**
     * Set <p><font color="red">此参数已经废弃，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，包括</p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @param SignComponentConfig <p><font color="red">此参数已经废弃，请使用 CreateFlowOption 里面的 SignComponentConfig</font><br>签署控件的配置信息，用在嵌入式发起的页面配置，包括</p><ul><li>签署控件 是否默认展示日期.</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setSignComponentConfig(SignComponentConfig SignComponentConfig) {
        this.SignComponentConfig = SignComponentConfig;
    }

    public ChannelCreatePrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePrepareFlowRequest(ChannelCreatePrepareFlowRequest source) {
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.FlowInfo != null) {
            this.FlowInfo = new BaseFlowInfo(source.FlowInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.FlowOption != null) {
            this.FlowOption = new CreateFlowOption(source.FlowOption);
        }
        if (source.FlowApproverList != null) {
            this.FlowApproverList = new CommonFlowApprover[source.FlowApproverList.length];
            for (int i = 0; i < source.FlowApproverList.length; i++) {
                this.FlowApproverList[i] = new CommonFlowApprover(source.FlowApproverList[i]);
            }
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.NeedPreview != null) {
            this.NeedPreview = new Boolean(source.NeedPreview);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SignComponentConfig != null) {
            this.SignComponentConfig = new SignComponentConfig(source.SignComponentConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "FlowInfo.", this.FlowInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamObj(map, prefix + "FlowOption.", this.FlowOption);
        this.setParamArrayObj(map, prefix + "FlowApproverList.", this.FlowApproverList);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "SignComponentConfig.", this.SignComponentConfig);

    }
}

