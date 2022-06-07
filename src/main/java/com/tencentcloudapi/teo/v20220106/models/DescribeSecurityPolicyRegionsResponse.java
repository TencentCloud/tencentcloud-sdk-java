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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityPolicyRegionsResponse extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 地域信息
    */
    @SerializedName("GeoIp")
    @Expose
    private GeoIp [] GeoIp;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return Count 总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
     * @param Count 总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 地域信息 
     * @return GeoIp 地域信息
     */
    public GeoIp [] getGeoIp() {
        return this.GeoIp;
    }

    /**
     * Set 地域信息
     * @param GeoIp 地域信息
     */
    public void setGeoIp(GeoIp [] GeoIp) {
        this.GeoIp = GeoIp;
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

    public DescribeSecurityPolicyRegionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityPolicyRegionsResponse(DescribeSecurityPolicyRegionsResponse source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.GeoIp != null) {
            this.GeoIp = new GeoIp[source.GeoIp.length];
            for (int i = 0; i < source.GeoIp.length; i++) {
                this.GeoIp[i] = new GeoIp(source.GeoIp[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "GeoIp.", this.GeoIp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

