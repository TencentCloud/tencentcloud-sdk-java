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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetachUserPolicyRequest extends AbstractModel {

    /**
    * <p>用户Id，和CAM侧Uin匹配</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>解绑的权限集合</p>
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * <p>要授权的策略列表</p>
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get <p>用户Id，和CAM侧Uin匹配</p> 
     * @return UserId <p>用户Id，和CAM侧Uin匹配</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户Id，和CAM侧Uin匹配</p>
     * @param UserId <p>用户Id，和CAM侧Uin匹配</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>解绑的权限集合</p> 
     * @return PolicySet <p>解绑的权限集合</p>
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set <p>解绑的权限集合</p>
     * @param PolicySet <p>解绑的权限集合</p>
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p> 
     * @return AccountType <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     * @param AccountType <p>用户来源类型TencentAccount（普通腾讯云用户） / EntraAccount（微软用户）</p>
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get <p>要授权的策略列表</p> 
     * @return PolicyIds <p>要授权的策略列表</p>
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set <p>要授权的策略列表</p>
     * @param PolicyIds <p>要授权的策略列表</p>
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public DetachUserPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetachUserPolicyRequest(DetachUserPolicyRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

