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

public class RestoreInstanceRequest extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
    * 按照ReNameRestoreDatabase中的库进行恢复，并重命名，不填则按照默认方式命名恢复的库，且恢复所有的库。
    */
    @SerializedName("RenameRestore")
    @Expose
    private RenameRestoreDatabase [] RenameRestore;

    /**
     * Get 实例ID，形如mssql-j8kv137v 
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得 
     * @return BackupId 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     * @param BackupId 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID 
     * @return TargetInstanceId 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     * @param TargetInstanceId 备份恢复到的同一个APPID下的实例ID，不填则恢复到原实例ID
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    /**
     * Get 按照ReNameRestoreDatabase中的库进行恢复，并重命名，不填则按照默认方式命名恢复的库，且恢复所有的库。 
     * @return RenameRestore 按照ReNameRestoreDatabase中的库进行恢复，并重命名，不填则按照默认方式命名恢复的库，且恢复所有的库。
     */
    public RenameRestoreDatabase [] getRenameRestore() {
        return this.RenameRestore;
    }

    /**
     * Set 按照ReNameRestoreDatabase中的库进行恢复，并重命名，不填则按照默认方式命名恢复的库，且恢复所有的库。
     * @param RenameRestore 按照ReNameRestoreDatabase中的库进行恢复，并重命名，不填则按照默认方式命名恢复的库，且恢复所有的库。
     */
    public void setRenameRestore(RenameRestoreDatabase [] RenameRestore) {
        this.RenameRestore = RenameRestore;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);
        this.setParamArrayObj(map, prefix + "RenameRestore.", this.RenameRestore);

    }
}

