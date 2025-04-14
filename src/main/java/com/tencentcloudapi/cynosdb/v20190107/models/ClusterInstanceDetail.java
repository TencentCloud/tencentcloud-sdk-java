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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterInstanceDetail extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 引擎类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 实例状态描述
    */
    @SerializedName("InstanceStatusDesc")
    @Expose
    private String InstanceStatusDesc;

    /**
    * cpu核数
    */
    @SerializedName("InstanceCpu")
    @Expose
    private Long InstanceCpu;

    /**
    * 内存
    */
    @SerializedName("InstanceMemory")
    @Expose
    private Long InstanceMemory;

    /**
    * 硬盘
    */
    @SerializedName("InstanceStorage")
    @Expose
    private Long InstanceStorage;

    /**
    * 实例角色
    */
    @SerializedName("InstanceRole")
    @Expose
    private String InstanceRole;

    /**
    * 执行开始时间(距离0点的秒数)	
    */
    @SerializedName("MaintainStartTime")
    @Expose
    private Long MaintainStartTime;

    /**
    * 持续的时间(单位：秒)	
    */
    @SerializedName("MaintainDuration")
    @Expose
    private Long MaintainDuration;

    /**
    * 可以执行的时间，枚举值：["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]
    */
    @SerializedName("MaintainWeekDays")
    @Expose
    private String [] MaintainWeekDays;

    /**
    * serverless实例子状态
    */
    @SerializedName("ServerlessStatus")
    @Expose
    private String ServerlessStatus;

    /**
    * 实例任务信息
    */
    @SerializedName("InstanceTasks")
    @Expose
    private ObjectTask [] InstanceTasks;

    /**
    * 实例机器类型
    */
    @SerializedName("InstanceDeviceType")
    @Expose
    private String InstanceDeviceType;

    /**
    * 实例存储类型
    */
    @SerializedName("InstanceStorageType")
    @Expose
    private String InstanceStorageType;

    /**
    * 数据库类型
    */
    @SerializedName("DbMode")
    @Expose
    private String DbMode;

    /**
    * 节点列表
    */
    @SerializedName("NodeList")
    @Expose
    private String [] NodeList;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 引擎类型 
     * @return InstanceType 引擎类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 引擎类型
     * @param InstanceType 引擎类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例状态 
     * @return InstanceStatus 实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 实例状态
     * @param InstanceStatus 实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 实例状态描述 
     * @return InstanceStatusDesc 实例状态描述
     */
    public String getInstanceStatusDesc() {
        return this.InstanceStatusDesc;
    }

    /**
     * Set 实例状态描述
     * @param InstanceStatusDesc 实例状态描述
     */
    public void setInstanceStatusDesc(String InstanceStatusDesc) {
        this.InstanceStatusDesc = InstanceStatusDesc;
    }

    /**
     * Get cpu核数 
     * @return InstanceCpu cpu核数
     */
    public Long getInstanceCpu() {
        return this.InstanceCpu;
    }

    /**
     * Set cpu核数
     * @param InstanceCpu cpu核数
     */
    public void setInstanceCpu(Long InstanceCpu) {
        this.InstanceCpu = InstanceCpu;
    }

    /**
     * Get 内存 
     * @return InstanceMemory 内存
     */
    public Long getInstanceMemory() {
        return this.InstanceMemory;
    }

    /**
     * Set 内存
     * @param InstanceMemory 内存
     */
    public void setInstanceMemory(Long InstanceMemory) {
        this.InstanceMemory = InstanceMemory;
    }

    /**
     * Get 硬盘 
     * @return InstanceStorage 硬盘
     */
    public Long getInstanceStorage() {
        return this.InstanceStorage;
    }

    /**
     * Set 硬盘
     * @param InstanceStorage 硬盘
     */
    public void setInstanceStorage(Long InstanceStorage) {
        this.InstanceStorage = InstanceStorage;
    }

    /**
     * Get 实例角色 
     * @return InstanceRole 实例角色
     */
    public String getInstanceRole() {
        return this.InstanceRole;
    }

    /**
     * Set 实例角色
     * @param InstanceRole 实例角色
     */
    public void setInstanceRole(String InstanceRole) {
        this.InstanceRole = InstanceRole;
    }

    /**
     * Get 执行开始时间(距离0点的秒数)	 
     * @return MaintainStartTime 执行开始时间(距离0点的秒数)	
     */
    public Long getMaintainStartTime() {
        return this.MaintainStartTime;
    }

    /**
     * Set 执行开始时间(距离0点的秒数)	
     * @param MaintainStartTime 执行开始时间(距离0点的秒数)	
     */
    public void setMaintainStartTime(Long MaintainStartTime) {
        this.MaintainStartTime = MaintainStartTime;
    }

    /**
     * Get 持续的时间(单位：秒)	 
     * @return MaintainDuration 持续的时间(单位：秒)	
     */
    public Long getMaintainDuration() {
        return this.MaintainDuration;
    }

    /**
     * Set 持续的时间(单位：秒)	
     * @param MaintainDuration 持续的时间(单位：秒)	
     */
    public void setMaintainDuration(Long MaintainDuration) {
        this.MaintainDuration = MaintainDuration;
    }

    /**
     * Get 可以执行的时间，枚举值：["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"] 
     * @return MaintainWeekDays 可以执行的时间，枚举值：["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]
     */
    public String [] getMaintainWeekDays() {
        return this.MaintainWeekDays;
    }

    /**
     * Set 可以执行的时间，枚举值：["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]
     * @param MaintainWeekDays 可以执行的时间，枚举值：["Mon","Tue","Wed","Thu","Fri", "Sat", "Sun"]
     */
    public void setMaintainWeekDays(String [] MaintainWeekDays) {
        this.MaintainWeekDays = MaintainWeekDays;
    }

    /**
     * Get serverless实例子状态 
     * @return ServerlessStatus serverless实例子状态
     */
    public String getServerlessStatus() {
        return this.ServerlessStatus;
    }

    /**
     * Set serverless实例子状态
     * @param ServerlessStatus serverless实例子状态
     */
    public void setServerlessStatus(String ServerlessStatus) {
        this.ServerlessStatus = ServerlessStatus;
    }

    /**
     * Get 实例任务信息 
     * @return InstanceTasks 实例任务信息
     */
    public ObjectTask [] getInstanceTasks() {
        return this.InstanceTasks;
    }

    /**
     * Set 实例任务信息
     * @param InstanceTasks 实例任务信息
     */
    public void setInstanceTasks(ObjectTask [] InstanceTasks) {
        this.InstanceTasks = InstanceTasks;
    }

    /**
     * Get 实例机器类型 
     * @return InstanceDeviceType 实例机器类型
     */
    public String getInstanceDeviceType() {
        return this.InstanceDeviceType;
    }

    /**
     * Set 实例机器类型
     * @param InstanceDeviceType 实例机器类型
     */
    public void setInstanceDeviceType(String InstanceDeviceType) {
        this.InstanceDeviceType = InstanceDeviceType;
    }

    /**
     * Get 实例存储类型 
     * @return InstanceStorageType 实例存储类型
     */
    public String getInstanceStorageType() {
        return this.InstanceStorageType;
    }

    /**
     * Set 实例存储类型
     * @param InstanceStorageType 实例存储类型
     */
    public void setInstanceStorageType(String InstanceStorageType) {
        this.InstanceStorageType = InstanceStorageType;
    }

    /**
     * Get 数据库类型 
     * @return DbMode 数据库类型
     */
    public String getDbMode() {
        return this.DbMode;
    }

    /**
     * Set 数据库类型
     * @param DbMode 数据库类型
     */
    public void setDbMode(String DbMode) {
        this.DbMode = DbMode;
    }

    /**
     * Get 节点列表 
     * @return NodeList 节点列表
     */
    public String [] getNodeList() {
        return this.NodeList;
    }

    /**
     * Set 节点列表
     * @param NodeList 节点列表
     */
    public void setNodeList(String [] NodeList) {
        this.NodeList = NodeList;
    }

    public ClusterInstanceDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterInstanceDetail(ClusterInstanceDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.InstanceStatusDesc != null) {
            this.InstanceStatusDesc = new String(source.InstanceStatusDesc);
        }
        if (source.InstanceCpu != null) {
            this.InstanceCpu = new Long(source.InstanceCpu);
        }
        if (source.InstanceMemory != null) {
            this.InstanceMemory = new Long(source.InstanceMemory);
        }
        if (source.InstanceStorage != null) {
            this.InstanceStorage = new Long(source.InstanceStorage);
        }
        if (source.InstanceRole != null) {
            this.InstanceRole = new String(source.InstanceRole);
        }
        if (source.MaintainStartTime != null) {
            this.MaintainStartTime = new Long(source.MaintainStartTime);
        }
        if (source.MaintainDuration != null) {
            this.MaintainDuration = new Long(source.MaintainDuration);
        }
        if (source.MaintainWeekDays != null) {
            this.MaintainWeekDays = new String[source.MaintainWeekDays.length];
            for (int i = 0; i < source.MaintainWeekDays.length; i++) {
                this.MaintainWeekDays[i] = new String(source.MaintainWeekDays[i]);
            }
        }
        if (source.ServerlessStatus != null) {
            this.ServerlessStatus = new String(source.ServerlessStatus);
        }
        if (source.InstanceTasks != null) {
            this.InstanceTasks = new ObjectTask[source.InstanceTasks.length];
            for (int i = 0; i < source.InstanceTasks.length; i++) {
                this.InstanceTasks[i] = new ObjectTask(source.InstanceTasks[i]);
            }
        }
        if (source.InstanceDeviceType != null) {
            this.InstanceDeviceType = new String(source.InstanceDeviceType);
        }
        if (source.InstanceStorageType != null) {
            this.InstanceStorageType = new String(source.InstanceStorageType);
        }
        if (source.DbMode != null) {
            this.DbMode = new String(source.DbMode);
        }
        if (source.NodeList != null) {
            this.NodeList = new String[source.NodeList.length];
            for (int i = 0; i < source.NodeList.length; i++) {
                this.NodeList[i] = new String(source.NodeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "InstanceStatusDesc", this.InstanceStatusDesc);
        this.setParamSimple(map, prefix + "InstanceCpu", this.InstanceCpu);
        this.setParamSimple(map, prefix + "InstanceMemory", this.InstanceMemory);
        this.setParamSimple(map, prefix + "InstanceStorage", this.InstanceStorage);
        this.setParamSimple(map, prefix + "InstanceRole", this.InstanceRole);
        this.setParamSimple(map, prefix + "MaintainStartTime", this.MaintainStartTime);
        this.setParamSimple(map, prefix + "MaintainDuration", this.MaintainDuration);
        this.setParamArraySimple(map, prefix + "MaintainWeekDays.", this.MaintainWeekDays);
        this.setParamSimple(map, prefix + "ServerlessStatus", this.ServerlessStatus);
        this.setParamArrayObj(map, prefix + "InstanceTasks.", this.InstanceTasks);
        this.setParamSimple(map, prefix + "InstanceDeviceType", this.InstanceDeviceType);
        this.setParamSimple(map, prefix + "InstanceStorageType", this.InstanceStorageType);
        this.setParamSimple(map, prefix + "DbMode", this.DbMode);
        this.setParamArraySimple(map, prefix + "NodeList.", this.NodeList);

    }
}

