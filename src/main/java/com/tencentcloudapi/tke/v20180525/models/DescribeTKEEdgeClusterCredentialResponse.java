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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTKEEdgeClusterCredentialResponse extends AbstractModel{

    /**
    * 集群的接入地址信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Addresses")
    @Expose
    private IPAddress [] Addresses;

    /**
    * 集群的认证信息
    */
    @SerializedName("Credential")
    @Expose
    private ClusterCredential Credential;

    /**
    * 集群的公网访问信息
    */
    @SerializedName("PublicLB")
    @Expose
    private EdgeClusterPublicLB PublicLB;

    /**
    * 集群的内网访问信息
    */
    @SerializedName("InternalLB")
    @Expose
    private EdgeClusterInternalLB InternalLB;

    /**
    * 集群的CoreDns部署信息
    */
    @SerializedName("CoreDns")
    @Expose
    private String CoreDns;

    /**
    * 集群的健康检查多地域部署信息
    */
    @SerializedName("HealthRegion")
    @Expose
    private String HealthRegion;

    /**
    * 集群的健康检查部署信息
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * 是否部署GridDaemon以支持headless service
    */
    @SerializedName("GridDaemon")
    @Expose
    private String GridDaemon;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群的接入地址信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Addresses 集群的接入地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IPAddress [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set 集群的接入地址信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Addresses 集群的接入地址信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddresses(IPAddress [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get 集群的认证信息 
     * @return Credential 集群的认证信息
     */
    public ClusterCredential getCredential() {
        return this.Credential;
    }

    /**
     * Set 集群的认证信息
     * @param Credential 集群的认证信息
     */
    public void setCredential(ClusterCredential Credential) {
        this.Credential = Credential;
    }

    /**
     * Get 集群的公网访问信息 
     * @return PublicLB 集群的公网访问信息
     */
    public EdgeClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set 集群的公网访问信息
     * @param PublicLB 集群的公网访问信息
     */
    public void setPublicLB(EdgeClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get 集群的内网访问信息 
     * @return InternalLB 集群的内网访问信息
     */
    public EdgeClusterInternalLB getInternalLB() {
        return this.InternalLB;
    }

    /**
     * Set 集群的内网访问信息
     * @param InternalLB 集群的内网访问信息
     */
    public void setInternalLB(EdgeClusterInternalLB InternalLB) {
        this.InternalLB = InternalLB;
    }

    /**
     * Get 集群的CoreDns部署信息 
     * @return CoreDns 集群的CoreDns部署信息
     */
    public String getCoreDns() {
        return this.CoreDns;
    }

    /**
     * Set 集群的CoreDns部署信息
     * @param CoreDns 集群的CoreDns部署信息
     */
    public void setCoreDns(String CoreDns) {
        this.CoreDns = CoreDns;
    }

    /**
     * Get 集群的健康检查多地域部署信息 
     * @return HealthRegion 集群的健康检查多地域部署信息
     */
    public String getHealthRegion() {
        return this.HealthRegion;
    }

    /**
     * Set 集群的健康检查多地域部署信息
     * @param HealthRegion 集群的健康检查多地域部署信息
     */
    public void setHealthRegion(String HealthRegion) {
        this.HealthRegion = HealthRegion;
    }

    /**
     * Get 集群的健康检查部署信息 
     * @return Health 集群的健康检查部署信息
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set 集群的健康检查部署信息
     * @param Health 集群的健康检查部署信息
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get 是否部署GridDaemon以支持headless service 
     * @return GridDaemon 是否部署GridDaemon以支持headless service
     */
    public String getGridDaemon() {
        return this.GridDaemon;
    }

    /**
     * Set 是否部署GridDaemon以支持headless service
     * @param GridDaemon 是否部署GridDaemon以支持headless service
     */
    public void setGridDaemon(String GridDaemon) {
        this.GridDaemon = GridDaemon;
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

    public DescribeTKEEdgeClusterCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTKEEdgeClusterCredentialResponse(DescribeTKEEdgeClusterCredentialResponse source) {
        if (source.Addresses != null) {
            this.Addresses = new IPAddress[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new IPAddress(source.Addresses[i]);
            }
        }
        if (source.Credential != null) {
            this.Credential = new ClusterCredential(source.Credential);
        }
        if (source.PublicLB != null) {
            this.PublicLB = new EdgeClusterPublicLB(source.PublicLB);
        }
        if (source.InternalLB != null) {
            this.InternalLB = new EdgeClusterInternalLB(source.InternalLB);
        }
        if (source.CoreDns != null) {
            this.CoreDns = new String(source.CoreDns);
        }
        if (source.HealthRegion != null) {
            this.HealthRegion = new String(source.HealthRegion);
        }
        if (source.Health != null) {
            this.Health = new String(source.Health);
        }
        if (source.GridDaemon != null) {
            this.GridDaemon = new String(source.GridDaemon);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Addresses.", this.Addresses);
        this.setParamObj(map, prefix + "Credential.", this.Credential);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamObj(map, prefix + "InternalLB.", this.InternalLB);
        this.setParamSimple(map, prefix + "CoreDns", this.CoreDns);
        this.setParamSimple(map, prefix + "HealthRegion", this.HealthRegion);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "GridDaemon", this.GridDaemon);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

