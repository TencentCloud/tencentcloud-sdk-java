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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessFieldValueRatioInfo extends AbstractModel {

    /**
    * 日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 对应的Value值的百分比
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
    * 字段对应的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 日志条数 
     * @return Count 日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 日志条数
     * @param Count 日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 对应的Value值的百分比 
     * @return Ratio 对应的Value值的百分比
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * Set 对应的Value值的百分比
     * @param Ratio 对应的Value值的百分比
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * Get 字段对应的值 
     * @return Value 字段对应的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段对应的值
     * @param Value 字段对应的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AccessFieldValueRatioInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessFieldValueRatioInfo(AccessFieldValueRatioInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Ratio != null) {
            this.Ratio = new Float(source.Ratio);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

