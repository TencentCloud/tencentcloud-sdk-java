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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceFetchMsgResponse extends AbstractModel {

    /**
    * 桌面登录ticket状态描述
    */
    @SerializedName("FetchStatusTicket")
    @Expose
    private String FetchStatusTicket;

    /**
    * 桌面登录ticket描述
    */
    @SerializedName("FetchTicket")
    @Expose
    private String FetchTicket;

    /**
    * 桌面登录launch url
    */
    @SerializedName("FetchUrl")
    @Expose
    private String FetchUrl;

    /**
    * 桌面传输协议
    */
    @SerializedName("ProtocolVersion")
    @Expose
    private String ProtocolVersion;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 桌面登录ticket状态描述 
     * @return FetchStatusTicket 桌面登录ticket状态描述
     */
    public String getFetchStatusTicket() {
        return this.FetchStatusTicket;
    }

    /**
     * Set 桌面登录ticket状态描述
     * @param FetchStatusTicket 桌面登录ticket状态描述
     */
    public void setFetchStatusTicket(String FetchStatusTicket) {
        this.FetchStatusTicket = FetchStatusTicket;
    }

    /**
     * Get 桌面登录ticket描述 
     * @return FetchTicket 桌面登录ticket描述
     */
    public String getFetchTicket() {
        return this.FetchTicket;
    }

    /**
     * Set 桌面登录ticket描述
     * @param FetchTicket 桌面登录ticket描述
     */
    public void setFetchTicket(String FetchTicket) {
        this.FetchTicket = FetchTicket;
    }

    /**
     * Get 桌面登录launch url 
     * @return FetchUrl 桌面登录launch url
     */
    public String getFetchUrl() {
        return this.FetchUrl;
    }

    /**
     * Set 桌面登录launch url
     * @param FetchUrl 桌面登录launch url
     */
    public void setFetchUrl(String FetchUrl) {
        this.FetchUrl = FetchUrl;
    }

    /**
     * Get 桌面传输协议 
     * @return ProtocolVersion 桌面传输协议
     */
    public String getProtocolVersion() {
        return this.ProtocolVersion;
    }

    /**
     * Set 桌面传输协议
     * @param ProtocolVersion 桌面传输协议
     */
    public void setProtocolVersion(String ProtocolVersion) {
        this.ProtocolVersion = ProtocolVersion;
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

    public DescribeInstanceFetchMsgResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceFetchMsgResponse(DescribeInstanceFetchMsgResponse source) {
        if (source.FetchStatusTicket != null) {
            this.FetchStatusTicket = new String(source.FetchStatusTicket);
        }
        if (source.FetchTicket != null) {
            this.FetchTicket = new String(source.FetchTicket);
        }
        if (source.FetchUrl != null) {
            this.FetchUrl = new String(source.FetchUrl);
        }
        if (source.ProtocolVersion != null) {
            this.ProtocolVersion = new String(source.ProtocolVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FetchStatusTicket", this.FetchStatusTicket);
        this.setParamSimple(map, prefix + "FetchTicket", this.FetchTicket);
        this.setParamSimple(map, prefix + "FetchUrl", this.FetchUrl);
        this.setParamSimple(map, prefix + "ProtocolVersion", this.ProtocolVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

