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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricTags extends AbstractModel {

    /**
    * 指标单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标Type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 指标单位 
     * @return Unit 指标单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 指标单位
     * @param Unit 指标单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * Get 指标Type 
     * @return Type 指标Type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指标Type
     * @param Type 指标Type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public MetricTags() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricTags(MetricTags source) {
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

