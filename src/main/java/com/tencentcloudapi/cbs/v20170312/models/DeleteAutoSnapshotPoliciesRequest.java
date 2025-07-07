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

public class DeleteAutoSnapshotPoliciesRequest extends AbstractModel {

    /**
    * 要删除的定期快照策略ID列表，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
     * Get 要删除的定期快照策略ID列表，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。 
     * @return AutoSnapshotPolicyIds 要删除的定期快照策略ID列表，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set 要删除的定期快照策略ID列表，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     * @param AutoSnapshotPolicyIds 要删除的定期快照策略ID列表，通过[ DescribeAutoSnapshotPolicies](https://cloud.tencent.com/document/api/362/33556)接口查询。
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    public DeleteAutoSnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAutoSnapshotPoliciesRequest(DeleteAutoSnapshotPoliciesRequest source) {
        if (source.AutoSnapshotPolicyIds != null) {
            this.AutoSnapshotPolicyIds = new String[source.AutoSnapshotPolicyIds.length];
            for (int i = 0; i < source.AutoSnapshotPolicyIds.length; i++) {
                this.AutoSnapshotPolicyIds[i] = new String(source.AutoSnapshotPolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);

    }
}

