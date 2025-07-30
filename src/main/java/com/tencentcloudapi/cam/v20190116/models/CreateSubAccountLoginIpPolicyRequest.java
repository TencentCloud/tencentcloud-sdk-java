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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubAccountLoginIpPolicyRequest extends AbstractModel {

    /**
    * IP策略集合
    */
    @SerializedName("IpPolicies")
    @Expose
    private IpPolicy [] IpPolicies;

    /**
    * 审批人类型，目前支持的类型有：SubAccountLoginLimitApproval（子账号登录限制审批）
    */
    @SerializedName("ApproverType")
    @Expose
    private String ApproverType;

    /**
    * 被添加为协助审批人的账号ID数组
    */
    @SerializedName("ApproverUin")
    @Expose
    private Long [] ApproverUin;

    /**
    * 是否禁用策略：0：不禁用，1：禁用
    */
    @SerializedName("DisablePolicy")
    @Expose
    private Long DisablePolicy;

    /**
    * 策略类型：1：更新IP策略，2：设置异地登录校验校验规则
    */
    @SerializedName("PolicyType")
    @Expose
    private Long PolicyType;

    /**
     * Get IP策略集合 
     * @return IpPolicies IP策略集合
     */
    public IpPolicy [] getIpPolicies() {
        return this.IpPolicies;
    }

    /**
     * Set IP策略集合
     * @param IpPolicies IP策略集合
     */
    public void setIpPolicies(IpPolicy [] IpPolicies) {
        this.IpPolicies = IpPolicies;
    }

    /**
     * Get 审批人类型，目前支持的类型有：SubAccountLoginLimitApproval（子账号登录限制审批） 
     * @return ApproverType 审批人类型，目前支持的类型有：SubAccountLoginLimitApproval（子账号登录限制审批）
     */
    public String getApproverType() {
        return this.ApproverType;
    }

    /**
     * Set 审批人类型，目前支持的类型有：SubAccountLoginLimitApproval（子账号登录限制审批）
     * @param ApproverType 审批人类型，目前支持的类型有：SubAccountLoginLimitApproval（子账号登录限制审批）
     */
    public void setApproverType(String ApproverType) {
        this.ApproverType = ApproverType;
    }

    /**
     * Get 被添加为协助审批人的账号ID数组 
     * @return ApproverUin 被添加为协助审批人的账号ID数组
     */
    public Long [] getApproverUin() {
        return this.ApproverUin;
    }

    /**
     * Set 被添加为协助审批人的账号ID数组
     * @param ApproverUin 被添加为协助审批人的账号ID数组
     */
    public void setApproverUin(Long [] ApproverUin) {
        this.ApproverUin = ApproverUin;
    }

    /**
     * Get 是否禁用策略：0：不禁用，1：禁用 
     * @return DisablePolicy 是否禁用策略：0：不禁用，1：禁用
     */
    public Long getDisablePolicy() {
        return this.DisablePolicy;
    }

    /**
     * Set 是否禁用策略：0：不禁用，1：禁用
     * @param DisablePolicy 是否禁用策略：0：不禁用，1：禁用
     */
    public void setDisablePolicy(Long DisablePolicy) {
        this.DisablePolicy = DisablePolicy;
    }

    /**
     * Get 策略类型：1：更新IP策略，2：设置异地登录校验校验规则 
     * @return PolicyType 策略类型：1：更新IP策略，2：设置异地登录校验校验规则
     */
    public Long getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型：1：更新IP策略，2：设置异地登录校验校验规则
     * @param PolicyType 策略类型：1：更新IP策略，2：设置异地登录校验校验规则
     */
    public void setPolicyType(Long PolicyType) {
        this.PolicyType = PolicyType;
    }

    public CreateSubAccountLoginIpPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubAccountLoginIpPolicyRequest(CreateSubAccountLoginIpPolicyRequest source) {
        if (source.IpPolicies != null) {
            this.IpPolicies = new IpPolicy[source.IpPolicies.length];
            for (int i = 0; i < source.IpPolicies.length; i++) {
                this.IpPolicies[i] = new IpPolicy(source.IpPolicies[i]);
            }
        }
        if (source.ApproverType != null) {
            this.ApproverType = new String(source.ApproverType);
        }
        if (source.ApproverUin != null) {
            this.ApproverUin = new Long[source.ApproverUin.length];
            for (int i = 0; i < source.ApproverUin.length; i++) {
                this.ApproverUin[i] = new Long(source.ApproverUin[i]);
            }
        }
        if (source.DisablePolicy != null) {
            this.DisablePolicy = new Long(source.DisablePolicy);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new Long(source.PolicyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IpPolicies.", this.IpPolicies);
        this.setParamSimple(map, prefix + "ApproverType", this.ApproverType);
        this.setParamArraySimple(map, prefix + "ApproverUin.", this.ApproverUin);
        this.setParamSimple(map, prefix + "DisablePolicy", this.DisablePolicy);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);

    }
}

