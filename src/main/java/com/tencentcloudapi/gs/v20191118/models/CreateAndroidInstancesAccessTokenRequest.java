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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAndroidInstancesAccessTokenRequest extends AbstractModel {

    /**
    * 实例 ID 列表。每次请求的实例的上限为 500。
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 有效期，默认为 12 小时，最大为 24 小时。支持 s（秒）、m（分）、h（小时）等单位，比如 12h 表示 12 小时，1h2m3s 表示一小时两分三秒
    */
    @SerializedName("ExpirationDuration")
    @Expose
    private String ExpirationDuration;

    /**
    * 模式。
STANDARD：默认值，标准模式
ACCELERATED：加速模式，该模式需要开通加速服务才能生效
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 用户 IP。在加速模式下，该字段必填。
    */
    @SerializedName("UserIP")
    @Expose
    private String UserIP;

    /**
     * Get 实例 ID 列表。每次请求的实例的上限为 500。 
     * @return AndroidInstanceIds 实例 ID 列表。每次请求的实例的上限为 500。
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 实例 ID 列表。每次请求的实例的上限为 500。
     * @param AndroidInstanceIds 实例 ID 列表。每次请求的实例的上限为 500。
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
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

    /**
     * Get 模式。
STANDARD：默认值，标准模式
ACCELERATED：加速模式，该模式需要开通加速服务才能生效 
     * @return Mode 模式。
STANDARD：默认值，标准模式
ACCELERATED：加速模式，该模式需要开通加速服务才能生效
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 模式。
STANDARD：默认值，标准模式
ACCELERATED：加速模式，该模式需要开通加速服务才能生效
     * @param Mode 模式。
STANDARD：默认值，标准模式
ACCELERATED：加速模式，该模式需要开通加速服务才能生效
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 用户 IP。在加速模式下，该字段必填。 
     * @return UserIP 用户 IP。在加速模式下，该字段必填。
     */
    public String getUserIP() {
        return this.UserIP;
    }

    /**
     * Set 用户 IP。在加速模式下，该字段必填。
     * @param UserIP 用户 IP。在加速模式下，该字段必填。
     */
    public void setUserIP(String UserIP) {
        this.UserIP = UserIP;
    }

    public CreateAndroidInstancesAccessTokenRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidInstancesAccessTokenRequest(CreateAndroidInstancesAccessTokenRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.ExpirationDuration != null) {
            this.ExpirationDuration = new String(source.ExpirationDuration);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.UserIP != null) {
            this.UserIP = new String(source.UserIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "ExpirationDuration", this.ExpirationDuration);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "UserIP", this.UserIP);

    }
}

