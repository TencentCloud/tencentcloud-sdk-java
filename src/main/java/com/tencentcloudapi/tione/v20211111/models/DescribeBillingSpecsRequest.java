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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillingSpecsRequest extends AbstractModel {

    /**
    * 付费模式：POSTPAID_BY_HOUR按量计费、PREPAID包年包月
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 资源类型：["", "CALC", "CPU", "GPU", "GPU-SW"]
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

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
     * Get 枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS 
     * @return TaskType 枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS
     * @param TaskType 枚举值：空、TRAIN、NOTEBOOK、INFERENCE或EMS
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 资源类型：["", "CALC", "CPU", "GPU", "GPU-SW"] 
     * @return ResourceType 资源类型：["", "CALC", "CPU", "GPU", "GPU-SW"]
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型：["", "CALC", "CPU", "GPU", "GPU-SW"]
     * @param ResourceType 资源类型：["", "CALC", "CPU", "GPU", "GPU-SW"]
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
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

