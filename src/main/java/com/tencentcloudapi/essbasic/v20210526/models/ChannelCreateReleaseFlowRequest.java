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

public class ChannelCreateReleaseFlowRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 待解除的流程编号（即原流程的编号）
    */
    @SerializedName("NeedRelievedFlowId")
    @Expose
    private String NeedRelievedFlowId;

    /**
    * 解除协议内容
    */
    @SerializedName("ReliveInfo")
    @Expose
    private RelieveInfo ReliveInfo;

    /**
    * 非必须，解除协议的本企业签署人列表，默认使用原流程的签署人列表；当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业的其他签署人来替换原流程中的原签署人，注意需要指明ApproverNumber来代表需要替换哪一个签署人，解除协议的签署人数量不能多于原流程的签署人数量
    */
    @SerializedName("ReleasedApprovers")
    @Expose
    private ReleasedApprover [] ReleasedApprovers;

    /**
    * 签署完回调url，最大长度1000个字符
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 机构信息
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 用户信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。 
     * @return Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     * @param Agent 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 待解除的流程编号（即原流程的编号） 
     * @return NeedRelievedFlowId 待解除的流程编号（即原流程的编号）
     */
    public String getNeedRelievedFlowId() {
        return this.NeedRelievedFlowId;
    }

    /**
     * Set 待解除的流程编号（即原流程的编号）
     * @param NeedRelievedFlowId 待解除的流程编号（即原流程的编号）
     */
    public void setNeedRelievedFlowId(String NeedRelievedFlowId) {
        this.NeedRelievedFlowId = NeedRelievedFlowId;
    }

    /**
     * Get 解除协议内容 
     * @return ReliveInfo 解除协议内容
     */
    public RelieveInfo getReliveInfo() {
        return this.ReliveInfo;
    }

    /**
     * Set 解除协议内容
     * @param ReliveInfo 解除协议内容
     */
    public void setReliveInfo(RelieveInfo ReliveInfo) {
        this.ReliveInfo = ReliveInfo;
    }

    /**
     * Get 非必须，解除协议的本企业签署人列表，默认使用原流程的签署人列表；当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业的其他签署人来替换原流程中的原签署人，注意需要指明ApproverNumber来代表需要替换哪一个签署人，解除协议的签署人数量不能多于原流程的签署人数量 
     * @return ReleasedApprovers 非必须，解除协议的本企业签署人列表，默认使用原流程的签署人列表；当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业的其他签署人来替换原流程中的原签署人，注意需要指明ApproverNumber来代表需要替换哪一个签署人，解除协议的签署人数量不能多于原流程的签署人数量
     */
    public ReleasedApprover [] getReleasedApprovers() {
        return this.ReleasedApprovers;
    }

    /**
     * Set 非必须，解除协议的本企业签署人列表，默认使用原流程的签署人列表；当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业的其他签署人来替换原流程中的原签署人，注意需要指明ApproverNumber来代表需要替换哪一个签署人，解除协议的签署人数量不能多于原流程的签署人数量
     * @param ReleasedApprovers 非必须，解除协议的本企业签署人列表，默认使用原流程的签署人列表；当解除协议的签署人与原流程的签署人不能相同时（例如原流程签署人离职了），需要指定本企业的其他签署人来替换原流程中的原签署人，注意需要指明ApproverNumber来代表需要替换哪一个签署人，解除协议的签署人数量不能多于原流程的签署人数量
     */
    public void setReleasedApprovers(ReleasedApprover [] ReleasedApprovers) {
        this.ReleasedApprovers = ReleasedApprovers;
    }

    /**
     * Get 签署完回调url，最大长度1000个字符 
     * @return CallbackUrl 签署完回调url，最大长度1000个字符
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 签署完回调url，最大长度1000个字符
     * @param CallbackUrl 签署完回调url，最大长度1000个字符
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 机构信息 
     * @return Organization 机构信息
     */
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 机构信息
     * @param Organization 机构信息
     */
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 用户信息 
     * @return Operator 用户信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 用户信息
     * @param Operator 用户信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateReleaseFlowRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateReleaseFlowRequest(ChannelCreateReleaseFlowRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.NeedRelievedFlowId != null) {
            this.NeedRelievedFlowId = new String(source.NeedRelievedFlowId);
        }
        if (source.ReliveInfo != null) {
            this.ReliveInfo = new RelieveInfo(source.ReliveInfo);
        }
        if (source.ReleasedApprovers != null) {
            this.ReleasedApprovers = new ReleasedApprover[source.ReleasedApprovers.length];
            for (int i = 0; i < source.ReleasedApprovers.length; i++) {
                this.ReleasedApprovers[i] = new ReleasedApprover(source.ReleasedApprovers[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
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
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "NeedRelievedFlowId", this.NeedRelievedFlowId);
        this.setParamObj(map, prefix + "ReliveInfo.", this.ReliveInfo);
        this.setParamArrayObj(map, prefix + "ReleasedApprovers.", this.ReleasedApprovers);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

