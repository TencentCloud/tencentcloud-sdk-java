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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteThrottleRuleRequest extends AbstractModel {

    /**
    * 限流规则Id
    */
    @SerializedName("ThrottleRuleId")
    @Expose
    private String ThrottleRuleId;

    /**
    * 实例标识
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 限流规则Id 
     * @return ThrottleRuleId 限流规则Id
     */
    public String getThrottleRuleId() {
        return this.ThrottleRuleId;
    }

    /**
     * Set 限流规则Id
     * @param ThrottleRuleId 限流规则Id
     */
    public void setThrottleRuleId(String ThrottleRuleId) {
        this.ThrottleRuleId = ThrottleRuleId;
    }

    /**
     * Get 实例标识 
     * @return InstanceId 实例标识
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例标识
     * @param InstanceId 实例标识
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public DeleteThrottleRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteThrottleRuleRequest(DeleteThrottleRuleRequest source) {
        if (source.ThrottleRuleId != null) {
            this.ThrottleRuleId = new String(source.ThrottleRuleId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ThrottleRuleId", this.ThrottleRuleId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

