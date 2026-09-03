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

public class DescribeEmrClusterInfoResponse extends AbstractModel {

    /**
    * <p>EMR 集群 ID，例如 emr-40ybwbbn</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>EMR 集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>集群绑定的 COS Bucket 名称</p>
    */
    @SerializedName("CosBucket")
    @Expose
    private String CosBucket;

    /**
    * <p>关联的 TKE 集群 ID，例如 cls-xxxxxxxx</p>
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * <p>集群资源用量（Cpu / Mem）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUsage")
    @Expose
    private EmrResourceUsage ResourceUsage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>EMR 集群 ID，例如 emr-40ybwbbn</p> 
     * @return ClusterId <p>EMR 集群 ID，例如 emr-40ybwbbn</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>EMR 集群 ID，例如 emr-40ybwbbn</p>
     * @param ClusterId <p>EMR 集群 ID，例如 emr-40ybwbbn</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>EMR 集群名称</p> 
     * @return ClusterName <p>EMR 集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>EMR 集群名称</p>
     * @param ClusterName <p>EMR 集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>集群绑定的 COS Bucket 名称</p> 
     * @return CosBucket <p>集群绑定的 COS Bucket 名称</p>
     */
    public String getCosBucket() {
        return this.CosBucket;
    }

    /**
     * Set <p>集群绑定的 COS Bucket 名称</p>
     * @param CosBucket <p>集群绑定的 COS Bucket 名称</p>
     */
    public void setCosBucket(String CosBucket) {
        this.CosBucket = CosBucket;
    }

    /**
     * Get <p>关联的 TKE 集群 ID，例如 cls-xxxxxxxx</p> 
     * @return TkeClusterId <p>关联的 TKE 集群 ID，例如 cls-xxxxxxxx</p>
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set <p>关联的 TKE 集群 ID，例如 cls-xxxxxxxx</p>
     * @param TkeClusterId <p>关联的 TKE 集群 ID，例如 cls-xxxxxxxx</p>
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get <p>集群资源用量（Cpu / Mem）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUsage <p>集群资源用量（Cpu / Mem）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EmrResourceUsage getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set <p>集群资源用量（Cpu / Mem）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUsage <p>集群资源用量（Cpu / Mem）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUsage(EmrResourceUsage ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
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

    public DescribeEmrClusterInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrClusterInfoResponse(DescribeEmrClusterInfoResponse source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.CosBucket != null) {
            this.CosBucket = new String(source.CosBucket);
        }
        if (source.TkeClusterId != null) {
            this.TkeClusterId = new String(source.TkeClusterId);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new EmrResourceUsage(source.ResourceUsage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "CosBucket", this.CosBucket);
        this.setParamSimple(map, prefix + "TkeClusterId", this.TkeClusterId);
        this.setParamObj(map, prefix + "ResourceUsage.", this.ResourceUsage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

