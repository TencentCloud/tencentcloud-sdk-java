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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySnapshotPoliciesRequest extends AbstractModel {

    /**
    * 快照策略修改信息。
    */
    @SerializedName("SnapshotPoliciesInfo")
    @Expose
    private BatchModifySnapshotPolicy [] SnapshotPoliciesInfo;

    /**
     * Get 快照策略修改信息。 
     * @return SnapshotPoliciesInfo 快照策略修改信息。
     */
    public BatchModifySnapshotPolicy [] getSnapshotPoliciesInfo() {
        return this.SnapshotPoliciesInfo;
    }

    /**
     * Set 快照策略修改信息。
     * @param SnapshotPoliciesInfo 快照策略修改信息。
     */
    public void setSnapshotPoliciesInfo(BatchModifySnapshotPolicy [] SnapshotPoliciesInfo) {
        this.SnapshotPoliciesInfo = SnapshotPoliciesInfo;
    }

    public ModifySnapshotPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySnapshotPoliciesRequest(ModifySnapshotPoliciesRequest source) {
        if (source.SnapshotPoliciesInfo != null) {
            this.SnapshotPoliciesInfo = new BatchModifySnapshotPolicy[source.SnapshotPoliciesInfo.length];
            for (int i = 0; i < source.SnapshotPoliciesInfo.length; i++) {
                this.SnapshotPoliciesInfo[i] = new BatchModifySnapshotPolicy(source.SnapshotPoliciesInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotPoliciesInfo.", this.SnapshotPoliciesInfo);

    }
}

