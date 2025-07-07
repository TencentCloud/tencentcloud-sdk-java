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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TryLipstickPicResponse extends AbstractModel {

    /**
    * RspImgType 为 base64 时，返回处理后的图片 base64 数据。默认返回base64
    */
    @SerializedName("ResultImage")
    @Expose
    private String ResultImage;

    /**
    * RspImgType 为 url 时，返回处理后的图片 url 数据。
    */
    @SerializedName("ResultUrl")
    @Expose
    private String ResultUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get RspImgType 为 base64 时，返回处理后的图片 base64 数据。默认返回base64 
     * @return ResultImage RspImgType 为 base64 时，返回处理后的图片 base64 数据。默认返回base64
     */
    public String getResultImage() {
        return this.ResultImage;
    }

    /**
     * Set RspImgType 为 base64 时，返回处理后的图片 base64 数据。默认返回base64
     * @param ResultImage RspImgType 为 base64 时，返回处理后的图片 base64 数据。默认返回base64
     */
    public void setResultImage(String ResultImage) {
        this.ResultImage = ResultImage;
    }

    /**
     * Get RspImgType 为 url 时，返回处理后的图片 url 数据。 
     * @return ResultUrl RspImgType 为 url 时，返回处理后的图片 url 数据。
     */
    public String getResultUrl() {
        return this.ResultUrl;
    }

    /**
     * Set RspImgType 为 url 时，返回处理后的图片 url 数据。
     * @param ResultUrl RspImgType 为 url 时，返回处理后的图片 url 数据。
     */
    public void setResultUrl(String ResultUrl) {
        this.ResultUrl = ResultUrl;
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

    public TryLipstickPicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TryLipstickPicResponse(TryLipstickPicResponse source) {
        if (source.ResultImage != null) {
            this.ResultImage = new String(source.ResultImage);
        }
        if (source.ResultUrl != null) {
            this.ResultUrl = new String(source.ResultUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResultImage", this.ResultImage);
        this.setParamSimple(map, prefix + "ResultUrl", this.ResultUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

