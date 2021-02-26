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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Migration extends AbstractModel{

    /**
    * 备份导入任务ID 或 增量导入任务ID
    */
    @SerializedName("MigrationId")
    @Expose
    private String MigrationId;

    /**
    * 备份导入名称，增量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MigrationName")
    @Expose
    private String MigrationName;

    /**
    * 应用ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 迁移目标实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 迁移任务恢复类型
    */
    @SerializedName("RecoveryType")
    @Expose
    private String RecoveryType;

    /**
    * 备份用户上传类型，COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * 备份文件列表，UploadType确定，COS_URL则保存URL，COS_UPLOAD则保存备份名称
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

    /**
    * 迁移任务状态，
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 迁移任务创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 迁移任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 迁移任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 说明信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 迁移细节
    */
    @SerializedName("Detail")
    @Expose
    private MigrationDetail Detail;

    /**
    * 当前状态允许的操作
    */
    @SerializedName("Action")
    @Expose
    private MigrationAction Action;

    /**
    * 是否是最终恢复，全量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

    /**
     * Get 备份导入任务ID 或 增量导入任务ID 
     * @return MigrationId 备份导入任务ID 或 增量导入任务ID
     */
    public String getMigrationId() {
        return this.MigrationId;
    }

    /**
     * Set 备份导入任务ID 或 增量导入任务ID
     * @param MigrationId 备份导入任务ID 或 增量导入任务ID
     */
    public void setMigrationId(String MigrationId) {
        this.MigrationId = MigrationId;
    }

    /**
     * Get 备份导入名称，增量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MigrationName 备份导入名称，增量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMigrationName() {
        return this.MigrationName;
    }

    /**
     * Set 备份导入名称，增量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param MigrationName 备份导入名称，增量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMigrationName(String MigrationName) {
        this.MigrationName = MigrationName;
    }

    /**
     * Get 应用ID 
     * @return AppId 应用ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 应用ID
     * @param AppId 应用ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 迁移目标实例ID 
     * @return InstanceId 迁移目标实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 迁移目标实例ID
     * @param InstanceId 迁移目标实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 迁移任务恢复类型 
     * @return RecoveryType 迁移任务恢复类型
     */
    public String getRecoveryType() {
        return this.RecoveryType;
    }

    /**
     * Set 迁移任务恢复类型
     * @param RecoveryType 迁移任务恢复类型
     */
    public void setRecoveryType(String RecoveryType) {
        this.RecoveryType = RecoveryType;
    }

    /**
     * Get 备份用户上传类型，COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传 
     * @return UploadType 备份用户上传类型，COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 备份用户上传类型，COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     * @param UploadType 备份用户上传类型，COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get 备份文件列表，UploadType确定，COS_URL则保存URL，COS_UPLOAD则保存备份名称 
     * @return BackupFiles 备份文件列表，UploadType确定，COS_URL则保存URL，COS_UPLOAD则保存备份名称
     */
    public String [] getBackupFiles() {
        return this.BackupFiles;
    }

    /**
     * Set 备份文件列表，UploadType确定，COS_URL则保存URL，COS_UPLOAD则保存备份名称
     * @param BackupFiles 备份文件列表，UploadType确定，COS_URL则保存URL，COS_UPLOAD则保存备份名称
     */
    public void setBackupFiles(String [] BackupFiles) {
        this.BackupFiles = BackupFiles;
    }

    /**
     * Get 迁移任务状态， 
     * @return Status 迁移任务状态，
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 迁移任务状态，
     * @param Status 迁移任务状态，
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 迁移任务创建时间 
     * @return CreateTime 迁移任务创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 迁移任务创建时间
     * @param CreateTime 迁移任务创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 迁移任务开始时间 
     * @return StartTime 迁移任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 迁移任务开始时间
     * @param StartTime 迁移任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 迁移任务结束时间 
     * @return EndTime 迁移任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 迁移任务结束时间
     * @param EndTime 迁移任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 说明信息 
     * @return Message 说明信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 说明信息
     * @param Message 说明信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 迁移细节 
     * @return Detail 迁移细节
     */
    public MigrationDetail getDetail() {
        return this.Detail;
    }

    /**
     * Set 迁移细节
     * @param Detail 迁移细节
     */
    public void setDetail(MigrationDetail Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 当前状态允许的操作 
     * @return Action 当前状态允许的操作
     */
    public MigrationAction getAction() {
        return this.Action;
    }

    /**
     * Set 当前状态允许的操作
     * @param Action 当前状态允许的操作
     */
    public void setAction(MigrationAction Action) {
        this.Action = Action;
    }

    /**
     * Get 是否是最终恢复，全量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRecovery 是否是最终恢复，全量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set 是否是最终恢复，全量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRecovery 是否是最终恢复，全量导入任务该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MigrationId", this.MigrationId);
        this.setParamSimple(map, prefix + "MigrationName", this.MigrationName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RecoveryType", this.RecoveryType);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "Detail.", this.Detail);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);

    }
}

