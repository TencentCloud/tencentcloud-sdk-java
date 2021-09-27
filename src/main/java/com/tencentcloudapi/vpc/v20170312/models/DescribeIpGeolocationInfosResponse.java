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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIpGeolocationInfosResponse extends AbstractModel{

    /**
    * IP地址信息列表。
    */
    @SerializedName("AddressInfo")
    @Expose
    private IpGeolocationInfo [] AddressInfo;

    /**
    * IP地址信息个数。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IP地址信息列表。 
     * @return AddressInfo IP地址信息列表。
     */
    public IpGeolocationInfo [] getAddressInfo() {
        return this.AddressInfo;
    }

    /**
     * Set IP地址信息列表。
     * @param AddressInfo IP地址信息列表。
     */
    public void setAddressInfo(IpGeolocationInfo [] AddressInfo) {
        this.AddressInfo = AddressInfo;
    }

    /**
     * Get IP地址信息个数。 
     * @return Total IP地址信息个数。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set IP地址信息个数。
     * @param Total IP地址信息个数。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeIpGeolocationInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIpGeolocationInfosResponse(DescribeIpGeolocationInfosResponse source) {
        if (source.AddressInfo != null) {
            this.AddressInfo = new IpGeolocationInfo[source.AddressInfo.length];
            for (int i = 0; i < source.AddressInfo.length; i++) {
                this.AddressInfo[i] = new IpGeolocationInfo(source.AddressInfo[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AddressInfo.", this.AddressInfo);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

