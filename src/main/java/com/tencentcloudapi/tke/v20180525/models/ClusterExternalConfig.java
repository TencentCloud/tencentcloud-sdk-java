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
    * <p>容器网络类型，支持：HostNetwork、CiliumBGP</p>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>子网ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>集群CIDR，网络模式HostNetwork 时无需填写</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * <p>【已废弃】是否开启专线连接能力</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>ProxyCLBMode</p><p>枚举值：</p><ul><li>Dedicated： 默认，独立专属 CLB 元素</li><li>Shared： 复用支撑面 CLB</li></ul><p>默认值：Dedicated</p>
    */
    @SerializedName("ProxyCLBMode")
    @Expose
    private String ProxyCLBMode;

    /**
     * Get <p>容器网络类型，支持：HostNetwork、CiliumBGP</p> 
     * @return NetworkType <p>容器网络类型，支持：HostNetwork、CiliumBGP</p>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>容器网络类型，支持：HostNetwork、CiliumBGP</p>
     * @param NetworkType <p>容器网络类型，支持：HostNetwork、CiliumBGP</p>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>子网ID</p> 
     * @return SubnetId <p>子网ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
     * @param SubnetId <p>子网ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>集群CIDR，网络模式HostNetwork 时无需填写</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterCIDR <p>集群CIDR，网络模式HostNetwork 时无需填写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set <p>集群CIDR，网络模式HostNetwork 时无需填写</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterCIDR <p>集群CIDR，网络模式HostNetwork 时无需填写</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get <p>【已废弃】是否开启专线连接能力</p> 
     * @return Enabled <p>【已废弃】是否开启专线连接能力</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>【已废弃】是否开启专线连接能力</p>
     * @param Enabled <p>【已废弃】是否开启专线连接能力</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>ProxyCLBMode</p><p>枚举值：</p><ul><li>Dedicated： 默认，独立专属 CLB 元素</li><li>Shared： 复用支撑面 CLB</li></ul><p>默认值：Dedicated</p> 
     * @return ProxyCLBMode <p>ProxyCLBMode</p><p>枚举值：</p><ul><li>Dedicated： 默认，独立专属 CLB 元素</li><li>Shared： 复用支撑面 CLB</li></ul><p>默认值：Dedicated</p>
     */
    public String getProxyCLBMode() {
        return this.ProxyCLBMode;
    }

    /**
     * Set <p>ProxyCLBMode</p><p>枚举值：</p><ul><li>Dedicated： 默认，独立专属 CLB 元素</li><li>Shared： 复用支撑面 CLB</li></ul><p>默认值：Dedicated</p>
     * @param ProxyCLBMode <p>ProxyCLBMode</p><p>枚举值：</p><ul><li>Dedicated： 默认，独立专属 CLB 元素</li><li>Shared： 复用支撑面 CLB</li></ul><p>默认值：Dedicated</p>
     */
    public void setProxyCLBMode(String ProxyCLBMode) {
        this.ProxyCLBMode = ProxyCLBMode;
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
        if (source.ProxyCLBMode != null) {
            this.ProxyCLBMode = new String(source.ProxyCLBMode);
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
        this.setParamSimple(map, prefix + "ProxyCLBMode", this.ProxyCLBMode);

    }
}

