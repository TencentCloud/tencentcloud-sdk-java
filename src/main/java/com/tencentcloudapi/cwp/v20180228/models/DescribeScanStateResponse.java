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

public class DescribeScanStateResponse extends AbstractModel{

    /**
    * 0 从未扫描过、 1 扫描中、 2扫描完成、 3停止中、 4停止完成
    */
    @SerializedName("ScanState")
    @Expose
    private Long ScanState;

    /**
    * 扫描进度
    */
    @SerializedName("Schedule")
    @Expose
    private Long Schedule;

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务扫描的漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long [] VulId;

    /**
    * 0一键检测 1定时检测
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 开始扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanBeginTime")
    @Expose
    private String ScanBeginTime;

    /**
    * 扫描漏洞数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskEventCount")
    @Expose
    private Long RiskEventCount;

    /**
    * 扫描结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanEndTime")
    @Expose
    private String ScanEndTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0 从未扫描过、 1 扫描中、 2扫描完成、 3停止中、 4停止完成 
     * @return ScanState 0 从未扫描过、 1 扫描中、 2扫描完成、 3停止中、 4停止完成
     */
    public Long getScanState() {
        return this.ScanState;
    }

    /**
     * Set 0 从未扫描过、 1 扫描中、 2扫描完成、 3停止中、 4停止完成
     * @param ScanState 0 从未扫描过、 1 扫描中、 2扫描完成、 3停止中、 4停止完成
     */
    public void setScanState(Long ScanState) {
        this.ScanState = ScanState;
    }

    /**
     * Get 扫描进度 
     * @return Schedule 扫描进度
     */
    public Long getSchedule() {
        return this.Schedule;
    }

    /**
     * Set 扫描进度
     * @param Schedule 扫描进度
     */
    public void setSchedule(Long Schedule) {
        this.Schedule = Schedule;
    }

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务扫描的漏洞id 
     * @return VulId 任务扫描的漏洞id
     */
    public Long [] getVulId() {
        return this.VulId;
    }

    /**
     * Set 任务扫描的漏洞id
     * @param VulId 任务扫描的漏洞id
     */
    public void setVulId(Long [] VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 0一键检测 1定时检测 
     * @return Type 0一键检测 1定时检测
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 0一键检测 1定时检测
     * @param Type 0一键检测 1定时检测
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 开始扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanBeginTime 开始扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanBeginTime() {
        return this.ScanBeginTime;
    }

    /**
     * Set 开始扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanBeginTime 开始扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanBeginTime(String ScanBeginTime) {
        this.ScanBeginTime = ScanBeginTime;
    }

    /**
     * Get 扫描漏洞数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskEventCount 扫描漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskEventCount() {
        return this.RiskEventCount;
    }

    /**
     * Set 扫描漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskEventCount 扫描漏洞数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskEventCount(Long RiskEventCount) {
        this.RiskEventCount = RiskEventCount;
    }

    /**
     * Get 扫描结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanEndTime 扫描结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanEndTime() {
        return this.ScanEndTime;
    }

    /**
     * Set 扫描结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanEndTime 扫描结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanEndTime(String ScanEndTime) {
        this.ScanEndTime = ScanEndTime;
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

    public DescribeScanStateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanStateResponse(DescribeScanStateResponse source) {
        if (source.ScanState != null) {
            this.ScanState = new Long(source.ScanState);
        }
        if (source.Schedule != null) {
            this.Schedule = new Long(source.Schedule);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.VulId != null) {
            this.VulId = new Long[source.VulId.length];
            for (int i = 0; i < source.VulId.length; i++) {
                this.VulId[i] = new Long(source.VulId[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ScanBeginTime != null) {
            this.ScanBeginTime = new String(source.ScanBeginTime);
        }
        if (source.RiskEventCount != null) {
            this.RiskEventCount = new Long(source.RiskEventCount);
        }
        if (source.ScanEndTime != null) {
            this.ScanEndTime = new String(source.ScanEndTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScanState", this.ScanState);
        this.setParamSimple(map, prefix + "Schedule", this.Schedule);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "VulId.", this.VulId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ScanBeginTime", this.ScanBeginTime);
        this.setParamSimple(map, prefix + "RiskEventCount", this.RiskEventCount);
        this.setParamSimple(map, prefix + "ScanEndTime", this.ScanEndTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

