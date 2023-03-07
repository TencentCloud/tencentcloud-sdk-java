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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBaselinePolicyStateRequest extends AbstractModel{

    /**
    * 策略Id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 开启状态[1:开启|0:未开启]
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
     * Get 策略Id 
     * @return PolicyId 策略Id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略Id
     * @param PolicyId 策略Id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 开启状态[1:开启|0:未开启] 
     * @return IsEnabled 开启状态[1:开启|0:未开启]
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 开启状态[1:开启|0:未开启]
     * @param IsEnabled 开启状态[1:开启|0:未开启]
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    public ModifyBaselinePolicyStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselinePolicyStateRequest(ModifyBaselinePolicyStateRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);

    }
}

