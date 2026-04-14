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

public class ClusterExternalConfig extends AbstractModel {

    /**
    * 容器网络类型，支持：HostNetwork、CiliumBGP
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 集群CIDR，网络模式HostNetwork 时无需填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 【已废弃】是否开启专线连接能力
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 容器网络类型，支持：HostNetwork、CiliumBGP 
     * @return NetworkType 容器网络类型，支持：HostNetwork、CiliumBGP
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 容器网络类型，支持：HostNetwork、CiliumBGP
     * @param NetworkType 容器网络类型，支持：HostNetwork、CiliumBGP
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
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
     * Get 集群CIDR，网络模式HostNetwork 时无需填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterCIDR 集群CIDR，网络模式HostNetwork 时无需填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 集群CIDR，网络模式HostNetwork 时无需填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterCIDR 集群CIDR，网络模式HostNetwork 时无需填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 【已废弃】是否开启专线连接能力 
     * @return Enabled 【已废弃】是否开启专线连接能力
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 【已废弃】是否开启专线连接能力
     * @param Enabled 【已废弃】是否开启专线连接能力
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ClusterExternalConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterExternalConfig(ClusterExternalConfig source) {
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

