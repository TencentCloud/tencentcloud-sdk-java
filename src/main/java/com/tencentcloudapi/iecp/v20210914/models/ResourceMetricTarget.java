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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceMetricTarget extends AbstractModel{

    /**
    * 类型(cpu|memory)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 平均值
    */
    @SerializedName("AverageValue")
    @Expose
    private Long AverageValue;

    /**
    * 单位
    */
    @SerializedName("Scale")
    @Expose
    private String Scale;

    /**
    * 平均值
    */
    @SerializedName("AverageUtilization")
    @Expose
    private Long AverageUtilization;

    /**
     * Get 类型(cpu|memory) 
     * @return Type 类型(cpu|memory)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型(cpu|memory)
     * @param Type 类型(cpu|memory)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 平均值 
     * @return AverageValue 平均值
     */
    public Long getAverageValue() {
        return this.AverageValue;
    }

    /**
     * Set 平均值
     * @param AverageValue 平均值
     */
    public void setAverageValue(Long AverageValue) {
        this.AverageValue = AverageValue;
    }

    /**
     * Get 单位 
     * @return Scale 单位
     */
    public String getScale() {
        return this.Scale;
    }

    /**
     * Set 单位
     * @param Scale 单位
     */
    public void setScale(String Scale) {
        this.Scale = Scale;
    }

    /**
     * Get 平均值 
     * @return AverageUtilization 平均值
     */
    public Long getAverageUtilization() {
        return this.AverageUtilization;
    }

    /**
     * Set 平均值
     * @param AverageUtilization 平均值
     */
    public void setAverageUtilization(Long AverageUtilization) {
        this.AverageUtilization = AverageUtilization;
    }

    public ResourceMetricTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceMetricTarget(ResourceMetricTarget source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.AverageValue != null) {
            this.AverageValue = new Long(source.AverageValue);
        }
        if (source.Scale != null) {
            this.Scale = new String(source.Scale);
        }
        if (source.AverageUtilization != null) {
            this.AverageUtilization = new Long(source.AverageUtilization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "AverageValue", this.AverageValue);
        this.setParamSimple(map, prefix + "Scale", this.Scale);
        this.setParamSimple(map, prefix + "AverageUtilization", this.AverageUtilization);

    }
}

