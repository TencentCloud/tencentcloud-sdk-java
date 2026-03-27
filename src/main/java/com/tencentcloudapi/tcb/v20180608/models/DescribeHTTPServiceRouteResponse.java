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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeHTTPServiceRouteResponse extends AbstractModel {

    /**
    * 域名路由信息列表
    */
    @SerializedName("Domains")
    @Expose
    private HTTPServiceDomain [] Domains;

    /**
    * 自定义接入的源站域名（HTTPService接入层域名）
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
    * 域名总数，分页查询使用总数判断是否已经拉取到所有数据
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 域名路由信息列表 
     * @return Domains 域名路由信息列表
     */
    public HTTPServiceDomain [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名路由信息列表
     * @param Domains 域名路由信息列表
     */
    public void setDomains(HTTPServiceDomain [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 自定义接入的源站域名（HTTPService接入层域名） 
     * @return OriginDomain 自定义接入的源站域名（HTTPService接入层域名）
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 自定义接入的源站域名（HTTPService接入层域名）
     * @param OriginDomain 自定义接入的源站域名（HTTPService接入层域名）
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    /**
     * Get 域名总数，分页查询使用总数判断是否已经拉取到所有数据 
     * @return TotalCount 域名总数，分页查询使用总数判断是否已经拉取到所有数据
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 域名总数，分页查询使用总数判断是否已经拉取到所有数据
     * @param TotalCount 域名总数，分页查询使用总数判断是否已经拉取到所有数据
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeHTTPServiceRouteResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeHTTPServiceRouteResponse(DescribeHTTPServiceRouteResponse source) {
        if (source.Domains != null) {
            this.Domains = new HTTPServiceDomain[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new HTTPServiceDomain(source.Domains[i]);
            }
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

