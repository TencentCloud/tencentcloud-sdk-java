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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowStatisticsArray extends AbstractModel{

    /**
    * 时间戳。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 每个会话的统计数据。
    */
    @SerializedName("FlowStatistics")
    @Expose
    private FlowStatistics [] FlowStatistics;

    /**
     * Get 时间戳。 
     * @return Timestamp 时间戳。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间戳。
     * @param Timestamp 时间戳。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 每个会话的统计数据。 
     * @return FlowStatistics 每个会话的统计数据。
     */
    public FlowStatistics [] getFlowStatistics() {
        return this.FlowStatistics;
    }

    /**
     * Set 每个会话的统计数据。
     * @param FlowStatistics 每个会话的统计数据。
     */
    public void setFlowStatistics(FlowStatistics [] FlowStatistics) {
        this.FlowStatistics = FlowStatistics;
    }

    public FlowStatisticsArray() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowStatisticsArray(FlowStatisticsArray source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.FlowStatistics != null) {
            this.FlowStatistics = new FlowStatistics[source.FlowStatistics.length];
            for (int i = 0; i < source.FlowStatistics.length; i++) {
                this.FlowStatistics[i] = new FlowStatistics(source.FlowStatistics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "FlowStatistics.", this.FlowStatistics);

    }
}

