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

public class UpdateTKEEdgeClusterRequest extends AbstractModel{

    /**
    * 边缘计算集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 边缘计算集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 边缘计算集群描述信息
    */
    @SerializedName("ClusterDesc")
    @Expose
    private String ClusterDesc;

    /**
    * 边缘计算集群的pod cidr
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * 边缘计算集群的service cidr
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 边缘计算集群公网访问LB信息
    */
    @SerializedName("PublicLB")
    @Expose
    private EdgeClusterPublicLB PublicLB;

    /**
    * 边缘计算集群内网访问LB信息
    */
    @SerializedName("InternalLB")
    @Expose
    private EdgeClusterInternalLB InternalLB;

    /**
    * 边缘计算集群的CoreDns部署信息
    */
    @SerializedName("CoreDns")
    @Expose
    private String CoreDns;

    /**
    * 边缘计算集群的健康检查多地域部署信息
    */
    @SerializedName("HealthRegion")
    @Expose
    private String HealthRegion;

    /**
    * 边缘计算集群的健康检查部署信息
    */
    @SerializedName("Health")
    @Expose
    private String Health;

    /**
    * 边缘计算集群的GridDaemon部署信息
    */
    @SerializedName("GridDaemon")
    @Expose
    private String GridDaemon;

    /**
     * Get 边缘计算集群ID 
     * @return ClusterId 边缘计算集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 边缘计算集群ID
     * @param ClusterId 边缘计算集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 边缘计算集群名称 
     * @return ClusterName 边缘计算集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 边缘计算集群名称
     * @param ClusterName 边缘计算集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 边缘计算集群描述信息 
     * @return ClusterDesc 边缘计算集群描述信息
     */
    public String getClusterDesc() {
        return this.ClusterDesc;
    }

    /**
     * Set 边缘计算集群描述信息
     * @param ClusterDesc 边缘计算集群描述信息
     */
    public void setClusterDesc(String ClusterDesc) {
        this.ClusterDesc = ClusterDesc;
    }

    /**
     * Get 边缘计算集群的pod cidr 
     * @return PodCIDR 边缘计算集群的pod cidr
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set 边缘计算集群的pod cidr
     * @param PodCIDR 边缘计算集群的pod cidr
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get 边缘计算集群的service cidr 
     * @return ServiceCIDR 边缘计算集群的service cidr
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 边缘计算集群的service cidr
     * @param ServiceCIDR 边缘计算集群的service cidr
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get 边缘计算集群公网访问LB信息 
     * @return PublicLB 边缘计算集群公网访问LB信息
     */
    public EdgeClusterPublicLB getPublicLB() {
        return this.PublicLB;
    }

    /**
     * Set 边缘计算集群公网访问LB信息
     * @param PublicLB 边缘计算集群公网访问LB信息
     */
    public void setPublicLB(EdgeClusterPublicLB PublicLB) {
        this.PublicLB = PublicLB;
    }

    /**
     * Get 边缘计算集群内网访问LB信息 
     * @return InternalLB 边缘计算集群内网访问LB信息
     */
    public EdgeClusterInternalLB getInternalLB() {
        return this.InternalLB;
    }

    /**
     * Set 边缘计算集群内网访问LB信息
     * @param InternalLB 边缘计算集群内网访问LB信息
     */
    public void setInternalLB(EdgeClusterInternalLB InternalLB) {
        this.InternalLB = InternalLB;
    }

    /**
     * Get 边缘计算集群的CoreDns部署信息 
     * @return CoreDns 边缘计算集群的CoreDns部署信息
     */
    public String getCoreDns() {
        return this.CoreDns;
    }

    /**
     * Set 边缘计算集群的CoreDns部署信息
     * @param CoreDns 边缘计算集群的CoreDns部署信息
     */
    public void setCoreDns(String CoreDns) {
        this.CoreDns = CoreDns;
    }

    /**
     * Get 边缘计算集群的健康检查多地域部署信息 
     * @return HealthRegion 边缘计算集群的健康检查多地域部署信息
     */
    public String getHealthRegion() {
        return this.HealthRegion;
    }

    /**
     * Set 边缘计算集群的健康检查多地域部署信息
     * @param HealthRegion 边缘计算集群的健康检查多地域部署信息
     */
    public void setHealthRegion(String HealthRegion) {
        this.HealthRegion = HealthRegion;
    }

    /**
     * Get 边缘计算集群的健康检查部署信息 
     * @return Health 边缘计算集群的健康检查部署信息
     */
    public String getHealth() {
        return this.Health;
    }

    /**
     * Set 边缘计算集群的健康检查部署信息
     * @param Health 边缘计算集群的健康检查部署信息
     */
    public void setHealth(String Health) {
        this.Health = Health;
    }

    /**
     * Get 边缘计算集群的GridDaemon部署信息 
     * @return GridDaemon 边缘计算集群的GridDaemon部署信息
     */
    public String getGridDaemon() {
        return this.GridDaemon;
    }

    /**
     * Set 边缘计算集群的GridDaemon部署信息
     * @param GridDaemon 边缘计算集群的GridDaemon部署信息
     */
    public void setGridDaemon(String GridDaemon) {
        this.GridDaemon = GridDaemon;
    }

    public UpdateTKEEdgeClusterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateTKEEdgeClusterRequest(UpdateTKEEdgeClusterRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterDesc != null) {
            this.ClusterDesc = new String(source.ClusterDesc);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterDesc", this.ClusterDesc);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamObj(map, prefix + "PublicLB.", this.PublicLB);
        this.setParamObj(map, prefix + "InternalLB.", this.InternalLB);
        this.setParamSimple(map, prefix + "CoreDns", this.CoreDns);
        this.setParamSimple(map, prefix + "HealthRegion", this.HealthRegion);
        this.setParamSimple(map, prefix + "Health", this.Health);
        this.setParamSimple(map, prefix + "GridDaemon", this.GridDaemon);

    }
}

