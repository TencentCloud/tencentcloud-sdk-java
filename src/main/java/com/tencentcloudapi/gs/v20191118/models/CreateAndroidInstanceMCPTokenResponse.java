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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstanceMCPTokenResponse extends AbstractModel {

    /**
    * <p>内部 ID，格式 k_ + 16 位 hex</p>
    */
    @SerializedName("TokenId")
    @Expose
    private String TokenId;

    /**
    * <p>明文 token，格式 mcpk_ + 48 位 hex。服务端只存 sha256，只返回这一次</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>内部 ID，格式 k_ + 16 位 hex</p> 
     * @return TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public String getTokenId() {
        return this.TokenId;
    }

    /**
     * Set <p>内部 ID，格式 k_ + 16 位 hex</p>
     * @param TokenId <p>内部 ID，格式 k_ + 16 位 hex</p>
     */
    public void setTokenId(String TokenId) {
        this.TokenId = TokenId;
    }

    /**
     * Get <p>明文 token，格式 mcpk_ + 48 位 hex。服务端只存 sha256，只返回这一次</p> 
     * @return Token <p>明文 token，格式 mcpk_ + 48 位 hex。服务端只存 sha256，只返回这一次</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>明文 token，格式 mcpk_ + 48 位 hex。服务端只存 sha256，只返回这一次</p>
     * @param Token <p>明文 token，格式 mcpk_ + 48 位 hex。服务端只存 sha256，只返回这一次</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    public CreateAndroidInstanceMCPTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstanceMCPTokenResponse(CreateAndroidInstanceMCPTokenResponse source) {
        if (source.TokenId != null) {
            this.TokenId = new String(source.TokenId);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TokenId", this.TokenId);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

