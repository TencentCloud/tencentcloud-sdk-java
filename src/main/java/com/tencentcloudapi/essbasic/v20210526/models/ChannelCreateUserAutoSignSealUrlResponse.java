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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateUserAutoSignSealUrlResponse extends AbstractModel {

    /**
    * 腾讯电子签小程序的AppId，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 腾讯电子签小程序的原始Id，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
    */
    @SerializedName("AppOriginalId")
    @Expose
    private String AppOriginalId;

    /**
    * 个人用户自动签的开通链接, 短链形式。过期时间受 `ExpiredTime` 参数控制。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 腾讯电子签小程序的跳转路径，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * base64格式的跳转二维码图片，可通过微信扫描后跳转到腾讯电子签小程序的开通界面。
    */
    @SerializedName("QrCode")
    @Expose
    private String QrCode;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 腾讯电子签小程序的AppId，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。 
     * @return AppId 腾讯电子签小程序的AppId，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 腾讯电子签小程序的AppId，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     * @param AppId 腾讯电子签小程序的AppId，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 腾讯电子签小程序的原始Id，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。 
     * @return AppOriginalId 腾讯电子签小程序的原始Id，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public String getAppOriginalId() {
        return this.AppOriginalId;
    }

    /**
     * Set 腾讯电子签小程序的原始Id，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     * @param AppOriginalId 腾讯电子签小程序的原始Id，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public void setAppOriginalId(String AppOriginalId) {
        this.AppOriginalId = AppOriginalId;
    }

    /**
     * Get 个人用户自动签的开通链接, 短链形式。过期时间受 `ExpiredTime` 参数控制。 
     * @return Url 个人用户自动签的开通链接, 短链形式。过期时间受 `ExpiredTime` 参数控制。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 个人用户自动签的开通链接, 短链形式。过期时间受 `ExpiredTime` 参数控制。
     * @param Url 个人用户自动签的开通链接, 短链形式。过期时间受 `ExpiredTime` 参数控制。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 腾讯电子签小程序的跳转路径，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。 
     * @return Path 腾讯电子签小程序的跳转路径，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 腾讯电子签小程序的跳转路径，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     * @param Path 腾讯电子签小程序的跳转路径，用于其他小程序/APP等应用跳转至腾讯电子签小程序使用。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get base64格式的跳转二维码图片，可通过微信扫描后跳转到腾讯电子签小程序的开通界面。 
     * @return QrCode base64格式的跳转二维码图片，可通过微信扫描后跳转到腾讯电子签小程序的开通界面。
     */
    public String getQrCode() {
        return this.QrCode;
    }

    /**
     * Set base64格式的跳转二维码图片，可通过微信扫描后跳转到腾讯电子签小程序的开通界面。
     * @param QrCode base64格式的跳转二维码图片，可通过微信扫描后跳转到腾讯电子签小程序的开通界面。
     */
    public void setQrCode(String QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ChannelCreateUserAutoSignSealUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateUserAutoSignSealUrlResponse(ChannelCreateUserAutoSignSealUrlResponse source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppOriginalId != null) {
            this.AppOriginalId = new String(source.AppOriginalId);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.QrCode != null) {
            this.QrCode = new String(source.QrCode);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppOriginalId", this.AppOriginalId);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "QrCode", this.QrCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

