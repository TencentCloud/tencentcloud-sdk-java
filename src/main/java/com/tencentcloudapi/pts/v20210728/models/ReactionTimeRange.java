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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReactionTimeRange extends AbstractModel{

    /**
    * 最小响应时间，单位ms
    */
    @SerializedName("Min")
    @Expose
    private String Min;

    /**
    * 最大响应时间，单位ms
    */
    @SerializedName("Max")
    @Expose
    private String Max;

    /**
     * Get 最小响应时间，单位ms 
     * @return Min 最小响应时间，单位ms
     */
    public String getMin() {
        return this.Min;
    }

    /**
     * Set 最小响应时间，单位ms
     * @param Min 最小响应时间，单位ms
     */
    public void setMin(String Min) {
        this.Min = Min;
    }

    /**
     * Get 最大响应时间，单位ms 
     * @return Max 最大响应时间，单位ms
     */
    public String getMax() {
        return this.Max;
    }

    /**
     * Set 最大响应时间，单位ms
     * @param Max 最大响应时间，单位ms
     */
    public void setMax(String Max) {
        this.Max = Max;
    }

    public ReactionTimeRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReactionTimeRange(ReactionTimeRange source) {
        if (source.Min != null) {
            this.Min = new String(source.Min);
        }
        if (source.Max != null) {
            this.Max = new String(source.Max);
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

