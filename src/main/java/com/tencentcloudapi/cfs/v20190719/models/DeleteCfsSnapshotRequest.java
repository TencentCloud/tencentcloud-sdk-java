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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCfsSnapshotRequest extends AbstractModel{

    /**
    * 文件系统快照id
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 需要删除的文件文件系统快照ID 列表，快照ID，跟ID列表至少填一项
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
     * Get 文件系统快照id 
     * @return SnapshotId 文件系统快照id
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 文件系统快照id
     * @param SnapshotId 文件系统快照id
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 需要删除的文件文件系统快照ID 列表，快照ID，跟ID列表至少填一项 
     * @return SnapshotIds 需要删除的文件文件系统快照ID 列表，快照ID，跟ID列表至少填一项
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 需要删除的文件文件系统快照ID 列表，快照ID，跟ID列表至少填一项
     * @param SnapshotIds 需要删除的文件文件系统快照ID 列表，快照ID，跟ID列表至少填一项
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    public DeleteCfsSnapshotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCfsSnapshotRequest(DeleteCfsSnapshotRequest source) {
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);

    }
}

