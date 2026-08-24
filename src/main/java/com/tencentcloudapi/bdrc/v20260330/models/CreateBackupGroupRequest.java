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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBackupGroupRequest extends AbstractModel {

    /**
    * 需要创建备份组的云硬盘ID列表。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 备份组的名称
    */
    @SerializedName("BackupGroupName")
    @Expose
    private String BackupGroupName;

    /**
    * 指定备份组到期时间，如果未传入该参数，默认为永久保留。
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
     * Get 需要创建备份组的云硬盘ID列表。 
     * @return DiskIds 需要创建备份组的云硬盘ID列表。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 需要创建备份组的云硬盘ID列表。
     * @param DiskIds 需要创建备份组的云硬盘ID列表。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 备份组的名称 
     * @return BackupGroupName 备份组的名称
     */
    public String getBackupGroupName() {
        return this.BackupGroupName;
    }

    /**
     * Set 备份组的名称
     * @param BackupGroupName 备份组的名称
     */
    public void setBackupGroupName(String BackupGroupName) {
        this.BackupGroupName = BackupGroupName;
    }

    /**
     * Get 指定备份组到期时间，如果未传入该参数，默认为永久保留。 
     * @return Deadline 指定备份组到期时间，如果未传入该参数，默认为永久保留。
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 指定备份组到期时间，如果未传入该参数，默认为永久保留。
     * @param Deadline 指定备份组到期时间，如果未传入该参数，默认为永久保留。
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    public CreateBackupGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBackupGroupRequest(CreateBackupGroupRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.BackupGroupName != null) {
            this.BackupGroupName = new String(source.BackupGroupName);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "BackupGroupName", this.BackupGroupName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);

    }
}

