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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePulsarProInstanceDetailResponse extends AbstractModel{

    /**
    * 集群信息
    */
    @SerializedName("ClusterInfo")
    @Expose
    private PulsarProClusterInfo ClusterInfo;

    /**
    * 集群网络接入点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAccessPointInfos")
    @Expose
    private PulsarNetworkAccessPointInfo [] NetworkAccessPointInfos;

    /**
    * 集群规格信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterSpecInfo")
    @Expose
    private PulsarProClusterSpecInfo ClusterSpecInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群信息 
     * @return ClusterInfo 集群信息
     */
    public PulsarProClusterInfo getClusterInfo() {
        return this.ClusterInfo;
    }

    /**
     * Set 集群信息
     * @param ClusterInfo 集群信息
     */
    public void setClusterInfo(PulsarProClusterInfo ClusterInfo) {
        this.ClusterInfo = ClusterInfo;
    }

    /**
     * Get 集群网络接入点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAccessPointInfos 集群网络接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PulsarNetworkAccessPointInfo [] getNetworkAccessPointInfos() {
        return this.NetworkAccessPointInfos;
    }

    /**
     * Set 集群网络接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAccessPointInfos 集群网络接入点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAccessPointInfos(PulsarNetworkAccessPointInfo [] NetworkAccessPointInfos) {
        this.NetworkAccessPointInfos = NetworkAccessPointInfos;
    }

    /**
     * Get 集群规格信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterSpecInfo 集群规格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PulsarProClusterSpecInfo getClusterSpecInfo() {
        return this.ClusterSpecInfo;
    }

    /**
     * Set 集群规格信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterSpecInfo 集群规格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterSpecInfo(PulsarProClusterSpecInfo ClusterSpecInfo) {
        this.ClusterSpecInfo = ClusterSpecInfo;
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

    public DescribePulsarProInstanceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePulsarProInstanceDetailResponse(DescribePulsarProInstanceDetailResponse source) {
        if (source.ClusterInfo != null) {
            this.ClusterInfo = new PulsarProClusterInfo(source.ClusterInfo);
        }
        if (source.NetworkAccessPointInfos != null) {
            this.NetworkAccessPointInfos = new PulsarNetworkAccessPointInfo[source.NetworkAccessPointInfos.length];
            for (int i = 0; i < source.NetworkAccessPointInfos.length; i++) {
                this.NetworkAccessPointInfos[i] = new PulsarNetworkAccessPointInfo(source.NetworkAccessPointInfos[i]);
            }
        }
        if (source.ClusterSpecInfo != null) {
            this.ClusterSpecInfo = new PulsarProClusterSpecInfo(source.ClusterSpecInfo);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ClusterInfo.", this.ClusterInfo);
        this.setParamArrayObj(map, prefix + "NetworkAccessPointInfos.", this.NetworkAccessPointInfos);
        this.setParamObj(map, prefix + "ClusterSpecInfo.", this.ClusterSpecInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

