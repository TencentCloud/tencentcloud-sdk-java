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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineOverviewStatistic extends AbstractModel {

    /**
    * <p>当前未通过的检测项总数（含主机和容器集群）。</p>
    */
    @SerializedName("NotPassItemCount")
    @Expose
    private Long NotPassItemCount;

    /**
    * <p>未通过检测项按策略分组的统计列表。</p>
    */
    @SerializedName("NotPassItemStatistic")
    @Expose
    private NotPassItemStatistic [] NotPassItemStatistic;

    /**
    * <p>近一年累计已修复的基线风险数量。</p>
    */
    @SerializedName("LastYearFixCount")
    @Expose
    private Long LastYearFixCount;

    /**
     * Get <p>当前未通过的检测项总数（含主机和容器集群）。</p> 
     * @return NotPassItemCount <p>当前未通过的检测项总数（含主机和容器集群）。</p>
     */
    public Long getNotPassItemCount() {
        return this.NotPassItemCount;
    }

    /**
     * Set <p>当前未通过的检测项总数（含主机和容器集群）。</p>
     * @param NotPassItemCount <p>当前未通过的检测项总数（含主机和容器集群）。</p>
     */
    public void setNotPassItemCount(Long NotPassItemCount) {
        this.NotPassItemCount = NotPassItemCount;
    }

    /**
     * Get <p>未通过检测项按策略分组的统计列表。</p> 
     * @return NotPassItemStatistic <p>未通过检测项按策略分组的统计列表。</p>
     */
    public NotPassItemStatistic [] getNotPassItemStatistic() {
        return this.NotPassItemStatistic;
    }

    /**
     * Set <p>未通过检测项按策略分组的统计列表。</p>
     * @param NotPassItemStatistic <p>未通过检测项按策略分组的统计列表。</p>
     */
    public void setNotPassItemStatistic(NotPassItemStatistic [] NotPassItemStatistic) {
        this.NotPassItemStatistic = NotPassItemStatistic;
    }

    /**
     * Get <p>近一年累计已修复的基线风险数量。</p> 
     * @return LastYearFixCount <p>近一年累计已修复的基线风险数量。</p>
     */
    public Long getLastYearFixCount() {
        return this.LastYearFixCount;
    }

    /**
     * Set <p>近一年累计已修复的基线风险数量。</p>
     * @param LastYearFixCount <p>近一年累计已修复的基线风险数量。</p>
     */
    public void setLastYearFixCount(Long LastYearFixCount) {
        this.LastYearFixCount = LastYearFixCount;
    }

    public BaselineOverviewStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineOverviewStatistic(BaselineOverviewStatistic source) {
        if (source.NotPassItemCount != null) {
            this.NotPassItemCount = new Long(source.NotPassItemCount);
        }
        if (source.NotPassItemStatistic != null) {
            this.NotPassItemStatistic = new NotPassItemStatistic[source.NotPassItemStatistic.length];
            for (int i = 0; i < source.NotPassItemStatistic.length; i++) {
                this.NotPassItemStatistic[i] = new NotPassItemStatistic(source.NotPassItemStatistic[i]);
            }
        }
        if (source.LastYearFixCount != null) {
            this.LastYearFixCount = new Long(source.LastYearFixCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NotPassItemCount", this.NotPassItemCount);
        this.setParamArrayObj(map, prefix + "NotPassItemStatistic.", this.NotPassItemStatistic);
        this.setParamSimple(map, prefix + "LastYearFixCount", this.LastYearFixCount);

    }
}

