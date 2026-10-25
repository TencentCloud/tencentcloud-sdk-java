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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMUsageSummaryResponse extends AbstractModel {

    /**
    * <p>上报总量</p>
    */
    @SerializedName("ReportVolume")
    @Expose
    private Long ReportVolume;

    /**
    * <p>窗口内有量应用数</p>
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
    * <p>hour 或 day</p>
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * <p>趋势</p>
    */
    @SerializedName("ByDate")
    @Expose
    private UsageTimePoint [] ByDate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>上报总量</p> 
     * @return ReportVolume <p>上报总量</p>
     */
    public Long getReportVolume() {
        return this.ReportVolume;
    }

    /**
     * Set <p>上报总量</p>
     * @param ReportVolume <p>上报总量</p>
     */
    public void setReportVolume(Long ReportVolume) {
        this.ReportVolume = ReportVolume;
    }

    /**
     * Get <p>窗口内有量应用数</p> 
     * @return ResourceCount <p>窗口内有量应用数</p>
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set <p>窗口内有量应用数</p>
     * @param ResourceCount <p>窗口内有量应用数</p>
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    /**
     * Get <p>hour 或 day</p> 
     * @return Granularity <p>hour 或 day</p>
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set <p>hour 或 day</p>
     * @param Granularity <p>hour 或 day</p>
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get <p>趋势</p> 
     * @return ByDate <p>趋势</p>
     */
    public UsageTimePoint [] getByDate() {
        return this.ByDate;
    }

    /**
     * Set <p>趋势</p>
     * @param ByDate <p>趋势</p>
     */
    public void setByDate(UsageTimePoint [] ByDate) {
        this.ByDate = ByDate;
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

    public DescribeTDEMUsageSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMUsageSummaryResponse(DescribeTDEMUsageSummaryResponse source) {
        if (source.ReportVolume != null) {
            this.ReportVolume = new Long(source.ReportVolume);
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.ByDate != null) {
            this.ByDate = new UsageTimePoint[source.ByDate.length];
            for (int i = 0; i < source.ByDate.length; i++) {
                this.ByDate[i] = new UsageTimePoint(source.ByDate[i]);
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
        this.setParamSimple(map, prefix + "ReportVolume", this.ReportVolume);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamArrayObj(map, prefix + "ByDate.", this.ByDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

