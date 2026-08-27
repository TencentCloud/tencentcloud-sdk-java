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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DispenseCondition extends AbstractModel {

    /**
    * 对外指标名
    */
    @SerializedName("ExtMetric")
    @Expose
    private String ExtMetric;

    /**
    * 过滤条件表
    */
    @SerializedName("DispenseFilters")
    @Expose
    private DispenseFilter [] DispenseFilters;

    /**
    * 过滤条件id
    */
    @SerializedName("ConditionId")
    @Expose
    private Long ConditionId;

    /**
     * Get 对外指标名 
     * @return ExtMetric 对外指标名
     */
    public String getExtMetric() {
        return this.ExtMetric;
    }

    /**
     * Set 对外指标名
     * @param ExtMetric 对外指标名
     */
    public void setExtMetric(String ExtMetric) {
        this.ExtMetric = ExtMetric;
    }

    /**
     * Get 过滤条件表 
     * @return DispenseFilters 过滤条件表
     */
    public DispenseFilter [] getDispenseFilters() {
        return this.DispenseFilters;
    }

    /**
     * Set 过滤条件表
     * @param DispenseFilters 过滤条件表
     */
    public void setDispenseFilters(DispenseFilter [] DispenseFilters) {
        this.DispenseFilters = DispenseFilters;
    }

    /**
     * Get 过滤条件id 
     * @return ConditionId 过滤条件id
     */
    public Long getConditionId() {
        return this.ConditionId;
    }

    /**
     * Set 过滤条件id
     * @param ConditionId 过滤条件id
     */
    public void setConditionId(Long ConditionId) {
        this.ConditionId = ConditionId;
    }

    public DispenseCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DispenseCondition(DispenseCondition source) {
        if (source.ExtMetric != null) {
            this.ExtMetric = new String(source.ExtMetric);
        }
        if (source.DispenseFilters != null) {
            this.DispenseFilters = new DispenseFilter[source.DispenseFilters.length];
            for (int i = 0; i < source.DispenseFilters.length; i++) {
                this.DispenseFilters[i] = new DispenseFilter(source.DispenseFilters[i]);
            }
        }
        if (source.ConditionId != null) {
            this.ConditionId = new Long(source.ConditionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExtMetric", this.ExtMetric);
        this.setParamArrayObj(map, prefix + "DispenseFilters.", this.DispenseFilters);
        this.setParamSimple(map, prefix + "ConditionId", this.ConditionId);

    }
}

