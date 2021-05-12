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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRealNameAuthTokenResponse extends AbstractModel{

    /**
    * 查询实名认证结果的唯一凭证
    */
    @SerializedName("AuthToken")
    @Expose
    private String AuthToken;

    /**
    * 实名认证授权地址，认证发起方需要重定向到这个地址获取认证用户的授权，仅能在微信环境下打开。
    */
    @SerializedName("RedirectURL")
    @Expose
    private String RedirectURL;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询实名认证结果的唯一凭证 
     * @return AuthToken 查询实名认证结果的唯一凭证
     */
    public String getAuthToken() {
        return this.AuthToken;
    }

    /**
     * Set 查询实名认证结果的唯一凭证
     * @param AuthToken 查询实名认证结果的唯一凭证
     */
    public void setAuthToken(String AuthToken) {
        this.AuthToken = AuthToken;
    }

    /**
     * Get 实名认证授权地址，认证发起方需要重定向到这个地址获取认证用户的授权，仅能在微信环境下打开。 
     * @return RedirectURL 实名认证授权地址，认证发起方需要重定向到这个地址获取认证用户的授权，仅能在微信环境下打开。
     */
    public String getRedirectURL() {
        return this.RedirectURL;
    }

    /**
     * Set 实名认证授权地址，认证发起方需要重定向到这个地址获取认证用户的授权，仅能在微信环境下打开。
     * @param RedirectURL 实名认证授权地址，认证发起方需要重定向到这个地址获取认证用户的授权，仅能在微信环境下打开。
     */
    public void setRedirectURL(String RedirectURL) {
        this.RedirectURL = RedirectURL;
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

    public GetRealNameAuthTokenResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRealNameAuthTokenResponse(GetRealNameAuthTokenResponse source) {
        if (source.AuthToken != null) {
            this.AuthToken = new String(source.AuthToken);
        }
        if (source.RedirectURL != null) {
            this.RedirectURL = new String(source.RedirectURL);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuthToken", this.AuthToken);
        this.setParamSimple(map, prefix + "RedirectURL", this.RedirectURL);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

