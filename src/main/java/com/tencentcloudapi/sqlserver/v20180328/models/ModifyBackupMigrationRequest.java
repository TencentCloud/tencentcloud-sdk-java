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

public class ModifyBackupMigrationRequest extends AbstractModel{

    /**
    * 导入目标实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份导入任务ID，由CreateBackupMigration接口返回
    */
    @SerializedName("BackupMigrationId")
    @Expose
    private String BackupMigrationId;

    /**
    * 任务名称
    */
    @SerializedName("MigrationName")
    @Expose
    private String MigrationName;

    /**
    * 迁移任务恢复类型，FULL,FULL_LOG,FULL_DIFF
    */
    @SerializedName("RecoveryType")
    @Expose
    private String RecoveryType;

    /**
    * COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * UploadType是COS_URL时这里时URL，COS_UPLOAD这里填备份文件的名字；只支持1个备份文件，但1个备份文件内可包含多个库
    */
    @SerializedName("BackupFiles")
    @Expose
    private String [] BackupFiles;

    /**
     * Get 导入目标实例ID 
     * @return InstanceId 导入目标实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 导入目标实例ID
     * @param InstanceId 导入目标实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份导入任务ID，由CreateBackupMigration接口返回 
     * @return BackupMigrationId 备份导入任务ID，由CreateBackupMigration接口返回
     */
    public String getBackupMigrationId() {
        return this.BackupMigrationId;
    }

    /**
     * Set 备份导入任务ID，由CreateBackupMigration接口返回
     * @param BackupMigrationId 备份导入任务ID，由CreateBackupMigration接口返回
     */
    public void setBackupMigrationId(String BackupMigrationId) {
        this.BackupMigrationId = BackupMigrationId;
    }

    /**
     * Get 任务名称 
     * @return MigrationName 任务名称
     */
    public String getMigrationName() {
        return this.MigrationName;
    }

    /**
     * Set 任务名称
     * @param MigrationName 任务名称
     */
    public void setMigrationName(String MigrationName) {
        this.MigrationName = MigrationName;
    }

    /**
     * Get 迁移任务恢复类型，FULL,FULL_LOG,FULL_DIFF 
     * @return RecoveryType 迁移任务恢复类型，FULL,FULL_LOG,FULL_DIFF
     */
    public String getRecoveryType() {
        return this.RecoveryType;
    }

    /**
     * Set 迁移任务恢复类型，FULL,FULL_LOG,FULL_DIFF
     * @param RecoveryType 迁移任务恢复类型，FULL,FULL_LOG,FULL_DIFF
     */
    public void setRecoveryType(String RecoveryType) {
        this.RecoveryType = RecoveryType;
    }

    /**
     * Get COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传 
     * @return UploadType COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     * @param UploadType COS_URL-备份放在用户的对象存储上，提供URL。COS_UPLOAD-备份放在业务的对象存储上，用户上传
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get UploadType是COS_URL时这里时URL，COS_UPLOAD这里填备份文件的名字；只支持1个备份文件，但1个备份文件内可包含多个库 
     * @return BackupFiles UploadType是COS_URL时这里时URL，COS_UPLOAD这里填备份文件的名字；只支持1个备份文件，但1个备份文件内可包含多个库
     */
    public String [] getBackupFiles() {
        return this.BackupFiles;
    }

    /**
     * Set UploadType是COS_URL时这里时URL，COS_UPLOAD这里填备份文件的名字；只支持1个备份文件，但1个备份文件内可包含多个库
     * @param BackupFiles UploadType是COS_URL时这里时URL，COS_UPLOAD这里填备份文件的名字；只支持1个备份文件，但1个备份文件内可包含多个库
     */
    public void setBackupFiles(String [] BackupFiles) {
        this.BackupFiles = BackupFiles;
    }

    public ModifyBackupMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupMigrationRequest(ModifyBackupMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.MigrationName != null) {
            this.MigrationName = new String(source.MigrationName);
        }
        if (source.RecoveryType != null) {
            this.RecoveryType = new String(source.RecoveryType);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.BackupFiles != null) {
            this.BackupFiles = new String[source.BackupFiles.length];
            for (int i = 0; i < source.BackupFiles.length; i++) {
                this.BackupFiles[i] = new String(source.BackupFiles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "MigrationName", this.MigrationName);
        this.setParamSimple(map, prefix + "RecoveryType", this.RecoveryType);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);

    }
}

