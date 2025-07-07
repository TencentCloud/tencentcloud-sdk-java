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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBackupNameRequest extends AbstractModel {

    /**
    * 实例ID，格式如：mssql-3l3fgqn7
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 修改的备份名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
    * 备份ID 可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。当GroupId为空时，BackupId必填。
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份任务组ID，在单库备份文件模式下，可通过[DescribeBackups](https://cloud.tencent.com/document/product/238/19943) 接口获得。
 BackupId 和 GroupId 同时存在，按照BackupId进行修改。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

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
     * Get 备份ID 可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。当GroupId为空时，BackupId必填。 
     * @return BackupId 备份ID 可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。当GroupId为空时，BackupId必填。
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID 可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。当GroupId为空时，BackupId必填。
     * @param BackupId 备份ID 可通过 [DescribeBackups](https://cloud.tencent.com/document/product/238/19943)  接口获取。当GroupId为空时，BackupId必填。
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份任务组ID，在单库备份文件模式下，可通过[DescribeBackups](https://cloud.tencent.com/document/product/238/19943) 接口获得。
 BackupId 和 GroupId 同时存在，按照BackupId进行修改。 
     * @return GroupId 备份任务组ID，在单库备份文件模式下，可通过[DescribeBackups](https://cloud.tencent.com/document/product/238/19943) 接口获得。
 BackupId 和 GroupId 同时存在，按照BackupId进行修改。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 备份任务组ID，在单库备份文件模式下，可通过[DescribeBackups](https://cloud.tencent.com/document/product/238/19943) 接口获得。
 BackupId 和 GroupId 同时存在，按照BackupId进行修改。
     * @param GroupId 备份任务组ID，在单库备份文件模式下，可通过[DescribeBackups](https://cloud.tencent.com/document/product/238/19943) 接口获得。
 BackupId 和 GroupId 同时存在，按照BackupId进行修改。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public ModifyBackupNameRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBackupNameRequest(ModifyBackupNameRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

