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

public class DeleteSealPoliciesRequest extends AbstractModel{

    /**
    * 调用方用户信息，userId 必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 印章授权编码数组。这个参数跟下面的SealId其中一个必填，另外一个可选填
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
    * 印章ID。这个参数跟上面的PolicyIds其中一个必填，另外一个可选填
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 待授权的员工ID
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 调用方用户信息，userId 必填 
     * @return Operator 调用方用户信息，userId 必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 调用方用户信息，userId 必填
     * @param Operator 调用方用户信息，userId 必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 印章授权编码数组。这个参数跟下面的SealId其中一个必填，另外一个可选填 
     * @return PolicyIds 印章授权编码数组。这个参数跟下面的SealId其中一个必填，另外一个可选填
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 印章授权编码数组。这个参数跟下面的SealId其中一个必填，另外一个可选填
     * @param PolicyIds 印章授权编码数组。这个参数跟下面的SealId其中一个必填，另外一个可选填
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 印章ID。这个参数跟上面的PolicyIds其中一个必填，另外一个可选填 
     * @return SealId 印章ID。这个参数跟上面的PolicyIds其中一个必填，另外一个可选填
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 印章ID。这个参数跟上面的PolicyIds其中一个必填，另外一个可选填
     * @param SealId 印章ID。这个参数跟上面的PolicyIds其中一个必填，另外一个可选填
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 待授权的员工ID 
     * @return UserIds 待授权的员工ID
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 待授权的员工ID
     * @param UserIds 待授权的员工ID
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
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

    public DeleteSealPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSealPoliciesRequest(DeleteSealPoliciesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

