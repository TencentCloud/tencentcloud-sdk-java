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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenPlanApiKeyResponse extends AbstractModel {

    /**
    * API Key 详情信息。
    */
    @SerializedName("ApiKey")
    @Expose
    private TokenPlanApiKeyInfo ApiKey;

    /**
    * API Key 额度及用量信息。
    */
    @SerializedName("Balance")
    @Expose
    private SubPackageBalance Balance;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get API Key 详情信息。 
     * @return ApiKey API Key 详情信息。
     */
    public TokenPlanApiKeyInfo getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API Key 详情信息。
     * @param ApiKey API Key 详情信息。
     */
    public void setApiKey(TokenPlanApiKeyInfo ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get API Key 额度及用量信息。 
     * @return Balance API Key 额度及用量信息。
     */
    public SubPackageBalance getBalance() {
        return this.Balance;
    }

    /**
     * Set API Key 额度及用量信息。
     * @param Balance API Key 额度及用量信息。
     */
    public void setBalance(SubPackageBalance Balance) {
        this.Balance = Balance;
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

    public DescribeTokenPlanApiKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanApiKeyResponse(DescribeTokenPlanApiKeyResponse source) {
        if (source.ApiKey != null) {
            this.ApiKey = new TokenPlanApiKeyInfo(source.ApiKey);
        }
        if (source.Balance != null) {
            this.Balance = new SubPackageBalance(source.Balance);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ApiKey.", this.ApiKey);
        this.setParamObj(map, prefix + "Balance.", this.Balance);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

