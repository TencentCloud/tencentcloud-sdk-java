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

public class StartBackupMigrationRequest extends AbstractModel{

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

    public StartBackupMigrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartBackupMigrationRequest(StartBackupMigrationRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupMigrationId != null) {
            this.BackupMigrationId = new String(source.BackupMigrationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupMigrationId", this.BackupMigrationId);

    }
}

