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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageAIServiceCallbackResponse extends AbstractModel {

    /**
    * 推送类型。http：HTTP 回调
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * HTTP 回调 URL
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * HTTP 回调鉴权 Token
    */
    @SerializedName("CallbackToken")
    @Expose
    private String CallbackToken;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 推送类型。http：HTTP 回调 
     * @return Type 推送类型。http：HTTP 回调
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 推送类型。http：HTTP 回调
     * @param Type 推送类型。http：HTTP 回调
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get HTTP 回调 URL 
     * @return CallbackUrl HTTP 回调 URL
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set HTTP 回调 URL
     * @param CallbackUrl HTTP 回调 URL
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get HTTP 回调鉴权 Token 
     * @return CallbackToken HTTP 回调鉴权 Token
     */
    public String getCallbackToken() {
        return this.CallbackToken;
    }

    /**
     * Set HTTP 回调鉴权 Token
     * @param CallbackToken HTTP 回调鉴权 Token
     */
    public void setCallbackToken(String CallbackToken) {
        this.CallbackToken = CallbackToken;
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

    public DescribeCloudStorageAIServiceCallbackResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageAIServiceCallbackResponse(DescribeCloudStorageAIServiceCallbackResponse source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CallbackToken != null) {
            this.CallbackToken = new String(source.CallbackToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "CallbackToken", this.CallbackToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

