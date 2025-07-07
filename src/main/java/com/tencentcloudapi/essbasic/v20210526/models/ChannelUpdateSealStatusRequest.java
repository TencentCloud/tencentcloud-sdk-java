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

public class ChannelUpdateSealStatusRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 印章状态，目前支持传入以下类型：
<ul><li>DISABLE-停用印章</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 印章ID
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 更新印章状态原因说明
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 操作者的信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 印章状态，目前支持传入以下类型：
<ul><li>DISABLE-停用印章</li></ul> 
     * @return Status 印章状态，目前支持传入以下类型：
<ul><li>DISABLE-停用印章</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 印章状态，目前支持传入以下类型：
<ul><li>DISABLE-停用印章</li></ul>
     * @param Status 印章状态，目前支持传入以下类型：
<ul><li>DISABLE-停用印章</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 印章ID 
     * @return SealId 印章ID
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID
     * @param SealId 印章ID
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 更新印章状态原因说明 
     * @return Reason 更新印章状态原因说明
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 更新印章状态原因说明
     * @param Reason 更新印章状态原因说明
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 操作者的信息 
     * @return Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者的信息
     * @param Operator 操作者的信息
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelUpdateSealStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelUpdateSealStatusRequest(ChannelUpdateSealStatusRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

