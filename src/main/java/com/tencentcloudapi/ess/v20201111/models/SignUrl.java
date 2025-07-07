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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignUrl extends AbstractModel {

    /**
    * 跳转至电子签名小程序签署的链接地址。
适用于客户端APP及小程序直接唤起电子签名小程序。
    */
    @SerializedName("AppSignUrl")
    @Expose
    private String AppSignUrl;

    /**
    * 签署链接有效时间，格式类似"2022-08-05 15:55:01"
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 跳转至电子签名小程序签署的链接地址，格式类似于https://essurl.cn/xxx。
打开此链接将会展示H5中间页面，随后唤起电子签名小程序以进行合同签署。
    */
    @SerializedName("HttpSignUrl")
    @Expose
    private String HttpSignUrl;

    /**
     * Get 跳转至电子签名小程序签署的链接地址。
适用于客户端APP及小程序直接唤起电子签名小程序。 
     * @return AppSignUrl 跳转至电子签名小程序签署的链接地址。
适用于客户端APP及小程序直接唤起电子签名小程序。
     */
    public String getAppSignUrl() {
        return this.AppSignUrl;
    }

    /**
     * Set 跳转至电子签名小程序签署的链接地址。
适用于客户端APP及小程序直接唤起电子签名小程序。
     * @param AppSignUrl 跳转至电子签名小程序签署的链接地址。
适用于客户端APP及小程序直接唤起电子签名小程序。
     */
    public void setAppSignUrl(String AppSignUrl) {
        this.AppSignUrl = AppSignUrl;
    }

    /**
     * Get 签署链接有效时间，格式类似"2022-08-05 15:55:01" 
     * @return EffectiveTime 签署链接有效时间，格式类似"2022-08-05 15:55:01"
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 签署链接有效时间，格式类似"2022-08-05 15:55:01"
     * @param EffectiveTime 签署链接有效时间，格式类似"2022-08-05 15:55:01"
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 跳转至电子签名小程序签署的链接地址，格式类似于https://essurl.cn/xxx。
打开此链接将会展示H5中间页面，随后唤起电子签名小程序以进行合同签署。 
     * @return HttpSignUrl 跳转至电子签名小程序签署的链接地址，格式类似于https://essurl.cn/xxx。
打开此链接将会展示H5中间页面，随后唤起电子签名小程序以进行合同签署。
     */
    public String getHttpSignUrl() {
        return this.HttpSignUrl;
    }

    /**
     * Set 跳转至电子签名小程序签署的链接地址，格式类似于https://essurl.cn/xxx。
打开此链接将会展示H5中间页面，随后唤起电子签名小程序以进行合同签署。
     * @param HttpSignUrl 跳转至电子签名小程序签署的链接地址，格式类似于https://essurl.cn/xxx。
打开此链接将会展示H5中间页面，随后唤起电子签名小程序以进行合同签署。
     */
    public void setHttpSignUrl(String HttpSignUrl) {
        this.HttpSignUrl = HttpSignUrl;
    }

    public SignUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignUrl(SignUrl source) {
        if (source.AppSignUrl != null) {
            this.AppSignUrl = new String(source.AppSignUrl);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.HttpSignUrl != null) {
            this.HttpSignUrl = new String(source.HttpSignUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppSignUrl", this.AppSignUrl);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "HttpSignUrl", this.HttpSignUrl);

    }
}

