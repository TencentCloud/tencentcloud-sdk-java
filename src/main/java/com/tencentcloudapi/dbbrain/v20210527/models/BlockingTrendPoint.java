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

public class BlockingTrendPoint extends AbstractModel {

    /**
    * <p>该 bucket 的实际聚合区间左端（含），格式：yyyy-MM-dd HH:mm:ss。聚合区间为前闭后开 [StartTime, EndTime)。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>该 bucket 的实际聚合区间右端（不含），格式：yyyy-MM-dd HH:mm:ss。即 StartTime + GranularityMs。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>该 bucket 内的阻塞 report 行数（底层 blocked_process_report 事件数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LockCount")
    @Expose
    private Long LockCount;

    /**
    * <p>该 bucket 内观测到的不同 monitorLoop 数量（lock monitor 扫描快照数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorLoopCount")
    @Expose
    private Long MonitorLoopCount;

    /**
     * Get <p>该 bucket 的实际聚合区间左端（含），格式：yyyy-MM-dd HH:mm:ss。聚合区间为前闭后开 [StartTime, EndTime)。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>该 bucket 的实际聚合区间左端（含），格式：yyyy-MM-dd HH:mm:ss。聚合区间为前闭后开 [StartTime, EndTime)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>该 bucket 的实际聚合区间左端（含），格式：yyyy-MM-dd HH:mm:ss。聚合区间为前闭后开 [StartTime, EndTime)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>该 bucket 的实际聚合区间左端（含），格式：yyyy-MM-dd HH:mm:ss。聚合区间为前闭后开 [StartTime, EndTime)。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>该 bucket 的实际聚合区间右端（不含），格式：yyyy-MM-dd HH:mm:ss。即 StartTime + GranularityMs。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>该 bucket 的实际聚合区间右端（不含），格式：yyyy-MM-dd HH:mm:ss。即 StartTime + GranularityMs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>该 bucket 的实际聚合区间右端（不含），格式：yyyy-MM-dd HH:mm:ss。即 StartTime + GranularityMs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>该 bucket 的实际聚合区间右端（不含），格式：yyyy-MM-dd HH:mm:ss。即 StartTime + GranularityMs。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>该 bucket 内的阻塞 report 行数（底层 blocked_process_report 事件数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LockCount <p>该 bucket 内的阻塞 report 行数（底层 blocked_process_report 事件数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLockCount() {
        return this.LockCount;
    }

    /**
     * Set <p>该 bucket 内的阻塞 report 行数（底层 blocked_process_report 事件数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LockCount <p>该 bucket 内的阻塞 report 行数（底层 blocked_process_report 事件数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLockCount(Long LockCount) {
        this.LockCount = LockCount;
    }

    /**
     * Get <p>该 bucket 内观测到的不同 monitorLoop 数量（lock monitor 扫描快照数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorLoopCount <p>该 bucket 内观测到的不同 monitorLoop 数量（lock monitor 扫描快照数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorLoopCount() {
        return this.MonitorLoopCount;
    }

    /**
     * Set <p>该 bucket 内观测到的不同 monitorLoop 数量（lock monitor 扫描快照数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorLoopCount <p>该 bucket 内观测到的不同 monitorLoop 数量（lock monitor 扫描快照数），无数据 bucket 返回 0。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorLoopCount(Long MonitorLoopCount) {
        this.MonitorLoopCount = MonitorLoopCount;
    }

    public BlockingTrendPoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BlockingTrendPoint(BlockingTrendPoint source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.LockCount != null) {
            this.LockCount = new Long(source.LockCount);
        }
        if (source.MonitorLoopCount != null) {
            this.MonitorLoopCount = new Long(source.MonitorLoopCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LockCount", this.LockCount);
        this.setParamSimple(map, prefix + "MonitorLoopCount", this.MonitorLoopCount);

    }
}

