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

public class ModifyBackupNameRequest extends AbstractModel{

    /**
    * 实例ID，格式如：mssql-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 要修改名称的备份ID，可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 修改的备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get 实例ID，格式如：mssql-3l3fgqn7 
     * @return InstanceId 实例ID，格式如：mssql-3l3fgqn7
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：mssql-3l3fgqn7
     * @param InstanceId 实例ID，格式如：mssql-3l3fgqn7
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 要修改名称的备份ID，可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。 
     * @return BackupId 要修改名称的备份ID，可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 要修改名称的备份ID，可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。
     * @param BackupId 要修改名称的备份ID，可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 修改的备份名称 
     * @return BackupName 修改的备份名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 修改的备份名称
     * @param BackupName 修改的备份名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

