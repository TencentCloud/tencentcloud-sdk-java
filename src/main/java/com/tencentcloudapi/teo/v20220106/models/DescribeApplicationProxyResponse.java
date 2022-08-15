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

public class DescribeApplicationProxyResponse extends AbstractModel{

    /**
    * 应用代理列表。
    */
    @SerializedName("Data")
    @Expose
    private ApplicationProxy [] Data;

    /**
    * 记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 字段已废弃。
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
    * 当ProxyId为空时，表示套餐内PlatType为ip的Anycast IP的实例数量。
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * 当ProxyId为空时，表示套餐内PlatType为domain的CNAME的实例数量。
    */
    @SerializedName("DomainCount")
    @Expose
    private Long DomainCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 应用代理列表。 
     * @return Data 应用代理列表。
     */
    public ApplicationProxy [] getData() {
        return this.Data;
    }

    /**
     * Set 应用代理列表。
     * @param Data 应用代理列表。
     */
    public void setData(ApplicationProxy [] Data) {
        this.Data = Data;
    }

    /**
     * Get 记录总数。 
     * @return TotalCount 记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 记录总数。
     * @param TotalCount 记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 字段已废弃。 
     * @return Quota 字段已废弃。
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set 字段已废弃。
     * @param Quota 字段已废弃。
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    /**
     * Get 当ProxyId为空时，表示套餐内PlatType为ip的Anycast IP的实例数量。 
     * @return IpCount 当ProxyId为空时，表示套餐内PlatType为ip的Anycast IP的实例数量。
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 当ProxyId为空时，表示套餐内PlatType为ip的Anycast IP的实例数量。
     * @param IpCount 当ProxyId为空时，表示套餐内PlatType为ip的Anycast IP的实例数量。
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 当ProxyId为空时，表示套餐内PlatType为domain的CNAME的实例数量。 
     * @return DomainCount 当ProxyId为空时，表示套餐内PlatType为domain的CNAME的实例数量。
     */
    public Long getDomainCount() {
        return this.DomainCount;
    }

    /**
     * Set 当ProxyId为空时，表示套餐内PlatType为domain的CNAME的实例数量。
     * @param DomainCount 当ProxyId为空时，表示套餐内PlatType为domain的CNAME的实例数量。
     */
    public void setDomainCount(Long DomainCount) {
        this.DomainCount = DomainCount;
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

    public DescribeApplicationProxyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApplicationProxyResponse(DescribeApplicationProxyResponse source) {
        if (source.Data != null) {
            this.Data = new ApplicationProxy[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new ApplicationProxy(source.Data[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.DomainCount != null) {
            this.DomainCount = new Long(source.DomainCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Quota", this.Quota);
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "DomainCount", this.DomainCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

