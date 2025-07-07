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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * 要绑定的定期快照策略ID，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 要绑定的云硬盘ID列表，一次请求最多绑定80块云盘。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
     * Get 要绑定的定期快照策略ID，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。 
     * @return AutoSnapshotPolicyId 要绑定的定期快照策略ID，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 要绑定的定期快照策略ID，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     * @param AutoSnapshotPolicyId 要绑定的定期快照策略ID，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Get 要绑定的云硬盘ID列表，一次请求最多绑定80块云盘。 
     * @return DiskIds 要绑定的云硬盘ID列表，一次请求最多绑定80块云盘。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 要绑定的云硬盘ID列表，一次请求最多绑定80块云盘。
     * @param DiskIds 要绑定的云硬盘ID列表，一次请求最多绑定80块云盘。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
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
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);

    }
}

