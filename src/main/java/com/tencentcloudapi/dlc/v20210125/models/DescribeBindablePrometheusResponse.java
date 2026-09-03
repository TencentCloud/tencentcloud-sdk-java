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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindablePrometheusResponse extends AbstractModel {

    /**
    * <p>TKE 集群是否已绑定 Prometheus 实例</p>
    */
    @SerializedName("Bound")
    @Expose
    private Boolean Bound;

    /**
    * <p>Prometheus 实例总数（未分页前）；Bound=false 时有意义</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>Prometheus 实例列表；Bound=false 时返回；已按同 VPC 优先稳定排序</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instances")
    @Expose
    private PrometheusInstanceItem [] Instances;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>TKE 集群是否已绑定 Prometheus 实例</p> 
     * @return Bound <p>TKE 集群是否已绑定 Prometheus 实例</p>
     */
    public Boolean getBound() {
        return this.Bound;
    }

    /**
     * Set <p>TKE 集群是否已绑定 Prometheus 实例</p>
     * @param Bound <p>TKE 集群是否已绑定 Prometheus 实例</p>
     */
    public void setBound(Boolean Bound) {
        this.Bound = Bound;
    }

    /**
     * Get <p>Prometheus 实例总数（未分页前）；Bound=false 时有意义</p> 
     * @return TotalCount <p>Prometheus 实例总数（未分页前）；Bound=false 时有意义</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Prometheus 实例总数（未分页前）；Bound=false 时有意义</p>
     * @param TotalCount <p>Prometheus 实例总数（未分页前）；Bound=false 时有意义</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>Prometheus 实例列表；Bound=false 时返回；已按同 VPC 优先稳定排序</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instances <p>Prometheus 实例列表；Bound=false 时返回；已按同 VPC 优先稳定排序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusInstanceItem [] getInstances() {
        return this.Instances;
    }

    /**
     * Set <p>Prometheus 实例列表；Bound=false 时返回；已按同 VPC 优先稳定排序</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instances <p>Prometheus 实例列表；Bound=false 时返回；已按同 VPC 优先稳定排序</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstances(PrometheusInstanceItem [] Instances) {
        this.Instances = Instances;
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

    public DescribeBindablePrometheusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBindablePrometheusResponse(DescribeBindablePrometheusResponse source) {
        if (source.Bound != null) {
            this.Bound = new Boolean(source.Bound);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Instances != null) {
            this.Instances = new PrometheusInstanceItem[source.Instances.length];
            for (int i = 0; i < source.Instances.length; i++) {
                this.Instances[i] = new PrometheusInstanceItem(source.Instances[i]);
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
        this.setParamSimple(map, prefix + "Bound", this.Bound);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Instances.", this.Instances);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

