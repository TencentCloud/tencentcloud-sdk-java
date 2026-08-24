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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePriceCreateCopyPairsResponse extends AbstractModel {

    /**
    * 复制对价格列表，与入参一一对应
    */
    @SerializedName("CopyPairPrices")
    @Expose
    private CopyPairPrice [] CopyPairPrices;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 复制对价格列表，与入参一一对应 
     * @return CopyPairPrices 复制对价格列表，与入参一一对应
     */
    public CopyPairPrice [] getCopyPairPrices() {
        return this.CopyPairPrices;
    }

    /**
     * Set 复制对价格列表，与入参一一对应
     * @param CopyPairPrices 复制对价格列表，与入参一一对应
     */
    public void setCopyPairPrices(CopyPairPrice [] CopyPairPrices) {
        this.CopyPairPrices = CopyPairPrices;
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

    public DescribePriceCreateCopyPairsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePriceCreateCopyPairsResponse(DescribePriceCreateCopyPairsResponse source) {
        if (source.CopyPairPrices != null) {
            this.CopyPairPrices = new CopyPairPrice[source.CopyPairPrices.length];
            for (int i = 0; i < source.CopyPairPrices.length; i++) {
                this.CopyPairPrices[i] = new CopyPairPrice(source.CopyPairPrices[i]);
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
        this.setParamArrayObj(map, prefix + "CopyPairPrices.", this.CopyPairPrices);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

