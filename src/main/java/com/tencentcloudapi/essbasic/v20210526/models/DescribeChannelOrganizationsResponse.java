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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeChannelOrganizationsResponse extends AbstractModel {

    /**
    * <p>满足查询条件的企业信息列表。</p>
    */
    @SerializedName("ChannelOrganizationInfos")
    @Expose
    private ChannelOrganizationInfo [] ChannelOrganizationInfos;

    /**
    * <p>偏移量:从 0 开始，最大20000。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>满足查询条件的企业总数量。</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>满足查询条件的企业信息列表。</p> 
     * @return ChannelOrganizationInfos <p>满足查询条件的企业信息列表。</p>
     */
    public ChannelOrganizationInfo [] getChannelOrganizationInfos() {
        return this.ChannelOrganizationInfos;
    }

    /**
     * Set <p>满足查询条件的企业信息列表。</p>
     * @param ChannelOrganizationInfos <p>满足查询条件的企业信息列表。</p>
     */
    public void setChannelOrganizationInfos(ChannelOrganizationInfo [] ChannelOrganizationInfos) {
        this.ChannelOrganizationInfos = ChannelOrganizationInfos;
    }

    /**
     * Get <p>偏移量:从 0 开始，最大20000。</p> 
     * @return Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量:从 0 开始，最大20000。</p>
     * @param Offset <p>偏移量:从 0 开始，最大20000。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>指定分页每页返回的数据条数，单页最大支持 200。</p> 
     * @return Limit <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     * @param Limit <p>指定分页每页返回的数据条数，单页最大支持 200。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>满足查询条件的企业总数量。</p> 
     * @return Total <p>满足查询条件的企业总数量。</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>满足查询条件的企业总数量。</p>
     * @param Total <p>满足查询条件的企业总数量。</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
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

    public DescribeChannelOrganizationsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeChannelOrganizationsResponse(DescribeChannelOrganizationsResponse source) {
        if (source.ChannelOrganizationInfos != null) {
            this.ChannelOrganizationInfos = new ChannelOrganizationInfo[source.ChannelOrganizationInfos.length];
            for (int i = 0; i < source.ChannelOrganizationInfos.length; i++) {
                this.ChannelOrganizationInfos[i] = new ChannelOrganizationInfo(source.ChannelOrganizationInfos[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "ChannelOrganizationInfos.", this.ChannelOrganizationInfos);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

