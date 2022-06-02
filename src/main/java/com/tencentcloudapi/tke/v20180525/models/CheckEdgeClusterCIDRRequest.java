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

public class CheckEdgeClusterCIDRRequest extends AbstractModel{

    /**
    * 集群的vpc-id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群的pod CIDR
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * 集群的service CIDR
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
     * Get 集群的vpc-id 
     * @return VpcId 集群的vpc-id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群的vpc-id
     * @param VpcId 集群的vpc-id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群的pod CIDR 
     * @return PodCIDR 集群的pod CIDR
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set 集群的pod CIDR
     * @param PodCIDR 集群的pod CIDR
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get 集群的service CIDR 
     * @return ServiceCIDR 集群的service CIDR
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 集群的service CIDR
     * @param ServiceCIDR 集群的service CIDR
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    public CheckEdgeClusterCIDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckEdgeClusterCIDRRequest(CheckEdgeClusterCIDRRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);

    }
}

