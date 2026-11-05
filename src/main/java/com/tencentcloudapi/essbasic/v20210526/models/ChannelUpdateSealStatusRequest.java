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
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>印章状态，目前支持传入以下类型：</p><ul><li>ENABLE-启用印章</li><li>DISABLE-停用印章</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>印章ID</p>
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * <p>更新印章状态原因说明</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>操作者的信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>个性化配置字段，默认不传。</p>
    */
    @SerializedName("Options")
    @Expose
    private Option [] Options;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>印章状态，目前支持传入以下类型：</p><ul><li>ENABLE-启用印章</li><li>DISABLE-停用印章</li></ul> 
     * @return Status <p>印章状态，目前支持传入以下类型：</p><ul><li>ENABLE-启用印章</li><li>DISABLE-停用印章</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>印章状态，目前支持传入以下类型：</p><ul><li>ENABLE-启用印章</li><li>DISABLE-停用印章</li></ul>
     * @param Status <p>印章状态，目前支持传入以下类型：</p><ul><li>ENABLE-启用印章</li><li>DISABLE-停用印章</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>印章ID</p> 
     * @return SealId <p>印章ID</p>
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set <p>印章ID</p>
     * @param SealId <p>印章ID</p>
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get <p>更新印章状态原因说明</p> 
     * @return Reason <p>更新印章状态原因说明</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>更新印章状态原因说明</p>
     * @param Reason <p>更新印章状态原因说明</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>操作者的信息</p> 
     * @return Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者的信息</p>
     * @param Operator <p>操作者的信息</p>
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>个性化配置字段，默认不传。</p> 
     * @return Options <p>个性化配置字段，默认不传。</p>
     */
    public Option [] getOptions() {
        return this.Options;
    }

    /**
     * Set <p>个性化配置字段，默认不传。</p>
     * @param Options <p>个性化配置字段，默认不传。</p>
     */
    public void setOptions(Option [] Options) {
        this.Options = Options;
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
        if (source.Options != null) {
            this.Options = new Option[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new Option(source.Options[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

