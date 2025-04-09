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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEmbedWebUrlResponse extends AbstractModel {

    /**
    * 嵌入的web链接，有效期：5分钟
链接仅能使用一次
建议：每次都用接口生成链接，保证链接的有效性
<br/>EmbedType=PREVIEW_CC_FLOW，该url为h5链接
    */
    @SerializedName("WebUrl")
    @Expose
    private String WebUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 嵌入的web链接，有效期：5分钟
链接仅能使用一次
建议：每次都用接口生成链接，保证链接的有效性
<br/>EmbedType=PREVIEW_CC_FLOW，该url为h5链接 
     * @return WebUrl 嵌入的web链接，有效期：5分钟
链接仅能使用一次
建议：每次都用接口生成链接，保证链接的有效性
<br/>EmbedType=PREVIEW_CC_FLOW，该url为h5链接
     */
    public String getWebUrl() {
        return this.WebUrl;
    }

    /**
     * Set 嵌入的web链接，有效期：5分钟
链接仅能使用一次
建议：每次都用接口生成链接，保证链接的有效性
<br/>EmbedType=PREVIEW_CC_FLOW，该url为h5链接
     * @param WebUrl 嵌入的web链接，有效期：5分钟
链接仅能使用一次
建议：每次都用接口生成链接，保证链接的有效性
<br/>EmbedType=PREVIEW_CC_FLOW，该url为h5链接
     */
    public void setWebUrl(String WebUrl) {
        this.WebUrl = WebUrl;
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

    public CreateEmbedWebUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateEmbedWebUrlResponse(CreateEmbedWebUrlResponse source) {
        if (source.WebUrl != null) {
            this.WebUrl = new String(source.WebUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WebUrl", this.WebUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

