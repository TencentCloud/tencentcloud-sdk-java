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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AcquireDeploymentTokenResponse extends AbstractModel {

    /**
    * <p>只用于目标 Deployment 数据面入口的短期 bearer Token，格式为 dpt_ 加非空、无 padding 的 Base64URL opaque 后缀。</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>Token 的绝对过期时间，UTC、秒精度 RFC3339 格式。</p>
    */
    @SerializedName("ExpiresAt")
    @Expose
    private String ExpiresAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>只用于目标 Deployment 数据面入口的短期 bearer Token，格式为 dpt_ 加非空、无 padding 的 Base64URL opaque 后缀。</p> 
     * @return Token <p>只用于目标 Deployment 数据面入口的短期 bearer Token，格式为 dpt_ 加非空、无 padding 的 Base64URL opaque 后缀。</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>只用于目标 Deployment 数据面入口的短期 bearer Token，格式为 dpt_ 加非空、无 padding 的 Base64URL opaque 后缀。</p>
     * @param Token <p>只用于目标 Deployment 数据面入口的短期 bearer Token，格式为 dpt_ 加非空、无 padding 的 Base64URL opaque 后缀。</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>Token 的绝对过期时间，UTC、秒精度 RFC3339 格式。</p> 
     * @return ExpiresAt <p>Token 的绝对过期时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public String getExpiresAt() {
        return this.ExpiresAt;
    }

    /**
     * Set <p>Token 的绝对过期时间，UTC、秒精度 RFC3339 格式。</p>
     * @param ExpiresAt <p>Token 的绝对过期时间，UTC、秒精度 RFC3339 格式。</p>
     */
    public void setExpiresAt(String ExpiresAt) {
        this.ExpiresAt = ExpiresAt;
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

    public AcquireDeploymentTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AcquireDeploymentTokenResponse(AcquireDeploymentTokenResponse source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiresAt != null) {
            this.ExpiresAt = new String(source.ExpiresAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiresAt", this.ExpiresAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

