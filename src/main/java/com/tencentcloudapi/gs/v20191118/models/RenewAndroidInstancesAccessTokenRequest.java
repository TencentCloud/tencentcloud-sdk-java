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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewAndroidInstancesAccessTokenRequest extends AbstractModel {

    /**
    * token
    */
    @SerializedName("AccessToken")
    @Expose
    private String AccessToken;

    /**
    * 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
    */
    @SerializedName("ExpirationDuration")
    @Expose
    private String ExpirationDuration;

    /**
     * Get token 
     * @return AccessToken token
     */
    public String getAccessToken() {
        return this.AccessToken;
    }

    /**
     * Set token
     * @param AccessToken token
     */
    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    /**
     * Get 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒 
     * @return ExpirationDuration 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     */
    public String getExpirationDuration() {
        return this.ExpirationDuration;
    }

    /**
     * Set 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     * @param ExpirationDuration 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
     */
    public void setExpirationDuration(String ExpirationDuration) {
        this.ExpirationDuration = ExpirationDuration;
    }

    public RenewAndroidInstancesAccessTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewAndroidInstancesAccessTokenRequest(RenewAndroidInstancesAccessTokenRequest source) {
        if (source.AccessToken != null) {
            this.AccessToken = new String(source.AccessToken);
        }
        if (source.ExpirationDuration != null) {
            this.ExpirationDuration = new String(source.ExpirationDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessToken", this.AccessToken);
        this.setParamSimple(map, prefix + "ExpirationDuration", this.ExpirationDuration);

    }
}

