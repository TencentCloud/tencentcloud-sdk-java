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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSnapshotPoliciesResponse extends AbstractModel{

    /**
    * 快照策略。
    */
    @SerializedName("SnapshotPolicies")
    @Expose
    private SnapshotPolicy [] SnapshotPolicies;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 快照策略。 
     * @return SnapshotPolicies 快照策略。
     */
    public SnapshotPolicy [] getSnapshotPolicies() {
        return this.SnapshotPolicies;
    }

    /**
     * Set 快照策略。
     * @param SnapshotPolicies 快照策略。
     */
    public void setSnapshotPolicies(SnapshotPolicy [] SnapshotPolicies) {
        this.SnapshotPolicies = SnapshotPolicies;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateSnapshotPoliciesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSnapshotPoliciesResponse(CreateSnapshotPoliciesResponse source) {
        if (source.SnapshotPolicies != null) {
            this.SnapshotPolicies = new SnapshotPolicy[source.SnapshotPolicies.length];
            for (int i = 0; i < source.SnapshotPolicies.length; i++) {
                this.SnapshotPolicies[i] = new SnapshotPolicy(source.SnapshotPolicies[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotPolicies.", this.SnapshotPolicies);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

