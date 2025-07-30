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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLifecyclePolicyRequest extends AbstractModel {

    /**
    * 生命周期管理策略名称，中文/英文/数字/下划线/中划线的组合，不超过64个字符
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * 生命周期管理策略关联的管理规则列表
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
    * 生命周期管理策略ID
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
     * Get 生命周期管理策略名称，中文/英文/数字/下划线/中划线的组合，不超过64个字符 
     * @return LifecyclePolicyName 生命周期管理策略名称，中文/英文/数字/下划线/中划线的组合，不超过64个字符
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set 生命周期管理策略名称，中文/英文/数字/下划线/中划线的组合，不超过64个字符
     * @param LifecyclePolicyName 生命周期管理策略名称，中文/英文/数字/下划线/中划线的组合，不超过64个字符
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get 生命周期管理策略关联的管理规则列表 
     * @return LifecycleRules 生命周期管理策略关联的管理规则列表
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set 生命周期管理策略关联的管理规则列表
     * @param LifecycleRules 生命周期管理策略关联的管理规则列表
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    /**
     * Get 生命周期管理策略ID 
     * @return LifecyclePolicyID 生命周期管理策略ID
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set 生命周期管理策略ID
     * @param LifecyclePolicyID 生命周期管理策略ID
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    public ModifyLifecyclePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLifecyclePolicyRequest(ModifyLifecyclePolicyRequest source) {
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);

    }
}

