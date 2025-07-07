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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckInstancesUpgradeAbleResponse extends AbstractModel {

    /**
    * 集群master当前小版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 集群master对应的大版本目前最新小版本
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * 可升级节点列表
    */
    @SerializedName("UpgradeAbleInstances")
    @Expose
    private UpgradeAbleInstancesItem [] UpgradeAbleInstances;

    /**
    * 总数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 不可升级原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnavailableVersionReason")
    @Expose
    private UnavailableReason [] UnavailableVersionReason;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群master当前小版本 
     * @return ClusterVersion 集群master当前小版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群master当前小版本
     * @param ClusterVersion 集群master当前小版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 集群master对应的大版本目前最新小版本 
     * @return LatestVersion 集群master对应的大版本目前最新小版本
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 集群master对应的大版本目前最新小版本
     * @param LatestVersion 集群master对应的大版本目前最新小版本
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get 可升级节点列表 
     * @return UpgradeAbleInstances 可升级节点列表
     */
    public UpgradeAbleInstancesItem [] getUpgradeAbleInstances() {
        return this.UpgradeAbleInstances;
    }

    /**
     * Set 可升级节点列表
     * @param UpgradeAbleInstances 可升级节点列表
     */
    public void setUpgradeAbleInstances(UpgradeAbleInstancesItem [] UpgradeAbleInstances) {
        this.UpgradeAbleInstances = UpgradeAbleInstances;
    }

    /**
     * Get 总数 
     * @return Total 总数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总数
     * @param Total 总数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 不可升级原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnavailableVersionReason 不可升级原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UnavailableReason [] getUnavailableVersionReason() {
        return this.UnavailableVersionReason;
    }

    /**
     * Set 不可升级原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnavailableVersionReason 不可升级原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnavailableVersionReason(UnavailableReason [] UnavailableVersionReason) {
        this.UnavailableVersionReason = UnavailableVersionReason;
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

    public CheckInstancesUpgradeAbleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckInstancesUpgradeAbleResponse(CheckInstancesUpgradeAbleResponse source) {
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.UpgradeAbleInstances != null) {
            this.UpgradeAbleInstances = new UpgradeAbleInstancesItem[source.UpgradeAbleInstances.length];
            for (int i = 0; i < source.UpgradeAbleInstances.length; i++) {
                this.UpgradeAbleInstances[i] = new UpgradeAbleInstancesItem(source.UpgradeAbleInstances[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.UnavailableVersionReason != null) {
            this.UnavailableVersionReason = new UnavailableReason[source.UnavailableVersionReason.length];
            for (int i = 0; i < source.UnavailableVersionReason.length; i++) {
                this.UnavailableVersionReason[i] = new UnavailableReason(source.UnavailableVersionReason[i]);
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
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamArrayObj(map, prefix + "UpgradeAbleInstances.", this.UpgradeAbleInstances);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "UnavailableVersionReason.", this.UnavailableVersionReason);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

