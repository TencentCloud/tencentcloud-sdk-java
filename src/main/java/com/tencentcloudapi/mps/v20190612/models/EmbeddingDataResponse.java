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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EmbeddingDataResponse extends AbstractModel {

    /**
    * <p>embedding 的结果</p>
    */
    @SerializedName("Data")
    @Expose
    private EmbeddingResultItem [] Data;

    /**
    * <p>embedding 的 token 用量</p>
    */
    @SerializedName("Usage")
    @Expose
    private TokensUsage Usage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>embedding 的结果</p> 
     * @return Data <p>embedding 的结果</p>
     */
    public EmbeddingResultItem [] getData() {
        return this.Data;
    }

    /**
     * Set <p>embedding 的结果</p>
     * @param Data <p>embedding 的结果</p>
     */
    public void setData(EmbeddingResultItem [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>embedding 的 token 用量</p> 
     * @return Usage <p>embedding 的 token 用量</p>
     */
    public TokensUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set <p>embedding 的 token 用量</p>
     * @param Usage <p>embedding 的 token 用量</p>
     */
    public void setUsage(TokensUsage Usage) {
        this.Usage = Usage;
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

    public EmbeddingDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingDataResponse(EmbeddingDataResponse source) {
        if (source.Data != null) {
            this.Data = new EmbeddingResultItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new EmbeddingResultItem(source.Data[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new TokensUsage(source.Usage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

