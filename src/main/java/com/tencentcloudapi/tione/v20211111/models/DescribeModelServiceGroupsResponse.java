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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelServiceGroupsResponse extends AbstractModel {

    /**
    * <p>推理服务组数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>服务组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceGroups")
    @Expose
    private ServiceGroup [] ServiceGroups;

    /**
    * <p>当前uin和region下全量服务组数量</p>
    */
    @SerializedName("GlobalTotalCount")
    @Expose
    private Long GlobalTotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>推理服务组数量。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCount <p>推理服务组数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>推理服务组数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCount <p>推理服务组数量。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>服务组信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceGroups <p>服务组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceGroup [] getServiceGroups() {
        return this.ServiceGroups;
    }

    /**
     * Set <p>服务组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceGroups <p>服务组信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceGroups(ServiceGroup [] ServiceGroups) {
        this.ServiceGroups = ServiceGroups;
    }

    /**
     * Get <p>当前uin和region下全量服务组数量</p> 
     * @return GlobalTotalCount <p>当前uin和region下全量服务组数量</p>
     */
    public Long getGlobalTotalCount() {
        return this.GlobalTotalCount;
    }

    /**
     * Set <p>当前uin和region下全量服务组数量</p>
     * @param GlobalTotalCount <p>当前uin和region下全量服务组数量</p>
     */
    public void setGlobalTotalCount(Long GlobalTotalCount) {
        this.GlobalTotalCount = GlobalTotalCount;
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

    public DescribeModelServiceGroupsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelServiceGroupsResponse(DescribeModelServiceGroupsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ServiceGroups != null) {
            this.ServiceGroups = new ServiceGroup[source.ServiceGroups.length];
            for (int i = 0; i < source.ServiceGroups.length; i++) {
                this.ServiceGroups[i] = new ServiceGroup(source.ServiceGroups[i]);
            }
        }
        if (source.GlobalTotalCount != null) {
            this.GlobalTotalCount = new Long(source.GlobalTotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ServiceGroups.", this.ServiceGroups);
        this.setParamSimple(map, prefix + "GlobalTotalCount", this.GlobalTotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

