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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetEmbeddingResponse extends AbstractModel {

    /**
    * 返回的 Embedding 信息。
    */
    @SerializedName("Data")
    @Expose
    private EmbeddingData [] Data;

    /**
    * Token 使用计数，按照总 Token 数量收费。
    */
    @SerializedName("Usage")
    @Expose
    private EmbeddingUsage Usage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的 Embedding 信息。 
     * @return Data 返回的 Embedding 信息。
     */
    public EmbeddingData [] getData() {
        return this.Data;
    }

    /**
     * Set 返回的 Embedding 信息。
     * @param Data 返回的 Embedding 信息。
     */
    public void setData(EmbeddingData [] Data) {
        this.Data = Data;
    }

    /**
     * Get Token 使用计数，按照总 Token 数量收费。 
     * @return Usage Token 使用计数，按照总 Token 数量收费。
     */
    public EmbeddingUsage getUsage() {
        return this.Usage;
    }

    /**
     * Set Token 使用计数，按照总 Token 数量收费。
     * @param Usage Token 使用计数，按照总 Token 数量收费。
     */
    public void setUsage(EmbeddingUsage Usage) {
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

    public GetEmbeddingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetEmbeddingResponse(GetEmbeddingResponse source) {
        if (source.Data != null) {
            this.Data = new EmbeddingData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new EmbeddingData(source.Data[i]);
            }
        }
        if (source.Usage != null) {
            this.Usage = new EmbeddingUsage(source.Usage);
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

