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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventTask extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 事件任务的id	
    */
    @SerializedName("EventTaskId")
    @Expose
    private Long EventTaskId;

    /**
    * 处理人uin
    */
    @SerializedName("HandleUser")
    @Expose
    private String HandleUser;

    /**
    * 事件名称	
    */
    @SerializedName("EventCode")
    @Expose
    private String EventCode;

    /**
    * CVM相关事件的维修id
    */
    @SerializedName("RepairId")
    @Expose
    private String RepairId;

    /**
    * 事件名称描述	
    */
    @SerializedName("EventNameDescribe")
    @Expose
    private String EventNameDescribe;

    /**
    * 事件等级（0-低；1-中；2-高；3-严重）	
    */
    @SerializedName("EventPriority")
    @Expose
    private Long EventPriority;

    /**
    * 事件详情	
    */
    @SerializedName("EventDetail")
    @Expose
    private String EventDetail;

    /**
    * 影响集群节点	
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 事件触发时间	
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 事件状态(1-待处理;2-已预约;3-处理中;4-已完成;5-处理中;6-自动处理中;-1-已忽略;-2-已删除)	
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否需要授权维修：1-不需要，2-需要
    */
    @SerializedName("NeedAuthorization")
    @Expose
    private Long NeedAuthorization;

    /**
    * 该事件涉及到的操作类型（OnlineMigrationForInstance-实例在线迁移,OnlineMaintenanceForInstance-实例在线维修,等）	
    */
    @SerializedName("OperationType")
    @Expose
    private String [] OperationType;

    /**
    * 完成时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 操作指引
    */
    @SerializedName("OperationGuide")
    @Expose
    private String OperationGuide;

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 集群id 
     * @return InstanceId 集群id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群id
     * @param InstanceId 集群id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 事件任务的id	 
     * @return EventTaskId 事件任务的id	
     */
    public Long getEventTaskId() {
        return this.EventTaskId;
    }

    /**
     * Set 事件任务的id	
     * @param EventTaskId 事件任务的id	
     */
    public void setEventTaskId(Long EventTaskId) {
        this.EventTaskId = EventTaskId;
    }

    /**
     * Get 处理人uin 
     * @return HandleUser 处理人uin
     */
    public String getHandleUser() {
        return this.HandleUser;
    }

    /**
     * Set 处理人uin
     * @param HandleUser 处理人uin
     */
    public void setHandleUser(String HandleUser) {
        this.HandleUser = HandleUser;
    }

    /**
     * Get 事件名称	 
     * @return EventCode 事件名称	
     */
    public String getEventCode() {
        return this.EventCode;
    }

    /**
     * Set 事件名称	
     * @param EventCode 事件名称	
     */
    public void setEventCode(String EventCode) {
        this.EventCode = EventCode;
    }

    /**
     * Get CVM相关事件的维修id 
     * @return RepairId CVM相关事件的维修id
     */
    public String getRepairId() {
        return this.RepairId;
    }

    /**
     * Set CVM相关事件的维修id
     * @param RepairId CVM相关事件的维修id
     */
    public void setRepairId(String RepairId) {
        this.RepairId = RepairId;
    }

    /**
     * Get 事件名称描述	 
     * @return EventNameDescribe 事件名称描述	
     */
    public String getEventNameDescribe() {
        return this.EventNameDescribe;
    }

    /**
     * Set 事件名称描述	
     * @param EventNameDescribe 事件名称描述	
     */
    public void setEventNameDescribe(String EventNameDescribe) {
        this.EventNameDescribe = EventNameDescribe;
    }

    /**
     * Get 事件等级（0-低；1-中；2-高；3-严重）	 
     * @return EventPriority 事件等级（0-低；1-中；2-高；3-严重）	
     */
    public Long getEventPriority() {
        return this.EventPriority;
    }

    /**
     * Set 事件等级（0-低；1-中；2-高；3-严重）	
     * @param EventPriority 事件等级（0-低；1-中；2-高；3-严重）	
     */
    public void setEventPriority(Long EventPriority) {
        this.EventPriority = EventPriority;
    }

    /**
     * Get 事件详情	 
     * @return EventDetail 事件详情	
     */
    public String getEventDetail() {
        return this.EventDetail;
    }

    /**
     * Set 事件详情	
     * @param EventDetail 事件详情	
     */
    public void setEventDetail(String EventDetail) {
        this.EventDetail = EventDetail;
    }

    /**
     * Get 影响集群节点	 
     * @return IP 影响集群节点	
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 影响集群节点	
     * @param IP 影响集群节点	
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 事件触发时间	 
     * @return CreateTime 事件触发时间	
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 事件触发时间	
     * @param CreateTime 事件触发时间	
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 事件状态(1-待处理;2-已预约;3-处理中;4-已完成;5-处理中;6-自动处理中;-1-已忽略;-2-已删除)	 
     * @return Status 事件状态(1-待处理;2-已预约;3-处理中;4-已完成;5-处理中;6-自动处理中;-1-已忽略;-2-已删除)	
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 事件状态(1-待处理;2-已预约;3-处理中;4-已完成;5-处理中;6-自动处理中;-1-已忽略;-2-已删除)	
     * @param Status 事件状态(1-待处理;2-已预约;3-处理中;4-已完成;5-处理中;6-自动处理中;-1-已忽略;-2-已删除)	
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否需要授权维修：1-不需要，2-需要 
     * @return NeedAuthorization 是否需要授权维修：1-不需要，2-需要
     */
    public Long getNeedAuthorization() {
        return this.NeedAuthorization;
    }

    /**
     * Set 是否需要授权维修：1-不需要，2-需要
     * @param NeedAuthorization 是否需要授权维修：1-不需要，2-需要
     */
    public void setNeedAuthorization(Long NeedAuthorization) {
        this.NeedAuthorization = NeedAuthorization;
    }

    /**
     * Get 该事件涉及到的操作类型（OnlineMigrationForInstance-实例在线迁移,OnlineMaintenanceForInstance-实例在线维修,等）	 
     * @return OperationType 该事件涉及到的操作类型（OnlineMigrationForInstance-实例在线迁移,OnlineMaintenanceForInstance-实例在线维修,等）	
     */
    public String [] getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 该事件涉及到的操作类型（OnlineMigrationForInstance-实例在线迁移,OnlineMaintenanceForInstance-实例在线维修,等）	
     * @param OperationType 该事件涉及到的操作类型（OnlineMigrationForInstance-实例在线迁移,OnlineMaintenanceForInstance-实例在线维修,等）	
     */
    public void setOperationType(String [] OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 完成时间 
     * @return FinishTime 完成时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 完成时间
     * @param FinishTime 完成时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 操作指引 
     * @return OperationGuide 操作指引
     */
    public String getOperationGuide() {
        return this.OperationGuide;
    }

    /**
     * Set 操作指引
     * @param OperationGuide 操作指引
     */
    public void setOperationGuide(String OperationGuide) {
        this.OperationGuide = OperationGuide;
    }

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public EventTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventTask(EventTask source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.EventTaskId != null) {
            this.EventTaskId = new Long(source.EventTaskId);
        }
        if (source.HandleUser != null) {
            this.HandleUser = new String(source.HandleUser);
        }
        if (source.EventCode != null) {
            this.EventCode = new String(source.EventCode);
        }
        if (source.RepairId != null) {
            this.RepairId = new String(source.RepairId);
        }
        if (source.EventNameDescribe != null) {
            this.EventNameDescribe = new String(source.EventNameDescribe);
        }
        if (source.EventPriority != null) {
            this.EventPriority = new Long(source.EventPriority);
        }
        if (source.EventDetail != null) {
            this.EventDetail = new String(source.EventDetail);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NeedAuthorization != null) {
            this.NeedAuthorization = new Long(source.NeedAuthorization);
        }
        if (source.OperationType != null) {
            this.OperationType = new String[source.OperationType.length];
            for (int i = 0; i < source.OperationType.length; i++) {
                this.OperationType[i] = new String(source.OperationType[i]);
            }
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.OperationGuide != null) {
            this.OperationGuide = new String(source.OperationGuide);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "EventTaskId", this.EventTaskId);
        this.setParamSimple(map, prefix + "HandleUser", this.HandleUser);
        this.setParamSimple(map, prefix + "EventCode", this.EventCode);
        this.setParamSimple(map, prefix + "RepairId", this.RepairId);
        this.setParamSimple(map, prefix + "EventNameDescribe", this.EventNameDescribe);
        this.setParamSimple(map, prefix + "EventPriority", this.EventPriority);
        this.setParamSimple(map, prefix + "EventDetail", this.EventDetail);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NeedAuthorization", this.NeedAuthorization);
        this.setParamArraySimple(map, prefix + "OperationType.", this.OperationType);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "OperationGuide", this.OperationGuide);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

