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

public class ChannelCreateFlowSignUrlRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程签署人，其中Name和Mobile必传，其他可不传，ApproverType目前只支持PERSON类型的签署人，如果不传默认为该值。还需注意签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowApproverInfo [] FlowApproverInfos;

    /**
    * 用户信息，暂未开放
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 机构信息，暂未开放
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 签署完之后的H5页面的跳转链接，此链接支持http://和https://，最大长度1000个字符。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

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
     * Get 流程编号 
     * @return FlowId 流程编号
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 流程编号
     * @param FlowId 流程编号
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 流程签署人，其中Name和Mobile必传，其他可不传，ApproverType目前只支持PERSON类型的签署人，如果不传默认为该值。还需注意签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。 
     * @return FlowApproverInfos 流程签署人，其中Name和Mobile必传，其他可不传，ApproverType目前只支持PERSON类型的签署人，如果不传默认为该值。还需注意签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     */
    public FlowApproverInfo [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 流程签署人，其中Name和Mobile必传，其他可不传，ApproverType目前只支持PERSON类型的签署人，如果不传默认为该值。还需注意签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     * @param FlowApproverInfos 流程签署人，其中Name和Mobile必传，其他可不传，ApproverType目前只支持PERSON类型的签署人，如果不传默认为该值。还需注意签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     */
    public void setFlowApproverInfos(FlowApproverInfo [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get 用户信息，暂未开放 
     * @return Operator 用户信息，暂未开放
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 用户信息，暂未开放
     * @param Operator 用户信息，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 机构信息，暂未开放 
     * @return Organization 机构信息，暂未开放
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 机构信息，暂未开放
     * @param Organization 机构信息，暂未开放
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 签署完之后的H5页面的跳转链接，此链接支持http://和https://，最大长度1000个字符。 
     * @return JumpUrl 签署完之后的H5页面的跳转链接，此链接支持http://和https://，最大长度1000个字符。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完之后的H5页面的跳转链接，此链接支持http://和https://，最大长度1000个字符。
     * @param JumpUrl 签署完之后的H5页面的跳转链接，此链接支持http://和https://，最大长度1000个字符。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public ChannelCreateFlowSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateFlowSignUrlRequest(ChannelCreateFlowSignUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowApproverInfo[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowApproverInfo(source.FlowApproverInfos[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

