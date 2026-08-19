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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFaceIdTokenResponse extends AbstractModel {

    /**
    * <p>token值。- 有效期 10分钟。- 只能完成1次核身。</p>
    */
    @SerializedName("FaceIdToken")
    @Expose
    private String FaceIdToken;

    /**
    * <p>客户端配置信息，SDK将使用该配置进行后续操作。请将返回值原样传递给客户端SDK。</p>
    */
    @SerializedName("ClientConfig")
    @Expose
    private String ClientConfig;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>token值。- 有效期 10分钟。- 只能完成1次核身。</p> 
     * @return FaceIdToken <p>token值。- 有效期 10分钟。- 只能完成1次核身。</p>
     */
    public String getFaceIdToken() {
        return this.FaceIdToken;
    }

    /**
     * Set <p>token值。- 有效期 10分钟。- 只能完成1次核身。</p>
     * @param FaceIdToken <p>token值。- 有效期 10分钟。- 只能完成1次核身。</p>
     */
    public void setFaceIdToken(String FaceIdToken) {
        this.FaceIdToken = FaceIdToken;
    }

    /**
     * Get <p>客户端配置信息，SDK将使用该配置进行后续操作。请将返回值原样传递给客户端SDK。</p> 
     * @return ClientConfig <p>客户端配置信息，SDK将使用该配置进行后续操作。请将返回值原样传递给客户端SDK。</p>
     */
    public String getClientConfig() {
        return this.ClientConfig;
    }

    /**
     * Set <p>客户端配置信息，SDK将使用该配置进行后续操作。请将返回值原样传递给客户端SDK。</p>
     * @param ClientConfig <p>客户端配置信息，SDK将使用该配置进行后续操作。请将返回值原样传递给客户端SDK。</p>
     */
    public void setClientConfig(String ClientConfig) {
        this.ClientConfig = ClientConfig;
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

    public GetFaceIdTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFaceIdTokenResponse(GetFaceIdTokenResponse source) {
        if (source.FaceIdToken != null) {
            this.FaceIdToken = new String(source.FaceIdToken);
        }
        if (source.ClientConfig != null) {
            this.ClientConfig = new String(source.ClientConfig);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FaceIdToken", this.FaceIdToken);
        this.setParamSimple(map, prefix + "ClientConfig", this.ClientConfig);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

