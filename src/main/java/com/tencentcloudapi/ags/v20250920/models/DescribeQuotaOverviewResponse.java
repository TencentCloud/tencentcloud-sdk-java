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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQuotaOverviewResponse extends AbstractModel {

    /**
    * <p>主账号配额上限及全账号当前用量</p>
    */
    @SerializedName("AccountQuotaOverview")
    @Expose
    private AccountQuotaOverview AccountQuotaOverview;

    /**
    * <p>当前分页下的配额组配额与用量列表。没有数据时返回空数组。</p>
    */
    @SerializedName("QuotaGroupSet")
    @Expose
    private QuotaGroupOverview [] QuotaGroupSet;

    /**
    * <p>满足过滤条件的配额组总数，不受当前分页大小影响。</p><p>单位：个</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>本次查询完成时间，格式为 RFC3339</p>
    */
    @SerializedName("DataTime")
    @Expose
    private String DataTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>主账号配额上限及全账号当前用量</p> 
     * @return AccountQuotaOverview <p>主账号配额上限及全账号当前用量</p>
     */
    public AccountQuotaOverview getAccountQuotaOverview() {
        return this.AccountQuotaOverview;
    }

    /**
     * Set <p>主账号配额上限及全账号当前用量</p>
     * @param AccountQuotaOverview <p>主账号配额上限及全账号当前用量</p>
     */
    public void setAccountQuotaOverview(AccountQuotaOverview AccountQuotaOverview) {
        this.AccountQuotaOverview = AccountQuotaOverview;
    }

    /**
     * Get <p>当前分页下的配额组配额与用量列表。没有数据时返回空数组。</p> 
     * @return QuotaGroupSet <p>当前分页下的配额组配额与用量列表。没有数据时返回空数组。</p>
     */
    public QuotaGroupOverview [] getQuotaGroupSet() {
        return this.QuotaGroupSet;
    }

    /**
     * Set <p>当前分页下的配额组配额与用量列表。没有数据时返回空数组。</p>
     * @param QuotaGroupSet <p>当前分页下的配额组配额与用量列表。没有数据时返回空数组。</p>
     */
    public void setQuotaGroupSet(QuotaGroupOverview [] QuotaGroupSet) {
        this.QuotaGroupSet = QuotaGroupSet;
    }

    /**
     * Get <p>满足过滤条件的配额组总数，不受当前分页大小影响。</p><p>单位：个</p> 
     * @return TotalCount <p>满足过滤条件的配额组总数，不受当前分页大小影响。</p><p>单位：个</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>满足过滤条件的配额组总数，不受当前分页大小影响。</p><p>单位：个</p>
     * @param TotalCount <p>满足过滤条件的配额组总数，不受当前分页大小影响。</p><p>单位：个</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>本次查询完成时间，格式为 RFC3339</p> 
     * @return DataTime <p>本次查询完成时间，格式为 RFC3339</p>
     */
    public String getDataTime() {
        return this.DataTime;
    }

    /**
     * Set <p>本次查询完成时间，格式为 RFC3339</p>
     * @param DataTime <p>本次查询完成时间，格式为 RFC3339</p>
     */
    public void setDataTime(String DataTime) {
        this.DataTime = DataTime;
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

    public DescribeQuotaOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuotaOverviewResponse(DescribeQuotaOverviewResponse source) {
        if (source.AccountQuotaOverview != null) {
            this.AccountQuotaOverview = new AccountQuotaOverview(source.AccountQuotaOverview);
        }
        if (source.QuotaGroupSet != null) {
            this.QuotaGroupSet = new QuotaGroupOverview[source.QuotaGroupSet.length];
            for (int i = 0; i < source.QuotaGroupSet.length; i++) {
                this.QuotaGroupSet[i] = new QuotaGroupOverview(source.QuotaGroupSet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataTime != null) {
            this.DataTime = new String(source.DataTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AccountQuotaOverview.", this.AccountQuotaOverview);
        this.setParamArrayObj(map, prefix + "QuotaGroupSet.", this.QuotaGroupSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "DataTime", this.DataTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

