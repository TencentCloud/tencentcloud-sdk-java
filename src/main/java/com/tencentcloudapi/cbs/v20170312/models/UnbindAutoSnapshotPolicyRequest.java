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

public class UnbindAutoSnapshotPolicyRequest extends AbstractModel {

    /**
    * 要解绑的定期快照策略ID。
    */
    @SerializedName("AutoSnapshotPolicyId")
    @Expose
    private String AutoSnapshotPolicyId;

    /**
    * 要解绑定期快照策略的云盘ID列表。此参数与 InstanceIds 参数至少需要传入一个。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 要解绑定期快照策略的实例ID列表。此参数与 DiskIds 参数至少需要传入一个。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

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
     * Get 要解绑定期快照策略的云盘ID列表。此参数与 InstanceIds 参数至少需要传入一个。 
     * @return DiskIds 要解绑定期快照策略的云盘ID列表。此参数与 InstanceIds 参数至少需要传入一个。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 要解绑定期快照策略的云盘ID列表。此参数与 InstanceIds 参数至少需要传入一个。
     * @param DiskIds 要解绑定期快照策略的云盘ID列表。此参数与 InstanceIds 参数至少需要传入一个。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 要解绑定期快照策略的实例ID列表。此参数与 DiskIds 参数至少需要传入一个。 
     * @return InstanceIds 要解绑定期快照策略的实例ID列表。此参数与 DiskIds 参数至少需要传入一个。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 要解绑定期快照策略的实例ID列表。此参数与 DiskIds 参数至少需要传入一个。
     * @param InstanceIds 要解绑定期快照策略的实例ID列表。此参数与 DiskIds 参数至少需要传入一个。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public UnbindAutoSnapshotPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindAutoSnapshotPolicyRequest(UnbindAutoSnapshotPolicyRequest source) {
        if (source.AutoSnapshotPolicyId != null) {
            this.AutoSnapshotPolicyId = new String(source.AutoSnapshotPolicyId);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoSnapshotPolicyId", this.AutoSnapshotPolicyId);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

