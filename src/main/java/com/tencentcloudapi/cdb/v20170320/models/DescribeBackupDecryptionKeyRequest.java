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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDecryptionKeyRequest extends AbstractModel {

    /**
    * 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例的备份ID，可通过DescribeBackups接口查询备份的ID。
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份类型 data: 数据备份 binlog:日志备份，默认为data
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
     * Get 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例ID，格式如：cdb-XXXX。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例的备份ID，可通过DescribeBackups接口查询备份的ID。 
     * @return BackupId 实例的备份ID，可通过DescribeBackups接口查询备份的ID。
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 实例的备份ID，可通过DescribeBackups接口查询备份的ID。
     * @param BackupId 实例的备份ID，可通过DescribeBackups接口查询备份的ID。
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份类型 data: 数据备份 binlog:日志备份，默认为data 
     * @return BackupType 备份类型 data: 数据备份 binlog:日志备份，默认为data
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * Set 备份类型 data: 数据备份 binlog:日志备份，默认为data
     * @param BackupType 备份类型 data: 数据备份 binlog:日志备份，默认为data
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    public DescribeBackupDecryptionKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDecryptionKeyRequest(DescribeBackupDecryptionKeyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupType != null) {
            this.BackupType = new String(source.BackupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);

    }
}

