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

public class AddClusterCIDRRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 增加的ClusterCIDR
    */
    @SerializedName("ClusterCIDRs")
    @Expose
    private String [] ClusterCIDRs;

    /**
    * 是否忽略ClusterCIDR与VPC路由表的冲突
    */
    @SerializedName("IgnoreClusterCIDRConflict")
    @Expose
    private Boolean IgnoreClusterCIDRConflict;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 增加的ClusterCIDR 
     * @return ClusterCIDRs 增加的ClusterCIDR
     */
    public String [] getClusterCIDRs() {
        return this.ClusterCIDRs;
    }

    /**
     * Set 增加的ClusterCIDR
     * @param ClusterCIDRs 增加的ClusterCIDR
     */
    public void setClusterCIDRs(String [] ClusterCIDRs) {
        this.ClusterCIDRs = ClusterCIDRs;
    }

    /**
     * Get 是否忽略ClusterCIDR与VPC路由表的冲突 
     * @return IgnoreClusterCIDRConflict 是否忽略ClusterCIDR与VPC路由表的冲突
     */
    public Boolean getIgnoreClusterCIDRConflict() {
        return this.IgnoreClusterCIDRConflict;
    }

    /**
     * Set 是否忽略ClusterCIDR与VPC路由表的冲突
     * @param IgnoreClusterCIDRConflict 是否忽略ClusterCIDR与VPC路由表的冲突
     */
    public void setIgnoreClusterCIDRConflict(Boolean IgnoreClusterCIDRConflict) {
        this.IgnoreClusterCIDRConflict = IgnoreClusterCIDRConflict;
    }

    public AddClusterCIDRRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddClusterCIDRRequest(AddClusterCIDRRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterCIDRs != null) {
            this.ClusterCIDRs = new String[source.ClusterCIDRs.length];
            for (int i = 0; i < source.ClusterCIDRs.length; i++) {
                this.ClusterCIDRs[i] = new String(source.ClusterCIDRs[i]);
            }
        }
        if (source.IgnoreClusterCIDRConflict != null) {
            this.IgnoreClusterCIDRConflict = new Boolean(source.IgnoreClusterCIDRConflict);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "ClusterCIDRs.", this.ClusterCIDRs);
        this.setParamSimple(map, prefix + "IgnoreClusterCIDRConflict", this.IgnoreClusterCIDRConflict);

    }
}

