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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * 快照策略ID，通过快照策略列表获取
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 文件系统id列表，用“,”分隔，文件系统id通过查询文件系统列表获得
    */
    @SerializedName("FileSystemIds")
    @Expose
    private String FileSystemIds;

    /**
     * Get 快照策略ID，通过快照策略列表获取 
     * @return AutoSnapshotPolicyId 快照策略ID，通过快照策略列表获取
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 快照策略ID，通过快照策略列表获取
     * @param AutoSnapshotPolicyId 快照策略ID，通过快照策略列表获取
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 文件系统id列表，用“,”分隔，文件系统id通过查询文件系统列表获得 
     * @return FileSystemIds 文件系统id列表，用“,”分隔，文件系统id通过查询文件系统列表获得
     */
    public String getFileSystemIds() {
        return this.FileSystemIds;
    }

    /**
     * Set 文件系统id列表，用“,”分隔，文件系统id通过查询文件系统列表获得
     * @param FileSystemIds 文件系统id列表，用“,”分隔，文件系统id通过查询文件系统列表获得
     */
    public void setFileSystemIds(String FileSystemIds) {
        this.FileSystemIds = FileSystemIds;
    }

    public BindAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindAutoSnapshotPolicyRequest(BindAutoSnapshotPolicyRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.FileSystemIds != null) {
            this.FileSystemIds = new String(source.FileSystemIds);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamSimple(map, prefix + "FileSystemIds", this.FileSystemIds);

    }
}

