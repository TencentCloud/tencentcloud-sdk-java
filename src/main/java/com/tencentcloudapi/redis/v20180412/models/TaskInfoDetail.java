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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInfoDetail extends AbstractModel {

    /**
    * 任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 任务开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务类型。
- FLOW_CREATE: "001"，新建实例
- FLOW_RESIZE ： "002"，配置变更
- FLOW_CLOSE："003"，关闭实例
- FLOW_CLEAN： "004"，清空实例
- FLOW_STARTUP："005"，实例启用。
- FLOW_DELETE："006"，删除实例。
- FLOW_SETPWD："007"，重置密码。
- FLOW_EXPORTBACKUP："009"，导出备份文件。
- FLOW_RESTOREBACKUP："010"，恢复备份。
- FLOW_BACKUPINSTANCE："012"，备份实例。
- FLOW_MIGRATEINSTANCE："013"，迁移实例。
- FLOW_DELBACKUP："014"，删除备份。
- FLOW_EXCHANGEINSTANCE： "016"，切换实例流程。
- FLOW_AUTOBACKUP："017"，自动备份实例。
- FLOW_MIGRATECHECK： "022"，迁移参数校验。
- FLOW_MIGRATETASK："023"，数据迁移中。
- FLOW_CLEANDB："025"，清空某个数据库。
- FLOW_CLONEBACKUP："026"，克隆备份。
- FLOW_CHANGEVIP： "027"，改变vip地址。
- FLOW_EXPORSHR ："028"，扩缩容。
- FLOW_ADDNODES："029"，加（减）节点。
- FLOW_CHANGENET："031"，改变网络类型。
- FLOW_MODIFYINSTACEREADONLY："033"，只读策略变更。
- FLOW_MODIFYINSTANCEPARAMS："034"，修改实例参数。
- FLOW_MODIFYINSTANCEPASSWORDFREE："035"，设置免密。
- FLOW_SWITCHINSTANCEVIP："036"，实例VIP切换。
- FLOW_MODIFYINSTANCEACCOUNT："037"，实例帐号变更。
- FLOW_MODIFYINSTANCEBANDWIDTH："038"，实例带宽变更。
- FLOW_ENABLEINSTANCE_REPLICATE："039"，开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE："040"，关闭副本只读。
- FLOW_UpgradeArch："041"，实例架构升级，主从升集群。
- FLOW_DowngradeArch： "042"，实例架构降级，集群降主从。
- FLOW_UpgradeVersion： "043"，版本升级。
- FLOW_MODIFYCONNECTIONCONFIG："044"，带宽连接数调整。
- FLOW_CLEARNETWORK："045"，更换网络，
- FLOW_REMOVE_BACKUP_FILE："046"，删除备份。
- FLOW_UPGRADE_SUPPORT_MULTI_AZ："047"，升级实例支持多可用区。
- FLOW_SHUTDOWN_MASTER："048"，模拟故障。
- FLOW_CHANGE_REPLICA_TO_MASTER："049"，手动提主。
- FLOW_CODE_ADD_REPLICATION_INSTANCE："050"，新增复制组。
- FLOW_OPEN_WAN："052"，开通外网。
- FLOW_CLOSE_WAN："053"，关闭外网FLOW_UPDATE_WAN："054"，更新外网。
- FLOW_CODE_DELETE_REPLICATION_INSTANCE："055"，解绑复制组。
- FLOW_CODE_CHANGE_MASTER_INSTANCE："056"，复制组实例切主。
- FLOW_CODE_CHANGE_INSTANCE_ROLE： "057"，更改复制组实例角色。
- FLOW_MIGRATE_NODE："058"，迁移节点。
- FLOW_SWITCH_NODE："059"，切换节点。
- FLOW_UPGRADE_SMALL_VERSION："060"，升级 Redi s版本。
- FLOW_UPGRADE_PROXY_VERSION："061"，升级 Proxy 版本。
- FLOW_MODIFY_INSTANCE_NETWORK： "062"，实例修改网络。
- FLOW_MIGRATE_PROXY_NODE："063"，迁移proxy节点。
- FLOW_MIGRATION_INSTANCE_ZONE："066"，实例可用区迁移中。
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY： "067"，实例版本升级中。
- FLOW_MODIFY_PROXY_NUM："069"，加（减）Proxy 节点。
- FLOW_MODIFYBACKUPMOD："070"，变更实例备份模式。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 项目 ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 任务进度。
    */
    @SerializedName("Progress")
    @Expose
    private Float Progress;

    /**
    * 任务执行结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务执行状态。

0：任务初始化。
1：执行中。
2：完成。
4：失败。
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get 任务 ID。 
     * @return TaskId 任务 ID。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID。
     * @param TaskId 任务 ID。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务开始时间。 
     * @return StartTime 任务开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间。
     * @param StartTime 任务开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务类型。
- FLOW_CREATE: "001"，新建实例
- FLOW_RESIZE ： "002"，配置变更
- FLOW_CLOSE："003"，关闭实例
- FLOW_CLEAN： "004"，清空实例
- FLOW_STARTUP："005"，实例启用。
- FLOW_DELETE："006"，删除实例。
- FLOW_SETPWD："007"，重置密码。
- FLOW_EXPORTBACKUP："009"，导出备份文件。
- FLOW_RESTOREBACKUP："010"，恢复备份。
- FLOW_BACKUPINSTANCE："012"，备份实例。
- FLOW_MIGRATEINSTANCE："013"，迁移实例。
- FLOW_DELBACKUP："014"，删除备份。
- FLOW_EXCHANGEINSTANCE： "016"，切换实例流程。
- FLOW_AUTOBACKUP："017"，自动备份实例。
- FLOW_MIGRATECHECK： "022"，迁移参数校验。
- FLOW_MIGRATETASK："023"，数据迁移中。
- FLOW_CLEANDB："025"，清空某个数据库。
- FLOW_CLONEBACKUP："026"，克隆备份。
- FLOW_CHANGEVIP： "027"，改变vip地址。
- FLOW_EXPORSHR ："028"，扩缩容。
- FLOW_ADDNODES："029"，加（减）节点。
- FLOW_CHANGENET："031"，改变网络类型。
- FLOW_MODIFYINSTACEREADONLY："033"，只读策略变更。
- FLOW_MODIFYINSTANCEPARAMS："034"，修改实例参数。
- FLOW_MODIFYINSTANCEPASSWORDFREE："035"，设置免密。
- FLOW_SWITCHINSTANCEVIP："036"，实例VIP切换。
- FLOW_MODIFYINSTANCEACCOUNT："037"，实例帐号变更。
- FLOW_MODIFYINSTANCEBANDWIDTH："038"，实例带宽变更。
- FLOW_ENABLEINSTANCE_REPLICATE："039"，开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE："040"，关闭副本只读。
- FLOW_UpgradeArch："041"，实例架构升级，主从升集群。
- FLOW_DowngradeArch： "042"，实例架构降级，集群降主从。
- FLOW_UpgradeVersion： "043"，版本升级。
- FLOW_MODIFYCONNECTIONCONFIG："044"，带宽连接数调整。
- FLOW_CLEARNETWORK："045"，更换网络，
- FLOW_REMOVE_BACKUP_FILE："046"，删除备份。
- FLOW_UPGRADE_SUPPORT_MULTI_AZ："047"，升级实例支持多可用区。
- FLOW_SHUTDOWN_MASTER："048"，模拟故障。
- FLOW_CHANGE_REPLICA_TO_MASTER："049"，手动提主。
- FLOW_CODE_ADD_REPLICATION_INSTANCE："050"，新增复制组。
- FLOW_OPEN_WAN："052"，开通外网。
- FLOW_CLOSE_WAN："053"，关闭外网FLOW_UPDATE_WAN："054"，更新外网。
- FLOW_CODE_DELETE_REPLICATION_INSTANCE："055"，解绑复制组。
- FLOW_CODE_CHANGE_MASTER_INSTANCE："056"，复制组实例切主。
- FLOW_CODE_CHANGE_INSTANCE_ROLE： "057"，更改复制组实例角色。
- FLOW_MIGRATE_NODE："058"，迁移节点。
- FLOW_SWITCH_NODE："059"，切换节点。
- FLOW_UPGRADE_SMALL_VERSION："060"，升级 Redi s版本。
- FLOW_UPGRADE_PROXY_VERSION："061"，升级 Proxy 版本。
- FLOW_MODIFY_INSTANCE_NETWORK： "062"，实例修改网络。
- FLOW_MIGRATE_PROXY_NODE："063"，迁移proxy节点。
- FLOW_MIGRATION_INSTANCE_ZONE："066"，实例可用区迁移中。
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY： "067"，实例版本升级中。
- FLOW_MODIFY_PROXY_NUM："069"，加（减）Proxy 节点。
- FLOW_MODIFYBACKUPMOD："070"，变更实例备份模式。 
     * @return TaskType 任务类型。
- FLOW_CREATE: "001"，新建实例
- FLOW_RESIZE ： "002"，配置变更
- FLOW_CLOSE："003"，关闭实例
- FLOW_CLEAN： "004"，清空实例
- FLOW_STARTUP："005"，实例启用。
- FLOW_DELETE："006"，删除实例。
- FLOW_SETPWD："007"，重置密码。
- FLOW_EXPORTBACKUP："009"，导出备份文件。
- FLOW_RESTOREBACKUP："010"，恢复备份。
- FLOW_BACKUPINSTANCE："012"，备份实例。
- FLOW_MIGRATEINSTANCE："013"，迁移实例。
- FLOW_DELBACKUP："014"，删除备份。
- FLOW_EXCHANGEINSTANCE： "016"，切换实例流程。
- FLOW_AUTOBACKUP："017"，自动备份实例。
- FLOW_MIGRATECHECK： "022"，迁移参数校验。
- FLOW_MIGRATETASK："023"，数据迁移中。
- FLOW_CLEANDB："025"，清空某个数据库。
- FLOW_CLONEBACKUP："026"，克隆备份。
- FLOW_CHANGEVIP： "027"，改变vip地址。
- FLOW_EXPORSHR ："028"，扩缩容。
- FLOW_ADDNODES："029"，加（减）节点。
- FLOW_CHANGENET："031"，改变网络类型。
- FLOW_MODIFYINSTACEREADONLY："033"，只读策略变更。
- FLOW_MODIFYINSTANCEPARAMS："034"，修改实例参数。
- FLOW_MODIFYINSTANCEPASSWORDFREE："035"，设置免密。
- FLOW_SWITCHINSTANCEVIP："036"，实例VIP切换。
- FLOW_MODIFYINSTANCEACCOUNT："037"，实例帐号变更。
- FLOW_MODIFYINSTANCEBANDWIDTH："038"，实例带宽变更。
- FLOW_ENABLEINSTANCE_REPLICATE："039"，开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE："040"，关闭副本只读。
- FLOW_UpgradeArch："041"，实例架构升级，主从升集群。
- FLOW_DowngradeArch： "042"，实例架构降级，集群降主从。
- FLOW_UpgradeVersion： "043"，版本升级。
- FLOW_MODIFYCONNECTIONCONFIG："044"，带宽连接数调整。
- FLOW_CLEARNETWORK："045"，更换网络，
- FLOW_REMOVE_BACKUP_FILE："046"，删除备份。
- FLOW_UPGRADE_SUPPORT_MULTI_AZ："047"，升级实例支持多可用区。
- FLOW_SHUTDOWN_MASTER："048"，模拟故障。
- FLOW_CHANGE_REPLICA_TO_MASTER："049"，手动提主。
- FLOW_CODE_ADD_REPLICATION_INSTANCE："050"，新增复制组。
- FLOW_OPEN_WAN："052"，开通外网。
- FLOW_CLOSE_WAN："053"，关闭外网FLOW_UPDATE_WAN："054"，更新外网。
- FLOW_CODE_DELETE_REPLICATION_INSTANCE："055"，解绑复制组。
- FLOW_CODE_CHANGE_MASTER_INSTANCE："056"，复制组实例切主。
- FLOW_CODE_CHANGE_INSTANCE_ROLE： "057"，更改复制组实例角色。
- FLOW_MIGRATE_NODE："058"，迁移节点。
- FLOW_SWITCH_NODE："059"，切换节点。
- FLOW_UPGRADE_SMALL_VERSION："060"，升级 Redi s版本。
- FLOW_UPGRADE_PROXY_VERSION："061"，升级 Proxy 版本。
- FLOW_MODIFY_INSTANCE_NETWORK： "062"，实例修改网络。
- FLOW_MIGRATE_PROXY_NODE："063"，迁移proxy节点。
- FLOW_MIGRATION_INSTANCE_ZONE："066"，实例可用区迁移中。
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY： "067"，实例版本升级中。
- FLOW_MODIFY_PROXY_NUM："069"，加（减）Proxy 节点。
- FLOW_MODIFYBACKUPMOD："070"，变更实例备份模式。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型。
- FLOW_CREATE: "001"，新建实例
- FLOW_RESIZE ： "002"，配置变更
- FLOW_CLOSE："003"，关闭实例
- FLOW_CLEAN： "004"，清空实例
- FLOW_STARTUP："005"，实例启用。
- FLOW_DELETE："006"，删除实例。
- FLOW_SETPWD："007"，重置密码。
- FLOW_EXPORTBACKUP："009"，导出备份文件。
- FLOW_RESTOREBACKUP："010"，恢复备份。
- FLOW_BACKUPINSTANCE："012"，备份实例。
- FLOW_MIGRATEINSTANCE："013"，迁移实例。
- FLOW_DELBACKUP："014"，删除备份。
- FLOW_EXCHANGEINSTANCE： "016"，切换实例流程。
- FLOW_AUTOBACKUP："017"，自动备份实例。
- FLOW_MIGRATECHECK： "022"，迁移参数校验。
- FLOW_MIGRATETASK："023"，数据迁移中。
- FLOW_CLEANDB："025"，清空某个数据库。
- FLOW_CLONEBACKUP："026"，克隆备份。
- FLOW_CHANGEVIP： "027"，改变vip地址。
- FLOW_EXPORSHR ："028"，扩缩容。
- FLOW_ADDNODES："029"，加（减）节点。
- FLOW_CHANGENET："031"，改变网络类型。
- FLOW_MODIFYINSTACEREADONLY："033"，只读策略变更。
- FLOW_MODIFYINSTANCEPARAMS："034"，修改实例参数。
- FLOW_MODIFYINSTANCEPASSWORDFREE："035"，设置免密。
- FLOW_SWITCHINSTANCEVIP："036"，实例VIP切换。
- FLOW_MODIFYINSTANCEACCOUNT："037"，实例帐号变更。
- FLOW_MODIFYINSTANCEBANDWIDTH："038"，实例带宽变更。
- FLOW_ENABLEINSTANCE_REPLICATE："039"，开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE："040"，关闭副本只读。
- FLOW_UpgradeArch："041"，实例架构升级，主从升集群。
- FLOW_DowngradeArch： "042"，实例架构降级，集群降主从。
- FLOW_UpgradeVersion： "043"，版本升级。
- FLOW_MODIFYCONNECTIONCONFIG："044"，带宽连接数调整。
- FLOW_CLEARNETWORK："045"，更换网络，
- FLOW_REMOVE_BACKUP_FILE："046"，删除备份。
- FLOW_UPGRADE_SUPPORT_MULTI_AZ："047"，升级实例支持多可用区。
- FLOW_SHUTDOWN_MASTER："048"，模拟故障。
- FLOW_CHANGE_REPLICA_TO_MASTER："049"，手动提主。
- FLOW_CODE_ADD_REPLICATION_INSTANCE："050"，新增复制组。
- FLOW_OPEN_WAN："052"，开通外网。
- FLOW_CLOSE_WAN："053"，关闭外网FLOW_UPDATE_WAN："054"，更新外网。
- FLOW_CODE_DELETE_REPLICATION_INSTANCE："055"，解绑复制组。
- FLOW_CODE_CHANGE_MASTER_INSTANCE："056"，复制组实例切主。
- FLOW_CODE_CHANGE_INSTANCE_ROLE： "057"，更改复制组实例角色。
- FLOW_MIGRATE_NODE："058"，迁移节点。
- FLOW_SWITCH_NODE："059"，切换节点。
- FLOW_UPGRADE_SMALL_VERSION："060"，升级 Redi s版本。
- FLOW_UPGRADE_PROXY_VERSION："061"，升级 Proxy 版本。
- FLOW_MODIFY_INSTANCE_NETWORK： "062"，实例修改网络。
- FLOW_MIGRATE_PROXY_NODE："063"，迁移proxy节点。
- FLOW_MIGRATION_INSTANCE_ZONE："066"，实例可用区迁移中。
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY： "067"，实例版本升级中。
- FLOW_MODIFY_PROXY_NUM："069"，加（减）Proxy 节点。
- FLOW_MODIFYBACKUPMOD："070"，变更实例备份模式。
     * @param TaskType 任务类型。
- FLOW_CREATE: "001"，新建实例
- FLOW_RESIZE ： "002"，配置变更
- FLOW_CLOSE："003"，关闭实例
- FLOW_CLEAN： "004"，清空实例
- FLOW_STARTUP："005"，实例启用。
- FLOW_DELETE："006"，删除实例。
- FLOW_SETPWD："007"，重置密码。
- FLOW_EXPORTBACKUP："009"，导出备份文件。
- FLOW_RESTOREBACKUP："010"，恢复备份。
- FLOW_BACKUPINSTANCE："012"，备份实例。
- FLOW_MIGRATEINSTANCE："013"，迁移实例。
- FLOW_DELBACKUP："014"，删除备份。
- FLOW_EXCHANGEINSTANCE： "016"，切换实例流程。
- FLOW_AUTOBACKUP："017"，自动备份实例。
- FLOW_MIGRATECHECK： "022"，迁移参数校验。
- FLOW_MIGRATETASK："023"，数据迁移中。
- FLOW_CLEANDB："025"，清空某个数据库。
- FLOW_CLONEBACKUP："026"，克隆备份。
- FLOW_CHANGEVIP： "027"，改变vip地址。
- FLOW_EXPORSHR ："028"，扩缩容。
- FLOW_ADDNODES："029"，加（减）节点。
- FLOW_CHANGENET："031"，改变网络类型。
- FLOW_MODIFYINSTACEREADONLY："033"，只读策略变更。
- FLOW_MODIFYINSTANCEPARAMS："034"，修改实例参数。
- FLOW_MODIFYINSTANCEPASSWORDFREE："035"，设置免密。
- FLOW_SWITCHINSTANCEVIP："036"，实例VIP切换。
- FLOW_MODIFYINSTANCEACCOUNT："037"，实例帐号变更。
- FLOW_MODIFYINSTANCEBANDWIDTH："038"，实例带宽变更。
- FLOW_ENABLEINSTANCE_REPLICATE："039"，开启副本只读。
- FLOW_DISABLEINSTANCE_REPLICATE："040"，关闭副本只读。
- FLOW_UpgradeArch："041"，实例架构升级，主从升集群。
- FLOW_DowngradeArch： "042"，实例架构降级，集群降主从。
- FLOW_UpgradeVersion： "043"，版本升级。
- FLOW_MODIFYCONNECTIONCONFIG："044"，带宽连接数调整。
- FLOW_CLEARNETWORK："045"，更换网络，
- FLOW_REMOVE_BACKUP_FILE："046"，删除备份。
- FLOW_UPGRADE_SUPPORT_MULTI_AZ："047"，升级实例支持多可用区。
- FLOW_SHUTDOWN_MASTER："048"，模拟故障。
- FLOW_CHANGE_REPLICA_TO_MASTER："049"，手动提主。
- FLOW_CODE_ADD_REPLICATION_INSTANCE："050"，新增复制组。
- FLOW_OPEN_WAN："052"，开通外网。
- FLOW_CLOSE_WAN："053"，关闭外网FLOW_UPDATE_WAN："054"，更新外网。
- FLOW_CODE_DELETE_REPLICATION_INSTANCE："055"，解绑复制组。
- FLOW_CODE_CHANGE_MASTER_INSTANCE："056"，复制组实例切主。
- FLOW_CODE_CHANGE_INSTANCE_ROLE： "057"，更改复制组实例角色。
- FLOW_MIGRATE_NODE："058"，迁移节点。
- FLOW_SWITCH_NODE："059"，切换节点。
- FLOW_UPGRADE_SMALL_VERSION："060"，升级 Redi s版本。
- FLOW_UPGRADE_PROXY_VERSION："061"，升级 Proxy 版本。
- FLOW_MODIFY_INSTANCE_NETWORK： "062"，实例修改网络。
- FLOW_MIGRATE_PROXY_NODE："063"，迁移proxy节点。
- FLOW_MIGRATION_INSTANCE_ZONE："066"，实例可用区迁移中。
- FLOW_UPGRADE_INSTANCE_CACHE_AND_PROXY： "067"，实例版本升级中。
- FLOW_MODIFY_PROXY_NUM："069"，加（减）Proxy 节点。
- FLOW_MODIFYBACKUPMOD："070"，变更实例备份模式。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
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
     * Get 项目 ID。 
     * @return ProjectId 项目 ID。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID。
     * @param ProjectId 项目 ID。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务进度。 
     * @return Progress 任务进度。
     */
    public Float getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务进度。
     * @param Progress 任务进度。
     */
    public void setProgress(Float Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 任务执行结束时间。 
     * @return EndTime 任务执行结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务执行结束时间。
     * @param EndTime 任务执行结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务执行状态。

0：任务初始化。
1：执行中。
2：完成。
4：失败。 
     * @return Result 任务执行状态。

0：任务初始化。
1：执行中。
2：完成。
4：失败。
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 任务执行状态。

0：任务初始化。
1：执行中。
2：完成。
4：失败。
     * @param Result 任务执行状态。

0：任务初始化。
1：执行中。
2：完成。
4：失败。
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public TaskInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoDetail(TaskInfoDetail source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Progress != null) {
            this.Progress = new Float(source.Progress);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

