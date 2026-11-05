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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GooseFSClustersInfo extends AbstractModel {

    /**
    * <p>集群 ID，形如 g_cvm_xxx</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>所属子网 ID</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>可用区</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>Master RPC 地址，多个地址用英文逗号拼接，例如 &quot;10.0.1.10:19998,10.0.1.11:19998&quot;，供 CSI 驱动连接用</p>
    */
    @SerializedName("MasterRPCAddress")
    @Expose
    private String MasterRPCAddress;

    /**
     * Get <p>集群 ID，形如 g_cvm_xxx</p> 
     * @return ClusterId <p>集群 ID，形如 g_cvm_xxx</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群 ID，形如 g_cvm_xxx</p>
     * @param ClusterId <p>集群 ID，形如 g_cvm_xxx</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return Name <p>集群名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>集群名称</p>
     * @param Name <p>集群名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>所属子网 ID</p> 
     * @return SubnetId <p>所属子网 ID</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>所属子网 ID</p>
     * @param SubnetId <p>所属子网 ID</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>可用区</p> 
     * @return Zone <p>可用区</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
     * @param Zone <p>可用区</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>Master RPC 地址，多个地址用英文逗号拼接，例如 &quot;10.0.1.10:19998,10.0.1.11:19998&quot;，供 CSI 驱动连接用</p> 
     * @return MasterRPCAddress <p>Master RPC 地址，多个地址用英文逗号拼接，例如 &quot;10.0.1.10:19998,10.0.1.11:19998&quot;，供 CSI 驱动连接用</p>
     */
    public String getMasterRPCAddress() {
        return this.MasterRPCAddress;
    }

    /**
     * Set <p>Master RPC 地址，多个地址用英文逗号拼接，例如 &quot;10.0.1.10:19998,10.0.1.11:19998&quot;，供 CSI 驱动连接用</p>
     * @param MasterRPCAddress <p>Master RPC 地址，多个地址用英文逗号拼接，例如 &quot;10.0.1.10:19998,10.0.1.11:19998&quot;，供 CSI 驱动连接用</p>
     */
    public void setMasterRPCAddress(String MasterRPCAddress) {
        this.MasterRPCAddress = MasterRPCAddress;
    }

    public GooseFSClustersInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSClustersInfo(GooseFSClustersInfo source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.MasterRPCAddress != null) {
            this.MasterRPCAddress = new String(source.MasterRPCAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "MasterRPCAddress", this.MasterRPCAddress);

    }
}

