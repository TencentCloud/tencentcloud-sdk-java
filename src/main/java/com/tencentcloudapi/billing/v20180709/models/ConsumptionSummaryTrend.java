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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumptionSummaryTrend extends AbstractModel {

    /**
    * 趋势类型，upward上升/downward下降/none无
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 趋势值，Type为none是该字段值为null
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 趋势类型，upward上升/downward下降/none无 
     * @return Type 趋势类型，upward上升/downward下降/none无
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 趋势类型，upward上升/downward下降/none无
     * @param Type 趋势类型，upward上升/downward下降/none无
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 趋势值，Type为none是该字段值为null 
     * @return Value 趋势值，Type为none是该字段值为null
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 趋势值，Type为none是该字段值为null
     * @param Value 趋势值，Type为none是该字段值为null
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public ConsumptionSummaryTrend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumptionSummaryTrend(ConsumptionSummaryTrend source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

