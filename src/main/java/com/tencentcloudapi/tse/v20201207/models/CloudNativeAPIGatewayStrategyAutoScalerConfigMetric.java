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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudNativeAPIGatewayStrategyAutoScalerConfigMetric extends AbstractModel {

    /**
    * 指标类型
- Resource
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 指标资源名称
- cpu
- memory
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 指标目标类型，目前只支持百分比Utilization
    */
    @SerializedName("TargetType")
    @Expose
    private String TargetType;

    /**
    * 指标目标值
    */
    @SerializedName("TargetValue")
    @Expose
    private Long TargetValue;

    /**
     * Get 指标类型
- Resource 
     * @return Type 指标类型
- Resource
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指标类型
- Resource
     * @param Type 指标类型
- Resource
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 指标资源名称
- cpu
- memory 
     * @return ResourceName 指标资源名称
- cpu
- memory
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 指标资源名称
- cpu
- memory
     * @param ResourceName 指标资源名称
- cpu
- memory
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 指标目标类型，目前只支持百分比Utilization 
     * @return TargetType 指标目标类型，目前只支持百分比Utilization
     */
    public String getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 指标目标类型，目前只支持百分比Utilization
     * @param TargetType 指标目标类型，目前只支持百分比Utilization
     */
    public void setTargetType(String TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 指标目标值 
     * @return TargetValue 指标目标值
     */
    public Long getTargetValue() {
        return this.TargetValue;
    }

    /**
     * Set 指标目标值
     * @param TargetValue 指标目标值
     */
    public void setTargetValue(Long TargetValue) {
        this.TargetValue = TargetValue;
    }

    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudNativeAPIGatewayStrategyAutoScalerConfigMetric(CloudNativeAPIGatewayStrategyAutoScalerConfigMetric source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.TargetType != null) {
            this.TargetType = new String(source.TargetType);
        }
        if (source.TargetValue != null) {
            this.TargetValue = new Long(source.TargetValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "TargetValue", this.TargetValue);

    }
}

