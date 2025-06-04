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
    * 需要解绑的文件系统ID列表，用"," 分割，文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 解绑的快照策略ID，可以通过[DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/582/80208) 查询获取
    */
    @SerializedName("FileSystemIds")
    @Expose
    private String FileSystemIds;

    /**
     * Get 需要解绑的文件系统ID列表，用"," 分割，文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 
     * @return AutoSnapshotPolicyId 需要解绑的文件系统ID列表，用"," 分割，文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 需要解绑的文件系统ID列表，用"," 分割，文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     * @param AutoSnapshotPolicyId 需要解绑的文件系统ID列表，用"," 分割，文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 解绑的快照策略ID，可以通过[DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/582/80208) 查询获取 
     * @return FileSystemIds 解绑的快照策略ID，可以通过[DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/582/80208) 查询获取
     */
    public String getFileSystemIds() {
        return this.FileSystemIds;
    }

    /**
     * Set 解绑的快照策略ID，可以通过[DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/582/80208) 查询获取
     * @param FileSystemIds 解绑的快照策略ID，可以通过[DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/582/80208) 查询获取
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

