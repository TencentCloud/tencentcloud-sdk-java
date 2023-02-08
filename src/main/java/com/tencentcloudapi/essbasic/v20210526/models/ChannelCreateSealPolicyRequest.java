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

public class ChannelCreateSealPolicyRequest extends AbstractModel{

    /**
    * 用户渠道信息
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 指定印章
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 指定待授权的用户ID数组
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 企业机构信息
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 操作人（用户）信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get 用户渠道信息 
     * @return Agent 用户渠道信息
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 用户渠道信息
     * @param Agent 用户渠道信息
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 指定印章 
     * @return SealId 指定印章
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 指定印章
     * @param SealId 指定印章
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 指定待授权的用户ID数组 
     * @return UserIds 指定待授权的用户ID数组
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 指定待授权的用户ID数组
     * @param UserIds 指定待授权的用户ID数组
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 企业机构信息 
     * @return Organization 企业机构信息
     */
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 企业机构信息
     * @param Organization 企业机构信息
     */
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 操作人（用户）信息 
     * @return Operator 操作人（用户）信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人（用户）信息
     * @param Operator 操作人（用户）信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelCreateSealPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateSealPolicyRequest(ChannelCreateSealPolicyRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
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
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

