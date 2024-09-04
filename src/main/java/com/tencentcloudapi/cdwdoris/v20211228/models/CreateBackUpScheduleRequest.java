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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackUpScheduleRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作类型 create(创建) update(编辑修改)
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 编辑时需要传
    */
    @SerializedName("ScheduleId")
    @Expose
    private Long ScheduleId;

    /**
    * 选择的星期 逗号分隔
废弃：使用ScheduleInfo
    */
    @SerializedName("WeekDays")
    @Expose
    private String WeekDays;

    /**
    * 执行小时
废弃：使用ScheduleInfo
    */
    @SerializedName("ExecuteHour")
    @Expose
    private Long ExecuteHour;

    /**
    * 备份表列表
    */
    @SerializedName("BackUpTables")
    @Expose
    private BackupTableContent [] BackUpTables;

    /**
    * 0为默认。1时是对远端的doris进行备份，不周期，一次性
    */
    @SerializedName("BackupType")
    @Expose
    private Long BackupType;

    /**
    * 远端doris集群的连接信息
    */
    @SerializedName("DorisSourceInfo")
    @Expose
    private DorisSourceInfo DorisSourceInfo;

    /**
    * 0为默认。1时是一次性备份。2时是远端备份
    */
    @SerializedName("BackupTimeType")
    @Expose
    private Long BackupTimeType;

    /**
    * 0为默认。1时是备份完成后立即恢复
    */
    @SerializedName("RestoreType")
    @Expose
    private Long RestoreType;

    /**
    * 0为默认。1时是提供自定义的secret连接cos
    */
    @SerializedName("AuthType")
    @Expose
    private Long AuthType;

    /**
    * cos认证的信息
    */
    @SerializedName("CosSourceInfo")
    @Expose
    private CosSourceInfo CosSourceInfo;

    /**
    * 调度任务名
    */
    @SerializedName("ScheduleName")
    @Expose
    private String ScheduleName;

    /**
    * 调度信息
    */
    @SerializedName("ScheduleInfo")
    @Expose
    private ScheduleInfo ScheduleInfo;

    /**
    * 更新任务状态：
3-暂停,
2-删除,
1-启动
    */
    @SerializedName("UpdateStatus")
    @Expose
    private Long UpdateStatus;

    /**
    * 当前任务的cos桶信息
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

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
     * Get 操作类型 create(创建) update(编辑修改) 
     * @return OperationType 操作类型 create(创建) update(编辑修改)
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * Set 操作类型 create(创建) update(编辑修改)
     * @param OperationType 操作类型 create(创建) update(编辑修改)
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * Get 编辑时需要传 
     * @return ScheduleId 编辑时需要传
     */
    public Long getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set 编辑时需要传
     * @param ScheduleId 编辑时需要传
     */
    public void setScheduleId(Long ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    /**
     * Get 选择的星期 逗号分隔
废弃：使用ScheduleInfo 
     * @return WeekDays 选择的星期 逗号分隔
废弃：使用ScheduleInfo
     */
    public String getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 选择的星期 逗号分隔
废弃：使用ScheduleInfo
     * @param WeekDays 选择的星期 逗号分隔
废弃：使用ScheduleInfo
     */
    public void setWeekDays(String WeekDays) {
        this.WeekDays = WeekDays;
    }

    /**
     * Get 执行小时
废弃：使用ScheduleInfo 
     * @return ExecuteHour 执行小时
废弃：使用ScheduleInfo
     */
    public Long getExecuteHour() {
        return this.ExecuteHour;
    }

    /**
     * Set 执行小时
废弃：使用ScheduleInfo
     * @param ExecuteHour 执行小时
废弃：使用ScheduleInfo
     */
    public void setExecuteHour(Long ExecuteHour) {
        this.ExecuteHour = ExecuteHour;
    }

    /**
     * Get 备份表列表 
     * @return BackUpTables 备份表列表
     */
    public BackupTableContent [] getBackUpTables() {
        return this.BackUpTables;
    }

    /**
     * Set 备份表列表
     * @param BackUpTables 备份表列表
     */
    public void setBackUpTables(BackupTableContent [] BackUpTables) {
        this.BackUpTables = BackUpTables;
    }

    /**
     * Get 0为默认。1时是对远端的doris进行备份，不周期，一次性 
     * @return BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性
     */
    public Long getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 0为默认。1时是对远端的doris进行备份，不周期，一次性
     * @param BackupType 0为默认。1时是对远端的doris进行备份，不周期，一次性
     */
    public void setBackupType(Long BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * Get 远端doris集群的连接信息 
     * @return DorisSourceInfo 远端doris集群的连接信息
     */
    public DorisSourceInfo getDorisSourceInfo() {
        return this.DorisSourceInfo;
    }

    /**
     * Set 远端doris集群的连接信息
     * @param DorisSourceInfo 远端doris集群的连接信息
     */
    public void setDorisSourceInfo(DorisSourceInfo DorisSourceInfo) {
        this.DorisSourceInfo = DorisSourceInfo;
    }

    /**
     * Get 0为默认。1时是一次性备份。2时是远端备份 
     * @return BackupTimeType 0为默认。1时是一次性备份。2时是远端备份
     */
    public Long getBackupTimeType() {
        return this.BackupTimeType;
    }

    /**
     * Set 0为默认。1时是一次性备份。2时是远端备份
     * @param BackupTimeType 0为默认。1时是一次性备份。2时是远端备份
     */
    public void setBackupTimeType(Long BackupTimeType) {
        this.BackupTimeType = BackupTimeType;
    }

    /**
     * Get 0为默认。1时是备份完成后立即恢复 
     * @return RestoreType 0为默认。1时是备份完成后立即恢复
     */
    public Long getRestoreType() {
        return this.RestoreType;
    }

    /**
     * Set 0为默认。1时是备份完成后立即恢复
     * @param RestoreType 0为默认。1时是备份完成后立即恢复
     */
    public void setRestoreType(Long RestoreType) {
        this.RestoreType = RestoreType;
    }

    /**
     * Get 0为默认。1时是提供自定义的secret连接cos 
     * @return AuthType 0为默认。1时是提供自定义的secret连接cos
     */
    public Long getAuthType() {
        return this.AuthType;
    }

    /**
     * Set 0为默认。1时是提供自定义的secret连接cos
     * @param AuthType 0为默认。1时是提供自定义的secret连接cos
     */
    public void setAuthType(Long AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * Get cos认证的信息 
     * @return CosSourceInfo cos认证的信息
     */
    public CosSourceInfo getCosSourceInfo() {
        return this.CosSourceInfo;
    }

    /**
     * Set cos认证的信息
     * @param CosSourceInfo cos认证的信息
     */
    public void setCosSourceInfo(CosSourceInfo CosSourceInfo) {
        this.CosSourceInfo = CosSourceInfo;
    }

    /**
     * Get 调度任务名 
     * @return ScheduleName 调度任务名
     */
    public String getScheduleName() {
        return this.ScheduleName;
    }

    /**
     * Set 调度任务名
     * @param ScheduleName 调度任务名
     */
    public void setScheduleName(String ScheduleName) {
        this.ScheduleName = ScheduleName;
    }

    /**
     * Get 调度信息 
     * @return ScheduleInfo 调度信息
     */
    public ScheduleInfo getScheduleInfo() {
        return this.ScheduleInfo;
    }

    /**
     * Set 调度信息
     * @param ScheduleInfo 调度信息
     */
    public void setScheduleInfo(ScheduleInfo ScheduleInfo) {
        this.ScheduleInfo = ScheduleInfo;
    }

    /**
     * Get 更新任务状态：
3-暂停,
2-删除,
1-启动 
     * @return UpdateStatus 更新任务状态：
3-暂停,
2-删除,
1-启动
     */
    public Long getUpdateStatus() {
        return this.UpdateStatus;
    }

    /**
     * Set 更新任务状态：
3-暂停,
2-删除,
1-启动
     * @param UpdateStatus 更新任务状态：
3-暂停,
2-删除,
1-启动
     */
    public void setUpdateStatus(Long UpdateStatus) {
        this.UpdateStatus = UpdateStatus;
    }

    /**
     * Get 当前任务的cos桶信息 
     * @return CosBucket 当前任务的cos桶信息
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set 当前任务的cos桶信息
     * @param CosBucket 当前任务的cos桶信息
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    public CreateBackUpScheduleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackUpScheduleRequest(CreateBackUpScheduleRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OperationType != null) {
            this.OperationType = new String(source.OperationType);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new Long(source.ScheduleId);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String(source.WeekDays);
        }
        if (source.ExecuteHour != null) {
            this.ExecuteHour = new Long(source.ExecuteHour);
        }
        if (source.BackUpTables != null) {
            this.BackUpTables = new BackupTableContent[source.BackUpTables.length];
            for (int i = 0; i < source.BackUpTables.length; i++) {
                this.BackUpTables[i] = new BackupTableContent(source.BackUpTables[i]);
            }
        }
        if (source.BackupType != null) {
            this.BackupType = new Long(source.BackupType);
        }
        if (source.DorisSourceInfo != null) {
            this.DorisSourceInfo = new DorisSourceInfo(source.DorisSourceInfo);
        }
        if (source.BackupTimeType != null) {
            this.BackupTimeType = new Long(source.BackupTimeType);
        }
        if (source.RestoreType != null) {
            this.RestoreType = new Long(source.RestoreType);
        }
        if (source.AuthType != null) {
            this.AuthType = new Long(source.AuthType);
        }
        if (source.CosSourceInfo != null) {
            this.CosSourceInfo = new CosSourceInfo(source.CosSourceInfo);
        }
        if (source.ScheduleName != null) {
            this.ScheduleName = new String(source.ScheduleName);
        }
        if (source.ScheduleInfo != null) {
            this.ScheduleInfo = new ScheduleInfo(source.ScheduleInfo);
        }
        if (source.UpdateStatus != null) {
            this.UpdateStatus = new Long(source.UpdateStatus);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);
        this.setParamSimple(map, prefix + "WeekDays", this.WeekDays);
        this.setParamSimple(map, prefix + "ExecuteHour", this.ExecuteHour);
        this.setParamArrayObj(map, prefix + "BackUpTables.", this.BackUpTables);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamObj(map, prefix + "DorisSourceInfo.", this.DorisSourceInfo);
        this.setParamSimple(map, prefix + "BackupTimeType", this.BackupTimeType);
        this.setParamSimple(map, prefix + "RestoreType", this.RestoreType);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamObj(map, prefix + "CosSourceInfo.", this.CosSourceInfo);
        this.setParamSimple(map, prefix + "ScheduleName", this.ScheduleName);
        this.setParamObj(map, prefix + "ScheduleInfo.", this.ScheduleInfo);
        this.setParamSimple(map, prefix + "UpdateStatus", this.UpdateStatus);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);

    }
}

