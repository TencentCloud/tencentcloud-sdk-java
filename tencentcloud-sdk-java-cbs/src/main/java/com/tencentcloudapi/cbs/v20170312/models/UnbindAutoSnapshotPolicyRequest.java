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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindAutoSnapshotPolicyRequest extends AbstractModel{

    /**
    * 要解绑定期快照策略的云盘ID列表。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 要解绑的定期快照策略ID。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
     * Get 要解绑定期快照策略的云盘ID列表。 
     * @return DiskIds 要解绑定期快照策略的云盘ID列表。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 要解绑定期快照策略的云盘ID列表。
     * @param DiskIds 要解绑定期快照策略的云盘ID列表。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 要解绑的定期快照策略ID。 
     * @return AutoSnapshotPolicyId 要解绑的定期快照策略ID。
     */
    public String getAutoSnapshotPolicyId() {
        return this.AutoSnapshotPolicyId;
    }

    /**
     * Set 要解绑的定期快照策略ID。
     * @param AutoSnapshotPolicyId 要解绑的定期快照策略ID。
     */
    public void setAutoSnapshotPolicyId(String AutoSnapshotPolicyId) {
        this.AutoSnapshotPolicyId = AutoSnapshotPolicyId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);

    }
}

