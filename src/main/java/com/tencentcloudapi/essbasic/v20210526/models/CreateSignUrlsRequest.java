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
    * 签署流程编号数组，最多支持100个。(备注：该参数和合同组编号必须二选一)
    */
    @SerializedName("FlowIds")
    @Expose
    private String [] FlowIds;

    /**
    * 合同组编号(备注：该参数和合同(流程)编号数组必须二选一)
    */
    @SerializedName("FlowGroupId")
    @Expose
    private String FlowGroupId;

    /**
    * 签署链接类型：“WEIXINAPP”-短链直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；"LONGURL2WEIXINAPP"-长链接跳转小程序；默认“WEIXINAPP”类型，即跳转至小程序；
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 签署链接生成类型，默认是 "ALL"；
"ALL"：全部签署方签署链接，此时不会给自动签署的签署方创建签署链接；
"CHANNEL"：渠道合作企业；
"NOT_CHANNEL"：非渠道合作企业；
"PERSON"：个人；
"FOLLOWER"：关注方，目前是合同抄送方；
    */
    @SerializedName("GenerateType")
    @Expose
    private String GenerateType;

    /**
    * 非渠道合作企业参与方的企业名称，GenerateType为"NOT_CHANNEL"时必填
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 参与人姓名，GenerateType为"PERSON"时必填
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参与人手机号；
GenerateType为"PERSON"或"FOLLOWER"时必填
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 渠道合作企业的企业Id，GenerateType为"CHANNEL"时必填
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 渠道合作企业参与人OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * Endpoint为"APP" 类型的签署链接，可以设置此值；支持调用方小程序打开签署链接，在电子签小程序完成签署后自动回跳至调用方小程序
    */
    @SerializedName("AutoJumpBack")
    @Expose
    private Boolean AutoJumpBack;

    /**
    * 签署完之后的H5页面的跳转链接，针对Endpoint为CHANNEL时有效，最大长度1000个字符。
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

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
     * Get 签署流程编号数组，最多支持100个。(备注：该参数和合同组编号必须二选一) 
     * @return FlowIds 签署流程编号数组，最多支持100个。(备注：该参数和合同组编号必须二选一)
     */
    public String [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * Set 签署流程编号数组，最多支持100个。(备注：该参数和合同组编号必须二选一)
     * @param FlowIds 签署流程编号数组，最多支持100个。(备注：该参数和合同组编号必须二选一)
     */
    public void setFlowIds(String [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * Get 合同组编号(备注：该参数和合同(流程)编号数组必须二选一) 
     * @return FlowGroupId 合同组编号(备注：该参数和合同(流程)编号数组必须二选一)
     */
    public String getFlowGroupId() {
        return this.FlowGroupId;
    }

    /**
     * Set 合同组编号(备注：该参数和合同(流程)编号数组必须二选一)
     * @param FlowGroupId 合同组编号(备注：该参数和合同(流程)编号数组必须二选一)
     */
    public void setFlowGroupId(String FlowGroupId) {
        this.FlowGroupId = FlowGroupId;
    }

    /**
     * Get 签署链接类型：“WEIXINAPP”-短链直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；"LONGURL2WEIXINAPP"-长链接跳转小程序；默认“WEIXINAPP”类型，即跳转至小程序； 
     * @return Endpoint 签署链接类型：“WEIXINAPP”-短链直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；"LONGURL2WEIXINAPP"-长链接跳转小程序；默认“WEIXINAPP”类型，即跳转至小程序；
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 签署链接类型：“WEIXINAPP”-短链直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；"LONGURL2WEIXINAPP"-长链接跳转小程序；默认“WEIXINAPP”类型，即跳转至小程序；
     * @param Endpoint 签署链接类型：“WEIXINAPP”-短链直接跳小程序；“CHANNEL”-跳转H5页面；“APP”-第三方APP或小程序跳转电子签小程序；"LONGURL2WEIXINAPP"-长链接跳转小程序；默认“WEIXINAPP”类型，即跳转至小程序；
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 签署链接生成类型，默认是 "ALL"；
"ALL"：全部签署方签署链接，此时不会给自动签署的签署方创建签署链接；
"CHANNEL"：渠道合作企业；
"NOT_CHANNEL"：非渠道合作企业；
"PERSON"：个人；
"FOLLOWER"：关注方，目前是合同抄送方； 
     * @return GenerateType 签署链接生成类型，默认是 "ALL"；
"ALL"：全部签署方签署链接，此时不会给自动签署的签署方创建签署链接；
"CHANNEL"：渠道合作企业；
"NOT_CHANNEL"：非渠道合作企业；
"PERSON"：个人；
"FOLLOWER"：关注方，目前是合同抄送方；
     */
    public String getGenerateType() {
        return this.GenerateType;
    }

    /**
     * Set 签署链接生成类型，默认是 "ALL"；
"ALL"：全部签署方签署链接，此时不会给自动签署的签署方创建签署链接；
"CHANNEL"：渠道合作企业；
"NOT_CHANNEL"：非渠道合作企业；
"PERSON"：个人；
"FOLLOWER"：关注方，目前是合同抄送方；
     * @param GenerateType 签署链接生成类型，默认是 "ALL"；
"ALL"：全部签署方签署链接，此时不会给自动签署的签署方创建签署链接；
"CHANNEL"：渠道合作企业；
"NOT_CHANNEL"：非渠道合作企业；
"PERSON"：个人；
"FOLLOWER"：关注方，目前是合同抄送方；
     */
    public void setGenerateType(String GenerateType) {
        this.GenerateType = GenerateType;
    }

    /**
     * Get 非渠道合作企业参与方的企业名称，GenerateType为"NOT_CHANNEL"时必填 
     * @return OrganizationName 非渠道合作企业参与方的企业名称，GenerateType为"NOT_CHANNEL"时必填
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 非渠道合作企业参与方的企业名称，GenerateType为"NOT_CHANNEL"时必填
     * @param OrganizationName 非渠道合作企业参与方的企业名称，GenerateType为"NOT_CHANNEL"时必填
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 参与人姓名，GenerateType为"PERSON"时必填 
     * @return Name 参与人姓名，GenerateType为"PERSON"时必填
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参与人姓名，GenerateType为"PERSON"时必填
     * @param Name 参与人姓名，GenerateType为"PERSON"时必填
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参与人手机号；
GenerateType为"PERSON"或"FOLLOWER"时必填 
     * @return Mobile 参与人手机号；
GenerateType为"PERSON"或"FOLLOWER"时必填
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 参与人手机号；
GenerateType为"PERSON"或"FOLLOWER"时必填
     * @param Mobile 参与人手机号；
GenerateType为"PERSON"或"FOLLOWER"时必填
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 渠道合作企业的企业Id，GenerateType为"CHANNEL"时必填 
     * @return OrganizationOpenId 渠道合作企业的企业Id，GenerateType为"CHANNEL"时必填
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 渠道合作企业的企业Id，GenerateType为"CHANNEL"时必填
     * @param OrganizationOpenId 渠道合作企业的企业Id，GenerateType为"CHANNEL"时必填
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 渠道合作企业参与人OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人 
     * @return OpenId 渠道合作企业参与人OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 渠道合作企业参与人OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人
     * @param OpenId 渠道合作企业参与人OpenId，GenerateType为"CHANNEL"时可用，指定到具体参与人
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
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
        if (source.FlowGroupId != null) {
            this.FlowGroupId = new String(source.FlowGroupId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.GenerateType != null) {
            this.GenerateType = new String(source.GenerateType);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.AutoJumpBack != null) {
            this.AutoJumpBack = new Boolean(source.AutoJumpBack);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
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
        this.setParamSimple(map, prefix + "FlowGroupId", this.FlowGroupId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "GenerateType", this.GenerateType);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "AutoJumpBack", this.AutoJumpBack);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

