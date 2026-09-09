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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateChannelResponse extends AbstractModel {

    /**
    * <p>渠道ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>二维码URL（扫码类渠道创建后回填，其他场景为空）</p>
    */
    @SerializedName("QrcodeUrl")
    @Expose
    private String QrcodeUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>渠道ID</p> 
     * @return ChannelId <p>渠道ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>渠道ID</p>
     * @param ChannelId <p>渠道ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>二维码URL（扫码类渠道创建后回填，其他场景为空）</p> 
     * @return QrcodeUrl <p>二维码URL（扫码类渠道创建后回填，其他场景为空）</p>
     */
    public String getQrcodeUrl() {
        return this.QrcodeUrl;
    }

    /**
     * Set <p>二维码URL（扫码类渠道创建后回填，其他场景为空）</p>
     * @param QrcodeUrl <p>二维码URL（扫码类渠道创建后回填，其他场景为空）</p>
     */
    public void setQrcodeUrl(String QrcodeUrl) {
        this.QrcodeUrl = QrcodeUrl;
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

    public CreateChannelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateChannelResponse(CreateChannelResponse source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.QrcodeUrl != null) {
            this.QrcodeUrl = new String(source.QrcodeUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "QrcodeUrl", this.QrcodeUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

