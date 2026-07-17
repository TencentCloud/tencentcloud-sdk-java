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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceManualInstanceConfig extends AbstractModel {

    /**
    * 固定实例数量。
    */
    @SerializedName("FixedInstanceCount")
    @Expose
    private Long FixedInstanceCount;

    /**
     * Get 固定实例数量。 
     * @return FixedInstanceCount 固定实例数量。
     */
    public Long getFixedInstanceCount() {
        return this.FixedInstanceCount;
    }

    /**
     * Set 固定实例数量。
     * @param FixedInstanceCount 固定实例数量。
     */
    public void setFixedInstanceCount(Long FixedInstanceCount) {
        this.FixedInstanceCount = FixedInstanceCount;
    }

    public InferenceManualInstanceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceManualInstanceConfig(InferenceManualInstanceConfig source) {
        if (source.FixedInstanceCount != null) {
            this.FixedInstanceCount = new Long(source.FixedInstanceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FixedInstanceCount", this.FixedInstanceCount);

    }
}

