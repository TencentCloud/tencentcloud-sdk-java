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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDataDetail extends AbstractModel {

    /**
    * <p>事件名称</p>
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * <p>事件重要程度;0: 一般  1: 重要</p>
    */
    @SerializedName("EventImportance")
    @Expose
    private Long EventImportance;

    /**
    * <p>事件内容</p>
    */
    @SerializedName("EventContent")
    @Expose
    private String EventContent;

    /**
    * <p>ES集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>节点Id</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点类型</p>
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * <p>事件状态,0:待处理，1:处理中，2:处理完成</p>
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * <p>事件类型;1：硬件异常；2：用户变更；3：智能运维</p>
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * <p>事件任务id</p>
    */
    @SerializedName("EventTaskId")
    @Expose
    private Long EventTaskId;

    /**
    * <p>节点隔离状态，0:未隔离；1:已隔离</p>
    */
    @SerializedName("EventIsolationStatus")
    @Expose
    private Long EventIsolationStatus;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>子事件异常类型</p>
    */
    @SerializedName("SubEventType")
    @Expose
    private Long SubEventType;

    /**
    * <p>cvm维修任务Id</p>
    */
    @SerializedName("CvmRepairId")
    @Expose
    private String CvmRepairId;

    /**
    * <p>处理类型</p>
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * <p>子事件名称</p>
    */
    @SerializedName("SubEventName")
    @Expose
    private String SubEventName;

    /**
     * Get <p>事件名称</p> 
     * @return EventName <p>事件名称</p>
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set <p>事件名称</p>
     * @param EventName <p>事件名称</p>
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get <p>事件重要程度;0: 一般  1: 重要</p> 
     * @return EventImportance <p>事件重要程度;0: 一般  1: 重要</p>
     */
    public Long getEventImportance() {
        return this.EventImportance;
    }

    /**
     * Set <p>事件重要程度;0: 一般  1: 重要</p>
     * @param EventImportance <p>事件重要程度;0: 一般  1: 重要</p>
     */
    public void setEventImportance(Long EventImportance) {
        this.EventImportance = EventImportance;
    }

    /**
     * Get <p>事件内容</p> 
     * @return EventContent <p>事件内容</p>
     */
    public String getEventContent() {
        return this.EventContent;
    }

    /**
     * Set <p>事件内容</p>
     * @param EventContent <p>事件内容</p>
     */
    public void setEventContent(String EventContent) {
        this.EventContent = EventContent;
    }

    /**
     * Get <p>ES集群id</p> 
     * @return InstanceId <p>ES集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES集群id</p>
     * @param InstanceId <p>ES集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return InstanceName <p>集群名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>集群名称</p>
     * @param InstanceName <p>集群名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>节点Id</p> 
     * @return NodeId <p>节点Id</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点Id</p>
     * @param NodeId <p>节点Id</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点类型</p> 
     * @return NodeRole <p>节点类型</p>
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set <p>节点类型</p>
     * @param NodeRole <p>节点类型</p>
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get <p>事件状态,0:待处理，1:处理中，2:处理完成</p> 
     * @return EventStatus <p>事件状态,0:待处理，1:处理中，2:处理完成</p>
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set <p>事件状态,0:待处理，1:处理中，2:处理完成</p>
     * @param EventStatus <p>事件状态,0:待处理，1:处理中，2:处理完成</p>
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get <p>事件类型;1：硬件异常；2：用户变更；3：智能运维</p> 
     * @return EventType <p>事件类型;1：硬件异常；2：用户变更；3：智能运维</p>
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型;1：硬件异常；2：用户变更；3：智能运维</p>
     * @param EventType <p>事件类型;1：硬件异常；2：用户变更；3：智能运维</p>
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>事件任务id</p> 
     * @return EventTaskId <p>事件任务id</p>
     */
    public Long getEventTaskId() {
        return this.EventTaskId;
    }

    /**
     * Set <p>事件任务id</p>
     * @param EventTaskId <p>事件任务id</p>
     */
    public void setEventTaskId(Long EventTaskId) {
        this.EventTaskId = EventTaskId;
    }

    /**
     * Get <p>节点隔离状态，0:未隔离；1:已隔离</p> 
     * @return EventIsolationStatus <p>节点隔离状态，0:未隔离；1:已隔离</p>
     */
    public Long getEventIsolationStatus() {
        return this.EventIsolationStatus;
    }

    /**
     * Set <p>节点隔离状态，0:未隔离；1:已隔离</p>
     * @param EventIsolationStatus <p>节点隔离状态，0:未隔离；1:已隔离</p>
     */
    public void setEventIsolationStatus(Long EventIsolationStatus) {
        this.EventIsolationStatus = EventIsolationStatus;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>子事件异常类型</p> 
     * @return SubEventType <p>子事件异常类型</p>
     */
    public Long getSubEventType() {
        return this.SubEventType;
    }

    /**
     * Set <p>子事件异常类型</p>
     * @param SubEventType <p>子事件异常类型</p>
     */
    public void setSubEventType(Long SubEventType) {
        this.SubEventType = SubEventType;
    }

    /**
     * Get <p>cvm维修任务Id</p> 
     * @return CvmRepairId <p>cvm维修任务Id</p>
     */
    public String getCvmRepairId() {
        return this.CvmRepairId;
    }

    /**
     * Set <p>cvm维修任务Id</p>
     * @param CvmRepairId <p>cvm维修任务Id</p>
     */
    public void setCvmRepairId(String CvmRepairId) {
        this.CvmRepairId = CvmRepairId;
    }

    /**
     * Get <p>处理类型</p> 
     * @return ProcessType <p>处理类型</p>
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set <p>处理类型</p>
     * @param ProcessType <p>处理类型</p>
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get <p>子事件名称</p> 
     * @return SubEventName <p>子事件名称</p>
     */
    public String getSubEventName() {
        return this.SubEventName;
    }

    /**
     * Set <p>子事件名称</p>
     * @param SubEventName <p>子事件名称</p>
     */
    public void setSubEventName(String SubEventName) {
        this.SubEventName = SubEventName;
    }

    public EventDataDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDataDetail(EventDataDetail source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventImportance != null) {
            this.EventImportance = new Long(source.EventImportance);
        }
        if (source.EventContent != null) {
            this.EventContent = new String(source.EventContent);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventTaskId != null) {
            this.EventTaskId = new Long(source.EventTaskId);
        }
        if (source.EventIsolationStatus != null) {
            this.EventIsolationStatus = new Long(source.EventIsolationStatus);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubEventType != null) {
            this.SubEventType = new Long(source.SubEventType);
        }
        if (source.CvmRepairId != null) {
            this.CvmRepairId = new String(source.CvmRepairId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.SubEventName != null) {
            this.SubEventName = new String(source.SubEventName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventImportance", this.EventImportance);
        this.setParamSimple(map, prefix + "EventContent", this.EventContent);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventTaskId", this.EventTaskId);
        this.setParamSimple(map, prefix + "EventIsolationStatus", this.EventIsolationStatus);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubEventType", this.SubEventType);
        this.setParamSimple(map, prefix + "CvmRepairId", this.CvmRepairId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "SubEventName", this.SubEventName);

    }
}

