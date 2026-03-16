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
    * 集群网络插件类型，支持：Flannel、CiliumBGP、CiliumVXLan
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
    * Pod CIDR
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 是否开启第三方节点池支持
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get 集群网络插件类型，支持：Flannel、CiliumBGP、CiliumVXLan 
     * @return NetworkType 集群网络插件类型，支持：Flannel、CiliumBGP、CiliumVXLan
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 集群网络插件类型，支持：Flannel、CiliumBGP、CiliumVXLan
     * @param NetworkType 集群网络插件类型，支持：Flannel、CiliumBGP、CiliumVXLan
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
     * Get Pod CIDR
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterCIDR Pod CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set Pod CIDR
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterCIDR Pod CIDR
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 是否开启第三方节点池支持 
     * @return Enabled 是否开启第三方节点池支持
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启第三方节点池支持
     * @param Enabled 是否开启第三方节点池支持
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

