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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSDKLoginTokenResponse extends AbstractModel{

    /**
    * SDK 登录 Token。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 过期时间戳，Unix 时间戳。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * SDK 加载路径会随着 SDK 的发布而变动。
    */
    @SerializedName("SdkURL")
    @Expose
    private String SdkURL;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get SDK 登录 Token。 
     * @return Token SDK 登录 Token。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set SDK 登录 Token。
     * @param Token SDK 登录 Token。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 过期时间戳，Unix 时间戳。 
     * @return ExpiredTime 过期时间戳，Unix 时间戳。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间戳，Unix 时间戳。
     * @param ExpiredTime 过期时间戳，Unix 时间戳。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get SDK 加载路径会随着 SDK 的发布而变动。 
     * @return SdkURL SDK 加载路径会随着 SDK 的发布而变动。
     */
    public String getSdkURL() {
        return this.SdkURL;
    }

    /**
     * Set SDK 加载路径会随着 SDK 的发布而变动。
     * @param SdkURL SDK 加载路径会随着 SDK 的发布而变动。
     */
    public void setSdkURL(String SdkURL) {
        this.SdkURL = SdkURL;
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

    public CreateSDKLoginTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSDKLoginTokenResponse(CreateSDKLoginTokenResponse source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.SdkURL != null) {
            this.SdkURL = new String(source.SdkURL);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "SdkURL", this.SdkURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

