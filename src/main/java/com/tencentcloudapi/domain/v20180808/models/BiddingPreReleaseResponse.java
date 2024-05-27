/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BiddingPreReleaseResponse extends AbstractModel {

    /**
    * 是否需要额外支付
    */
    @SerializedName("IsNeedPay")
    @Expose
    private Boolean IsNeedPay;

    /**
    * 计费请求参数，以Json字符串的形式进行返回。
    */
    @SerializedName("BillingParam")
    @Expose
    private String BillingParam;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否需要额外支付 
     * @return IsNeedPay 是否需要额外支付
     */
    public Boolean getIsNeedPay() {
        return this.IsNeedPay;
    }

    /**
     * Set 是否需要额外支付
     * @param IsNeedPay 是否需要额外支付
     */
    public void setIsNeedPay(Boolean IsNeedPay) {
        this.IsNeedPay = IsNeedPay;
    }

    /**
     * Get 计费请求参数，以Json字符串的形式进行返回。 
     * @return BillingParam 计费请求参数，以Json字符串的形式进行返回。
     */
    public String getBillingParam() {
        return this.BillingParam;
    }

    /**
     * Set 计费请求参数，以Json字符串的形式进行返回。
     * @param BillingParam 计费请求参数，以Json字符串的形式进行返回。
     */
    public void setBillingParam(String BillingParam) {
        this.BillingParam = BillingParam;
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

    public BiddingPreReleaseResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BiddingPreReleaseResponse(BiddingPreReleaseResponse source) {
        if (source.IsNeedPay != null) {
            this.IsNeedPay = new Boolean(source.IsNeedPay);
        }
        if (source.BillingParam != null) {
            this.BillingParam = new String(source.BillingParam);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsNeedPay", this.IsNeedPay);
        this.setParamSimple(map, prefix + "BillingParam", this.BillingParam);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

