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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccelerationDomainsResponse extends AbstractModel{

    /**
    * 加速域名总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 加速域名列表。
    */
    @SerializedName("AccelerationDomains")
    @Expose
    private AccelerationDomain [] AccelerationDomains;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加速域名总数。 
     * @return TotalCount 加速域名总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 加速域名总数。
     * @param TotalCount 加速域名总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 加速域名列表。 
     * @return AccelerationDomains 加速域名列表。
     */
    public AccelerationDomain [] getAccelerationDomains() {
        return this.AccelerationDomains;
    }

    /**
     * Set 加速域名列表。
     * @param AccelerationDomains 加速域名列表。
     */
    public void setAccelerationDomains(AccelerationDomain [] AccelerationDomains) {
        this.AccelerationDomains = AccelerationDomains;
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

    public DescribeAccelerationDomainsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccelerationDomainsResponse(DescribeAccelerationDomainsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.AccelerationDomains != null) {
            this.AccelerationDomains = new AccelerationDomain[source.AccelerationDomains.length];
            for (int i = 0; i < source.AccelerationDomains.length; i++) {
                this.AccelerationDomains[i] = new AccelerationDomain(source.AccelerationDomains[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "AccelerationDomains.", this.AccelerationDomains);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

