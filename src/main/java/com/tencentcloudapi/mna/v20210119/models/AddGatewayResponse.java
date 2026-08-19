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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddGatewayResponse extends AbstractModel {

    /**
    * <p>网关ID。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>网关鉴权 Token。</p>
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * <p>网关注册地址。</p>
    */
    @SerializedName("RegisterCenterUrl")
    @Expose
    private String RegisterCenterUrl;

    /**
    * <p>网关上报地址。</p>
    */
    @SerializedName("TelemetryUrl")
    @Expose
    private String TelemetryUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>网关ID。</p> 
     * @return GatewayId <p>网关ID。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关ID。</p>
     * @param GatewayId <p>网关ID。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>网关鉴权 Token。</p> 
     * @return Token <p>网关鉴权 Token。</p>
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set <p>网关鉴权 Token。</p>
     * @param Token <p>网关鉴权 Token。</p>
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get <p>网关注册地址。</p> 
     * @return RegisterCenterUrl <p>网关注册地址。</p>
     */
    public String getRegisterCenterUrl() {
        return this.RegisterCenterUrl;
    }

    /**
     * Set <p>网关注册地址。</p>
     * @param RegisterCenterUrl <p>网关注册地址。</p>
     */
    public void setRegisterCenterUrl(String RegisterCenterUrl) {
        this.RegisterCenterUrl = RegisterCenterUrl;
    }

    /**
     * Get <p>网关上报地址。</p> 
     * @return TelemetryUrl <p>网关上报地址。</p>
     */
    public String getTelemetryUrl() {
        return this.TelemetryUrl;
    }

    /**
     * Set <p>网关上报地址。</p>
     * @param TelemetryUrl <p>网关上报地址。</p>
     */
    public void setTelemetryUrl(String TelemetryUrl) {
        this.TelemetryUrl = TelemetryUrl;
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

    public AddGatewayResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddGatewayResponse(AddGatewayResponse source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RegisterCenterUrl != null) {
            this.RegisterCenterUrl = new String(source.RegisterCenterUrl);
        }
        if (source.TelemetryUrl != null) {
            this.TelemetryUrl = new String(source.TelemetryUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RegisterCenterUrl", this.RegisterCenterUrl);
        this.setParamSimple(map, prefix + "TelemetryUrl", this.TelemetryUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

