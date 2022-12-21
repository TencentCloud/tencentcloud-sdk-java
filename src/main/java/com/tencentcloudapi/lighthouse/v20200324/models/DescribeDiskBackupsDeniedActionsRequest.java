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

public class DescribeDiskBackupsDeniedActionsRequest extends AbstractModel{

    /**
    * 云硬盘备份点 ID 列表, 可通过 DescribeDiskBackups 接口查询。
    */
    @SerializedName("DiskBackupIds")
    @Expose
    private String [] DiskBackupIds;

    /**
     * Get 云硬盘备份点 ID 列表, 可通过 DescribeDiskBackups 接口查询。 
     * @return DiskBackupIds 云硬盘备份点 ID 列表, 可通过 DescribeDiskBackups 接口查询。
     */
    public String [] getDiskBackupIds() {
        return this.DiskBackupIds;
    }

    /**
     * Set 云硬盘备份点 ID 列表, 可通过 DescribeDiskBackups 接口查询。
     * @param DiskBackupIds 云硬盘备份点 ID 列表, 可通过 DescribeDiskBackups 接口查询。
     */
    public void setDiskBackupIds(String [] DiskBackupIds) {
        this.DiskBackupIds = DiskBackupIds;
    }

    public DescribeDiskBackupsDeniedActionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDiskBackupsDeniedActionsRequest(DescribeDiskBackupsDeniedActionsRequest source) {
        if (source.DiskBackupIds != null) {
            this.DiskBackupIds = new String[source.DiskBackupIds.length];
            for (int i = 0; i < source.DiskBackupIds.length; i++) {
                this.DiskBackupIds[i] = new String(source.DiskBackupIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskBackupIds.", this.DiskBackupIds);

    }
}

