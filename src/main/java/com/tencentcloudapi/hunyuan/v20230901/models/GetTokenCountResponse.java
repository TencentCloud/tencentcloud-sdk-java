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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTokenCountResponse extends AbstractModel {

    /**
    * token计数
    */
    @SerializedName("TokenCount")
    @Expose
    private Long TokenCount;

    /**
    * 字符计数
    */
    @SerializedName("CharacterCount")
    @Expose
    private Long CharacterCount;

    /**
    * 切分后的列表
    */
    @SerializedName("Tokens")
    @Expose
    private String [] Tokens;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get token计数 
     * @return TokenCount token计数
     */
    public Long getTokenCount() {
        return this.TokenCount;
    }

    /**
     * Set token计数
     * @param TokenCount token计数
     */
    public void setTokenCount(Long TokenCount) {
        this.TokenCount = TokenCount;
    }

    /**
     * Get 字符计数 
     * @return CharacterCount 字符计数
     */
    public Long getCharacterCount() {
        return this.CharacterCount;
    }

    /**
     * Set 字符计数
     * @param CharacterCount 字符计数
     */
    public void setCharacterCount(Long CharacterCount) {
        this.CharacterCount = CharacterCount;
    }

    /**
     * Get 切分后的列表 
     * @return Tokens 切分后的列表
     */
    public String [] getTokens() {
        return this.Tokens;
    }

    /**
     * Set 切分后的列表
     * @param Tokens 切分后的列表
     */
    public void setTokens(String [] Tokens) {
        this.Tokens = Tokens;
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

    public GetTokenCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTokenCountResponse(GetTokenCountResponse source) {
        if (source.TokenCount != null) {
            this.TokenCount = new Long(source.TokenCount);
        }
        if (source.CharacterCount != null) {
            this.CharacterCount = new Long(source.CharacterCount);
        }
        if (source.Tokens != null) {
            this.Tokens = new String[source.Tokens.length];
            for (int i = 0; i < source.Tokens.length; i++) {
                this.Tokens[i] = new String(source.Tokens[i]);
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
        this.setParamSimple(map, prefix + "TokenCount", this.TokenCount);
        this.setParamSimple(map, prefix + "CharacterCount", this.CharacterCount);
        this.setParamArraySimple(map, prefix + "Tokens.", this.Tokens);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

