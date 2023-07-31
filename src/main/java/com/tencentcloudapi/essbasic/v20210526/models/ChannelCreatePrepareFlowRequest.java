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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreatePrepareFlowRequest extends AbstractModel{

    /**
    * 资源id，与ResourceType对应
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源类型，1：模板，目前仅支持模板，与ResourceId对应
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 合同流程基础信息
    */
    @SerializedName("FlowInfo")
    @Expose
    private BaseFlowInfo FlowInfo;

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 合同流程配置信息，用于配置发起合同时定制化
    */
    @SerializedName("FlowOption")
    @Expose
    private CreateFlowOption FlowOption;

    /**
    * 合同签署人信息
    */
    @SerializedName("FlowApproverList")
    @Expose
    private CommonFlowApprover [] FlowApproverList;

    /**
    * 通过flowid快速获得之前成功通过页面发起的合同生成链接
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL
    */
    @SerializedName("NeedPreview")
    @Expose
    private Boolean NeedPreview;

    /**
    * 企业机构信息，不用传
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 操作人（用户）信息，不用传
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 资源id，与ResourceType对应 
     * @return ResourceId 资源id，与ResourceType对应
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id，与ResourceType对应
     * @param ResourceId 资源id，与ResourceType对应
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源类型，1：模板，目前仅支持模板，与ResourceId对应 
     * @return ResourceType 资源类型，1：模板，目前仅支持模板，与ResourceId对应
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，1：模板，目前仅支持模板，与ResourceId对应
     * @param ResourceType 资源类型，1：模板，目前仅支持模板，与ResourceId对应
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 合同流程基础信息 
     * @return FlowInfo 合同流程基础信息
     */
    public BaseFlowInfo getFlowInfo() {
        return this.FlowInfo;
    }

    /**
     * Set 合同流程基础信息
     * @param FlowInfo 合同流程基础信息
     */
    public void setFlowInfo(BaseFlowInfo FlowInfo) {
        this.FlowInfo = FlowInfo;
    }

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 合同流程配置信息，用于配置发起合同时定制化 
     * @return FlowOption 合同流程配置信息，用于配置发起合同时定制化
     */
    public CreateFlowOption getFlowOption() {
        return this.FlowOption;
    }

    /**
     * Set 合同流程配置信息，用于配置发起合同时定制化
     * @param FlowOption 合同流程配置信息，用于配置发起合同时定制化
     */
    public void setFlowOption(CreateFlowOption FlowOption) {
        this.FlowOption = FlowOption;
    }

    /**
     * Get 合同签署人信息 
     * @return FlowApproverList 合同签署人信息
     */
    public CommonFlowApprover [] getFlowApproverList() {
        return this.FlowApproverList;
    }

    /**
     * Set 合同签署人信息
     * @param FlowApproverList 合同签署人信息
     */
    public void setFlowApproverList(CommonFlowApprover [] FlowApproverList) {
        this.FlowApproverList = FlowApproverList;
    }

    /**
     * Get 通过flowid快速获得之前成功通过页面发起的合同生成链接 
     * @return FlowId 通过flowid快速获得之前成功通过页面发起的合同生成链接
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 通过flowid快速获得之前成功通过页面发起的合同生成链接
     * @param FlowId 通过flowid快速获得之前成功通过页面发起的合同生成链接
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL 
     * @return NeedPreview 该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL
     * @deprecated
     */
    @Deprecated
    public Boolean getNeedPreview() {
        return this.NeedPreview;
    }

    /**
     * Set 该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL
     * @param NeedPreview 该参数不可用，请通过获取 web 可嵌入接口获取合同流程预览 URL
     * @deprecated
     */
    @Deprecated
    public void setNeedPreview(Boolean NeedPreview) {
        this.NeedPreview = NeedPreview;
    }

    /**
     * Get 企业机构信息，不用传 
     * @return Organization 企业机构信息，不用传
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 企业机构信息，不用传
     * @param Organization 企业机构信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 操作人（用户）信息，不用传 
     * @return Operator 操作人（用户）信息，不用传
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人（用户）信息，不用传
     * @param Operator 操作人（用户）信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreatePrepareFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreatePrepareFlowRequest(ChannelCreatePrepareFlowRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.FlowInfo != null) {
            this.FlowInfo = new BaseFlowInfo(source.FlowInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "FlowInfo.", this.FlowInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "FlowOption.", this.FlowOption);
        this.setParamArrayObj(map, prefix + "FlowApproverList.", this.FlowApproverList);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "NeedPreview", this.NeedPreview);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

