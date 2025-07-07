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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayAuthKeyInfo extends AbstractModel {

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否启用:
0: 关闭。
1: 启用。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 鉴权 Key。
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * 有效时间，单位：秒。
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
    * 鉴权 BackKey。
    */
    @SerializedName("AuthBackKey")
    @Expose
    private String AuthBackKey;

    /**
     * Get 域名。 
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否启用:
0: 关闭。
1: 启用。 
     * @return Enable 是否启用:
0: 关闭。
1: 启用。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用:
0: 关闭。
1: 启用。
     * @param Enable 是否启用:
0: 关闭。
1: 启用。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 鉴权 Key。 
     * @return AuthKey 鉴权 Key。
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set 鉴权 Key。
     * @param AuthKey 鉴权 Key。
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get 有效时间，单位：秒。 
     * @return AuthDelta 有效时间，单位：秒。
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set 有效时间，单位：秒。
     * @param AuthDelta 有效时间，单位：秒。
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Get 鉴权 BackKey。 
     * @return AuthBackKey 鉴权 BackKey。
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * Set 鉴权 BackKey。
     * @param AuthBackKey 鉴权 BackKey。
     */
    public void setAuthBackKey(String AuthBackKey) {
        this.AuthBackKey = AuthBackKey;
    }

    public PlayAuthKeyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlayAuthKeyInfo(PlayAuthKeyInfo source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.AuthKey != null) {
            this.AuthKey = new String(source.AuthKey);
        }
        if (source.AuthDelta != null) {
            this.AuthDelta = new Long(source.AuthDelta);
        }
        if (source.AuthBackKey != null) {
            this.AuthBackKey = new String(source.AuthBackKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "AuthKey", this.AuthKey);
        this.setParamSimple(map, prefix + "AuthDelta", this.AuthDelta);
        this.setParamSimple(map, prefix + "AuthBackKey", this.AuthBackKey);

    }
}

