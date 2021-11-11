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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceMetricSource extends AbstractModel{

    /**
    * 资源名称 cpu/memory
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 目标平均利用率
    */
    @SerializedName("TargetAverageUtilization")
    @Expose
    private Long TargetAverageUtilization;

    /**
    * 目标平均值
    */
    @SerializedName("TargetAverageValue")
    @Expose
    private String TargetAverageValue;

    /**
     * Get 资源名称 cpu/memory 
     * @return Name 资源名称 cpu/memory
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称 cpu/memory
     * @param Name 资源名称 cpu/memory
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 目标平均利用率 
     * @return TargetAverageUtilization 目标平均利用率
     */
    public Long getTargetAverageUtilization() {
        return this.TargetAverageUtilization;
    }

    /**
     * Set 目标平均利用率
     * @param TargetAverageUtilization 目标平均利用率
     */
    public void setTargetAverageUtilization(Long TargetAverageUtilization) {
        this.TargetAverageUtilization = TargetAverageUtilization;
    }

    /**
     * Get 目标平均值 
     * @return TargetAverageValue 目标平均值
     */
    public String getTargetAverageValue() {
        return this.TargetAverageValue;
    }

    /**
     * Set 目标平均值
     * @param TargetAverageValue 目标平均值
     */
    public void setTargetAverageValue(String TargetAverageValue) {
        this.TargetAverageValue = TargetAverageValue;
    }

    public ResourceMetricSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceMetricSource(ResourceMetricSource source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TargetAverageUtilization != null) {
            this.TargetAverageUtilization = new Long(source.TargetAverageUtilization);
        }
        if (source.TargetAverageValue != null) {
            this.TargetAverageValue = new String(source.TargetAverageValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TargetAverageUtilization", this.TargetAverageUtilization);
        this.setParamSimple(map, prefix + "TargetAverageValue", this.TargetAverageValue);

    }
}

