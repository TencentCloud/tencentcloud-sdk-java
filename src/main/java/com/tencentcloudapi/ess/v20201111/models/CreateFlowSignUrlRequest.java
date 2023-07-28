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

public class CreateFlowSignUrlRequest extends AbstractModel{

    /**
    * 流程编号
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 流程签署人列表，其中结构体的ApproverName，ApproverMobile和ApproverType必传，其他可不传，ApproverType目前只支持个人类型的签署人。

签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
    */
    @SerializedName("FlowApproverInfos")
    @Expose
    private FlowCreateApprover [] FlowApproverInfos;

    /**
    * 用户信息，此结构体UserId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

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
     * Get 流程签署人列表，其中结构体的ApproverName，ApproverMobile和ApproverType必传，其他可不传，ApproverType目前只支持个人类型的签署人。

签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。 
     * @return FlowApproverInfos 流程签署人列表，其中结构体的ApproverName，ApproverMobile和ApproverType必传，其他可不传，ApproverType目前只支持个人类型的签署人。

签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     */
    public FlowCreateApprover [] getFlowApproverInfos() {
        return this.FlowApproverInfos;
    }

    /**
     * Set 流程签署人列表，其中结构体的ApproverName，ApproverMobile和ApproverType必传，其他可不传，ApproverType目前只支持个人类型的签署人。

签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     * @param FlowApproverInfos 流程签署人列表，其中结构体的ApproverName，ApproverMobile和ApproverType必传，其他可不传，ApproverType目前只支持个人类型的签署人。

签署人只能有手写签名和时间类型的签署控件，其他类型的填写控件和签署控件暂时都未支持。
     */
    public void setFlowApproverInfos(FlowCreateApprover [] FlowApproverInfos) {
        this.FlowApproverInfos = FlowApproverInfos;
    }

    /**
     * Get 用户信息，此结构体UserId必填 
     * @return Operator 用户信息，此结构体UserId必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 用户信息，此结构体UserId必填
     * @param Operator 用户信息，此结构体UserId必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
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

    public CreateFlowSignUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowSignUrlRequest(CreateFlowSignUrlRequest source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.FlowApproverInfos != null) {
            this.FlowApproverInfos = new FlowCreateApprover[source.FlowApproverInfos.length];
            for (int i = 0; i < source.FlowApproverInfos.length; i++) {
                this.FlowApproverInfos[i] = new FlowCreateApprover(source.FlowApproverInfos[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamArrayObj(map, prefix + "FlowApproverInfos.", this.FlowApproverInfos);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

