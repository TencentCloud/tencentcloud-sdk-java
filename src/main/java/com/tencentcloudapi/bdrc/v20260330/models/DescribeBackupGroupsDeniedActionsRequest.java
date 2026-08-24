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

public class DescribeBackupGroupsDeniedActionsRequest extends AbstractModel {

    /**
    * 备份组列表
    */
    @SerializedName("BackupGroupIds")
    @Expose
    private String [] BackupGroupIds;

    /**
     * Get 备份组列表 
     * @return BackupGroupIds 备份组列表
     */
    public String [] getBackupGroupIds() {
        return this.BackupGroupIds;
    }

    /**
     * Set 备份组列表
     * @param BackupGroupIds 备份组列表
     */
    public void setBackupGroupIds(String [] BackupGroupIds) {
        this.BackupGroupIds = BackupGroupIds;
    }

    public DescribeBackupGroupsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupGroupsDeniedActionsRequest(DescribeBackupGroupsDeniedActionsRequest source) {
        if (source.BackupGroupIds != null) {
            this.BackupGroupIds = new String[source.BackupGroupIds.length];
            for (int i = 0; i < source.BackupGroupIds.length; i++) {
                this.BackupGroupIds[i] = new String(source.BackupGroupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BackupGroupIds.", this.BackupGroupIds);

    }
}

