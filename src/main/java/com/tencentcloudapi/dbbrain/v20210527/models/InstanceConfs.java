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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfs extends AbstractModel {

    /**
    * 数据库巡检开关, Yes/No。
    */
    @SerializedName("DailyInspection")
    @Expose
    private String DailyInspection;

    /**
    * 实例概览开关，Yes/No。
    */
    @SerializedName("OverviewDisplay")
    @Expose
    private String OverviewDisplay;

    /**
    * redis大key分析的自定义分割符，仅redis使用
    */
    @SerializedName("KeyDelimiters")
    @Expose
    private String [] KeyDelimiters;

    /**
    * 分片节点数量。
    */
    @SerializedName("ShardNum")
    @Expose
    private String ShardNum;

    /**
    * 是否开启大key周期性分析，仅redis产品有效。
    */
    @SerializedName("AnalysisTopKey")
    @Expose
    private String AnalysisTopKey;

    /**
     * Get 数据库巡检开关, Yes/No。 
     * @return DailyInspection 数据库巡检开关, Yes/No。
     */
    public String getDailyInspection() {
        return this.DailyInspection;
    }

    /**
     * Set 数据库巡检开关, Yes/No。
     * @param DailyInspection 数据库巡检开关, Yes/No。
     */
    public void setDailyInspection(String DailyInspection) {
        this.DailyInspection = DailyInspection;
    }

    /**
     * Get 实例概览开关，Yes/No。 
     * @return OverviewDisplay 实例概览开关，Yes/No。
     */
    public String getOverviewDisplay() {
        return this.OverviewDisplay;
    }

    /**
     * Set 实例概览开关，Yes/No。
     * @param OverviewDisplay 实例概览开关，Yes/No。
     */
    public void setOverviewDisplay(String OverviewDisplay) {
        this.OverviewDisplay = OverviewDisplay;
    }

    /**
     * Get redis大key分析的自定义分割符，仅redis使用 
     * @return KeyDelimiters redis大key分析的自定义分割符，仅redis使用
     */
    public String [] getKeyDelimiters() {
        return this.KeyDelimiters;
    }

    /**
     * Set redis大key分析的自定义分割符，仅redis使用
     * @param KeyDelimiters redis大key分析的自定义分割符，仅redis使用
     */
    public void setKeyDelimiters(String [] KeyDelimiters) {
        this.KeyDelimiters = KeyDelimiters;
    }

    /**
     * Get 分片节点数量。 
     * @return ShardNum 分片节点数量。
     */
    public String getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set 分片节点数量。
     * @param ShardNum 分片节点数量。
     */
    public void setShardNum(String ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get 是否开启大key周期性分析，仅redis产品有效。 
     * @return AnalysisTopKey 是否开启大key周期性分析，仅redis产品有效。
     */
    public String getAnalysisTopKey() {
        return this.AnalysisTopKey;
    }

    /**
     * Set 是否开启大key周期性分析，仅redis产品有效。
     * @param AnalysisTopKey 是否开启大key周期性分析，仅redis产品有效。
     */
    public void setAnalysisTopKey(String AnalysisTopKey) {
        this.AnalysisTopKey = AnalysisTopKey;
    }

    public InstanceConfs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceConfs(InstanceConfs source) {
        if (source.DailyInspection != null) {
            this.DailyInspection = new String(source.DailyInspection);
        }
        if (source.OverviewDisplay != null) {
            this.OverviewDisplay = new String(source.OverviewDisplay);
        }
        if (source.KeyDelimiters != null) {
            this.KeyDelimiters = new String[source.KeyDelimiters.length];
            for (int i = 0; i < source.KeyDelimiters.length; i++) {
                this.KeyDelimiters[i] = new String(source.KeyDelimiters[i]);
            }
        }
        if (source.ShardNum != null) {
            this.ShardNum = new String(source.ShardNum);
        }
        if (source.AnalysisTopKey != null) {
            this.AnalysisTopKey = new String(source.AnalysisTopKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DailyInspection", this.DailyInspection);
        this.setParamSimple(map, prefix + "OverviewDisplay", this.OverviewDisplay);
        this.setParamArraySimple(map, prefix + "KeyDelimiters.", this.KeyDelimiters);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "AnalysisTopKey", this.AnalysisTopKey);

    }
}

