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

public class WillDeleteItem extends AbstractModel {

    /**
    * 备份文件ID
    */
    @SerializedName("BackupId")
    @Expose
    private Long BackupId;

    /**
    * 备份文件名称
    */
    @SerializedName("BackupName")
    @Expose
    private String BackupName;

    /**
     * Get 备份文件ID 
     * @return BackupId 备份文件ID
     */
    public Long getBackupId() {
        return this.BackupId;
    }

    /**
     * Set 备份文件ID
     * @param BackupId 备份文件ID
     */
    public void setBackupId(Long BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * Get 备份文件名称 
     * @return BackupName 备份文件名称
     */
    public String getBackupName() {
        return this.BackupName;
    }

    /**
     * Set 备份文件名称
     * @param BackupName 备份文件名称
     */
    public void setBackupName(String BackupName) {
        this.BackupName = BackupName;
    }

    public WillDeleteItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WillDeleteItem(WillDeleteItem source) {
        if (source.BackupId != null) {
            this.BackupId = new Long(source.BackupId);
        }
        if (source.BackupName != null) {
            this.BackupName = new String(source.BackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupName", this.BackupName);

    }
}

