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

public class ModifyIncrementalMigrationRequest extends AbstractModel{

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
    * 增量导入任务ID，由CreateIncrementalMigration接口返回
    */
    @SerializedName("IncrementalMigrationId")
    @Expose
    private String IncrementalMigrationId;

    /**
    * 是否需要恢复，NO-不需要，YES-需要，默认不修改增量备份导入任务是否需要恢复的属性。
    */
    @SerializedName("IsRecovery")
    @Expose
    private String IsRecovery;

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
     * Get 增量导入任务ID，由CreateIncrementalMigration接口返回 
     * @return IncrementalMigrationId 增量导入任务ID，由CreateIncrementalMigration接口返回
     */
    public String getIncrementalMigrationId() {
        return this.IncrementalMigrationId;
    }

    /**
     * Set 增量导入任务ID，由CreateIncrementalMigration接口返回
     * @param IncrementalMigrationId 增量导入任务ID，由CreateIncrementalMigration接口返回
     */
    public void setIncrementalMigrationId(String IncrementalMigrationId) {
        this.IncrementalMigrationId = IncrementalMigrationId;
    }

    /**
     * Get 是否需要恢复，NO-不需要，YES-需要，默认不修改增量备份导入任务是否需要恢复的属性。 
     * @return IsRecovery 是否需要恢复，NO-不需要，YES-需要，默认不修改增量备份导入任务是否需要恢复的属性。
     */
    public String getIsRecovery() {
        return this.IsRecovery;
    }

    /**
     * Set 是否需要恢复，NO-不需要，YES-需要，默认不修改增量备份导入任务是否需要恢复的属性。
     * @param IsRecovery 是否需要恢复，NO-不需要，YES-需要，默认不修改增量备份导入任务是否需要恢复的属性。
     */
    public void setIsRecovery(String IsRecovery) {
        this.IsRecovery = IsRecovery;
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

    public ModifyIncrementalMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIncrementalMigrationRequest(ModifyIncrementalMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.IncrementalMigrationId != null) {
            this.IncrementalMigrationId = new String(source.IncrementalMigrationId);
        }
        if (source.IsRecovery != null) {
            this.IsRecovery = new String(source.IsRecovery);
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
        this.setParamSimple(map, prefix + "IncrementalMigrationId", this.IncrementalMigrationId);
        this.setParamSimple(map, prefix + "IsRecovery", this.IsRecovery);
        this.setParamArraySimple(map, prefix + "BackupFiles.", this.BackupFiles);

    }
}

