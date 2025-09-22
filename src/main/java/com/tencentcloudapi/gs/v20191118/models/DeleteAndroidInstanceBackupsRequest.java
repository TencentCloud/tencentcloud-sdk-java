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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAndroidInstanceBackupsRequest extends AbstractModel {

    /**
    * 备份ID列表
    */
    @SerializedName("BackupIds")
    @Expose
    private String [] BackupIds;

    /**
     * Get 备份ID列表 
     * @return BackupIds 备份ID列表
     */
    public String [] getBackupIds() {
        return this.BackupIds;
    }

    /**
     * Set 备份ID列表
     * @param BackupIds 备份ID列表
     */
    public void setBackupIds(String [] BackupIds) {
        this.BackupIds = BackupIds;
    }

    public DeleteAndroidInstanceBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAndroidInstanceBackupsRequest(DeleteAndroidInstanceBackupsRequest source) {
        if (source.BackupIds != null) {
            this.BackupIds = new String[source.BackupIds.length];
            for (int i = 0; i < source.BackupIds.length; i++) {
                this.BackupIds[i] = new String(source.BackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BackupIds.", this.BackupIds);

    }
}

