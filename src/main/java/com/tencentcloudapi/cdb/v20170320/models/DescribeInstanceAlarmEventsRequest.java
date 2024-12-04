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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceAlarmEventsRequest extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件查询范围开始时间，闭区间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事件查询范围截止时间，闭区间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 事件名称。 Outofmemory - 内存OOM（有状态事件）; Switch - 主从切换（有状态事件）; Roremove - 只读实例剔除（有状态事件）; MemoryUsedHigh - 内存使用率过高（有状态事件）; CPUExpansion - CPU性能扩容（无状态事件）; CPUExpansionFailed - CPU性能扩容失败（无状态事件）; CPUContraction - CPU性能回缩（无状态事件）; Restart - 实例重启（有状态事件）; ServerFailureNodeMigration - ServerFailureNodeMigration（有状态事件）; PlannedSwitch - 计划内主备切换（无状态事件）; OverusedReadonlySet - 实例将被锁定（无状态事件）; OverusedReadWriteSet - 实例解除锁定（无状态事件）。
    */
    @SerializedName("EventName")
    @Expose
    private String [] EventName;

    /**
    * 事件状态。"1" - 发生事件；"0" - 恢复事件；"-" - 无状态事件。
    */
    @SerializedName("EventStatus")
    @Expose
    private String EventStatus;

    /**
    * 排序方式。按事件发生事件进行排序，"DESC"-倒排；”ASC“-正序，默认倒排。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 事件展示数量。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 节点 ID。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件查询范围开始时间，闭区间。 
     * @return StartTime 事件查询范围开始时间，闭区间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事件查询范围开始时间，闭区间。
     * @param StartTime 事件查询范围开始时间，闭区间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事件查询范围截止时间，闭区间。 
     * @return EndTime 事件查询范围截止时间，闭区间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 事件查询范围截止时间，闭区间。
     * @param EndTime 事件查询范围截止时间，闭区间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 事件名称。 Outofmemory - 内存OOM（有状态事件）; Switch - 主从切换（有状态事件）; Roremove - 只读实例剔除（有状态事件）; MemoryUsedHigh - 内存使用率过高（有状态事件）; CPUExpansion - CPU性能扩容（无状态事件）; CPUExpansionFailed - CPU性能扩容失败（无状态事件）; CPUContraction - CPU性能回缩（无状态事件）; Restart - 实例重启（有状态事件）; ServerFailureNodeMigration - ServerFailureNodeMigration（有状态事件）; PlannedSwitch - 计划内主备切换（无状态事件）; OverusedReadonlySet - 实例将被锁定（无状态事件）; OverusedReadWriteSet - 实例解除锁定（无状态事件）。 
     * @return EventName 事件名称。 Outofmemory - 内存OOM（有状态事件）; Switch - 主从切换（有状态事件）; Roremove - 只读实例剔除（有状态事件）; MemoryUsedHigh - 内存使用率过高（有状态事件）; CPUExpansion - CPU性能扩容（无状态事件）; CPUExpansionFailed - CPU性能扩容失败（无状态事件）; CPUContraction - CPU性能回缩（无状态事件）; Restart - 实例重启（有状态事件）; ServerFailureNodeMigration - ServerFailureNodeMigration（有状态事件）; PlannedSwitch - 计划内主备切换（无状态事件）; OverusedReadonlySet - 实例将被锁定（无状态事件）; OverusedReadWriteSet - 实例解除锁定（无状态事件）。
     */
    public String [] getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称。 Outofmemory - 内存OOM（有状态事件）; Switch - 主从切换（有状态事件）; Roremove - 只读实例剔除（有状态事件）; MemoryUsedHigh - 内存使用率过高（有状态事件）; CPUExpansion - CPU性能扩容（无状态事件）; CPUExpansionFailed - CPU性能扩容失败（无状态事件）; CPUContraction - CPU性能回缩（无状态事件）; Restart - 实例重启（有状态事件）; ServerFailureNodeMigration - ServerFailureNodeMigration（有状态事件）; PlannedSwitch - 计划内主备切换（无状态事件）; OverusedReadonlySet - 实例将被锁定（无状态事件）; OverusedReadWriteSet - 实例解除锁定（无状态事件）。
     * @param EventName 事件名称。 Outofmemory - 内存OOM（有状态事件）; Switch - 主从切换（有状态事件）; Roremove - 只读实例剔除（有状态事件）; MemoryUsedHigh - 内存使用率过高（有状态事件）; CPUExpansion - CPU性能扩容（无状态事件）; CPUExpansionFailed - CPU性能扩容失败（无状态事件）; CPUContraction - CPU性能回缩（无状态事件）; Restart - 实例重启（有状态事件）; ServerFailureNodeMigration - ServerFailureNodeMigration（有状态事件）; PlannedSwitch - 计划内主备切换（无状态事件）; OverusedReadonlySet - 实例将被锁定（无状态事件）; OverusedReadWriteSet - 实例解除锁定（无状态事件）。
     */
    public void setEventName(String [] EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件状态。"1" - 发生事件；"0" - 恢复事件；"-" - 无状态事件。 
     * @return EventStatus 事件状态。"1" - 发生事件；"0" - 恢复事件；"-" - 无状态事件。
     */
    public String getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态。"1" - 发生事件；"0" - 恢复事件；"-" - 无状态事件。
     * @param EventStatus 事件状态。"1" - 发生事件；"0" - 恢复事件；"-" - 无状态事件。
     */
    public void setEventStatus(String EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 排序方式。按事件发生事件进行排序，"DESC"-倒排；”ASC“-正序，默认倒排。 
     * @return Order 排序方式。按事件发生事件进行排序，"DESC"-倒排；”ASC“-正序，默认倒排。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式。按事件发生事件进行排序，"DESC"-倒排；”ASC“-正序，默认倒排。
     * @param Order 排序方式。按事件发生事件进行排序，"DESC"-倒排；”ASC“-正序，默认倒排。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 事件展示数量。 
     * @return Limit 事件展示数量。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 事件展示数量。
     * @param Limit 事件展示数量。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 节点 ID。 
     * @return NodeId 节点 ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点 ID。
     * @param NodeId 节点 ID。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    public DescribeInstanceAlarmEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceAlarmEventsRequest(DescribeInstanceAlarmEventsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.EventName != null) {
            this.EventName = new String[source.EventName.length];
            for (int i = 0; i < source.EventName.length; i++) {
                this.EventName[i] = new String(source.EventName[i]);
            }
        }
        if (source.EventStatus != null) {
            this.EventStatus = new String(source.EventStatus);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "EventName.", this.EventName);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);

    }
}

