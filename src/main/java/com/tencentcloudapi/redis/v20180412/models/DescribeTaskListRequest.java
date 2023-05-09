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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskListRequest extends AbstractModel{

    /**
    * 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 每页输出的任务列表大小。默认为 20，最多输出100条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 项目 ID。登录 [Redis 控制台](https://console.cloud.tencent.com/redis)，在右上角的账号信息下拉菜单中，选择**项目管理**，即可获取对应的项目 ID。
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * 任务类型。
- FLOW_CREATE：创建实例。
- FLOW_MODIFYCONNECTIONCONFIG：调整带宽连接数。
- FLOW_MODIFYINSTANCEPASSWORDFREE：免密变更流程。
- FLOW_CLEARNETWORK：VPC退还中。
- FLOW_SETPWD：设置访问密码。
- FLOW_EXPORSHR：扩缩容流程。
- FLOW_UpgradeArch：实例架构升级流程。
- FLOW_MODIFYINSTANCEPARAMS：修改实例参数。
- FLOW_MODIFYINSTACEREADONLY：只读变更流程。
- FLOW_CLOSE：关闭实例。
- FLOW_DELETE：删除实例。
- FLOW_OPEN_WAN：开启外网。
- FLOW_CLEAN：清空实例。      
- FLOW_MODIFYINSTANCEACCOUNT：修改实例账号。
- FLOW_ENABLEINSTANCE_REPLICATE：开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE: 关闭副本只读。
- FLOW_SWITCHINSTANCEVIP：交换实例 VIP。
- FLOW_CHANGE_REPLICA_TO_MSTER：副本节点升主节点。
- FLOW_BACKUPINSTANCE：备份实例。
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * 任务执行的起始时间。格式如：2021-12-30 00:00:00。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 任务运行的终止时间。格式如：2021-12-30 20:59:35
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 该参数为内部使用，请忽略。
    */
    @SerializedName("TaskStatus")
    @Expose
    private Long [] TaskStatus;

    /**
    * 任务执行状态。
- 0：任务初始化。
- 1：执行中。
- 2：完成。
- 4：失败。
    */
    @SerializedName("Result")
    @Expose
    private Long [] Result;

    /**
    * 该字段已废弃，使用OperateUin代替，请忽略。
    */
    @SerializedName("OperatorUin")
    @Expose
    private Long [] OperatorUin;

    /**
    * 操作者账号 ID，UIN。
    */
    @SerializedName("OperateUin")
    @Expose
    private String [] OperateUin;

    /**
     * Get 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。 
     * @return InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     * @param InstanceId 指定实例 ID。例如：crs-xjhsdj****。请登录[Redis控制台](https://console.cloud.tencent.com/redis)在实例列表复制实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 每页输出的任务列表大小。默认为 20，最多输出100条。 
     * @return Limit 每页输出的任务列表大小。默认为 20，最多输出100条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页输出的任务列表大小。默认为 20，最多输出100条。
     * @param Limit 每页输出的任务列表大小。默认为 20，最多输出100条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。 
     * @return Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     * @param Offset 分页偏移量，取Limit整数倍。计算公式：offset=limit*(页码-1)。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 项目 ID。登录 [Redis 控制台](https://console.cloud.tencent.com/redis)，在右上角的账号信息下拉菜单中，选择**项目管理**，即可获取对应的项目 ID。 
     * @return ProjectIds 项目 ID。登录 [Redis 控制台](https://console.cloud.tencent.com/redis)，在右上角的账号信息下拉菜单中，选择**项目管理**，即可获取对应的项目 ID。
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set 项目 ID。登录 [Redis 控制台](https://console.cloud.tencent.com/redis)，在右上角的账号信息下拉菜单中，选择**项目管理**，即可获取对应的项目 ID。
     * @param ProjectIds 项目 ID。登录 [Redis 控制台](https://console.cloud.tencent.com/redis)，在右上角的账号信息下拉菜单中，选择**项目管理**，即可获取对应的项目 ID。
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get 任务类型。
- FLOW_CREATE：创建实例。
- FLOW_MODIFYCONNECTIONCONFIG：调整带宽连接数。
- FLOW_MODIFYINSTANCEPASSWORDFREE：免密变更流程。
- FLOW_CLEARNETWORK：VPC退还中。
- FLOW_SETPWD：设置访问密码。
- FLOW_EXPORSHR：扩缩容流程。
- FLOW_UpgradeArch：实例架构升级流程。
- FLOW_MODIFYINSTANCEPARAMS：修改实例参数。
- FLOW_MODIFYINSTACEREADONLY：只读变更流程。
- FLOW_CLOSE：关闭实例。
- FLOW_DELETE：删除实例。
- FLOW_OPEN_WAN：开启外网。
- FLOW_CLEAN：清空实例。      
- FLOW_MODIFYINSTANCEACCOUNT：修改实例账号。
- FLOW_ENABLEINSTANCE_REPLICATE：开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE: 关闭副本只读。
- FLOW_SWITCHINSTANCEVIP：交换实例 VIP。
- FLOW_CHANGE_REPLICA_TO_MSTER：副本节点升主节点。
- FLOW_BACKUPINSTANCE：备份实例。 
     * @return TaskTypes 任务类型。
- FLOW_CREATE：创建实例。
- FLOW_MODIFYCONNECTIONCONFIG：调整带宽连接数。
- FLOW_MODIFYINSTANCEPASSWORDFREE：免密变更流程。
- FLOW_CLEARNETWORK：VPC退还中。
- FLOW_SETPWD：设置访问密码。
- FLOW_EXPORSHR：扩缩容流程。
- FLOW_UpgradeArch：实例架构升级流程。
- FLOW_MODIFYINSTANCEPARAMS：修改实例参数。
- FLOW_MODIFYINSTACEREADONLY：只读变更流程。
- FLOW_CLOSE：关闭实例。
- FLOW_DELETE：删除实例。
- FLOW_OPEN_WAN：开启外网。
- FLOW_CLEAN：清空实例。      
- FLOW_MODIFYINSTANCEACCOUNT：修改实例账号。
- FLOW_ENABLEINSTANCE_REPLICATE：开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE: 关闭副本只读。
- FLOW_SWITCHINSTANCEVIP：交换实例 VIP。
- FLOW_CHANGE_REPLICA_TO_MSTER：副本节点升主节点。
- FLOW_BACKUPINSTANCE：备份实例。
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型。
- FLOW_CREATE：创建实例。
- FLOW_MODIFYCONNECTIONCONFIG：调整带宽连接数。
- FLOW_MODIFYINSTANCEPASSWORDFREE：免密变更流程。
- FLOW_CLEARNETWORK：VPC退还中。
- FLOW_SETPWD：设置访问密码。
- FLOW_EXPORSHR：扩缩容流程。
- FLOW_UpgradeArch：实例架构升级流程。
- FLOW_MODIFYINSTANCEPARAMS：修改实例参数。
- FLOW_MODIFYINSTACEREADONLY：只读变更流程。
- FLOW_CLOSE：关闭实例。
- FLOW_DELETE：删除实例。
- FLOW_OPEN_WAN：开启外网。
- FLOW_CLEAN：清空实例。      
- FLOW_MODIFYINSTANCEACCOUNT：修改实例账号。
- FLOW_ENABLEINSTANCE_REPLICATE：开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE: 关闭副本只读。
- FLOW_SWITCHINSTANCEVIP：交换实例 VIP。
- FLOW_CHANGE_REPLICA_TO_MSTER：副本节点升主节点。
- FLOW_BACKUPINSTANCE：备份实例。
     * @param TaskTypes 任务类型。
- FLOW_CREATE：创建实例。
- FLOW_MODIFYCONNECTIONCONFIG：调整带宽连接数。
- FLOW_MODIFYINSTANCEPASSWORDFREE：免密变更流程。
- FLOW_CLEARNETWORK：VPC退还中。
- FLOW_SETPWD：设置访问密码。
- FLOW_EXPORSHR：扩缩容流程。
- FLOW_UpgradeArch：实例架构升级流程。
- FLOW_MODIFYINSTANCEPARAMS：修改实例参数。
- FLOW_MODIFYINSTACEREADONLY：只读变更流程。
- FLOW_CLOSE：关闭实例。
- FLOW_DELETE：删除实例。
- FLOW_OPEN_WAN：开启外网。
- FLOW_CLEAN：清空实例。      
- FLOW_MODIFYINSTANCEACCOUNT：修改实例账号。
- FLOW_ENABLEINSTANCE_REPLICATE：开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE: 关闭副本只读。
- FLOW_SWITCHINSTANCEVIP：交换实例 VIP。
- FLOW_CHANGE_REPLICA_TO_MSTER：副本节点升主节点。
- FLOW_BACKUPINSTANCE：备份实例。
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 任务执行的起始时间。格式如：2021-12-30 00:00:00。 
     * @return BeginTime 任务执行的起始时间。格式如：2021-12-30 00:00:00。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 任务执行的起始时间。格式如：2021-12-30 00:00:00。
     * @param BeginTime 任务执行的起始时间。格式如：2021-12-30 00:00:00。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 任务运行的终止时间。格式如：2021-12-30 20:59:35 
     * @return EndTime 任务运行的终止时间。格式如：2021-12-30 20:59:35
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务运行的终止时间。格式如：2021-12-30 20:59:35
     * @param EndTime 任务运行的终止时间。格式如：2021-12-30 20:59:35
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 该参数为内部使用，请忽略。 
     * @return TaskStatus 该参数为内部使用，请忽略。
     */
    public Long [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 该参数为内部使用，请忽略。
     * @param TaskStatus 该参数为内部使用，请忽略。
     */
    public void setTaskStatus(Long [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务执行状态。
- 0：任务初始化。
- 1：执行中。
- 2：完成。
- 4：失败。 
     * @return Result 任务执行状态。
- 0：任务初始化。
- 1：执行中。
- 2：完成。
- 4：失败。
     */
    public Long [] getResult() {
        return this.Result;
    }

    /**
     * Set 任务执行状态。
- 0：任务初始化。
- 1：执行中。
- 2：完成。
- 4：失败。
     * @param Result 任务执行状态。
- 0：任务初始化。
- 1：执行中。
- 2：完成。
- 4：失败。
     */
    public void setResult(Long [] Result) {
        this.Result = Result;
    }

    /**
     * Get 该字段已废弃，使用OperateUin代替，请忽略。 
     * @return OperatorUin 该字段已废弃，使用OperateUin代替，请忽略。
     */
    public Long [] getOperatorUin() {
        return this.OperatorUin;
    }

    /**
     * Set 该字段已废弃，使用OperateUin代替，请忽略。
     * @param OperatorUin 该字段已废弃，使用OperateUin代替，请忽略。
     */
    public void setOperatorUin(Long [] OperatorUin) {
        this.OperatorUin = OperatorUin;
    }

    /**
     * Get 操作者账号 ID，UIN。 
     * @return OperateUin 操作者账号 ID，UIN。
     */
    public String [] getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者账号 ID，UIN。
     * @param OperateUin 操作者账号 ID，UIN。
     */
    public void setOperateUin(String [] OperateUin) {
        this.OperateUin = OperateUin;
    }

    public DescribeTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskListRequest(DescribeTaskListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new Long[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new Long(source.TaskStatus[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new Long[source.Result.length];
            for (int i = 0; i < source.Result.length; i++) {
                this.Result[i] = new Long(source.Result[i]);
            }
        }
        if (source.OperatorUin != null) {
            this.OperatorUin = new Long[source.OperatorUin.length];
            for (int i = 0; i < source.OperatorUin.length; i++) {
                this.OperatorUin[i] = new Long(source.OperatorUin[i]);
            }
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String[source.OperateUin.length];
            for (int i = 0; i < source.OperateUin.length; i++) {
                this.OperateUin[i] = new String(source.OperateUin[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);
        this.setParamArraySimple(map, prefix + "Result.", this.Result);
        this.setParamArraySimple(map, prefix + "OperatorUin.", this.OperatorUin);
        this.setParamArraySimple(map, prefix + "OperateUin.", this.OperateUin);

    }
}

