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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EDRScanRecordItem extends AbstractModel {

    /**
    * <p>任务主键 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务名称，如 Malware_20260702_030000</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>扫描类型</p><p>枚举值：</p><ul><li>MANNAL： 手动扫描</li><li>CYCLE： 定时扫描</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>定时调度描述（ScanType=1 时有值），如“每天 03:00:00”</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleDesc")
    @Expose
    private String ScheduleDesc;

    /**
    * <p>任务资产类型：0=主机扫描，1=容器扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>扫描目标涉及的账号AppId列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAppIDs")
    @Expose
    private Long [] TargetAppIDs;

    /**
    * <p>任务创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>云类型：0=腾讯云，1=AWS，2=Azure，4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>资产选择方式：all=全部资产，tag=按标签选择，direct=直接选择</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>扫描资产总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalAssetCount")
    @Expose
    private Long TotalAssetCount;

    /**
    * <p>创建者账号AppId（前端据此判断操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateAppID")
    @Expose
    private Long CreateAppID;

    /**
    * <p>创建者账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * <p>创建者云类型：0=腾讯云, 1=AWS, 2=Azure, 4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorCloudType")
    @Expose
    private Long CreatorCloudType;

    /**
    * <p>任务开始时间，格式 2006-01-02 15:04:05</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>任务结束时间，未结束为空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>WAIT：待扫描，SCANNING：扫描中，FINISHED：已完成，FAILED：失败，CANCELED：已停止</p><p>枚举值：</p><ul><li>WAIT： 待扫描</li><li>SCANNING： 扫描中</li><li>FINISHED： 已完成</li><li>FAILED： 失败</li><li>CANCELED： 已停止</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>任务主键 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务主键 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务主键 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务主键 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称，如 Malware_20260702_030000</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称，如 Malware_20260702_030000</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称，如 Malware_20260702_030000</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称，如 Malware_20260702_030000</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>扫描类型</p><p>枚举值：</p><ul><li>MANNAL： 手动扫描</li><li>CYCLE： 定时扫描</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>扫描类型</p><p>枚举值：</p><ul><li>MANNAL： 手动扫描</li><li>CYCLE： 定时扫描</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>扫描类型</p><p>枚举值：</p><ul><li>MANNAL： 手动扫描</li><li>CYCLE： 定时扫描</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>扫描类型</p><p>枚举值：</p><ul><li>MANNAL： 手动扫描</li><li>CYCLE： 定时扫描</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>定时调度描述（ScanType=1 时有值），如“每天 03:00:00”</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleDesc <p>定时调度描述（ScanType=1 时有值），如“每天 03:00:00”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleDesc() {
        return this.ScheduleDesc;
    }

    /**
     * Set <p>定时调度描述（ScanType=1 时有值），如“每天 03:00:00”</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleDesc <p>定时调度描述（ScanType=1 时有值），如“每天 03:00:00”</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleDesc(String ScheduleDesc) {
        this.ScheduleDesc = ScheduleDesc;
    }

    /**
     * Get <p>任务资产类型：0=主机扫描，1=容器扫描</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务资产类型：0=主机扫描，1=容器扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务资产类型：0=主机扫描，1=容器扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务资产类型：0=主机扫描，1=容器扫描</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>扫描目标涉及的账号AppId列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAppIDs <p>扫描目标涉及的账号AppId列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getTargetAppIDs() {
        return this.TargetAppIDs;
    }

    /**
     * Set <p>扫描目标涉及的账号AppId列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAppIDs <p>扫描目标涉及的账号AppId列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAppIDs(Long [] TargetAppIDs) {
        this.TargetAppIDs = TargetAppIDs;
    }

    /**
     * Get <p>任务创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountName <p>任务创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>任务创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountName <p>任务创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>云类型：0=腾讯云，1=AWS，2=Azure，4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudType <p>云类型：0=腾讯云，1=AWS，2=Azure，4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>云类型：0=腾讯云，1=AWS，2=Azure，4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudType <p>云类型：0=腾讯云，1=AWS，2=Azure，4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>资产选择方式：all=全部资产，tag=按标签选择，direct=直接选择</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetSelectionType <p>资产选择方式：all=全部资产，tag=按标签选择，direct=直接选择</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>资产选择方式：all=全部资产，tag=按标签选择，direct=直接选择</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetSelectionType <p>资产选择方式：all=全部资产，tag=按标签选择，direct=直接选择</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>扫描资产总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalAssetCount <p>扫描资产总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalAssetCount() {
        return this.TotalAssetCount;
    }

    /**
     * Set <p>扫描资产总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalAssetCount <p>扫描资产总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalAssetCount(Long TotalAssetCount) {
        this.TotalAssetCount = TotalAssetCount;
    }

    /**
     * Get <p>创建者账号AppId（前端据此判断操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateAppID <p>创建者账号AppId（前端据此判断操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateAppID() {
        return this.CreateAppID;
    }

    /**
     * Set <p>创建者账号AppId（前端据此判断操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateAppID <p>创建者账号AppId（前端据此判断操作权限）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateAppID(Long CreateAppID) {
        this.CreateAppID = CreateAppID;
    }

    /**
     * Get <p>创建者账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建者账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建者账号uin</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorName <p>创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set <p>创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorName <p>创建者账号名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get <p>创建者云类型：0=腾讯云, 1=AWS, 2=Azure, 4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorCloudType <p>创建者云类型：0=腾讯云, 1=AWS, 2=Azure, 4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreatorCloudType() {
        return this.CreatorCloudType;
    }

    /**
     * Set <p>创建者云类型：0=腾讯云, 1=AWS, 2=Azure, 4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorCloudType <p>创建者云类型：0=腾讯云, 1=AWS, 2=Azure, 4=阿里云</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorCloudType(Long CreatorCloudType) {
        this.CreatorCloudType = CreatorCloudType;
    }

    /**
     * Get <p>任务开始时间，格式 2006-01-02 15:04:05</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>任务开始时间，格式 2006-01-02 15:04:05</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>任务开始时间，格式 2006-01-02 15:04:05</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>任务开始时间，格式 2006-01-02 15:04:05</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>任务结束时间，未结束为空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>任务结束时间，未结束为空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>任务结束时间，未结束为空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>任务结束时间，未结束为空字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>WAIT：待扫描，SCANNING：扫描中，FINISHED：已完成，FAILED：失败，CANCELED：已停止</p><p>枚举值：</p><ul><li>WAIT： 待扫描</li><li>SCANNING： 扫描中</li><li>FINISHED： 已完成</li><li>FAILED： 失败</li><li>CANCELED： 已停止</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>WAIT：待扫描，SCANNING：扫描中，FINISHED：已完成，FAILED：失败，CANCELED：已停止</p><p>枚举值：</p><ul><li>WAIT： 待扫描</li><li>SCANNING： 扫描中</li><li>FINISHED： 已完成</li><li>FAILED： 失败</li><li>CANCELED： 已停止</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>WAIT：待扫描，SCANNING：扫描中，FINISHED：已完成，FAILED：失败，CANCELED：已停止</p><p>枚举值：</p><ul><li>WAIT： 待扫描</li><li>SCANNING： 扫描中</li><li>FINISHED： 已完成</li><li>FAILED： 失败</li><li>CANCELED： 已停止</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>WAIT：待扫描，SCANNING：扫描中，FINISHED：已完成，FAILED：失败，CANCELED：已停止</p><p>枚举值：</p><ul><li>WAIT： 待扫描</li><li>SCANNING： 扫描中</li><li>FINISHED： 已完成</li><li>FAILED： 失败</li><li>CANCELED： 已停止</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public EDRScanRecordItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanRecordItem(EDRScanRecordItem source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ScheduleDesc != null) {
            this.ScheduleDesc = new String(source.ScheduleDesc);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TargetAppIDs != null) {
            this.TargetAppIDs = new Long[source.TargetAppIDs.length];
            for (int i = 0; i < source.TargetAppIDs.length; i++) {
                this.TargetAppIDs[i] = new Long(source.TargetAppIDs[i]);
            }
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.TotalAssetCount != null) {
            this.TotalAssetCount = new Long(source.TotalAssetCount);
        }
        if (source.CreateAppID != null) {
            this.CreateAppID = new Long(source.CreateAppID);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.CreatorCloudType != null) {
            this.CreatorCloudType = new Long(source.CreatorCloudType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ScheduleDesc", this.ScheduleDesc);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "TargetAppIDs.", this.TargetAppIDs);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamSimple(map, prefix + "TotalAssetCount", this.TotalAssetCount);
        this.setParamSimple(map, prefix + "CreateAppID", this.CreateAppID);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "CreatorCloudType", this.CreatorCloudType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

