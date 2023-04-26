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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingSpecsRequest extends AbstractModel{

    /**
    * 枚举值：TRAIN、NOTEBOOK、INFERENCE
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 资源类型：CALC 计算资源、CPU CPU资源、GPU GPU资源、CBS云硬盘
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 枚举值：TRAIN、NOTEBOOK、INFERENCE 
     * @return TaskType 枚举值：TRAIN、NOTEBOOK、INFERENCE
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 枚举值：TRAIN、NOTEBOOK、INFERENCE
     * @param TaskType 枚举值：TRAIN、NOTEBOOK、INFERENCE
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月 
     * @return ChargeType 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月
     * @param ChargeType 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 资源类型：CALC 计算资源、CPU CPU资源、GPU GPU资源、CBS云硬盘 
     * @return ResourceType 资源类型：CALC 计算资源、CPU CPU资源、GPU GPU资源、CBS云硬盘
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：CALC 计算资源、CPU CPU资源、GPU GPU资源、CBS云硬盘
     * @param ResourceType 资源类型：CALC 计算资源、CPU CPU资源、GPU GPU资源、CBS云硬盘
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeBillingSpecsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillingSpecsRequest(DescribeBillingSpecsRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

