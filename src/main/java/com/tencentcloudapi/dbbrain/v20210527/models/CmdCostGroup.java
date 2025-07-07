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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmdCostGroup extends AbstractModel {

    /**
    * 该延迟区间内命令数占总命令数百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
    * 延迟区间上界，单位ms
    */
    @SerializedName("CostUpperLimit")
    @Expose
    private String CostUpperLimit;

    /**
    * 延迟区间下界，单位ms
    */
    @SerializedName("CostLowerLimit")
    @Expose
    private String CostLowerLimit;

    /**
    * 该延迟区间内命令次数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 该延迟区间内命令数占总命令数百分比 
     * @return Percent 该延迟区间内命令数占总命令数百分比
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * Set 该延迟区间内命令数占总命令数百分比
     * @param Percent 该延迟区间内命令数占总命令数百分比
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * Get 延迟区间上界，单位ms 
     * @return CostUpperLimit 延迟区间上界，单位ms
     */
    public String getCostUpperLimit() {
        return this.CostUpperLimit;
    }

    /**
     * Set 延迟区间上界，单位ms
     * @param CostUpperLimit 延迟区间上界，单位ms
     */
    public void setCostUpperLimit(String CostUpperLimit) {
        this.CostUpperLimit = CostUpperLimit;
    }

    /**
     * Get 延迟区间下界，单位ms 
     * @return CostLowerLimit 延迟区间下界，单位ms
     */
    public String getCostLowerLimit() {
        return this.CostLowerLimit;
    }

    /**
     * Set 延迟区间下界，单位ms
     * @param CostLowerLimit 延迟区间下界，单位ms
     */
    public void setCostLowerLimit(String CostLowerLimit) {
        this.CostLowerLimit = CostLowerLimit;
    }

    /**
     * Get 该延迟区间内命令次数 
     * @return Count 该延迟区间内命令次数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该延迟区间内命令次数
     * @param Count 该延迟区间内命令次数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public CmdCostGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmdCostGroup(CmdCostGroup source) {
        if (source.Percent != null) {
            this.Percent = new Float(source.Percent);
        }
        if (source.CostUpperLimit != null) {
            this.CostUpperLimit = new String(source.CostUpperLimit);
        }
        if (source.CostLowerLimit != null) {
            this.CostLowerLimit = new String(source.CostLowerLimit);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CostUpperLimit", this.CostUpperLimit);
        this.setParamSimple(map, prefix + "CostLowerLimit", this.CostLowerLimit);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

