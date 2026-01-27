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

public class CopyAutoSnapshotPolicyCrossAccountResponse extends AbstractModel {

    /**
    * 已备份的定期快照策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoSnapshotPolicyIds")
    @Expose
    private String [] AutoSnapshotPolicyIds;

    /**
    * 目标账户uin
    */
    @SerializedName("TargetAccountUin")
    @Expose
    private String TargetAccountUin;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 已备份的定期快照策略ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoSnapshotPolicyIds 已备份的定期快照策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAutoSnapshotPolicyIds() {
        return this.AutoSnapshotPolicyIds;
    }

    /**
     * Set 已备份的定期快照策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoSnapshotPolicyIds 已备份的定期快照策略ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoSnapshotPolicyIds(String [] AutoSnapshotPolicyIds) {
        this.AutoSnapshotPolicyIds = AutoSnapshotPolicyIds;
    }

    /**
     * Get 目标账户uin 
     * @return TargetAccountUin 目标账户uin
     */
    public String getTargetAccountUin() {
        return this.TargetAccountUin;
    }

    /**
     * Set 目标账户uin
     * @param TargetAccountUin 目标账户uin
     */
    public void setTargetAccountUin(String TargetAccountUin) {
        this.TargetAccountUin = TargetAccountUin;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CopyAutoSnapshotPolicyCrossAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyAutoSnapshotPolicyCrossAccountResponse(CopyAutoSnapshotPolicyCrossAccountResponse source) {
        if (source.AutoSnapshotPolicyIds != null) {
            this.AutoSnapshotPolicyIds = new String[source.AutoSnapshotPolicyIds.length];
            for (int i = 0; i < source.AutoSnapshotPolicyIds.length; i++) {
                this.AutoSnapshotPolicyIds[i] = new String(source.AutoSnapshotPolicyIds[i]);
            }
        }
        if (source.TargetAccountUin != null) {
            this.TargetAccountUin = new String(source.TargetAccountUin);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AutoSnapshotPolicyIds.", this.AutoSnapshotPolicyIds);
        this.setParamSimple(map, prefix + "TargetAccountUin", this.TargetAccountUin);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

