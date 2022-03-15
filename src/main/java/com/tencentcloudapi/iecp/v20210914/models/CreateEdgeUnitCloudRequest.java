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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEdgeUnitCloudRequest extends AbstractModel{

    /**
    * 集群名称，长度小于32
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * k8s版本，仅支持1.16.7 和 1.18.2
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 集群pod cidr， 默认  10.1.0.0/16
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * 集群service cidr, 默认 10.2.0.0/16
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 是否开启监控。目前内存中权限开启联系产品开通白名单
    */
    @SerializedName("OpenCloudMonitor")
    @Expose
    private Boolean OpenCloudMonitor;

    /**
     * Get 集群名称，长度小于32 
     * @return Name 集群名称，长度小于32
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 集群名称，长度小于32
     * @param Name 集群名称，长度小于32
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get k8s版本，仅支持1.16.7 和 1.18.2 
     * @return K8sVersion k8s版本，仅支持1.16.7 和 1.18.2
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set k8s版本，仅支持1.16.7 和 1.18.2
     * @param K8sVersion k8s版本，仅支持1.16.7 和 1.18.2
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群描述 
     * @return Description 集群描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集群描述
     * @param Description 集群描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 集群pod cidr， 默认  10.1.0.0/16 
     * @return PodCIDR 集群pod cidr， 默认  10.1.0.0/16
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set 集群pod cidr， 默认  10.1.0.0/16
     * @param PodCIDR 集群pod cidr， 默认  10.1.0.0/16
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get 集群service cidr, 默认 10.2.0.0/16 
     * @return ServiceCIDR 集群service cidr, 默认 10.2.0.0/16
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 集群service cidr, 默认 10.2.0.0/16
     * @param ServiceCIDR 集群service cidr, 默认 10.2.0.0/16
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get 是否开启监控。目前内存中权限开启联系产品开通白名单 
     * @return OpenCloudMonitor 是否开启监控。目前内存中权限开启联系产品开通白名单
     */
    public Boolean getOpenCloudMonitor() {
        return this.OpenCloudMonitor;
    }

    /**
     * Set 是否开启监控。目前内存中权限开启联系产品开通白名单
     * @param OpenCloudMonitor 是否开启监控。目前内存中权限开启联系产品开通白名单
     */
    public void setOpenCloudMonitor(Boolean OpenCloudMonitor) {
        this.OpenCloudMonitor = OpenCloudMonitor;
    }

    public CreateEdgeUnitCloudRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEdgeUnitCloudRequest(CreateEdgeUnitCloudRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.OpenCloudMonitor != null) {
            this.OpenCloudMonitor = new Boolean(source.OpenCloudMonitor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "OpenCloudMonitor", this.OpenCloudMonitor);

    }
}

