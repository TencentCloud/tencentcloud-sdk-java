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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetClusterLevelPriceResponse extends AbstractModel {

    /**
    * 询价结果，单位：分，打折后
    */
    @SerializedName("Cost")
    @Expose
    private Long Cost;

    /**
    * 询价结果，单位：分，折扣前
    */
    @SerializedName("TotalCost")
    @Expose
    private Long TotalCost;

    /**
    * 总的折扣，100表示100%不打折
    */
    @SerializedName("Policy")
    @Expose
    private Float Policy;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 询价结果，单位：分，打折后 
     * @return Cost 询价结果，单位：分，打折后
     */
    public Long getCost() {
        return this.Cost;
    }

    /**
     * Set 询价结果，单位：分，打折后
     * @param Cost 询价结果，单位：分，打折后
     */
    public void setCost(Long Cost) {
        this.Cost = Cost;
    }

    /**
     * Get 询价结果，单位：分，折扣前 
     * @return TotalCost 询价结果，单位：分，折扣前
     */
    public Long getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 询价结果，单位：分，折扣前
     * @param TotalCost 询价结果，单位：分，折扣前
     */
    public void setTotalCost(Long TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 总的折扣，100表示100%不打折 
     * @return Policy 总的折扣，100表示100%不打折
     */
    public Float getPolicy() {
        return this.Policy;
    }

    /**
     * Set 总的折扣，100表示100%不打折
     * @param Policy 总的折扣，100表示100%不打折
     */
    public void setPolicy(Float Policy) {
        this.Policy = Policy;
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

    public GetClusterLevelPriceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetClusterLevelPriceResponse(GetClusterLevelPriceResponse source) {
        if (source.Cost != null) {
            this.Cost = new Long(source.Cost);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new Long(source.TotalCost);
        }
        if (source.Policy != null) {
            this.Policy = new Float(source.Policy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cost", this.Cost);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

