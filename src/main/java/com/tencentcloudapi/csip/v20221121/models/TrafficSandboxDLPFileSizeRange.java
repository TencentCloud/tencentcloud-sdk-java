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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficSandboxDLPFileSizeRange extends AbstractModel {

    /**
    * 下限，单位 Byte；0 表示无下限
    */
    @SerializedName("Min")
    @Expose
    private Long Min;

    /**
    * 上限，单位 Byte；0 表示无上限
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
     * Get 下限，单位 Byte；0 表示无下限 
     * @return Min 下限，单位 Byte；0 表示无下限
     */
    public Long getMin() {
        return this.Min;
    }

    /**
     * Set 下限，单位 Byte；0 表示无下限
     * @param Min 下限，单位 Byte；0 表示无下限
     */
    public void setMin(Long Min) {
        this.Min = Min;
    }

    /**
     * Get 上限，单位 Byte；0 表示无上限 
     * @return Max 上限，单位 Byte；0 表示无上限
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 上限，单位 Byte；0 表示无上限
     * @param Max 上限，单位 Byte；0 表示无上限
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    public TrafficSandboxDLPFileSizeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficSandboxDLPFileSizeRange(TrafficSandboxDLPFileSizeRange source) {
        if (source.Min != null) {
            this.Min = new Long(source.Min);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Min", this.Min);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

