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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateIpv6AddressesBandwidthResponse extends AbstractModel {

    /**
    * 弹性公网 IPV6 的唯一 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressSet")
    @Expose
    private String [] AddressSet;

    /**
    * 异步任务TaskId。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 弹性公网 IPV6 的唯一 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressSet 弹性公网 IPV6 的唯一 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * Set 弹性公网 IPV6 的唯一 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressSet 弹性公网 IPV6 的唯一 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressSet(String [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * Get 异步任务TaskId。 
     * @return TaskId 异步任务TaskId。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 异步任务TaskId。
     * @param TaskId 异步任务TaskId。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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

    public AllocateIpv6AddressesBandwidthResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIpv6AddressesBandwidthResponse(AllocateIpv6AddressesBandwidthResponse source) {
        if (source.AddressSet != null) {
            this.AddressSet = new String[source.AddressSet.length];
            for (int i = 0; i < source.AddressSet.length; i++) {
                this.AddressSet[i] = new String(source.AddressSet[i]);
            }
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

