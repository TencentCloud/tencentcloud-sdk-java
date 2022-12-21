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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDiskBackupRequest extends AbstractModel{

    /**
    * 云硬盘 ID。当前只支持数据盘创建备份点。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 云硬盘备份点名称，最大长度90。
    */
    @SerializedName("DiskBackupName")
    @Expose
    private String DiskBackupName;

    /**
     * Get 云硬盘 ID。当前只支持数据盘创建备份点。 
     * @return DiskId 云硬盘 ID。当前只支持数据盘创建备份点。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * Set 云硬盘 ID。当前只支持数据盘创建备份点。
     * @param DiskId 云硬盘 ID。当前只支持数据盘创建备份点。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * Get 云硬盘备份点名称，最大长度90。 
     * @return DiskBackupName 云硬盘备份点名称，最大长度90。
     */
    public String getDiskBackupName() {
        return this.DiskBackupName;
    }

    /**
     * Set 云硬盘备份点名称，最大长度90。
     * @param DiskBackupName 云硬盘备份点名称，最大长度90。
     */
    public void setDiskBackupName(String DiskBackupName) {
        this.DiskBackupName = DiskBackupName;
    }

    public CreateDiskBackupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDiskBackupRequest(CreateDiskBackupRequest source) {
        if (source.DiskId != null) {
            this.DiskId = new String(source.DiskId);
        }
        if (source.DiskBackupName != null) {
            this.DiskBackupName = new String(source.DiskBackupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskBackupName", this.DiskBackupName);

    }
}

