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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateNetworkInstanceInfo extends AbstractModel {

    /**
    * 私网实例ID
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 私网实例名称
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 网络地址
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * 网络掩码
    */
    @SerializedName("Mask")
    @Expose
    private Long Mask;

    /**
    * 关联物理机数量
    */
    @SerializedName("ServerCount")
    @Expose
    private Long ServerCount;

    /**
    * 可用Ip数量
    */
    @SerializedName("AvailableIpCount")
    @Expose
    private Long AvailableIpCount;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get 私网实例ID 
     * @return NetworkInstanceId 私网实例ID
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 私网实例ID
     * @param NetworkInstanceId 私网实例ID
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 私网实例名称 
     * @return NetworkInstanceName 私网实例名称
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set 私网实例名称
     * @param NetworkInstanceName 私网实例名称
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get 可用区ID 
     * @return ZoneId 可用区ID
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 网络地址 
     * @return Network 网络地址
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set 网络地址
     * @param Network 网络地址
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get 网络掩码 
     * @return Mask 网络掩码
     */
    public Long getMask() {
        return this.Mask;
    }

    /**
     * Set 网络掩码
     * @param Mask 网络掩码
     */
    public void setMask(Long Mask) {
        this.Mask = Mask;
    }

    /**
     * Get 关联物理机数量 
     * @return ServerCount 关联物理机数量
     */
    public Long getServerCount() {
        return this.ServerCount;
    }

    /**
     * Set 关联物理机数量
     * @param ServerCount 关联物理机数量
     */
    public void setServerCount(Long ServerCount) {
        this.ServerCount = ServerCount;
    }

    /**
     * Get 可用Ip数量 
     * @return AvailableIpCount 可用Ip数量
     */
    public Long getAvailableIpCount() {
        return this.AvailableIpCount;
    }

    /**
     * Set 可用Ip数量
     * @param AvailableIpCount 可用Ip数量
     */
    public void setAvailableIpCount(Long AvailableIpCount) {
        this.AvailableIpCount = AvailableIpCount;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 更新时间 
     * @return UpdatedAt 更新时间
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 更新时间
     * @param UpdatedAt 更新时间
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public PrivateNetworkInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateNetworkInstanceInfo(PrivateNetworkInstanceInfo source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Network != null) {
            this.Network = new String(source.Network);
        }
        if (source.Mask != null) {
            this.Mask = new Long(source.Mask);
        }
        if (source.ServerCount != null) {
            this.ServerCount = new Long(source.ServerCount);
        }
        if (source.AvailableIpCount != null) {
            this.AvailableIpCount = new Long(source.AvailableIpCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "Mask", this.Mask);
        this.setParamSimple(map, prefix + "ServerCount", this.ServerCount);
        this.setParamSimple(map, prefix + "AvailableIpCount", this.AvailableIpCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

