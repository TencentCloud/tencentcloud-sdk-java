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

public class StatisticDataInfo extends AbstractModel {

    /**
    * 统计维度的值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 平均时间。
    */
    @SerializedName("TimeAvg")
    @Expose
    private Float TimeAvg;

    /**
    * 总时间。
    */
    @SerializedName("TimeSum")
    @Expose
    private Float TimeSum;

    /**
    * 数量。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 统计维度的值。 
     * @return Name 统计维度的值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 统计维度的值。
     * @param Name 统计维度的值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 平均时间。 
     * @return TimeAvg 平均时间。
     */
    public Float getTimeAvg() {
        return this.TimeAvg;
    }

    /**
     * Set 平均时间。
     * @param TimeAvg 平均时间。
     */
    public void setTimeAvg(Float TimeAvg) {
        this.TimeAvg = TimeAvg;
    }

    /**
     * Get 总时间。 
     * @return TimeSum 总时间。
     */
    public Float getTimeSum() {
        return this.TimeSum;
    }

    /**
     * Set 总时间。
     * @param TimeSum 总时间。
     */
    public void setTimeSum(Float TimeSum) {
        this.TimeSum = TimeSum;
    }

    /**
     * Get 数量。 
     * @return Count 数量。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数量。
     * @param Count 数量。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public StatisticDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatisticDataInfo(StatisticDataInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TimeAvg != null) {
            this.TimeAvg = new Float(source.TimeAvg);
        }
        if (source.TimeSum != null) {
            this.TimeSum = new Float(source.TimeSum);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TimeAvg", this.TimeAvg);
        this.setParamSimple(map, prefix + "TimeSum", this.TimeSum);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

