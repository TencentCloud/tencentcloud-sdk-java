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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupRegionAndIds extends AbstractModel {

    /**
    * 备份地域
    */
    @SerializedName("BackupRegion")
    @Expose
    private String BackupRegion;

    /**
    * 备份ID
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
     * Get 备份地域 
     * @return BackupRegion 备份地域
     */
    public String getBackupRegion() {
        return this.BackupRegion;
    }

    /**
     * Set 备份地域
     * @param BackupRegion 备份地域
     */
    public void setBackupRegion(String BackupRegion) {
        this.BackupRegion = BackupRegion;
    }

    /**
     * Get 备份ID 
     * @return BackupId 备份ID
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份ID
     * @param BackupId 备份ID
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    public BackupRegionAndIds() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupRegionAndIds(BackupRegionAndIds source) {
        if (source.BackupRegion != null) {
            this.BackupRegion = new String(source.BackupRegion);
        }
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupRegion", this.BackupRegion);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

