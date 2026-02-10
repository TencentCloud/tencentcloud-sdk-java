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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubnetInfo extends AbstractModel {

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 应用的集群；可以是集群id,也可以是All
    */
    @SerializedName("UsedCluster")
    @Expose
    private String UsedCluster;

    /**
    * cidr，只有当IsDirectConnect为true时才生效
    */
    @SerializedName("CIDR")
    @Expose
    private String CIDR;

    /**
    * 是否为专线接入场景
    */
    @SerializedName("IsDirectConnect")
    @Expose
    private Boolean IsDirectConnect;

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 应用的集群；可以是集群id,也可以是All 
     * @return UsedCluster 应用的集群；可以是集群id,也可以是All
     */
    public String getUsedCluster() {
        return this.UsedCluster;
    }

    /**
     * Set 应用的集群；可以是集群id,也可以是All
     * @param UsedCluster 应用的集群；可以是集群id,也可以是All
     */
    public void setUsedCluster(String UsedCluster) {
        this.UsedCluster = UsedCluster;
    }

    /**
     * Get cidr，只有当IsDirectConnect为true时才生效 
     * @return CIDR cidr，只有当IsDirectConnect为true时才生效
     */
    public String getCIDR() {
        return this.CIDR;
    }

    /**
     * Set cidr，只有当IsDirectConnect为true时才生效
     * @param CIDR cidr，只有当IsDirectConnect为true时才生效
     */
    public void setCIDR(String CIDR) {
        this.CIDR = CIDR;
    }

    /**
     * Get 是否为专线接入场景 
     * @return IsDirectConnect 是否为专线接入场景
     */
    public Boolean getIsDirectConnect() {
        return this.IsDirectConnect;
    }

    /**
     * Set 是否为专线接入场景
     * @param IsDirectConnect 是否为专线接入场景
     */
    public void setIsDirectConnect(Boolean IsDirectConnect) {
        this.IsDirectConnect = IsDirectConnect;
    }

    public SubnetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubnetInfo(SubnetInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.UsedCluster != null) {
            this.UsedCluster = new String(source.UsedCluster);
        }
        if (source.CIDR != null) {
            this.CIDR = new String(source.CIDR);
        }
        if (source.IsDirectConnect != null) {
            this.IsDirectConnect = new Boolean(source.IsDirectConnect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "UsedCluster", this.UsedCluster);
        this.setParamSimple(map, prefix + "CIDR", this.CIDR);
        this.setParamSimple(map, prefix + "IsDirectConnect", this.IsDirectConnect);

    }
}

