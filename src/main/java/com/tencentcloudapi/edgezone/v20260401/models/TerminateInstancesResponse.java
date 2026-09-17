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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstancesResponse extends AbstractModel {

    /**
    * <p>销毁成功的实例ID列表。</p>
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * <p>销毁失败的实例信息列表（部分成功时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedInstanceSet")
    @Expose
    private FailedInstance [] FailedInstanceSet;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>销毁成功的实例ID列表。</p> 
     * @return InstanceIdSet <p>销毁成功的实例ID列表。</p>
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set <p>销毁成功的实例ID列表。</p>
     * @param InstanceIdSet <p>销毁成功的实例ID列表。</p>
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get <p>销毁失败的实例信息列表（部分成功时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedInstanceSet <p>销毁失败的实例信息列表（部分成功时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FailedInstance [] getFailedInstanceSet() {
        return this.FailedInstanceSet;
    }

    /**
     * Set <p>销毁失败的实例信息列表（部分成功时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedInstanceSet <p>销毁失败的实例信息列表（部分成功时返回）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedInstanceSet(FailedInstance [] FailedInstanceSet) {
        this.FailedInstanceSet = FailedInstanceSet;
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

    public TerminateInstancesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesResponse(TerminateInstancesResponse source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.FailedInstanceSet != null) {
            this.FailedInstanceSet = new FailedInstance[source.FailedInstanceSet.length];
            for (int i = 0; i < source.FailedInstanceSet.length; i++) {
                this.FailedInstanceSet[i] = new FailedInstance(source.FailedInstanceSet[i]);
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
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamArrayObj(map, prefix + "FailedInstanceSet.", this.FailedInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

