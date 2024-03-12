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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetNodePoolNodeProtectionResponse extends AbstractModel {

    /**
    * 成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SucceedInstanceIds")
    @Expose
    private String [] SucceedInstanceIds;

    /**
    * 没有成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedInstanceIds")
    @Expose
    private String [] FailedInstanceIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SucceedInstanceIds 成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSucceedInstanceIds() {
        return this.SucceedInstanceIds;
    }

    /**
     * Set 成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SucceedInstanceIds 成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSucceedInstanceIds(String [] SucceedInstanceIds) {
        this.SucceedInstanceIds = SucceedInstanceIds;
    }

    /**
     * Get 没有成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedInstanceIds 没有成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailedInstanceIds() {
        return this.FailedInstanceIds;
    }

    /**
     * Set 没有成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedInstanceIds 没有成功设置的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedInstanceIds(String [] FailedInstanceIds) {
        this.FailedInstanceIds = FailedInstanceIds;
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

    public SetNodePoolNodeProtectionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetNodePoolNodeProtectionResponse(SetNodePoolNodeProtectionResponse source) {
        if (source.SucceedInstanceIds != null) {
            this.SucceedInstanceIds = new String[source.SucceedInstanceIds.length];
            for (int i = 0; i < source.SucceedInstanceIds.length; i++) {
                this.SucceedInstanceIds[i] = new String(source.SucceedInstanceIds[i]);
            }
        }
        if (source.FailedInstanceIds != null) {
            this.FailedInstanceIds = new String[source.FailedInstanceIds.length];
            for (int i = 0; i < source.FailedInstanceIds.length; i++) {
                this.FailedInstanceIds[i] = new String(source.FailedInstanceIds[i]);
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
        this.setParamArraySimple(map, prefix + "SucceedInstanceIds.", this.SucceedInstanceIds);
        this.setParamArraySimple(map, prefix + "FailedInstanceIds.", this.FailedInstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

