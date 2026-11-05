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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateVLEmbeddingResponse extends AbstractModel {

    /**
    * <p>向量化结果列表。单条图文混合输入可能返回多个向量。</p>
    */
    @SerializedName("Data")
    @Expose
    private EmbeddingObject [] Data;

    /**
    * <p>输入 Token 数，多模态场景含图像、视频折算的 Token。</p>
    */
    @SerializedName("InputTokens")
    @Expose
    private Long InputTokens;

    /**
    * <p>总 Token 数。</p>
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>向量化结果列表。单条图文混合输入可能返回多个向量。</p> 
     * @return Data <p>向量化结果列表。单条图文混合输入可能返回多个向量。</p>
     */
    public EmbeddingObject [] getData() {
        return this.Data;
    }

    /**
     * Set <p>向量化结果列表。单条图文混合输入可能返回多个向量。</p>
     * @param Data <p>向量化结果列表。单条图文混合输入可能返回多个向量。</p>
     */
    public void setData(EmbeddingObject [] Data) {
        this.Data = Data;
    }

    /**
     * Get <p>输入 Token 数，多模态场景含图像、视频折算的 Token。</p> 
     * @return InputTokens <p>输入 Token 数，多模态场景含图像、视频折算的 Token。</p>
     */
    public Long getInputTokens() {
        return this.InputTokens;
    }

    /**
     * Set <p>输入 Token 数，多模态场景含图像、视频折算的 Token。</p>
     * @param InputTokens <p>输入 Token 数，多模态场景含图像、视频折算的 Token。</p>
     */
    public void setInputTokens(Long InputTokens) {
        this.InputTokens = InputTokens;
    }

    /**
     * Get <p>总 Token 数。</p> 
     * @return TotalTokens <p>总 Token 数。</p>
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set <p>总 Token 数。</p>
     * @param TotalTokens <p>总 Token 数。</p>
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
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

    public GenerateVLEmbeddingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GenerateVLEmbeddingResponse(GenerateVLEmbeddingResponse source) {
        if (source.Data != null) {
            this.Data = new EmbeddingObject[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new EmbeddingObject(source.Data[i]);
            }
        }
        if (source.InputTokens != null) {
            this.InputTokens = new Long(source.InputTokens);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
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
        this.setParamSimple(map, prefix + "InputTokens", this.InputTokens);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

