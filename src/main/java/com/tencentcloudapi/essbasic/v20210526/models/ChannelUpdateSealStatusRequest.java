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

public class ChannelUpdateSealStatusRequest extends AbstractModel{

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 操作的印章状态，DISABLE-停用印章
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
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 操作的印章状态，DISABLE-停用印章 
     * @return Status 操作的印章状态，DISABLE-停用印章
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 操作的印章状态，DISABLE-停用印章
     * @param Status 操作的印章状态，DISABLE-停用印章
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

