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

public class DeleteIncrementalMigrationRequest extends AbstractModel{

    /**
    * 目标实例ID
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
    * 增量备份导入任务ID，由CreateIncrementalMigration接口返回
    */
    @SerializedName("IncrementalMigrationId")
    @Expose
    private String IncrementalMigrationId;

    /**
     * Get 目标实例ID 
     * @return InstanceId 目标实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 目标实例ID
     * @param InstanceId 目标实例ID
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
     * Get 增量备份导入任务ID，由CreateIncrementalMigration接口返回 
     * @return IncrementalMigrationId 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     */
    public String getIncrementalMigrationId() {
        return this.IncrementalMigrationId;
    }

    /**
     * Set 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     * @param IncrementalMigrationId 增量备份导入任务ID，由CreateIncrementalMigration接口返回
     */
    public void setIncrementalMigrationId(String IncrementalMigrationId) {
        this.IncrementalMigrationId = IncrementalMigrationId;
    }

    public DeleteIncrementalMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteIncrementalMigrationRequest(DeleteIncrementalMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
        if (source.IncrementalMigrationId != null) {
            this.IncrementalMigrationId = new String(source.IncrementalMigrationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);
        this.setParamSimple(map, prefix + "IncrementalMigrationId", this.IncrementalMigrationId);

    }
}

