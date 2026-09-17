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

public class DescribePlatformCreditsUsageResponse extends AbstractModel {

    /**
    * <p>资源点套餐内用量总和</p>
    */
    @SerializedName("DeductValueCount")
    @Expose
    private Float DeductValueCount;

    /**
    * <p>资源点资源包用量总和</p>
    */
    @SerializedName("PackageDeductValueCount")
    @Expose
    private Float PackageDeductValueCount;

    /**
    * <p>资源点按量用量总和</p>
    */
    @SerializedName("ReportValueCount")
    @Expose
    private Float ReportValueCount;

    /**
    * <p>每日消耗具体数据</p>
    */
    @SerializedName("DailyList")
    @Expose
    private PlatformCreditsUsageDaily [] DailyList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源点套餐内用量总和</p> 
     * @return DeductValueCount <p>资源点套餐内用量总和</p>
     */
    public Float getDeductValueCount() {
        return this.DeductValueCount;
    }

    /**
     * Set <p>资源点套餐内用量总和</p>
     * @param DeductValueCount <p>资源点套餐内用量总和</p>
     */
    public void setDeductValueCount(Float DeductValueCount) {
        this.DeductValueCount = DeductValueCount;
    }

    /**
     * Get <p>资源点资源包用量总和</p> 
     * @return PackageDeductValueCount <p>资源点资源包用量总和</p>
     */
    public Float getPackageDeductValueCount() {
        return this.PackageDeductValueCount;
    }

    /**
     * Set <p>资源点资源包用量总和</p>
     * @param PackageDeductValueCount <p>资源点资源包用量总和</p>
     */
    public void setPackageDeductValueCount(Float PackageDeductValueCount) {
        this.PackageDeductValueCount = PackageDeductValueCount;
    }

    /**
     * Get <p>资源点按量用量总和</p> 
     * @return ReportValueCount <p>资源点按量用量总和</p>
     */
    public Float getReportValueCount() {
        return this.ReportValueCount;
    }

    /**
     * Set <p>资源点按量用量总和</p>
     * @param ReportValueCount <p>资源点按量用量总和</p>
     */
    public void setReportValueCount(Float ReportValueCount) {
        this.ReportValueCount = ReportValueCount;
    }

    /**
     * Get <p>每日消耗具体数据</p> 
     * @return DailyList <p>每日消耗具体数据</p>
     */
    public PlatformCreditsUsageDaily [] getDailyList() {
        return this.DailyList;
    }

    /**
     * Set <p>每日消耗具体数据</p>
     * @param DailyList <p>每日消耗具体数据</p>
     */
    public void setDailyList(PlatformCreditsUsageDaily [] DailyList) {
        this.DailyList = DailyList;
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

    public DescribePlatformCreditsUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlatformCreditsUsageResponse(DescribePlatformCreditsUsageResponse source) {
        if (source.DeductValueCount != null) {
            this.DeductValueCount = new Float(source.DeductValueCount);
        }
        if (source.PackageDeductValueCount != null) {
            this.PackageDeductValueCount = new Float(source.PackageDeductValueCount);
        }
        if (source.ReportValueCount != null) {
            this.ReportValueCount = new Float(source.ReportValueCount);
        }
        if (source.DailyList != null) {
            this.DailyList = new PlatformCreditsUsageDaily[source.DailyList.length];
            for (int i = 0; i < source.DailyList.length; i++) {
                this.DailyList[i] = new PlatformCreditsUsageDaily(source.DailyList[i]);
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
        this.setParamSimple(map, prefix + "DeductValueCount", this.DeductValueCount);
        this.setParamSimple(map, prefix + "PackageDeductValueCount", this.PackageDeductValueCount);
        this.setParamSimple(map, prefix + "ReportValueCount", this.ReportValueCount);
        this.setParamArrayObj(map, prefix + "DailyList.", this.DailyList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

