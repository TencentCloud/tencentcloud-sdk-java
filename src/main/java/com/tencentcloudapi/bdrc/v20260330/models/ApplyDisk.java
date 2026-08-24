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

public class ApplyDisk extends AbstractModel {

    /**
    * 备份ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 云盘ID
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * Get 备份ID 
     * @return BackupId 备份ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID
     * @param BackupId 备份ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 云盘ID 
     * @return DiskId 云盘ID
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云盘ID
     * @param DiskId 云盘ID
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    public ApplyDisk() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyDisk(ApplyDisk source) {
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

