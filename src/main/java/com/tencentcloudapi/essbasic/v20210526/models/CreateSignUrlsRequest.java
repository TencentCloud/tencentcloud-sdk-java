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

public class CreateSignUrlsRequest extends AbstractModel{

    /**
    * 渠道应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 和 Agent.ProxyAppId 均必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 签署流程编号数组，最多支持100个。
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 签署链接类型：“WEIXINAPP”-直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；默认“WEIXINAPP”类型，即跳转至小程序。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
    * Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * 操作者的信息
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
     * Get 签署流程编号数组，最多支持100个。 
     * @return FlowIds 签署流程编号数组，最多支持100个。
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 签署流程编号数组，最多支持100个。
     * @param FlowIds 签署流程编号数组，最多支持100个。
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 签署链接类型：“WEIXINAPP”-直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；默认“WEIXINAPP”类型，即跳转至小程序。 
     * @return Endpoint 签署链接类型：“WEIXINAPP”-直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；默认“WEIXINAPP”类型，即跳转至小程序。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 签署链接类型：“WEIXINAPP”-直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；默认“WEIXINAPP”类型，即跳转至小程序。
     * @param Endpoint 签署链接类型：“WEIXINAPP”-直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；默认“WEIXINAPP”类型，即跳转至小程序。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。 
     * @return JumpUrl 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     * @param JumpUrl 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    /**
     * Get Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序 
     * @return AutoJumpBack Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     */
    public Boolean getAutoJumpBack() {
        return this.AutoJumpBack;
    }

    /**
     * Set Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     * @param AutoJumpBack Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
     */
    public void setAutoJumpBack(Boolean AutoJumpBack) {
        this.AutoJumpBack = AutoJumpBack;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public CreateSignUrlsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSignUrlsRequest(CreateSignUrlsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.FlowIds != null) {
            this.FlowIds = new String[source.FlowIds.length];
            for (int i = 0; i < source.FlowIds.length; i++) {
                this.FlowIds[i] = new String(source.FlowIds[i]);
            }
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
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
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

