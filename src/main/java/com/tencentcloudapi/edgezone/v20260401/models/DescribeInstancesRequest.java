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

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * <p>实例ID列表，用于按实例ID筛选</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>实例名称，支持模糊匹配</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>可用区代码，用于筛选指定可用区的实例</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例状态列表，用于按状态筛选实例。可选值：allocating、running、isolating、isolated、terminating、error</p>
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String [] InstanceStatus;

    /**
    * <p>公网网络ID</p>
    */
    @SerializedName("PublicNetworkId")
    @Expose
    private String PublicNetworkId;

    /**
    * <p>私有网络ID</p>
    */
    @SerializedName("PrivateNetworkId")
    @Expose
    private String PrivateNetworkId;

    /**
    * <p>公网IPv4地址列表，用于按公网IP筛选实例</p>
    */
    @SerializedName("PublicIps")
    @Expose
    private String [] PublicIps;

    /**
    * <p>偏移量，默认0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认20，最大100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>实例ID列表，用于按实例ID筛选</p> 
     * @return InstanceIds <p>实例ID列表，用于按实例ID筛选</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>实例ID列表，用于按实例ID筛选</p>
     * @param InstanceIds <p>实例ID列表，用于按实例ID筛选</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>实例名称，支持模糊匹配</p> 
     * @return InstanceName <p>实例名称，支持模糊匹配</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称，支持模糊匹配</p>
     * @param InstanceName <p>实例名称，支持模糊匹配</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>可用区代码，用于筛选指定可用区的实例</p> 
     * @return Zone <p>可用区代码，用于筛选指定可用区的实例</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区代码，用于筛选指定可用区的实例</p>
     * @param Zone <p>可用区代码，用于筛选指定可用区的实例</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>实例状态列表，用于按状态筛选实例。可选值：allocating、running、isolating、isolated、terminating、error</p> 
     * @return InstanceStatus <p>实例状态列表，用于按状态筛选实例。可选值：allocating、running、isolating、isolated、terminating、error</p>
     */
    public String [] getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set <p>实例状态列表，用于按状态筛选实例。可选值：allocating、running、isolating、isolated、terminating、error</p>
     * @param InstanceStatus <p>实例状态列表，用于按状态筛选实例。可选值：allocating、running、isolating、isolated、terminating、error</p>
     */
    public void setInstanceStatus(String [] InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get <p>公网网络ID</p> 
     * @return PublicNetworkId <p>公网网络ID</p>
     */
    public String getPublicNetworkId() {
        return this.PublicNetworkId;
    }

    /**
     * Set <p>公网网络ID</p>
     * @param PublicNetworkId <p>公网网络ID</p>
     */
    public void setPublicNetworkId(String PublicNetworkId) {
        this.PublicNetworkId = PublicNetworkId;
    }

    /**
     * Get <p>私有网络ID</p> 
     * @return PrivateNetworkId <p>私有网络ID</p>
     */
    public String getPrivateNetworkId() {
        return this.PrivateNetworkId;
    }

    /**
     * Set <p>私有网络ID</p>
     * @param PrivateNetworkId <p>私有网络ID</p>
     */
    public void setPrivateNetworkId(String PrivateNetworkId) {
        this.PrivateNetworkId = PrivateNetworkId;
    }

    /**
     * Get <p>公网IPv4地址列表，用于按公网IP筛选实例</p> 
     * @return PublicIps <p>公网IPv4地址列表，用于按公网IP筛选实例</p>
     */
    public String [] getPublicIps() {
        return this.PublicIps;
    }

    /**
     * Set <p>公网IPv4地址列表，用于按公网IP筛选实例</p>
     * @param PublicIps <p>公网IPv4地址列表，用于按公网IP筛选实例</p>
     */
    public void setPublicIps(String [] PublicIps) {
        this.PublicIps = PublicIps;
    }

    /**
     * Get <p>偏移量，默认0</p> 
     * @return Offset <p>偏移量，默认0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认0</p>
     * @param Offset <p>偏移量，默认0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认20，最大100</p> 
     * @return Limit <p>返回数量，默认20，最大100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认20，最大100</p>
     * @param Limit <p>返回数量，默认20，最大100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String[source.InstanceStatus.length];
            for (int i = 0; i < source.InstanceStatus.length; i++) {
                this.InstanceStatus[i] = new String(source.InstanceStatus[i]);
            }
        }
        if (source.PublicNetworkId != null) {
            this.PublicNetworkId = new String(source.PublicNetworkId);
        }
        if (source.PrivateNetworkId != null) {
            this.PrivateNetworkId = new String(source.PrivateNetworkId);
        }
        if (source.PublicIps != null) {
            this.PublicIps = new String[source.PublicIps.length];
            for (int i = 0; i < source.PublicIps.length; i++) {
                this.PublicIps[i] = new String(source.PublicIps[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArraySimple(map, prefix + "InstanceStatus.", this.InstanceStatus);
        this.setParamSimple(map, prefix + "PublicNetworkId", this.PublicNetworkId);
        this.setParamSimple(map, prefix + "PrivateNetworkId", this.PrivateNetworkId);
        this.setParamArraySimple(map, prefix + "PublicIps.", this.PublicIps);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

