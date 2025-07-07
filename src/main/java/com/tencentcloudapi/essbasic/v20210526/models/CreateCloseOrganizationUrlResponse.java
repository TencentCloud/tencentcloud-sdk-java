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

public class CreateCloseOrganizationUrlResponse extends AbstractModel {

    /**
    * 链接有效期，unix时间戳，精确到秒
    */
    @SerializedName("ExpiredOn")
    @Expose
    private Long ExpiredOn;

    /**
    * H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
    */
    @SerializedName("LongUrl")
    @Expose
    private String LongUrl;

    /**
    * H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
    */
    @SerializedName("ShortUrl")
    @Expose
    private String ShortUrl;

    /**
    * APP或小程序跳转电子签小程序链接, 一般用于客户小程序或者APP跳转过来, 打开后进入腾讯电子签小程序
    */
    @SerializedName("MiniAppPath")
    @Expose
    private String MiniAppPath;

    /**
    * 二维码链接
    */
    @SerializedName("QrcodeUrl")
    @Expose
    private String QrcodeUrl;

    /**
    * 直接跳转至电子签小程序的二维码链接，无需通过中转页。您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。
    */
    @SerializedName("WeixinQrcodeUrl")
    @Expose
    private String WeixinQrcodeUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 链接有效期，unix时间戳，精确到秒 
     * @return ExpiredOn 链接有效期，unix时间戳，精确到秒
     */
    public Long getExpiredOn() {
        return this.ExpiredOn;
    }

    /**
     * Set 链接有效期，unix时间戳，精确到秒
     * @param ExpiredOn 链接有效期，unix时间戳，精确到秒
     */
    public void setExpiredOn(Long ExpiredOn) {
        this.ExpiredOn = ExpiredOn;
    }

    /**
     * Get H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序 
     * @return LongUrl H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     */
    public String getLongUrl() {
        return this.LongUrl;
    }

    /**
     * Set H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     * @param LongUrl H5跳转到电子签小程序链接, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     */
    public void setLongUrl(String LongUrl) {
        this.LongUrl = LongUrl;
    }

    /**
     * Get H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序 
     * @return ShortUrl H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     */
    public String getShortUrl() {
        return this.ShortUrl;
    }

    /**
     * Set H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     * @param ShortUrl H5跳转到电子签小程序链接的短链形式, 一般用于发送短信中带的链接, 打开后进入腾讯电子签小程序
     */
    public void setShortUrl(String ShortUrl) {
        this.ShortUrl = ShortUrl;
    }

    /**
     * Get APP或小程序跳转电子签小程序链接, 一般用于客户小程序或者APP跳转过来, 打开后进入腾讯电子签小程序 
     * @return MiniAppPath APP或小程序跳转电子签小程序链接, 一般用于客户小程序或者APP跳转过来, 打开后进入腾讯电子签小程序
     */
    public String getMiniAppPath() {
        return this.MiniAppPath;
    }

    /**
     * Set APP或小程序跳转电子签小程序链接, 一般用于客户小程序或者APP跳转过来, 打开后进入腾讯电子签小程序
     * @param MiniAppPath APP或小程序跳转电子签小程序链接, 一般用于客户小程序或者APP跳转过来, 打开后进入腾讯电子签小程序
     */
    public void setMiniAppPath(String MiniAppPath) {
        this.MiniAppPath = MiniAppPath;
    }

    /**
     * Get 二维码链接 
     * @return QrcodeUrl 二维码链接
     */
    public String getQrcodeUrl() {
        return this.QrcodeUrl;
    }

    /**
     * Set 二维码链接
     * @param QrcodeUrl 二维码链接
     */
    public void setQrcodeUrl(String QrcodeUrl) {
        this.QrcodeUrl = QrcodeUrl;
    }

    /**
     * Get 直接跳转至电子签小程序的二维码链接，无需通过中转页。您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。 
     * @return WeixinQrcodeUrl 直接跳转至电子签小程序的二维码链接，无需通过中转页。您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。
     */
    public String getWeixinQrcodeUrl() {
        return this.WeixinQrcodeUrl;
    }

    /**
     * Set 直接跳转至电子签小程序的二维码链接，无需通过中转页。您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。
     * @param WeixinQrcodeUrl 直接跳转至电子签小程序的二维码链接，无需通过中转页。您需要自行将其转换为二维码，使用微信扫码后可直接进入。请注意，直接点击链接是无效的。
     */
    public void setWeixinQrcodeUrl(String WeixinQrcodeUrl) {
        this.WeixinQrcodeUrl = WeixinQrcodeUrl;
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

    public CreateCloseOrganizationUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloseOrganizationUrlResponse(CreateCloseOrganizationUrlResponse source) {
        if (source.ExpiredOn != null) {
            this.ExpiredOn = new Long(source.ExpiredOn);
        }
        if (source.LongUrl != null) {
            this.LongUrl = new String(source.LongUrl);
        }
        if (source.ShortUrl != null) {
            this.ShortUrl = new String(source.ShortUrl);
        }
        if (source.MiniAppPath != null) {
            this.MiniAppPath = new String(source.MiniAppPath);
        }
        if (source.QrcodeUrl != null) {
            this.QrcodeUrl = new String(source.QrcodeUrl);
        }
        if (source.WeixinQrcodeUrl != null) {
            this.WeixinQrcodeUrl = new String(source.WeixinQrcodeUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredOn", this.ExpiredOn);
        this.setParamSimple(map, prefix + "LongUrl", this.LongUrl);
        this.setParamSimple(map, prefix + "ShortUrl", this.ShortUrl);
        this.setParamSimple(map, prefix + "MiniAppPath", this.MiniAppPath);
        this.setParamSimple(map, prefix + "QrcodeUrl", this.QrcodeUrl);
        this.setParamSimple(map, prefix + "WeixinQrcodeUrl", this.WeixinQrcodeUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

