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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesRequest extends AbstractModel {

    /**
    * 服务器舰队ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * CVM实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 结果返回最大数量，最小值0，最大值100
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回结果偏移，最小值0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * CVM实例公网IP
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
     * Get 服务器舰队ID 
     * @return FleetId 服务器舰队ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 服务器舰队ID
     * @param FleetId 服务器舰队ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get CVM实例ID 
     * @return InstanceId CVM实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set CVM实例ID
     * @param InstanceId CVM实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 结果返回最大数量，最小值0，最大值100 
     * @return Offset 结果返回最大数量，最小值0，最大值100
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 结果返回最大数量，最小值0，最大值100
     * @param Offset 结果返回最大数量，最小值0，最大值100
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回结果偏移，最小值0 
     * @return Limit 返回结果偏移，最小值0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回结果偏移，最小值0
     * @param Limit 返回结果偏移，最小值0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get CVM实例公网IP 
     * @return IpAddress CVM实例公网IP
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set CVM实例公网IP
     * @param IpAddress CVM实例公网IP
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    public DescribeInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesRequest(DescribeInstancesRequest source) {
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);

    }
}

