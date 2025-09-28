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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelUpdateSealStatusResponse extends AbstractModel {

    /**
    * 人脸验证操作人链接，用法可以参考"[跳转电子签小程序配置](https://qian.tencent.com/developers/company/openwxminiprogram/)"，默认为空。
    */
    @SerializedName("SealOperatorVerifyPath")
    @Expose
    private String SealOperatorVerifyPath;

    /**
    * 人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。
    */
    @SerializedName("SealOperatorVerifyQrcodeUrl")
    @Expose
    private String SealOperatorVerifyQrcodeUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 人脸验证操作人链接，用法可以参考"[跳转电子签小程序配置](https://qian.tencent.com/developers/company/openwxminiprogram/)"，默认为空。 
     * @return SealOperatorVerifyPath 人脸验证操作人链接，用法可以参考"[跳转电子签小程序配置](https://qian.tencent.com/developers/company/openwxminiprogram/)"，默认为空。
     */
    public String getSealOperatorVerifyPath() {
        return this.SealOperatorVerifyPath;
    }

    /**
     * Set 人脸验证操作人链接，用法可以参考"[跳转电子签小程序配置](https://qian.tencent.com/developers/company/openwxminiprogram/)"，默认为空。
     * @param SealOperatorVerifyPath 人脸验证操作人链接，用法可以参考"[跳转电子签小程序配置](https://qian.tencent.com/developers/company/openwxminiprogram/)"，默认为空。
     */
    public void setSealOperatorVerifyPath(String SealOperatorVerifyPath) {
        this.SealOperatorVerifyPath = SealOperatorVerifyPath;
    }

    /**
     * Get 人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。 
     * @return SealOperatorVerifyQrcodeUrl 人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。
     */
    public String getSealOperatorVerifyQrcodeUrl() {
        return this.SealOperatorVerifyQrcodeUrl;
    }

    /**
     * Set 人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。
     * @param SealOperatorVerifyQrcodeUrl 人脸验证操作人二维码链接，扫码后会跳转到腾讯电子签小程序进行人脸验证，默认为空。
     */
    public void setSealOperatorVerifyQrcodeUrl(String SealOperatorVerifyQrcodeUrl) {
        this.SealOperatorVerifyQrcodeUrl = SealOperatorVerifyQrcodeUrl;
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

    public ChannelUpdateSealStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelUpdateSealStatusResponse(ChannelUpdateSealStatusResponse source) {
        if (source.SealOperatorVerifyPath != null) {
            this.SealOperatorVerifyPath = new String(source.SealOperatorVerifyPath);
        }
        if (source.SealOperatorVerifyQrcodeUrl != null) {
            this.SealOperatorVerifyQrcodeUrl = new String(source.SealOperatorVerifyQrcodeUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SealOperatorVerifyPath", this.SealOperatorVerifyPath);
        this.setParamSimple(map, prefix + "SealOperatorVerifyQrcodeUrl", this.SealOperatorVerifyQrcodeUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

