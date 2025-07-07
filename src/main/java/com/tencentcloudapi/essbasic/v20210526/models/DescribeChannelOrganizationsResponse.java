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
    * 满足查询条件的企业信息列表。
    */
    @SerializedName("ChannelOrganizationInfos")
    @Expose
    private ChannelOrganizationInfo [] ChannelOrganizationInfos;

    /**
    * 指定分页返回第几页的数据。页码从 0 开始，即首页为 0，最大20000。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 指定分页每页返回的数据条数，单页最大支持 200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 满足查询条件的企业总数量。
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
     * Get 满足查询条件的企业信息列表。 
     * @return ChannelOrganizationInfos 满足查询条件的企业信息列表。
     */
    public ChannelOrganizationInfo [] getChannelOrganizationInfos() {
        return this.ChannelOrganizationInfos;
    }

    /**
     * Set 满足查询条件的企业信息列表。
     * @param ChannelOrganizationInfos 满足查询条件的企业信息列表。
     */
    public void setChannelOrganizationInfos(ChannelOrganizationInfo [] ChannelOrganizationInfos) {
        this.ChannelOrganizationInfos = ChannelOrganizationInfos;
    }

    /**
     * Get 指定分页返回第几页的数据。页码从 0 开始，即首页为 0，最大20000。 
     * @return Offset 指定分页返回第几页的数据。页码从 0 开始，即首页为 0，最大20000。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定分页返回第几页的数据。页码从 0 开始，即首页为 0，最大20000。
     * @param Offset 指定分页返回第几页的数据。页码从 0 开始，即首页为 0，最大20000。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 指定分页每页返回的数据条数，单页最大支持 200。 
     * @return Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大支持 200。
     * @param Limit 指定分页每页返回的数据条数，单页最大支持 200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 满足查询条件的企业总数量。 
     * @return Total 满足查询条件的企业总数量。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 满足查询条件的企业总数量。
     * @param Total 满足查询条件的企业总数量。
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

