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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoScalerPolicy extends AbstractModel {

    /**
    * 类型，Pods
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数量
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 扩容周期
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
     * Get 类型，Pods 
     * @return Type 类型，Pods
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，Pods
     * @param Type 类型，Pods
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数量 
     * @return Value 数量
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 数量
     * @param Value 数量
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 扩容周期 
     * @return PeriodSeconds 扩容周期
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set 扩容周期
     * @param PeriodSeconds 扩容周期
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    public AutoScalerPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalerPolicy(AutoScalerPolicy source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);

    }
}

