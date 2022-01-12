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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloneDBInstanceSpecRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 基础备份集ID，此入参和RecoveryTargetTime必须选择一个传入。如与RecoveryTargetTime参数同时设置，则以此参数为准。
    */
    @SerializedName("BackupSetId")
    @Expose
    private String BackupSetId;

    /**
    * 恢复目标时间，此入参和BackupSetId必须选择一个传入。时区以东八区（UTC+8）为准。
    */
    @SerializedName("RecoveryTargetTime")
    @Expose
    private String RecoveryTargetTime;

    /**
     * Get 实例ID。 
     * @return DBInstanceId 实例ID。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。
     * @param DBInstanceId 实例ID。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 基础备份集ID，此入参和RecoveryTargetTime必须选择一个传入。如与RecoveryTargetTime参数同时设置，则以此参数为准。 
     * @return BackupSetId 基础备份集ID，此入参和RecoveryTargetTime必须选择一个传入。如与RecoveryTargetTime参数同时设置，则以此参数为准。
     */
    public String getBackupSetId() {
        return this.BackupSetId;
    }

    /**
     * Set 基础备份集ID，此入参和RecoveryTargetTime必须选择一个传入。如与RecoveryTargetTime参数同时设置，则以此参数为准。
     * @param BackupSetId 基础备份集ID，此入参和RecoveryTargetTime必须选择一个传入。如与RecoveryTargetTime参数同时设置，则以此参数为准。
     */
    public void setBackupSetId(String BackupSetId) {
        this.BackupSetId = BackupSetId;
    }

    /**
     * Get 恢复目标时间，此入参和BackupSetId必须选择一个传入。时区以东八区（UTC+8）为准。 
     * @return RecoveryTargetTime 恢复目标时间，此入参和BackupSetId必须选择一个传入。时区以东八区（UTC+8）为准。
     */
    public String getRecoveryTargetTime() {
        return this.RecoveryTargetTime;
    }

    /**
     * Set 恢复目标时间，此入参和BackupSetId必须选择一个传入。时区以东八区（UTC+8）为准。
     * @param RecoveryTargetTime 恢复目标时间，此入参和BackupSetId必须选择一个传入。时区以东八区（UTC+8）为准。
     */
    public void setRecoveryTargetTime(String RecoveryTargetTime) {
        this.RecoveryTargetTime = RecoveryTargetTime;
    }

    public DescribeCloneDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloneDBInstanceSpecRequest(DescribeCloneDBInstanceSpecRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.BackupSetId != null) {
            this.BackupSetId = new String(source.BackupSetId);
        }
        if (source.RecoveryTargetTime != null) {
            this.RecoveryTargetTime = new String(source.RecoveryTargetTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "BackupSetId", this.BackupSetId);
        this.setParamSimple(map, prefix + "RecoveryTargetTime", this.RecoveryTargetTime);

    }
}

