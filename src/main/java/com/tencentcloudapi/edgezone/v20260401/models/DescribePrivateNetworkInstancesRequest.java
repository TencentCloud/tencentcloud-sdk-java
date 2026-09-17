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

public class DescribePrivateNetworkInstancesRequest extends AbstractModel {

    /**
    * 私网实例Id
    */
    @SerializedName("NetworkInstanceId")
    @Expose
    private String NetworkInstanceId;

    /**
    * 新实例名称
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
    * 分页偏移量，默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量，默认 20，最大 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 私网实例Id 
     * @return NetworkInstanceId 私网实例Id
     */
    public String getNetworkInstanceId() {
        return this.NetworkInstanceId;
    }

    /**
     * Set 私网实例Id
     * @param NetworkInstanceId 私网实例Id
     */
    public void setNetworkInstanceId(String NetworkInstanceId) {
        this.NetworkInstanceId = NetworkInstanceId;
    }

    /**
     * Get 新实例名称 
     * @return NetworkInstanceName 新实例名称
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set 新实例名称
     * @param NetworkInstanceName 新实例名称
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
     * Get 分页偏移量，默认0 
     * @return Offset 分页偏移量，默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认0
     * @param Offset 分页偏移量，默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页数量，默认 20，最大 100 
     * @return Limit 每页数量，默认 20，最大 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量，默认 20，最大 100
     * @param Limit 每页数量，默认 20，最大 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribePrivateNetworkInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrivateNetworkInstancesRequest(DescribePrivateNetworkInstancesRequest source) {
        if (source.NetworkInstanceId != null) {
            this.NetworkInstanceId = new String(source.NetworkInstanceId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
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
        this.setParamSimple(map, prefix + "NetworkInstanceId", this.NetworkInstanceId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

