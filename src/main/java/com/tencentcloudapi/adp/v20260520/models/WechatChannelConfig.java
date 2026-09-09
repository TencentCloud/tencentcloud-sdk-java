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

public class WechatChannelConfig extends AbstractModel {

    /**
    * <p>授权二维码URL（创建后回填）</p>
    */
    @SerializedName("QrcodeUrl")
    @Expose
    private String QrcodeUrl;

    /**
    * <p>公众号/小程序AppId（授权后回填）</p>
    */
    @SerializedName("WechatAppId")
    @Expose
    private String WechatAppId;

    /**
    * <p>公众号/小程序RefreshToken（授权后回填）</p>
    */
    @SerializedName("WechatRefreshToken")
    @Expose
    private String WechatRefreshToken;

    /**
     * Get <p>授权二维码URL（创建后回填）</p> 
     * @return QrcodeUrl <p>授权二维码URL（创建后回填）</p>
     */
    public String getQrcodeUrl() {
        return this.QrcodeUrl;
    }

    /**
     * Set <p>授权二维码URL（创建后回填）</p>
     * @param QrcodeUrl <p>授权二维码URL（创建后回填）</p>
     */
    public void setQrcodeUrl(String QrcodeUrl) {
        this.QrcodeUrl = QrcodeUrl;
    }

    /**
     * Get <p>公众号/小程序AppId（授权后回填）</p> 
     * @return WechatAppId <p>公众号/小程序AppId（授权后回填）</p>
     */
    public String getWechatAppId() {
        return this.WechatAppId;
    }

    /**
     * Set <p>公众号/小程序AppId（授权后回填）</p>
     * @param WechatAppId <p>公众号/小程序AppId（授权后回填）</p>
     */
    public void setWechatAppId(String WechatAppId) {
        this.WechatAppId = WechatAppId;
    }

    /**
     * Get <p>公众号/小程序RefreshToken（授权后回填）</p> 
     * @return WechatRefreshToken <p>公众号/小程序RefreshToken（授权后回填）</p>
     */
    public String getWechatRefreshToken() {
        return this.WechatRefreshToken;
    }

    /**
     * Set <p>公众号/小程序RefreshToken（授权后回填）</p>
     * @param WechatRefreshToken <p>公众号/小程序RefreshToken（授权后回填）</p>
     */
    public void setWechatRefreshToken(String WechatRefreshToken) {
        this.WechatRefreshToken = WechatRefreshToken;
    }

    public WechatChannelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WechatChannelConfig(WechatChannelConfig source) {
        if (source.QrcodeUrl != null) {
            this.QrcodeUrl = new String(source.QrcodeUrl);
        }
        if (source.WechatAppId != null) {
            this.WechatAppId = new String(source.WechatAppId);
        }
        if (source.WechatRefreshToken != null) {
            this.WechatRefreshToken = new String(source.WechatRefreshToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QrcodeUrl", this.QrcodeUrl);
        this.setParamSimple(map, prefix + "WechatAppId", this.WechatAppId);
        this.setParamSimple(map, prefix + "WechatRefreshToken", this.WechatRefreshToken);

    }
}

