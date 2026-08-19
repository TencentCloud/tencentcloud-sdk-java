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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIAnalysisRobotInfoResponse extends AbstractModel {

    /**
    * <p>机器人配置url</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>访问token</p>
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * <p>aes key</p>
    */
    @SerializedName("AesKey")
    @Expose
    private String AesKey;

    /**
    * <p>机器人ID</p>
    */
    @SerializedName("BotID")
    @Expose
    private String BotID;

    /**
    * <p>二维码图片获取地址</p>
    */
    @SerializedName("QrcodeImageContext")
    @Expose
    private String QrcodeImageContext;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>机器人配置url</p> 
     * @return URL <p>机器人配置url</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>机器人配置url</p>
     * @param URL <p>机器人配置url</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>访问token</p> 
     * @return AccessToken <p>访问token</p>
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set <p>访问token</p>
     * @param AccessToken <p>访问token</p>
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get <p>aes key</p> 
     * @return AesKey <p>aes key</p>
     */
    public String getAesKey() {
        return this.AesKey;
    }

    /**
     * Set <p>aes key</p>
     * @param AesKey <p>aes key</p>
     */
    public void setAesKey(String AesKey) {
        this.AesKey = AesKey;
    }

    /**
     * Get <p>机器人ID</p> 
     * @return BotID <p>机器人ID</p>
     */
    public String getBotID() {
        return this.BotID;
    }

    /**
     * Set <p>机器人ID</p>
     * @param BotID <p>机器人ID</p>
     */
    public void setBotID(String BotID) {
        this.BotID = BotID;
    }

    /**
     * Get <p>二维码图片获取地址</p> 
     * @return QrcodeImageContext <p>二维码图片获取地址</p>
     */
    public String getQrcodeImageContext() {
        return this.QrcodeImageContext;
    }

    /**
     * Set <p>二维码图片获取地址</p>
     * @param QrcodeImageContext <p>二维码图片获取地址</p>
     */
    public void setQrcodeImageContext(String QrcodeImageContext) {
        this.QrcodeImageContext = QrcodeImageContext;
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

    public DescribeAIAnalysisRobotInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIAnalysisRobotInfoResponse(DescribeAIAnalysisRobotInfoResponse source) {
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
        if (source.AesKey != null) {
            this.AesKey = new String(source.AesKey);
        }
        if (source.BotID != null) {
            this.BotID = new String(source.BotID);
        }
        if (source.QrcodeImageContext != null) {
            this.QrcodeImageContext = new String(source.QrcodeImageContext);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "AesKey", this.AesKey);
        this.setParamSimple(map, prefix + "BotID", this.BotID);
        this.setParamSimple(map, prefix + "QrcodeImageContext", this.QrcodeImageContext);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

