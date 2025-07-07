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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBrandSocialReportResponse extends AbstractModel {

    /**
    * 累计统计数据
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 按天计算的统计数据
    */
    @SerializedName("DateCountSet")
    @Expose
    private DateCount [] DateCountSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 累计统计数据 
     * @return TotalCount 累计统计数据
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 累计统计数据
     * @param TotalCount 累计统计数据
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 按天计算的统计数据 
     * @return DateCountSet 按天计算的统计数据
     */
    public DateCount [] getDateCountSet() {
        return this.DateCountSet;
    }

    /**
     * Set 按天计算的统计数据
     * @param DateCountSet 按天计算的统计数据
     */
    public void setDateCountSet(DateCount [] DateCountSet) {
        this.DateCountSet = DateCountSet;
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

    public DescribeBrandSocialReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBrandSocialReportResponse(DescribeBrandSocialReportResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DateCountSet != null) {
            this.DateCountSet = new DateCount[source.DateCountSet.length];
            for (int i = 0; i < source.DateCountSet.length; i++) {
                this.DateCountSet[i] = new DateCount(source.DateCountSet[i]);
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
        this.setParamArrayObj(map, prefix + "DateCountSet.", this.DateCountSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

