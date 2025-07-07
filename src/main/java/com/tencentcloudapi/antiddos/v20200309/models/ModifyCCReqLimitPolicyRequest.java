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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCCReqLimitPolicyRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略项
    */
    @SerializedName("Policy")
    @Expose
    private CCReqLimitPolicyRecord Policy;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略项 
     * @return Policy 策略项
     */
    public CCReqLimitPolicyRecord getPolicy() {
        return this.Policy;
    }

    /**
     * Set 策略项
     * @param Policy 策略项
     */
    public void setPolicy(CCReqLimitPolicyRecord Policy) {
        this.Policy = Policy;
    }

    public ModifyCCReqLimitPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCCReqLimitPolicyRequest(ModifyCCReqLimitPolicyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.Policy != null) {
            this.Policy = new CCReqLimitPolicyRecord(source.Policy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamObj(map, prefix + "Policy.", this.Policy);

    }
}

