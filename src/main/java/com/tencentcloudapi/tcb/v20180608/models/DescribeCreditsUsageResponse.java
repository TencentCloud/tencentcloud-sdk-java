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

public class DescribeCreditsUsageResponse extends AbstractModel {

    /**
    * <p>资源点套餐内用量</p>
    */
    @SerializedName("DeductValue")
    @Expose
    private Float DeductValue;

    /**
    * <p>资源点资源包用量</p>
    */
    @SerializedName("PackageDeductValue")
    @Expose
    private Float PackageDeductValue;

    /**
    * <p>资源点按量用量</p>
    */
    @SerializedName("ReportValue")
    @Expose
    private Float ReportValue;

    /**
    * <p>历史周期资源点用量</p>
    */
    @SerializedName("HistoryDeducted")
    @Expose
    private Float HistoryDeducted;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>资源点套餐内用量</p> 
     * @return DeductValue <p>资源点套餐内用量</p>
     */
    public Float getDeductValue() {
        return this.DeductValue;
    }

    /**
     * Set <p>资源点套餐内用量</p>
     * @param DeductValue <p>资源点套餐内用量</p>
     */
    public void setDeductValue(Float DeductValue) {
        this.DeductValue = DeductValue;
    }

    /**
     * Get <p>资源点资源包用量</p> 
     * @return PackageDeductValue <p>资源点资源包用量</p>
     */
    public Float getPackageDeductValue() {
        return this.PackageDeductValue;
    }

    /**
     * Set <p>资源点资源包用量</p>
     * @param PackageDeductValue <p>资源点资源包用量</p>
     */
    public void setPackageDeductValue(Float PackageDeductValue) {
        this.PackageDeductValue = PackageDeductValue;
    }

    /**
     * Get <p>资源点按量用量</p> 
     * @return ReportValue <p>资源点按量用量</p>
     */
    public Float getReportValue() {
        return this.ReportValue;
    }

    /**
     * Set <p>资源点按量用量</p>
     * @param ReportValue <p>资源点按量用量</p>
     */
    public void setReportValue(Float ReportValue) {
        this.ReportValue = ReportValue;
    }

    /**
     * Get <p>历史周期资源点用量</p> 
     * @return HistoryDeducted <p>历史周期资源点用量</p>
     */
    public Float getHistoryDeducted() {
        return this.HistoryDeducted;
    }

    /**
     * Set <p>历史周期资源点用量</p>
     * @param HistoryDeducted <p>历史周期资源点用量</p>
     */
    public void setHistoryDeducted(Float HistoryDeducted) {
        this.HistoryDeducted = HistoryDeducted;
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

    public DescribeCreditsUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCreditsUsageResponse(DescribeCreditsUsageResponse source) {
        if (source.DeductValue != null) {
            this.DeductValue = new Float(source.DeductValue);
        }
        if (source.PackageDeductValue != null) {
            this.PackageDeductValue = new Float(source.PackageDeductValue);
        }
        if (source.ReportValue != null) {
            this.ReportValue = new Float(source.ReportValue);
        }
        if (source.HistoryDeducted != null) {
            this.HistoryDeducted = new Float(source.HistoryDeducted);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeductValue", this.DeductValue);
        this.setParamSimple(map, prefix + "PackageDeductValue", this.PackageDeductValue);
        this.setParamSimple(map, prefix + "ReportValue", this.ReportValue);
        this.setParamSimple(map, prefix + "HistoryDeducted", this.HistoryDeducted);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

