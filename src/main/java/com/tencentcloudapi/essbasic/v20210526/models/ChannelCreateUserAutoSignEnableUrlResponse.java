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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateUserAutoSignEnableUrlResponse extends AbstractModel{

    /**
    * 跳转短链
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 小程序AppId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 小程序 原始 Id
    */
    @SerializedName("AppOriginalId")
    @Expose
    private String AppOriginalId;

    /**
    * 跳转路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * base64格式跳转二维码
    */
    @SerializedName("QrCode")
    @Expose
    private String QrCode;

    /**
    * 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
    */
    @SerializedName("UrlType")
    @Expose
    private String UrlType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 跳转短链 
     * @return Url 跳转短链
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 跳转短链
     * @param Url 跳转短链
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 小程序AppId 
     * @return AppId 小程序AppId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 小程序AppId
     * @param AppId 小程序AppId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 小程序 原始 Id 
     * @return AppOriginalId 小程序 原始 Id
     */
    public String getAppOriginalId() {
        return this.AppOriginalId;
    }

    /**
     * Set 小程序 原始 Id
     * @param AppOriginalId 小程序 原始 Id
     */
    public void setAppOriginalId(String AppOriginalId) {
        this.AppOriginalId = AppOriginalId;
    }

    /**
     * Get 跳转路径 
     * @return Path 跳转路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 跳转路径
     * @param Path 跳转路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get base64格式跳转二维码 
     * @return QrCode base64格式跳转二维码
     */
    public String getQrCode() {
        return this.QrCode;
    }

    /**
     * Set base64格式跳转二维码
     * @param QrCode base64格式跳转二维码
     */
    public void setQrCode(String QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get 链接类型，空-默认小程序端链接，H5SIGN-h5端链接 
     * @return UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public String getUrlType() {
        return this.UrlType;
    }

    /**
     * Set 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     * @param UrlType 链接类型，空-默认小程序端链接，H5SIGN-h5端链接
     */
    public void setUrlType(String UrlType) {
        this.UrlType = UrlType;
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

    public ChannelCreateUserAutoSignEnableUrlResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateUserAutoSignEnableUrlResponse(ChannelCreateUserAutoSignEnableUrlResponse source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.AppOriginalId != null) {
            this.AppOriginalId = new String(source.AppOriginalId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.QrCode != null) {
            this.QrCode = new String(source.QrCode);
        }
        if (source.UrlType != null) {
            this.UrlType = new String(source.UrlType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppOriginalId", this.AppOriginalId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "QrCode", this.QrCode);
        this.setParamSimple(map, prefix + "UrlType", this.UrlType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

