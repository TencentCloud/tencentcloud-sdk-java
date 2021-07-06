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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGrantServiceAccessPolicy extends AbstractModel{

    /**
    * 策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 策略名
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 策略类型: Custom自定义策略，Presetting预设策略
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略描述
    */
    @SerializedName("PolicyDescription")
    @Expose
    private String PolicyDescription;

    /**
     * Get 策略ID 
     * @return PolicyId 策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID
     * @param PolicyId 策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 策略名 
     * @return PolicyName 策略名
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名
     * @param PolicyName 策略名
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 策略类型: Custom自定义策略，Presetting预设策略 
     * @return PolicyType 策略类型: Custom自定义策略，Presetting预设策略
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型: Custom自定义策略，Presetting预设策略
     * @param PolicyType 策略类型: Custom自定义策略，Presetting预设策略
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略描述 
     * @return PolicyDescription 策略描述
     */
    public String getPolicyDescription() {
        return this.PolicyDescription;
    }

    /**
     * Set 策略描述
     * @param PolicyDescription 策略描述
     */
    public void setPolicyDescription(String PolicyDescription) {
        this.PolicyDescription = PolicyDescription;
    }

    public ListGrantServiceAccessPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGrantServiceAccessPolicy(ListGrantServiceAccessPolicy source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyDescription != null) {
            this.PolicyDescription = new String(source.PolicyDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyDescription", this.PolicyDescription);

    }
}

