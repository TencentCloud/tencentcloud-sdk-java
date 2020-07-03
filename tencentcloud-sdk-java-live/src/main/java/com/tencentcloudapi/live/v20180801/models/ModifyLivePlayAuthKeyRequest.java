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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLivePlayAuthKeyRequest extends AbstractModel{

    /**
    * 播放域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 是否启用，0：关闭，1：启用。
不传表示不修改当前值。
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 鉴权key。
不传表示不修改当前值。
    */
    @SerializedName("AuthKey")
    @Expose
    private String AuthKey;

    /**
    * 有效时间，单位：秒。
不传表示不修改当前值。
    */
    @SerializedName("AuthDelta")
    @Expose
    private Long AuthDelta;

    /**
    * 鉴权备用key。
不传表示不修改当前值。
    */
    @SerializedName("AuthBackKey")
    @Expose
    private String AuthBackKey;

    /**
     * Get 播放域名。 
     * @return DomainName 播放域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 播放域名。
     * @param DomainName 播放域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 是否启用，0：关闭，1：启用。
不传表示不修改当前值。 
     * @return Enable 是否启用，0：关闭，1：启用。
不传表示不修改当前值。
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 是否启用，0：关闭，1：启用。
不传表示不修改当前值。
     * @param Enable 是否启用，0：关闭，1：启用。
不传表示不修改当前值。
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 鉴权key。
不传表示不修改当前值。 
     * @return AuthKey 鉴权key。
不传表示不修改当前值。
     */
    public String getAuthKey() {
        return this.AuthKey;
    }

    /**
     * Set 鉴权key。
不传表示不修改当前值。
     * @param AuthKey 鉴权key。
不传表示不修改当前值。
     */
    public void setAuthKey(String AuthKey) {
        this.AuthKey = AuthKey;
    }

    /**
     * Get 有效时间，单位：秒。
不传表示不修改当前值。 
     * @return AuthDelta 有效时间，单位：秒。
不传表示不修改当前值。
     */
    public Long getAuthDelta() {
        return this.AuthDelta;
    }

    /**
     * Set 有效时间，单位：秒。
不传表示不修改当前值。
     * @param AuthDelta 有效时间，单位：秒。
不传表示不修改当前值。
     */
    public void setAuthDelta(Long AuthDelta) {
        this.AuthDelta = AuthDelta;
    }

    /**
     * Get 鉴权备用key。
不传表示不修改当前值。 
     * @return AuthBackKey 鉴权备用key。
不传表示不修改当前值。
     */
    public String getAuthBackKey() {
        return this.AuthBackKey;
    }

    /**
     * Set 鉴权备用key。
不传表示不修改当前值。
     * @param AuthBackKey 鉴权备用key。
不传表示不修改当前值。
     */
    public void setAuthBackKey(String AuthBackKey) {
        this.AuthBackKey = AuthBackKey;
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

