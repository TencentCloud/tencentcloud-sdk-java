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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KubeJarvisStateInspectionResult extends AbstractModel {

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 诊断开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 诊断结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 诊断结果统计
    */
    @SerializedName("Statistics")
    @Expose
    private KubeJarvisStateStatistic [] Statistics;

    /**
    * 诊断结果详情
    */
    @SerializedName("Diagnostics")
    @Expose
    private KubeJarvisStateDiagnostic [] Diagnostics;

    /**
    * 查询巡检报告相关报错
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 诊断开始时间 
     * @return StartTime 诊断开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 诊断开始时间
     * @param StartTime 诊断开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 诊断结束时间 
     * @return EndTime 诊断结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 诊断结束时间
     * @param EndTime 诊断结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 诊断结果统计 
     * @return Statistics 诊断结果统计
     */
    public KubeJarvisStateStatistic [] getStatistics() {
        return this.Statistics;
    }

    /**
     * Set 诊断结果统计
     * @param Statistics 诊断结果统计
     */
    public void setStatistics(KubeJarvisStateStatistic [] Statistics) {
        this.Statistics = Statistics;
    }

    /**
     * Get 诊断结果详情 
     * @return Diagnostics 诊断结果详情
     */
    public KubeJarvisStateDiagnostic [] getDiagnostics() {
        return this.Diagnostics;
    }

    /**
     * Set 诊断结果详情
     * @param Diagnostics 诊断结果详情
     */
    public void setDiagnostics(KubeJarvisStateDiagnostic [] Diagnostics) {
        this.Diagnostics = Diagnostics;
    }

    /**
     * Get 查询巡检报告相关报错 
     * @return Error 查询巡检报告相关报错
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set 查询巡检报告相关报错
     * @param Error 查询巡检报告相关报错
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public KubeJarvisStateInspectionResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KubeJarvisStateInspectionResult(KubeJarvisStateInspectionResult source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Statistics != null) {
            this.Statistics = new KubeJarvisStateStatistic[source.Statistics.length];
            for (int i = 0; i < source.Statistics.length; i++) {
                this.Statistics[i] = new KubeJarvisStateStatistic(source.Statistics[i]);
            }
        }
        if (source.Diagnostics != null) {
            this.Diagnostics = new KubeJarvisStateDiagnostic[source.Diagnostics.length];
            for (int i = 0; i < source.Diagnostics.length; i++) {
                this.Diagnostics[i] = new KubeJarvisStateDiagnostic(source.Diagnostics[i]);
            }
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Statistics.", this.Statistics);
        this.setParamArrayObj(map, prefix + "Diagnostics.", this.Diagnostics);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

