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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncBaselineDetectSummaryResponse extends AbstractModel{

    /**
    * 处理进度
    */
    @SerializedName("ProgressRate")
    @Expose
    private Long ProgressRate;

    /**
    * 未通过策略总数
    */
    @SerializedName("NotPassPolicyCount")
    @Expose
    private Long NotPassPolicyCount;

    /**
    * 主机总数
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 1:即将进行首次扫描   0:已经扫描过了
    */
    @SerializedName("WillFirstScan")
    @Expose
    private Long WillFirstScan;

    /**
    * 正在检测的任务ID
    */
    @SerializedName("DetectingTaskIds")
    @Expose
    private Long [] DetectingTaskIds;

    /**
    * 扫描中剩余时间(分钟)
    */
    @SerializedName("LeftMins")
    @Expose
    private Long LeftMins;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 处理进度 
     * @return ProgressRate 处理进度
     */
    public Long getProgressRate() {
        return this.ProgressRate;
    }

    /**
     * Set 处理进度
     * @param ProgressRate 处理进度
     */
    public void setProgressRate(Long ProgressRate) {
        this.ProgressRate = ProgressRate;
    }

    /**
     * Get 未通过策略总数 
     * @return NotPassPolicyCount 未通过策略总数
     */
    public Long getNotPassPolicyCount() {
        return this.NotPassPolicyCount;
    }

    /**
     * Set 未通过策略总数
     * @param NotPassPolicyCount 未通过策略总数
     */
    public void setNotPassPolicyCount(Long NotPassPolicyCount) {
        this.NotPassPolicyCount = NotPassPolicyCount;
    }

    /**
     * Get 主机总数 
     * @return HostCount 主机总数
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 主机总数
     * @param HostCount 主机总数
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 1:即将进行首次扫描   0:已经扫描过了 
     * @return WillFirstScan 1:即将进行首次扫描   0:已经扫描过了
     */
    public Long getWillFirstScan() {
        return this.WillFirstScan;
    }

    /**
     * Set 1:即将进行首次扫描   0:已经扫描过了
     * @param WillFirstScan 1:即将进行首次扫描   0:已经扫描过了
     */
    public void setWillFirstScan(Long WillFirstScan) {
        this.WillFirstScan = WillFirstScan;
    }

    /**
     * Get 正在检测的任务ID 
     * @return DetectingTaskIds 正在检测的任务ID
     */
    public Long [] getDetectingTaskIds() {
        return this.DetectingTaskIds;
    }

    /**
     * Set 正在检测的任务ID
     * @param DetectingTaskIds 正在检测的任务ID
     */
    public void setDetectingTaskIds(Long [] DetectingTaskIds) {
        this.DetectingTaskIds = DetectingTaskIds;
    }

    /**
     * Get 扫描中剩余时间(分钟) 
     * @return LeftMins 扫描中剩余时间(分钟)
     */
    public Long getLeftMins() {
        return this.LeftMins;
    }

    /**
     * Set 扫描中剩余时间(分钟)
     * @param LeftMins 扫描中剩余时间(分钟)
     */
    public void setLeftMins(Long LeftMins) {
        this.LeftMins = LeftMins;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SyncBaselineDetectSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncBaselineDetectSummaryResponse(SyncBaselineDetectSummaryResponse source) {
        if (source.ProgressRate != null) {
            this.ProgressRate = new Long(source.ProgressRate);
        }
        if (source.NotPassPolicyCount != null) {
            this.NotPassPolicyCount = new Long(source.NotPassPolicyCount);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.WillFirstScan != null) {
            this.WillFirstScan = new Long(source.WillFirstScan);
        }
        if (source.DetectingTaskIds != null) {
            this.DetectingTaskIds = new Long[source.DetectingTaskIds.length];
            for (int i = 0; i < source.DetectingTaskIds.length; i++) {
                this.DetectingTaskIds[i] = new Long(source.DetectingTaskIds[i]);
            }
        }
        if (source.LeftMins != null) {
            this.LeftMins = new Long(source.LeftMins);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProgressRate", this.ProgressRate);
        this.setParamSimple(map, prefix + "NotPassPolicyCount", this.NotPassPolicyCount);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "WillFirstScan", this.WillFirstScan);
        this.setParamArraySimple(map, prefix + "DetectingTaskIds.", this.DetectingTaskIds);
        this.setParamSimple(map, prefix + "LeftMins", this.LeftMins);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

