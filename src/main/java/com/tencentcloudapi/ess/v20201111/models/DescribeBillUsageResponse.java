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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillUsageResponse extends AbstractModel {

    /**
    * 企业套餐余额及使用情况
    */
    @SerializedName("Summary")
    @Expose
    private OrgBillSummary [] Summary;

    /**
    * 集团子企业套餐使用情况
    */
    @SerializedName("SubOrgSummary")
    @Expose
    private SubOrgBillSummary [] SubOrgSummary;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 企业套餐余额及使用情况 
     * @return Summary 企业套餐余额及使用情况
     */
    public OrgBillSummary [] getSummary() {
        return this.Summary;
    }

    /**
     * Set 企业套餐余额及使用情况
     * @param Summary 企业套餐余额及使用情况
     */
    public void setSummary(OrgBillSummary [] Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 集团子企业套餐使用情况 
     * @return SubOrgSummary 集团子企业套餐使用情况
     */
    public SubOrgBillSummary [] getSubOrgSummary() {
        return this.SubOrgSummary;
    }

    /**
     * Set 集团子企业套餐使用情况
     * @param SubOrgSummary 集团子企业套餐使用情况
     */
    public void setSubOrgSummary(SubOrgBillSummary [] SubOrgSummary) {
        this.SubOrgSummary = SubOrgSummary;
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

    public DescribeBillUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillUsageResponse(DescribeBillUsageResponse source) {
        if (source.Summary != null) {
            this.Summary = new OrgBillSummary[source.Summary.length];
            for (int i = 0; i < source.Summary.length; i++) {
                this.Summary[i] = new OrgBillSummary(source.Summary[i]);
            }
        }
        if (source.SubOrgSummary != null) {
            this.SubOrgSummary = new SubOrgBillSummary[source.SubOrgSummary.length];
            for (int i = 0; i < source.SubOrgSummary.length; i++) {
                this.SubOrgSummary[i] = new SubOrgBillSummary(source.SubOrgSummary[i]);
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
        this.setParamArrayObj(map, prefix + "Summary.", this.Summary);
        this.setParamArrayObj(map, prefix + "SubOrgSummary.", this.SubOrgSummary);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

